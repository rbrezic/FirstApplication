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
        
         }

    private void kontrolaVrsta() throws AgencijaException {
        if(entitet.getNaziv()==null || entitet.getNaziv().trim().isEmpty()){
            throw new AgencijaException("Vrsta obavezna");
        } }
    
}
