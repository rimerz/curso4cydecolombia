/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.List;
import java.util.Map;
import model.Centradas;

/**
 *
 * @author administrator
 */
public interface DaoView {
    public List<Centradas> getViewCentradas(Map<String,Object> condiciones);
}
