/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import model.dao.*;
import java.util.List;
import model.Prepto;

/**
 *
 * @author administrator
 */
public interface ServicePresupuesto {

    public List<Prepto> getPresupuestos();
    
    
}
