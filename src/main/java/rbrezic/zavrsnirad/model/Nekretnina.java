/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author Korisnik
 */
@Entity
public class Nekretnina extends Entitet {
    
    private String naziv;
    private BigDecimal kvadratura;
    private String opis;
    private Boolean legalizacija;
    private BigDecimal cijena;

    

    @ManyToOne
    private Lokacija lokacija;
    @ManyToOne
    private Vrsta vrsta;
    @ManyToOne
    private Vlasnik vlasnik;
    
    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Boolean getLegalizacija() {
        return legalizacija;
    }

    public void setLegalizacija(Boolean legalizacija) {
        this.legalizacija = legalizacija;
    }

    public BigDecimal getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(BigDecimal kvadratura) {
        this.kvadratura = kvadratura;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public Lokacija getLokacija() {
        return lokacija;
    }

    public void setLokacija(Lokacija lokacija) {
        this.lokacija = lokacija;
    }

    public Vrsta getVrsta() {
        return vrsta;
    }

    public void setVrsta(Vrsta vrsta) {
        this.vrsta = vrsta;
    }

    public Vlasnik getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Vlasnik vlasnik) {
        this.vlasnik = vlasnik;
    }
    @Override
    public String toString() {
        return getNaziv();
    }

    
    }
    
    

    
    
    

