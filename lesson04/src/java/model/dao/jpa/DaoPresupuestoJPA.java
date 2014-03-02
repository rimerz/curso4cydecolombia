/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.jpa;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import model.Prepto;
import model.dao.DaoPresupuesto;

/**
 *
 * @author administrator
 */
public class DaoPresupuestoJPA implements DaoPresupuesto {

    private final String CALL_GTASA = "sfalmacenamiento";
    private static final String PERSISTENCE_UNIT_NAME = "lesson04PU";
  
    @PersistenceContext(unitName =  "lesson04PU")
    private EntityManager em; 
 
    @Override
    public List getPresupuestos() {

        if (em == null) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            em = factory.createEntityManager();
            System.err.println("Not injected @PersistenceContext");
        }
        List<Prepto> list = null;
        StoredProcedureQuery spq = null;

        spq = em.createStoredProcedureQuery(CALL_GTASA, Prepto.class);
        spq.registerStoredProcedureParameter("fi", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("ff", String.class, ParameterMode.IN);

        spq.setParameter("fi", "2013-01-27");
        spq.setParameter("ff", "2013-01-31");

        list = spq.getResultList();
        return list;
    }

}
