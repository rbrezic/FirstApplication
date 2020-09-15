/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad;

import rbrezic.zavrsnirad.utility.HibernateUtil;
import rbrezic.zavrsnirad.utility.PocetniInsert;

/**
 *
 * @author Korisnik
 */
public class Start {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory().openSession();
        
        PocetniInsert.izvedi();
    }
    
}
