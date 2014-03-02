/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import model.Prepto;
import model.dao.DaoPresupuesto;
import model.dao.jpa.DaoPresupuestoJPA;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import util.MyTypeAdapter;

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
    //@Test
    public void DaoLesson04() {
        DaoPresupuesto dp = new DaoPresupuestoJPA();
        List l = dp.getPresupuestos();
        assertNotNull(l);
    }

    @Test
    public void DaoLesson04JsonGoogle() {

        DaoPresupuesto dp = new DaoPresupuestoJPA();
        List l = dp.getPresupuestos();
        assertNotNull(l);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonArray ja = gson.toJsonTree(l).getAsJsonArray();

        JsonObject respuesta = new JsonObject();
        respuesta.addProperty("error", "");
        respuesta.addProperty("succes", true);
        respuesta.add("mesage", ja);

        System.out.println("respuestaJson: " + respuesta);

    }

    @Test
    public void DaoLesson04JsonSimple() {

        DaoPresupuesto dp = new DaoPresupuestoJPA();
        List l = dp.getPresupuestos();
        assertNotNull(l);

        JSONObject obj = new JSONObject();
        JSONArray list = new JSONArray();

        list.addAll(l);
        obj.put("message", list.get(0));
        obj.put("suuces", true);

        System.out.println("prodList: " + obj);
    }
}
