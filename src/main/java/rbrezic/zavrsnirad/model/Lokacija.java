/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author Korisnik
 */
@Entity
public class Lokacija extends Entitet {
    
    private String zupanija;
    @Column(name = "naziv_mjesta")
    private String nazivMjesta;
    @Column(name = "postanski_broj")
    private String postanskiBroj;
    private String ulica;
    @Column(name = "broj_kuce")
    private String brojKuce;
    
    
     @OneToMany(mappedBy = "lokacija")
    private List<Nekretnina> nekretnine = new ArrayList<>();
    public List<Nekretnina> getNekretnine() {
       return nekretnine;
    }

    public String getZupanija() {
        return zupanija;
    }

    public void setZupanija(String zupanija) {
        this.zupanija = zupanija;
    }

    public String getNazivMjesta() {
        return nazivMjesta;
    }

    public void setNazivMjesta(String nazivMjesta) {
        this.nazivMjesta = nazivMjesta;
    }

    public String getPostanskiBroj() {
        return postanskiBroj;
    }

    public void setPostanskiBroj(String postanskiBroj) {
        this.postanskiBroj = postanskiBroj;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getBrojKuce() {
        return brojKuce;
    }

    public void setBrojKuce(String brojKuce) {
        this.brojKuce = brojKuce;
    }
    @Override
    public String toString() {
        return getNazivMjesta()+" ("+getUlica()+getBrojKuce()+")";
    }


    
}
