/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;

import java.util.List;
import org.mindrot.jbcrypt.BCrypt;
import rbrezic.zavrsnirad.model.Operater;
import rbrezic.zavrsnirad.utility.AgencijaException;

/**
 *
 * @author Korisnik
 */
public class ObradaOperater extends Obrada<Operater> {
    
    public Operater autoriziraj(String email, char[] lozinka){
        
        Operater operater = (Operater) sesion.createQuery(
                " from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();
        
        if(operater==null){
            return null;
        }
        
        return BCrypt.checkpw(new String(lozinka), operater.getLozinka()) 
                ? operater : null;
    }
    @Override
    public List<Operater> getPodaci() {
         return sesion.createQuery("from Operater").list();
     }

    @Override
    protected void kontrolaCreate() throws AgencijaException {
        kontrolaIme();
     }

    @Override
    protected void kontrolaUpdate() throws AgencijaException {
    }

    @Override
    protected void kontrolaDelete() throws AgencijaException {
     }

    private void kontrolaIme() {
        
     }

    
    
}
