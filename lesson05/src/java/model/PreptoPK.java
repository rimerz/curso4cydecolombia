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
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author administrator
 */
@Embeddable
public class PreptoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private int codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "f_ingreso")
    @Temporal(TemporalType.DATE)
    private Date fIngreso;
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

    public PreptoPK() {
    }

    public PreptoPK(int codigo, Date fIngreso, String sigla, String nCont) {
        this.codigo = codigo;
        this.fIngreso = fIngreso;
        this.sigla = sigla;
        this.nCont = nCont;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFIngreso() {
        return fIngreso;
    }

    public void setFIngreso(Date fIngreso) {
        this.fIngreso = fIngreso;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigo;
        hash += (fIngreso != null ? fIngreso.hashCode() : 0);
        hash += (sigla != null ? sigla.hashCode() : 0);
        hash += (nCont != null ? nCont.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PreptoPK)) {
            return false;
        }
        PreptoPK other = (PreptoPK) object;
        if (this.codigo != other.codigo) {
            return false;
        }
        if ((this.fIngreso == null && other.fIngreso != null) || (this.fIngreso != null && !this.fIngreso.equals(other.fIngreso))) {
            return false;
        }
        if ((this.sigla == null && other.sigla != null) || (this.sigla != null && !this.sigla.equals(other.sigla))) {
            return false;
        }
        if ((this.nCont == null && other.nCont != null) || (this.nCont != null && !this.nCont.equals(other.nCont))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("(codigo=%s, fIngreso=%s,  sigla=%s, nCont=%s)", codigo, fIngreso, sigla, nCont);
    }

}
