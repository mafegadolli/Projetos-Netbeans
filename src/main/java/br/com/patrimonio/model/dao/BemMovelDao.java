/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.model.dao;

import br.com.patrimonio.model.BemMovel;
import br.com.patrimonio.util.JpaUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author MARCOS
 */
public class BemMovelDao implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private final SessionFactory conexao;
    
    JpaUtil jpaUtil = new JpaUtil();
    
    public List<BemMovel> bensMoveis  = new ArrayList<>();

    public BemMovelDao() {
        conexao = new Configuration().configure().buildSessionFactory();    
    }
    
 
    public void inserirBemMovel(BemMovel bemMovel){
        Session session;
        session = conexao.openSession();     
        Transaction tx = session.beginTransaction();
        session.save(bemMovel);
        tx.commit();
        session.close();
    }
    
    public List<BemMovel> pesquisaTodosBemMovel(){        
        EntityManager manager = jpaUtil.getEntityManager();
        TypedQuery<BemMovel> query = manager.createQuery("from BemMovel", BemMovel.class);
        bensMoveis = query.getResultList();
        manager.close();
        return bensMoveis;         
    }   

    public JpaUtil getJpaUtil() {
        return jpaUtil;
    }

    public void setJpaUtil(JpaUtil jpaUtil) {
        this.jpaUtil = jpaUtil;
    }

    public List<BemMovel> getBensMoveis() {
        return bensMoveis;
    }

    public void setBensMoveis(List<BemMovel> bensMoveis) {
        this.bensMoveis = bensMoveis;
    }
    
}
