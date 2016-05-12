/*
Agora, sempre que precisarmos de uma
EntityManager, podemos chamar:
EntityManager manager = JpaUtil.getEntityManager();
*/
package br.com.patrimonio.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author MARCOS
 */

public class JpaUtil {
    
    
    private static EntityManagerFactory factory;
    
    static{
        factory = Persistence.createEntityManagerFactory("PatrimonioPU");
    }

    public JpaUtil() {
        
    }

    
    /**
     * E podemos indicar ao CDI que queremos que ele use esse método sempre que
     * alguém pedir a injeção de um EntityManager. Fazemos isso com a anotação
     * @return 
     * @Produces
     */  
 
    public static EntityManager getEntityManager(){
        return factory.createEntityManager();
    }
    
}
