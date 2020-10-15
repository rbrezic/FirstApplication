/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;

import java.util.List;
import rbrezic.zavrsnirad.model.Vrsta;
import rbrezic.zavrsnirad.utility.AgencijaException;

/**
 *
 * @author Korisnik
 */
public class ObradaVrsta extends Obrada<Vrsta> {

    @Override
    public List<Vrsta> getPodaci() {
        return session.createQuery("from Vrsta").list();
        }
    public List<Vrsta> getPodaci(String uvjet) {
      return session.createQuery("from Vrsta v "
              + " where concat(v.naziv) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
    }

    @Override
    protected void kontrolaCreate() throws AgencijaException {
        kontrolaVrsta();
        
         }

    @Override
    protected void kontrolaUpdate() throws AgencijaException {
        kontrolaVrsta();
         }

    @Override
    protected void kontrolaDelete() throws AgencijaException {
        if (!entitet.getNekretnine().isEmpty()){
            throw new AgencijaException("NEMOGUĆE(Vrsta je dodijeljena nekoj nekretnini)");
        }
        
         }

    private void kontrolaVrsta() throws AgencijaException {
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().isEmpty()){
            throw new AgencijaException("Vrsta obavezna");
        } }
    
}
