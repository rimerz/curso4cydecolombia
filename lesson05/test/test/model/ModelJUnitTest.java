/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.persistence.criteria.Predicate;
import model.Centradas;
import model.dao.jpa.DaoViewJpa;
import model.dao.DaoView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author administrator
 */
public class ModelJUnitTest {

    public ModelJUnitTest() {
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
    public void getWhereView_centradas_fromJPA() throws ParseException {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strFi = "2013-01-30";
        String strFf = "2014-01-31";

        Date fi = formatoDelTexto.parse(strFi);
        Date ff = formatoDelTexto.parse(strFf);

        Map<String, Object> condiciones = new TreeMap<String, Object>();
        condiciones.put("tamaño", 40);
        condiciones.put("tipo", "DR");
        condiciones.put("fIngreso", new Date[]{fi, ff});

        DaoView dv = new DaoViewJpa();
        List<Centradas> list = dv.getViewCentradas(condiciones);
        assertNotNull(list);
        System.out.println("Lista: " + list.size());
        //System.out.println("Lista: " + list);
    }
}
