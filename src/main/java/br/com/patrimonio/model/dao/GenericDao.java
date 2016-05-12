/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.model.dao;

import br.com.patrimonio.util.JpaUtil;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author MARCOS
 * @param <T>
 */
public abstract class GenericDao<T> {

    private static final long serialVersionUID = 1L;
    private final SessionFactory conexao;
    JpaUtil jpaUtil = new JpaUtil();
    public List<T> lista = new ArrayList<>();
    private Object manager;

    
    public GenericDao() {
        conexao = new Configuration().configure().buildSessionFactory();
    }

    
    public void inserir(T o) {
        Session session;
        session = conexao.openSession();
        Transaction tx = session.beginTransaction();
        session.save(o);
        tx.commit();
        session.close();
    }

    
    protected List<T> pesquisaTodos(T o) {
        EntityManager manager = jpaUtil.getEntityManager();
        //CriteriaBuilder cb = manager.getCriteriaBuilder();
        //CriteriaQuery<T> cq = (CriteriaQuery<T>) cb.createQuery();
        //Root<T> root = cq.from(o);
        //System.out.println(" query : from " + o.getClass().getName());
        TypedQuery<T> query = manager.createQuery("from " + o.getClass().getName(), (Class<T>)o.getClass());       
        lista = query.getResultList();
        manager.close();
        return lista;
    }
    
    
    public JpaUtil getJpaUtil() {
        return jpaUtil;
    }

    public void setJpaUtil(JpaUtil jpaUtil) {
        this.jpaUtil = jpaUtil;
    }

    public List<T> getLista() {
        return lista;
    }

    public void setLista(List<T> l) {
        this.lista = l;
    }

}
