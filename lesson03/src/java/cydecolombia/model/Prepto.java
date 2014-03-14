/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cydecolombia.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author administrator
 */
@Entity
@Table(name = "prepto")
@NamedQueries({
    @NamedQuery(name = "Prepto.findAll", query = "SELECT p FROM Prepto p")})
public class Prepto implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PreptoPK preptoPK;
    @Size(max = 50)
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "f_valoriza")
    @Temporal(TemporalType.DATE)
    private Date fValoriza;
    @Column(name = "f_aproba")
    @Temporal(TemporalType.DATE)
    private Date fAproba;
    @Size(max = 2)
    @Column(name = "tama\u00f1o")
    private String tamaño;
    @Size(max = 5)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 1)
    @Column(name = "digito")
    private String digito;
    @Size(max = 15)
    @Column(name = "linea")
    private String linea;
    @Size(max = 40)
    @Column(name = "naviera")
    private String naviera;
    @Column(name = "f_factura")
    @Temporal(TemporalType.DATE)
    private Date fFactura;
    @Column(name = "aprobado")
    private Boolean aprobado;
    @Size(max = 12)
    @Column(name = "inspector")
    private String inspector;
    @Size(max = 50)
    @Column(name = "liquidador")
    private String liquidador;
    @Column(name = "tara")
    private Integer tara;
    @Size(max = 125)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 125)
    @Column(name = "iso_code")
    private String isoCode;
    @Size(max = 125)
    @Column(name = "f_fabrica")
    private String fFabrica;
    @Size(max = 125)
    @Column(name = "cliente")
    private String cliente;
    @Size(max = 125)
    @Column(name = "viaje")
    private String viaje;
    @Size(max = 125)
    @Column(name = "transporte")
    private String transporte;
    @Size(max = 200)
    @Column(name = "observacio")
    private String observacio;
    @Size(max = 2)
    @Column(name = "estado")
    private String estado;
    @Size(max = 2)
    @Column(name = "movimiento")
    private String movimiento;
    @Size(max = 2)
    @Column(name = "condicion")
    private String condicion;
    @Size(max = 100)
    @Column(name = "conductor")
    private String conductor;
    @Size(max = 20)
    @Column(name = "cedulac")
    private String cedulac;
    @Size(max = 10)
    @Column(name = "placa")
    private String placa;
    @Column(name = "f_factural")
    @Temporal(TemporalType.DATE)
    private Date fFactural;
    @Column(name = "fsalida")
    @Temporal(TemporalType.DATE)
    private Date fsalida;
    @Column(name = "comodato")
    private Integer comodato;
    @Column(name = "f_autoriza")
    @Temporal(TemporalType.DATE)
    private Date fAutoriza;
    @Size(max = 30)
    @Column(name = "medio")
    private String medio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "patio")
    private String patio;

    public Prepto() {
    }

    public Prepto(PreptoPK preptoPK) {
        this.preptoPK = preptoPK;
    }

    public Prepto(PreptoPK preptoPK, String patio) {
        this.preptoPK = preptoPK;
        this.patio = patio;
    }

    public Prepto(int codigo, Date fIngreso, String sigla, String nCont) {
        this.preptoPK = new PreptoPK(codigo, fIngreso, sigla, nCont);
    }

    public PreptoPK getPreptoPK() {
        return preptoPK;
    }

    public void setPreptoPK(PreptoPK preptoPK) {
        this.preptoPK = preptoPK;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getFValoriza() {
        return fValoriza;
    }

    public void setFValoriza(Date fValoriza) {
        this.fValoriza = fValoriza;
    }

    public Date getFAproba() {
        return fAproba;
    }

    public void setFAproba(Date fAproba) {
        this.fAproba = fAproba;
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

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getNaviera() {
        return naviera;
    }

    public void setNaviera(String naviera) {
        this.naviera = naviera;
    }

    public Date getFFactura() {
        return fFactura;
    }

    public void setFFactura(Date fFactura) {
        this.fFactura = fFactura;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getLiquidador() {
        return liquidador;
    }

    public void setLiquidador(String liquidador) {
        this.liquidador = liquidador;
    }

    public Integer getTara() {
        return tara;
    }

    public void setTara(Integer tara) {
        this.tara = tara;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public String getFFabrica() {
        return fFabrica;
    }

    public void setFFabrica(String fFabrica) {
        this.fFabrica = fFabrica;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getViaje() {
        return viaje;
    }

    public void setViaje(String viaje) {
        this.viaje = viaje;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getObservacio() {
        return observacio;
    }

    public void setObservacio(String observacio) {
        this.observacio = observacio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getCedulac() {
        return cedulac;
    }

    public void setCedulac(String cedulac) {
        this.cedulac = cedulac;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getFFactural() {
        return fFactural;
    }

    public void setFFactural(Date fFactural) {
        this.fFactural = fFactural;
    }

    public Date getFsalida() {
        return fsalida;
    }

    public void setFsalida(Date fsalida) {
        this.fsalida = fsalida;
    }

    public Integer getComodato() {
        return comodato;
    }

    public void setComodato(Integer comodato) {
        this.comodato = comodato;
    }

    public Date getFAutoriza() {
        return fAutoriza;
    }

    public void setFAutoriza(Date fAutoriza) {
        this.fAutoriza = fAutoriza;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getPatio() {
        return patio;
    }

    public void setPatio(String patio) {
        this.patio = patio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (preptoPK != null ? preptoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prepto)) {
            return false;
        }
        Prepto other = (Prepto) object;
        if ((this.preptoPK == null && other.preptoPK != null) || (this.preptoPK != null && !this.preptoPK.equals(other.preptoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\ncydecolombia.model.Prepto[ preptoPK=" + preptoPK + ", tamaño=" + tamaño +" ]";
    }
    
}
