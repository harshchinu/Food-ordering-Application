/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parth;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Zarna
 */
@Entity
@Table(name = "FOOD_INFORMATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FoodInformation.findAll", query = "SELECT f FROM FoodInformation f")
    , @NamedQuery(name = "FoodInformation.findById", query = "SELECT f FROM FoodInformation f WHERE f.id = :id")
    , @NamedQuery(name = "FoodInformation.findByFoodName", query = "SELECT f FROM FoodInformation f WHERE f.foodName = :foodName")
    , @NamedQuery(name = "FoodInformation.findByPrice", query = "SELECT f FROM FoodInformation f WHERE f.price = :price")})
public class FoodInformation implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "FOOD_NAME")
    private String foodName;
    @Column(name = "PRICE")
    private Integer price;

    public FoodInformation() {
    }

    public FoodInformation(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        String oldFoodName = this.foodName;
        this.foodName = foodName;
        changeSupport.firePropertyChange("foodName", oldFoodName, foodName);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
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
        if (!(object instanceof FoodInformation)) {
            return false;
        }
        FoodInformation other = (FoodInformation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parth.FoodInformation[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
