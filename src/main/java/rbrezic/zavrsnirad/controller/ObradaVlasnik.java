/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;


import java.util.List;
import rbrezic.zavrsnirad.model.Vlasnik;
import rbrezic.zavrsnirad.utility.AgencijaException;
import rbrezic.zavrsnirad.utility.Oib;

/**
 *
 * @author Korisnik
 * 
 */
public class ObradaVlasnik extends ObradaOsoba<Vlasnik>  {
    
    @Override
    public List<Vlasnik> getPodaci() {
      return session.createQuery("from Vlasnik").list();
    }
    
    public List<Vlasnik> getPodaci(String uvjet) {
      return session.createQuery("from Vlasnik v "
              + " where concat(v.ime, ' ', v.prezime, ' ', v.oib) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
    }
    
    
    @Override
    protected void kontrolaCreate() throws AgencijaException{
        kontrolaIme();
        kontrolaOib();
    }
    
    @Override
    protected void kontrolaUpdate() throws AgencijaException{
        kontrolaOib();
    }
    
    protected void kontrolaOib() throws AgencijaException{
        if(entitet.getOib()==null || entitet.getOib().isEmpty()){
            throw new AgencijaException("OIB obavezan");
        }
        if(!Oib.isValjan(entitet.getOib())){
            throw new AgencijaException("OIB nije valjan");
        }
    }
    protected void kontrolaIme() throws AgencijaException{
        if(entitet.getIme()==null || entitet.getIme().trim().isEmpty()){
            throw new AgencijaException("Ime obavezno");
        }
    }


    @Override
    protected void kontrolaDelete() throws AgencijaException {
        }

}

   
    



    
    
    
    

