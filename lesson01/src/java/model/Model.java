/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author rricm
 */
public class Model {

    private final String CALL_GTASA = "{call sfalmacenamiento (?,?)}";
    private static Connection c;

    private DataSource getCydecolombia() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("jdbc/cydecolombia");
    }

    public static void conectar() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost/logicont", "root", "123");
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new SQLException("Driver  No Cargado");
        }
    }

    public List<Presupuesto> getSfalmacenamiento(String fechaInicial, String fechaFinal) throws SQLException {
        CallableStatement cst = null;
        ResultSet rs = null;
        List list = null;
        //CachedRowSet ch = new com.sun.rowset.CachedRowSetImpl();

        try {
            cst = c.prepareCall(this.CALL_GTASA);
            cst.setString(1, fechaInicial);
            cst.setString(2, fechaFinal);

            rs = cst.executeQuery();
            //ch.populate(rs);

            list = new ArrayList<Presupuesto>();
            while (rs.next()) {
                String codigo = rs.getString(1);
                String sigla = rs.getString(2);
                String n_cont = rs.getString(3);
                String digito = rs.getString(4);
                String tamano = rs.getString(5);
                String f_ingreso = rs.getString(6);
                String fsalida = rs.getString(7);
                String motonave = rs.getString(8);
                String no_dias = rs.getString(9);

                Presupuesto prepto = new Presupuesto(codigo, sigla, n_cont, digito, tamano, f_ingreso, fsalida, motonave, no_dias);

                list.add(prepto);
            }

        } finally {
            if (cst != null) {
                cst.close();
            }
            if (rs != null) {
                rs.close();
            }
        }
        return list;
    }

}
