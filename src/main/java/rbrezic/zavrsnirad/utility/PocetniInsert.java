/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.utility;

import java.math.BigDecimal;
import org.hibernate.Session;
import rbrezic.zavrsnirad.model.Nekretnina;

/**
 *
 * @author Korisnik
 */
public class PocetniInsert {
    public static void izvedi(){
    Session session = HibernateUtil.getSessionFactory().openSession();
    
    Nekretnina villa = new Nekretnina();
    villa.setNaziv("Villa");
    villa.setLegalizacija(Boolean.TRUE);
    villa.setKvadratura(new BigDecimal(200.00));
    
    
    
    
    
    }
}
