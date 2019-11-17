package com.parth;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author Zarna
 */
public class billAddManager {
    EntityManagerFactory emf;
    EntityManager em;
    CustomerBill cus;
    
    public billAddManager() {
        emf=Persistence.createEntityManagerFactory("Resturant_FoodPU");
        em=emf.createEntityManager();
    }
    public billAddManager(CustomerBill cus) {
        emf=Persistence.createEntityManagerFactory("Resturant_FoodPU");
        em=emf.createEntityManager();
        this.cus=cus;
    }
    
    public void close(){
        em.close();
        emf.close();
    }
    public void insert(CustomerBill cus) {
       
        em.getTransaction().begin();
        em.persist(cus);
        em.getTransaction().commit();
        
    }
    public FoodInformation findByid(int id) {
        FoodInformation f=em.find(FoodInformation.class, id);
        return f;
    }
    
}
