/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


/**
 *
 * @author MARCOS
 */
@Entity
@Table(name="tipo_incorporacao")
public class TipoIncorporacao implements Serializable {
    
    private static final long serialVersionUID = 1L;
 
    @Id
    @Column(name = "codigo_tipo")
    @GeneratedValue(generator = "inc")
    @GenericGenerator(name = "inc", strategy = "increment")
    private Integer codigoTipo;
    
    @Column(name="descricao_incorporacao")
    private String descricaoIncorporacao;

    
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


    
}
