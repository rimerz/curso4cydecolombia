/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.jpa;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import model.Centradas;
import model.Centradas_;
import model.dao.DaoView;

/**
 *
 * @author administrator
 */
public class DaoViewJpa implements DaoView {

    private static final String PERSISTENCE_UNIT_NAME = "lesson05PU";

    // @PersistenceContext(unitName = "lesson05PU")
    private EntityManager em;
    private CriteriaBuilder cb;

    public DaoViewJpa() {
        if (em == null) {
            System.err.println("Not injected @PersistenceContext");
            EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            em = factory.createEntityManager();
        }
        cb = em.getCriteriaBuilder();
    }

    public List<Predicate> getWhereDinamicFromCentradas(CriteriaQuery cq, Map<String, Object> codiciones) {
        Root<Centradas> atributos = cq.from(Centradas.class);
        List<Predicate> predicates = new ArrayList<>();

        for (Map.Entry<String, Object> entry : codiciones.entrySet()) {
            String atributo = entry.getKey();
            Object value = entry.getValue();

            Predicate condition = null;
            if (atributo.equals("fIngreso")) {
                Date fi = ((Date[]) value)[0];
                Date ff = ((Date[]) value)[1];
                System.err.println(fi);
                System.err.println(ff);
                condition = cb.between(atributos.get(Centradas_.fIngreso), fi, ff);
            } else {
                condition = cb.equal(atributos.get(atributo), value);
            }
            predicates.add(condition);
        }

            //Parametros = linea, tamaño,tipo,estado,cliente,codigop ,motonave
        return predicates;
    }

    @Override
    public List<Centradas> getViewCentradas(Map<String, Object> condiciones) {
        CriteriaQuery<Centradas> cq = cb.createQuery(Centradas.class);

        List<Predicate> conditions = this.getWhereDinamicFromCentradas(cq, condiciones);
        cq.where(cb.and(conditions.toArray(new Predicate[conditions.size()])));

        List<Centradas> result = em.createQuery(cq).getResultList();

        return result;
    }

}
