/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author administrator
 */
@Entity
@Table(name = "motonave")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Motonave.findAll", query = "SELECT m FROM Motonave m"),
    @NamedQuery(name = "Motonave.findByCodigo", query = "SELECT m FROM Motonave m WHERE m.codigo = :codigo"),
    @NamedQuery(name = "Motonave.findByNombrem", query = "SELECT m FROM Motonave m WHERE m.nombrem = :nombrem")})
public class Motonave implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codigo")
    private Integer codigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "nombrem")
    private String nombrem;
    @OneToMany(mappedBy = "motonave")
    private List<Prepto> preptoList;

    public Motonave() {
    }

    public Motonave(Integer codigo) {
        this.codigo = codigo;
    }

    public Motonave(Integer codigo, String nombrem) {
        this.codigo = codigo;
        this.nombrem = nombrem;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombrem() {
        return nombrem;
    }

    public void setNombrem(String nombrem) {
        this.nombrem = nombrem;
    }

    @XmlTransient
    public List<Prepto> getPreptoList() {
        return preptoList;
    }

    public void setPreptoList(List<Prepto> preptoList) {
        this.preptoList = preptoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Motonave)) {
            return false;
        }
        Motonave other = (Motonave) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.dao.Motonave[ codigo=" + codigo + " ]";
    }
    
}
