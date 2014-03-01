/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test.model;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.dao.DaoPresupuesto;
import model.dao.jpa.DaoPresupuestoJPA;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author administrator
 */
public class ModelJUnitTest {
    String pu = "lesson04PU";
    EntityManager em;
    EntityManagerFactory emf;
    
    public ModelJUnitTest() {
    }
    
    @Before
    public void setUp() {
        this.emf = Persistence.createEntityManagerFactory(pu);
        this.em = emf.createEntityManager();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void DaoLesson04() {
         DaoPresupuesto dp = new DaoPresupuestoJPA();
         List l = dp.getPresupuestos();
         assertNotNull(l);
     }
}
