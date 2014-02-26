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
    private static final String PERSISTENCE_UNIT_NAME = "lesson02PU4JTA";

    private static EntityManagerFactory factory;
    private static EntityManager em;

    public static void getEntityManager() {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        em = factory.createEntityManager();
    }

    public List<Presupuesto> getSfalmacenamiento(String fechaInicial, String fechaFinal) {
        List<Presupuesto> list = null;
        StoredProcedureQuery spq = null;
        try {
            spq = em.createStoredProcedureQuery (CALL_GTASA,Presupuesto.class);
            spq.registerStoredProcedureParameter("fi", String.class, ParameterMode.IN);
            spq.registerStoredProcedureParameter("ff", String.class, ParameterMode.IN);

            spq.setParameter("fi", fechaInicial);
            spq.setParameter("ff", fechaFinal);

            list = spq.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }

        return list;
    }
    

}
