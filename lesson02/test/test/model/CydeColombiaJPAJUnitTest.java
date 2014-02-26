/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import java.sql.SQLException;
import model.Model;
import model.Presupuesto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author administrator
 */
public class CydeColombiaJPAJUnitTest {

    private Model model;

    public CydeColombiaJPAJUnitTest() {
        model = new Model();
    }

    @BeforeClass
    public static void setUpClass() {
        Model.getEntityManager();
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void getGtasafromDBfromProcedrueAlmaced() throws SQLException {
        java.util.List<Presupuesto> l = model.getSfalmacenamiento("2013-01-27", "2013-01-31");
        for (Presupuesto p : l) {  
            System.out.println(p);            
        }

        assertNotNull(l);

    }
}
