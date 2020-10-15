/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Korisnik
 */
@Entity
public class Vrsta extends Entitet {
    
    private String naziv;

    public String getNaziv() {
        return naziv;
    }
    
    @OneToMany(mappedBy = "vrsta")
    private List<Nekretnina> nekretnine = new ArrayList<>();
    public List<Nekretnina> getNekretnine() {
       return nekretnine;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    @Override
    public String toString() {
        return getNaziv();
    }
    
    
    
}
