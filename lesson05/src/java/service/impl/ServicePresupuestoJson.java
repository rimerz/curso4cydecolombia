/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import model.Dto;
import model.Prepto;
import model.dao.DaoPresupuesto;
import model.dao.jpa.DaoPresupuestoJPA;
import service.ServicePresupuesto;

/**
 *
 * @author administrator
 */
@WebService(name = "WebServiceCydecolombia")
public class ServicePresupuestoJson implements ServicePresupuesto {

    private Gson gson;
    private JsonObject respuesta;
    private DaoPresupuesto dp;

    public ServicePresupuestoJson() {
        dp = new DaoPresupuestoJPA();
        gson = new GsonBuilder().serializeNulls().create();
        respuesta = new JsonObject();
    }

    @WebMethod(operationName = "consultarPresupuesto")
    @Override
    public List<Prepto> getPresupuestos() {
        List<Prepto> l = dp.getPresupuestos();
        JsonArray ja = gson.toJsonTree(l).getAsJsonArray();

        respuesta.addProperty("error", 0);
        respuesta.addProperty("succes", true);
        respuesta.add("mesage", ja);
        
        return l;
    }

} 
