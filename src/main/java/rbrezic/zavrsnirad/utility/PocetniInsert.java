/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.utility;

import java.math.BigDecimal;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;
import rbrezic.zavrsnirad.controller.ObradaOperater;
import rbrezic.zavrsnirad.model.Nekretnina;
import rbrezic.zavrsnirad.model.Operater;

/**
 *
 * @author Korisnik
 */
public class PocetniInsert {
    public static void izvedi(){
    Session session = HibernateUtil.getSessionFactory().openSession();
        
        
        Operater operater = new Operater();
        operater.setIme("Rafael");
        operater.setPrezime("Brezić");
        operater.setUloga("Operater");
        operater.setEmail("brezicrafael10@gmail.com");
        operater.setOib(Oib.getOibIiCentrala());
        operater.setLozinka(BCrypt.hashpw("r", BCrypt.gensalt()));
        
        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (AgencijaException ex) {
            ex.printStackTrace();
        }
    
         session.beginTransaction();
    
    
    
    
    }
}
