/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.patrimonio.model.dao;

import br.com.patrimonio.model.BemMovel;
import java.util.List;

/**
 *
 * @author MARCOS
 */
public class BemMovel2Dao extends GenericDao<BemMovel>{

    public List<BemMovel> pesquisaTodos() {
        return super.pesquisaTodos(new BemMovel());
    }
}
