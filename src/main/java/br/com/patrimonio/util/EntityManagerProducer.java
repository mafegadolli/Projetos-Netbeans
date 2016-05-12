/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.util;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author MARCOS
 */
@ApplicationScoped
public class EntityManagerProducer {
    
    private EntityManagerFactory factory;
    
    public EntityManagerProducer(){
        this.factory = Persistence.createEntityManagerFactory("PatrimonioPU");
    }
    
    @Produces
    @RequestScoped
    public EntityManager createEntityManager(){
        return factory.createEntityManager();
    }
    
    public void closeEntityManager(@Disposes EntityManager manager) {
        manager.close();
    } 
            
            
}
