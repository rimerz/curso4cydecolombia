package test.model;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Model;
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
public class CydeColombiaJUnitTest {

    private Model m;

    public CydeColombiaJUnitTest() {
        m = new Model();
    }

    @BeforeClass
    public static void setUpClass() {
        try {
            Model.conectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(CydeColombiaJUnitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    public void getGtasafromDBfromProcedrueAlmaced() throws SQLException {
        java.util.List l = m.getSfalmacenamiento("2013-01-27", "2013-01-31");
        System.out.println(l);
        assertNotNull(l);
    }
}
