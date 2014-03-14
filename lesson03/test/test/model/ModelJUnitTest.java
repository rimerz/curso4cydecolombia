/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import cydecolombia.model.Model;
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
public class ModelJUnitTest {

    public ModelJUnitTest() {
    }

    @BeforeClass
    public static void setUpClass() {
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
    @Test
    public void getListadePresupuesto4ProcedimientoAlmacenadoSfalmacenamiento() {
        Model model = new Model();
        java.util.List l = model.getSfalmacenamiento("2013-01-27", "2013-01-31");
        assertNotNull(l);
        System.out.println(l);
    }
}
