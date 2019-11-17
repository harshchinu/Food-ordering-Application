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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Zarna
 */
@Entity
@Table(name = "CUSTOMER_BILL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CustomerBill.findAll", query = "SELECT c FROM CustomerBill c")
    , @NamedQuery(name = "CustomerBill.findById", query = "SELECT c FROM CustomerBill c WHERE c.id = :id")
    , @NamedQuery(name = "CustomerBill.findByVegchesseburger", query = "SELECT c FROM CustomerBill c WHERE c.vegchesseburger = :vegchesseburger")
    , @NamedQuery(name = "CustomerBill.findByGrilledchatpataaloo", query = "SELECT c FROM CustomerBill c WHERE c.grilledchatpataaloo = :grilledchatpataaloo")
    , @NamedQuery(name = "CustomerBill.findByChatpatanaanaloo", query = "SELECT c FROM CustomerBill c WHERE c.chatpatanaanaloo = :chatpatanaanaloo")
    , @NamedQuery(name = "CustomerBill.findByPizzamcpuffandmcveggie", query = "SELECT c FROM CustomerBill c WHERE c.pizzamcpuffandmcveggie = :pizzamcpuffandmcveggie")
    , @NamedQuery(name = "CustomerBill.findByFrenchfries", query = "SELECT c FROM CustomerBill c WHERE c.frenchfries = :frenchfries")
    , @NamedQuery(name = "CustomerBill.findByChatpatanaan", query = "SELECT c FROM CustomerBill c WHERE c.chatpatanaan = :chatpatanaan")
    , @NamedQuery(name = "CustomerBill.findByTotalamount", query = "SELECT c FROM CustomerBill c WHERE c.totalamount = :totalamount")})
public class CustomerBill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "VEGCHESSEBURGER")
    private Integer vegchesseburger;
    @Column(name = "GRILLEDCHATPATAALOO")
    private Integer grilledchatpataaloo;
    @Column(name = "CHATPATANAANALOO")
    private Integer chatpatanaanaloo;
    @Column(name = "PIZZAMCPUFFANDMCVEGGIE")
    private Integer pizzamcpuffandmcveggie;
    @Column(name = "FRENCHFRIES")
    private Integer frenchfries;
    @Column(name = "CHATPATANAAN")
    private Integer chatpatanaan;
    @Column(name = "TOTALAMOUNT")
    private Integer totalamount;

    public CustomerBill() {
    }

    public CustomerBill(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVegchesseburger() {
        return vegchesseburger;
    }

    public void setVegchesseburger(Integer vegchesseburger) {
        this.vegchesseburger = vegchesseburger;
    }

    public Integer getGrilledchatpataaloo() {
        return grilledchatpataaloo;
    }

    public void setGrilledchatpataaloo(Integer grilledchatpataaloo) {
        this.grilledchatpataaloo = grilledchatpataaloo;
    }

    public Integer getChatpatanaanaloo() {
        return chatpatanaanaloo;
    }

    public void setChatpatanaanaloo(Integer chatpatanaanaloo) {
        this.chatpatanaanaloo = chatpatanaanaloo;
    }

    public Integer getPizzamcpuffandmcveggie() {
        return pizzamcpuffandmcveggie;
    }

    public void setPizzamcpuffandmcveggie(Integer pizzamcpuffandmcveggie) {
        this.pizzamcpuffandmcveggie = pizzamcpuffandmcveggie;
    }

    public Integer getFrenchfries() {
        return frenchfries;
    }

    public void setFrenchfries(Integer frenchfries) {
        this.frenchfries = frenchfries;
    }

    public Integer getChatpatanaan() {
        return chatpatanaan;
    }

    public void setChatpatanaan(Integer chatpatanaan) {
        this.chatpatanaan = chatpatanaan;
    }

    public Integer getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(Integer totalamount) {
        this.totalamount = totalamount;
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
        if (!(object instanceof CustomerBill)) {
            return false;
        }
        CustomerBill other = (CustomerBill) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.parth.CustomerBill[ id=" + id + " ]";
    }
    
}
