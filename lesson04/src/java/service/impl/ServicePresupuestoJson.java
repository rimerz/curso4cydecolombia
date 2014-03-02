/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import java.util.List;
import model.Prepto;
import model.dao.DaoPresupuesto;
import model.dao.jpa.DaoPresupuestoJPA;
import service.ServicePresupuesto;



/**
 *
 * @author administrator
 */
public class ServicePresupuestoJson implements ServicePresupuesto {

    private DaoPresupuesto dp;

     public ServicePresupuestoJson() {
        dp = new DaoPresupuestoJPA();
    }
    
    @Override
    public List getPresupuestos() {
        List<Prepto> l = dp.getPresupuestos();
        return l;
    }

}
