/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.bean;

import br.com.patrimonio.model.TipoIncorporacao;
import br.com.patrimonio.model.dao.TipoIncorporacaoDao;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author MARCOS
 */

@ManagedBean
@RequestScoped
public class TipoIncorporacaoBean {

    TipoIncorporacao tipoIncorporacao = new TipoIncorporacao();
    TipoIncorporacaoDao tipoDao = new TipoIncorporacaoDao();

    private List<TipoIncorporacao> tiposIncorporacoes;
    
    private Integer codigoTipo;
    private String descricaoIncorporacao;
    
    
    public void inserirObjeto() {   
        tipoIncorporacao.setCodigoTipo(this.codigoTipo);
        tipoIncorporacao.setDescricaoIncorporacao(this.descricaoIncorporacao); 
        tipoDao.inserirTipoIncorporacao(tipoIncorporacao);
    }
       
    public void listaTodos(){
        tiposIncorporacoes = tipoDao.pesquisaTodosTiposIncorporacao();
    }

    public Integer getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(Integer codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public String getDescricaoIncorporacao() {
        return descricaoIncorporacao;
    }

    public void setDescricaoIncorporacao(String descricaoIncorporacao) {
        this.descricaoIncorporacao = descricaoIncorporacao;
    }

    public List<TipoIncorporacao> getTiposIncorporacoes() {
        return tiposIncorporacoes;
    }

    public void setTiposIncorporacoes(List<TipoIncorporacao> tiposIncorporacoes) {
        this.tiposIncorporacoes = tiposIncorporacoes;
    }

}
