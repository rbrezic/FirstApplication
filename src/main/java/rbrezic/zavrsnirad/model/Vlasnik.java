/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author Korisnik
 */
@Entity
public class Vlasnik extends Osoba {
   
    
    private String kontakt;
    
    public String getKontakt() {
        return kontakt;
    }   
    /*
    private List<Nekretnina> nekretnine = new ArrayList<>();
    public List<Nekretnina> getNekretnine() {
       return nekretnine;
    }
    public void setNekretnine(List<Nekretnina> nekretnine) {
        this.nekretnine = nekretnine;
    }
    */

    public void setKontakt(String kontakt) {
        this.kontakt = kontakt;
    }
    
 
}
