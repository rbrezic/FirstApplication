/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;

import rbrezic.zavrsnirad.model.Osoba;
import rbrezic.zavrsnirad.utility.AgencijaException;



/**
 *
 * @author Korisnik
 * @param <T>
 */
public abstract class ObradaOsoba<T extends Osoba> extends Obrada<T> {
    
    /**
     *
     * @throws AgencijaException
     */
    @Override
    protected void kontrolaCreate() throws AgencijaException {
     kontrolaPrezime();
    
    }

  
    @Override
    protected void kontrolaUpdate() throws AgencijaException {
        kontrolaPrezime();
      }

   

    private void kontrolaPrezime() throws AgencijaException {
       if(entitet.getIme()==null || entitet.getIme().trim().isEmpty()){
         throw new AgencijaException("Prezime obavezno");
     } }
    
    
    
    
}
