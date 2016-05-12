/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.chave.composta;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author MARCOS
 */
@Embeddable
public class BemMovelChaveComposta implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Integer sistema;
    private Integer chapa;
    private Integer naturezaBem;

    public BemMovelChaveComposta() {
    }

    public BemMovelChaveComposta(Integer sistema, Integer chapa, Integer naturezaBem) {
        this.sistema = sistema;
        this.chapa = chapa;
        this.naturezaBem = naturezaBem;
    }

    public Integer getSistema() {
        return sistema;
    }

    public void setSistema(Integer sistema) {
        this.sistema = sistema;
    }

    public Integer getChapa() {
        return chapa;
    }

    public void setChapa(Integer chapa) {
        this.chapa = chapa;
    }

    public Integer getNaturezaBem() {
        return naturezaBem;
    }

    public void setNaturezaBem(Integer naturezaBem) {
        this.naturezaBem = naturezaBem;
    }
    
    
}
