/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.teste;

import br.com.patrimonio.model.TipoIncorporacao;
import br.com.patrimonio.model.dao.TipoIncorporacaoDao;
import javax.swing.JOptionPane;

/**
 *
 * @author MARCOS
 */
public class TipoIncorporacaoTeste {
    public static void main(String[] args) {
        
        TipoIncorporacao tipoIncorporacao = new TipoIncorporacao();
       
        tipoIncorporacao.setCodigoTipo (Integer.parseInt(JOptionPane.showInputDialog("Digite o código do tipo de Incorporação: ")));
        tipoIncorporacao.setDescricaoIncorporacao(JOptionPane.showInputDialog("Digite Nome do Tipo Incorporacao: "));
        
        TipoIncorporacaoDao dao = new TipoIncorporacaoDao();
        dao.inserirTipoIncorporacao(tipoIncorporacao);
        
    }
}