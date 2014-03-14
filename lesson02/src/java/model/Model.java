package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author rricm
 */
public class Model {

    private final String CALL_GTASA = "sfalmacenamiento";
    private static final String PERSISTENCE_UNIT_NAME = "lesson02PU";

    public List<Presupuesto> getSfalmacenamiento(String fechaInicial, String fechaFinal) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        List<Presupuesto> list = null;
        StoredProcedureQuery spq = null;

        spq = em.createStoredProcedureQuery(CALL_GTASA, Presupuesto.class);
        spq.registerStoredProcedureParameter("fi", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("ff", String.class, ParameterMode.IN);

        spq.setParameter("fi", fechaInicial);
        spq.setParameter("ff", fechaFinal);

        list = spq.getResultList();

        return list;
    }

}
