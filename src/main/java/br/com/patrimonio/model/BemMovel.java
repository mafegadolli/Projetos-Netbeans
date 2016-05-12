/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.model;

import br.com.patrimonio.chave.composta.BemMovelChaveComposta;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author MARCOS
 */
@Entity
@Table(name = "bem")
public class BemMovel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private BemMovelChaveComposta bemMovelId;
 
    @Temporal(value=TemporalType.DATE)
    @Column(name = "data_incorporacao")
    private Date dataIncorporacao;
    
    @Column(name = "processo_incorporacao")
    private Integer processoIncorporacao;
    @Column(name = "ano_processo_incorporacao")
    private Integer anoProcessoIncorporacao;
    @Column(name = "processo_baixa")
    private Integer processoBaixa;
    @Column(name = "ano_processo_baixa")
    private Integer anoProcessoBaixa;
    
    @Temporal(value=TemporalType.DATE)
    @Column(name = "data_baixa")
    private Date dataBaixa;   
    
    
    //private PlanoContabil planoContabil;

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

    public Integer getProcessoBaixa() {
        return processoBaixa;
    }

    public void setProcessoBaixa(Integer processoBaixa) {
        this.processoBaixa = processoBaixa;
    }

    public Integer getAnoProcessoBaixa() {
        return anoProcessoBaixa;
    }

    public void setAnoProcessoBaixa(Integer anoProcessoBaixa) {
        this.anoProcessoBaixa = anoProcessoBaixa;
    }

    public Date getDataBaixa() {
        return dataBaixa;
    }

    public void setDataBaixa(Date dataBaixa) {
        this.dataBaixa = dataBaixa;
    }

   
  


}
