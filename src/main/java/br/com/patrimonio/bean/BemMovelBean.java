/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.bean;

import br.com.patrimonio.chave.composta.BemMovelChaveComposta;
import br.com.patrimonio.model.BemMovel;
import br.com.patrimonio.model.dao.BemMovel2Dao;
import br.com.patrimonio.model.dao.BemMovelDao;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author MARCOS
 */
@ManagedBean
@RequestScoped
public class BemMovelBean implements Serializable{
    
    
    private BemMovel bemMovel = new BemMovel();     
    private BemMovel2Dao bemMovelDao = new BemMovel2Dao();   
    
    private List<BemMovel> bensMoveis;
        
    private BemMovelChaveComposta bemMovelId;
    private Date dataIncorporacao;
    private Integer processoIncorporacao;
    private Integer anoProcessoIncorporacao;

    
    public void inserirObjeto(BemMovel bemMovel){
        
    }
    
    public void listaTodos(){     
        bensMoveis = bemMovelDao.pesquisaTodos();       
    }

    public BemMovel getBemMovel() {
        return bemMovel;
    }

    public void setBemMovel(BemMovel bemMovel) {
        this.bemMovel = bemMovel;
    }

    public BemMovel2Dao getBemMovelDao() {
        return bemMovelDao;
    }

    public void setBemMovelDao(BemMovel2Dao bemMovelDao) {
        this.bemMovelDao = bemMovelDao;
    }

    public List<BemMovel> getBensMoveis() {
        return bensMoveis;
    }

    public void setBensMoveis(List<BemMovel> bensMoveis) {
        this.bensMoveis = bensMoveis;
    }

    public BemMovelChaveComposta getBemMovelId() {
        return bemMovelId;
    }

    public void setBemMovelId(BemMovelChaveComposta bemMovelId) {
        this.bemMovelId = bemMovelId;
    }

    public Date getDataIncorporacao() {
        return dataIncorporacao;
    }

    public void setDataIncorporacao(Date dataIncorporacao) {
        this.dataIncorporacao = dataIncorporacao;
    }

    public Integer getProcessoIncorporacao() {
        return processoIncorporacao;
    }

    public void setProcessoIncorporacao(Integer processoIncorporacao) {
        this.processoIncorporacao = processoIncorporacao;
    }

    public Integer getAnoProcessoIncorporacao() {
        return anoProcessoIncorporacao;
    }

    public void setAnoProcessoIncorporacao(Integer anoProcessoIncorporacao) {
        this.anoProcessoIncorporacao = anoProcessoIncorporacao;
    }
    
    
    
    
}
