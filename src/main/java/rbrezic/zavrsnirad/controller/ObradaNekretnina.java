/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;

import java.util.List;
import rbrezic.zavrsnirad.model.Nekretnina;
import rbrezic.zavrsnirad.utility.AgencijaException;

/**
 *
 * @author Korisnik
 */
public class ObradaNekretnina extends Obrada<Nekretnina> {
    
    public ObradaNekretnina(Nekretnina nekretnina) {
        super(nekretnina);
    }

    public ObradaNekretnina() {
        super();
    }

    @Override
    public List<Nekretnina> getPodaci() {
        return session.createQuery("from Nekretnina").list();
    }

    @Override
    protected void kontrolaCreate() throws AgencijaException {
        kontrolaNaziv();
       }

    @Override
    protected void kontrolaUpdate() throws AgencijaException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaDelete() throws AgencijaException {
        
      }

    private void kontrolaNaziv() throws AgencijaException { 
        if(entitet.getNaziv()==null || entitet.getNaziv().isEmpty() ){
          throw  new AgencijaException("Unos naziva obavezan");
        }
     }
    
}
