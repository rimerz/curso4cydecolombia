/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cydecolombia.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

/**
 *
 * @author administrator
 */
public class Model {

    private final String CALL_GTASA = "sfalmacenamiento";
    private static final String PERSISTENCE_UNIT_NAME = "manualTestPU";

    public List getSfalmacenamiento(String fechaInicial, String fechaFinal) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        List<Prepto> list = null;
        StoredProcedureQuery spq = null;

        spq = em.createStoredProcedureQuery(CALL_GTASA, Prepto.class);
        spq.registerStoredProcedureParameter("fi", String.class, ParameterMode.IN);
        spq.registerStoredProcedureParameter("ff", String.class, ParameterMode.IN);

        spq.setParameter("fi", fechaInicial);
        spq.setParameter("ff", fechaFinal);

        list = spq.getResultList();
        return list;
    }

}
