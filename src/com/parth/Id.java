/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parth;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Zarna
 */
@Entity
@Table(name = "ID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Id.findAll", query = "SELECT i FROM Id i")
    , @NamedQuery(name = "Id.findById", query = "SELECT i FROM Id i WHERE i.id = :id")
    , @NamedQuery(name = "Id.findByValue", query = "SELECT i FROM Id i WHERE i.value = :value")})
public class Id implements Serializable {

    private static final long serialVersionUID = 1L;
    @javax.persistence.Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "VALUE")
    private Integer value;

    public Id() {
    }

    public Id(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Id)) {
            return false;
        }
        Id other = (Id) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parth.Id[ id=" + id + " ]";
    }
    
}
