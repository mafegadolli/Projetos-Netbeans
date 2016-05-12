/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author MARCOS
 */
public class PlanoContabil implements Serializable{
    
     private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "codigo_contabil")
    private String codigoContabil;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "saldo_inicial")
    private Double saldoInicial;
    @Column(name = "FROMCAD")
    private Integer fromcad;
    @Column(name = "folha")
    private Integer folha;
    @Column(name = "saldo_inicial_global")
    private Double saldoInicialGlobal;
    @Column(name = "codigo_contabil_antigo")
    private String codigoContabilAntigo;

    public String getCodigoContabil() {
        return codigoContabil;
    }

    public void setCodigoContabil(String codigoContabil) {
        this.codigoContabil = codigoContabil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Integer getFromcad() {
        return fromcad;
    }

    public void setFromcad(Integer fromcad) {
        this.fromcad = fromcad;
    }

    public Integer getFolha() {
        return folha;
    }

    public void setFolha(Integer folha) {
        this.folha = folha;
    }

    public Double getSaldoInicialGlobal() {
        return saldoInicialGlobal;
    }

    public void setSaldoInicialGlobal(Double saldoInicialGlobal) {
        this.saldoInicialGlobal = saldoInicialGlobal;
    }

    public String getCodigoContabilAntigo() {
        return codigoContabilAntigo;
    }

    public void setCodigoContabilAntigo(String codigoContabilAntigo) {
        this.codigoContabilAntigo = codigoContabilAntigo;
    }

    
    
}
