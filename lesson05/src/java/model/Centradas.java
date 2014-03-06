/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author administrator
 */
@Entity
@Table(name = "centradas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Centradas.findAll", query = "SELECT c FROM Centradas c")})
public class Centradas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    @Id
    private int codigo;
    @Size(max = 11)
    @Column(name = "numerocont")
    private String numerocont;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "sigla")
    private String sigla;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "n_cont")
    private String nCont;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Size(max = 1)
    @Column(name = "digito")
    private String digito;
    @Size(max = 2)
    @Column(name = "tama\u00f1o")
    private String tamaño;
    @Size(max = 5)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 100)
    @Column(name = "motonave")
    private String motonave;
    @Size(max = 125)
    @Column(name = "viaje")
    private String viaje;
    @Size(max = 2)
    @Column(name = "estado")
    private String estado;
    @Size(max = 2)
    @Column(name = "condicion")
    private String condicion;
    @Size(max = 15)
    @Column(name = "linea")
    private String linea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "f_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fIngreso;
    @Size(max = 125)
    @Column(name = "cliente")
    private String cliente;
    @Size(max = 200)
    @Column(name = "observacio")
    private String observacio;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 70)
    @Column(name = "patio")
    private String patio;
    @Size(max = 3)
    @Column(name = "codigop")
    private String codigop;

    public Centradas() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNumerocont() {
        return numerocont;
    }

    public void setNumerocont(String numerocont) {
        this.numerocont = numerocont;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNCont() {
        return nCont;
    }

    public void setNCont(String nCont) {
        this.nCont = nCont;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotonave() {
        return motonave;
    }

    public void setMotonave(String motonave) {
        this.motonave = motonave;
    }

    public String getViaje() {
        return viaje;
    }

    public void setViaje(String viaje) {
        this.viaje = viaje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public Date getFIngreso() {
        return fIngreso;
    }

    public void setFIngreso(Date fIngreso) {
        this.fIngreso = fIngreso;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getObservacio() {
        return observacio;
    }

    public void setObservacio(String observacio) {
        this.observacio = observacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    public String getCodigop() {
        return codigop;
    }

    public void setCodigop(String codigop) {
        this.codigop = codigop;
    }

    @Override
    public String toString() {
        return "\nCentradas{" + "codigo=" + codigo + ", numerocont=" + numerocont + ", sigla=" + sigla + ", nCont=" + nCont + ", ciudad=" + ciudad + ", digito=" + digito + ", tama\u00f1o=" + tamaño + ", tipo=" + tipo + ", motonave=" + motonave + ", viaje=" + viaje + ", estado=" + estado + ", condicion=" + condicion + ", linea=" + linea + ", fIngreso=" + fIngreso + ", cliente=" + cliente + ", observacio=" + observacio + ", nombre=" + nombre + ", patio=" + patio + ", codigop=" + codigop + '}';
    }

}
