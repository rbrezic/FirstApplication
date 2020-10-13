/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;

import java.util.List;

import rbrezic.zavrsnirad.model.Lokacija;
import rbrezic.zavrsnirad.utility.AgencijaException;

/**
 *
 * @author Korisnik
 * 
 */
public class ObradaLokacija extends Obrada<Lokacija> {
    
    @Override
    public List<Lokacija> getPodaci() {
        return session.createQuery("from Lokacija").list();
         }

    

    @Override
    protected void kontrolaCreate() throws AgencijaException {
        kontrolaZupanija();
        kontrolaNazivMjesta();
        kontrolaPostanskiBroj();
        kontrolaUlica();
        kontrolaBrojKuce();
    }
    public List<Lokacija> getPodaci(String uvjet) {
      return session.createQuery("from Lokacija l "
              + " where concat(l.nazivMjesta) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
    }

    @Override
    protected void kontrolaUpdate() throws AgencijaException {
        kontrolaZupanija();
        
    }

    @Override
    protected void kontrolaDelete() throws AgencijaException {
        
    }

    private void kontrolaZupanija() throws AgencijaException {
        //if(entitet.getZupanija()==null || entitet.getZupanija().isEmpty() ){
        //  throw  new AgencijaException("Unos županije obavezan");
        //}
    }
    private void kontrolaNazivMjesta() throws AgencijaException {
        if(entitet.getNazivMjesta()==null || entitet.getNazivMjesta().isEmpty() ){
          throw  new AgencijaException("Unos naziva mjesta obavezan");
        }
       
    }

    private void kontrolaPostanskiBroj() throws AgencijaException {
      
        
    }

    private void kontrolaUlica() throws AgencijaException {
        if(entitet.getUlica()==null || entitet.getUlica().isEmpty() ){
          throw  new AgencijaException("Unos ulice obavezan");
        }
       
    }

    private void kontrolaBrojKuce() throws AgencijaException {
        if(entitet.getBrojKuce()==null || entitet.getBrojKuce().isEmpty() ){
          throw  new AgencijaException("Unos broja kuće obavezan");
        }
        
    }

    


}


