/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.model.dao;

import br.com.patrimonio.model.TipoIncorporacao;
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
public class TipoIncorporacaoDao implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private final SessionFactory conexao;
    List<TipoIncorporacao> tiposIncorporacoes;
      
    JpaUtil jpaUtil = new JpaUtil();
    
    
    public TipoIncorporacaoDao(){     
        this.tiposIncorporacoes = new ArrayList<>();
        conexao = new Configuration().configure().buildSessionFactory();
    }
    
    public void inserirTipoIncorporacao(TipoIncorporacao tipoIncorporacao){
        Session session;
        session = conexao.openSession();     
        Transaction tx = session.beginTransaction();
        session.save(tipoIncorporacao);
        tx.commit();
        session.close();
    }
    
    public List<TipoIncorporacao> pesquisaTodosTiposIncorporacao(){        
        EntityManager manager = jpaUtil.getEntityManager();
        TypedQuery<TipoIncorporacao> query = manager.createQuery("from TipoIncorporacao", TipoIncorporacao.class);
        tiposIncorporacoes = query.getResultList();     
        manager.close();
        return tiposIncorporacoes;
    }

    public List<TipoIncorporacao> getTiposIncorporacoes() {
        return tiposIncorporacoes;
    }

    public void setTiposIncorporacoes(List<TipoIncorporacao> tiposIncorporacoes) {
        this.tiposIncorporacoes = tiposIncorporacoes;
    }

    public JpaUtil getJpaUtil() {
        return jpaUtil;
    }

    public void setJpaUtil(JpaUtil jpaUtil) {
        this.jpaUtil = jpaUtil;
    }
    
    
    
}
