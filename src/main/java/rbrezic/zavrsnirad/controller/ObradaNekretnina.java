/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;

import java.math.BigDecimal;
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
    
    public List<Nekretnina> getPodaci(String uvjet) {
      return session.createQuery("from Nekretnina n "
              + " where concat(n.naziv) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
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
        if(entitet.getNaziv().isEmpty()){
            throw new AgencijaException("Naziv nije postavljen, unijeti naziv");
        }
        boolean broj=false;
        try {
            new BigDecimal(entitet.getNaziv());
            broj=true;
        } catch (Exception e) {
        }
        if(broj){
            throw new AgencijaException("Naziv ne može biti broj, unijeti naziv");
        }
        
        if(entitet.getNaziv().length()>50){
            throw new AgencijaException("Dužina naziva ne može biti veća od 50 znakova");
        }
    }
     
    private void kontrolaNull(Object o, String poruka) throws AgencijaException{
        if(o==null){
            throw new AgencijaException(poruka);
        }
    }
    
}
