package model;



import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author rricm
 */
@Entity
public class Presupuesto {
    @Id
    private String codigo;
    private String sigla ;
    private String n_cont ;
    private String digito;
    private String tamano;
    private String f_ingreso ;
    private String fsalida ;
    private String motonave;            
    private String no_dias ;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getN_cont() {
        return n_cont;
    }

    public void setN_cont(String n_cont) {
        this.n_cont = n_cont;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getF_ingreso() {
        return f_ingreso;
    }

    public void setF_ingreso(String f_ingreso) {
        this.f_ingreso = f_ingreso;
    }

    public String getFsalida() {
        return fsalida;
    }

    public void setFsalida(String fsalida) {
        this.fsalida = fsalida;
    }

    public String getMotonave() {
        return motonave;
    }

    public void setMotonave(String motonave) {
        this.motonave = motonave;
    }

    public String getNo_dias() {
        return no_dias;
    }

    public void setNo_dias(String no_dias) {
        this.no_dias = no_dias;
    }

    @Override
    public String toString() {
        return "\nPrepto{" + "codigo=" + codigo + ", sigla=" + sigla + ", n_cont=" + n_cont + ", digito=" + digito + ", tamano=" + tamano + ", f_ingreso=" + f_ingreso + ", fsalida=" + fsalida + ", motonave=" + motonave + ", no_dias=" + no_dias + '}' ;
    }
    
}
