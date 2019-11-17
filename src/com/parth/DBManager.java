/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.parth;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author Zarna
 */
public class DBManager {
    EntityManagerFactory emf;
    EntityManager em;
    FoodInformation f;
    
    public DBManager() {
        emf=Persistence.createEntityManagerFactory("Resturant_FoodPU");
        em=emf.createEntityManager();
    }
    public DBManager(FoodInformation f) {
        emf=Persistence.createEntityManagerFactory("Resturant_FoodPU");
        em=emf.createEntityManager();
        this.f=f;
    }
    public DBManager(CustomerBill cus) {
        
    }
    public void close(){
        em.close();
        emf.close();
    }
    public void insert(FoodInformation f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        
    }
    public FoodInformation findByid(int id) {
        FoodInformation f=em.find(FoodInformation.class, id);
        return f;
    }
    
}
