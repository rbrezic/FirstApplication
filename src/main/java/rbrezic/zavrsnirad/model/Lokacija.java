/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.model;

import javax.persistence.Entity;

/**
 *
 * @author Korisnik
 */
@Entity
public class Lokacija extends Entitet {
    
    private String zupanija;
    private String naziv_mjesta;
    private String postanski_broj;
    private String ulica;
    private String broj_kuce;

    public String getZupanija() {
        return zupanija;
    }

    public void setZupanija(String zupanija) {
        this.zupanija = zupanija;
    }

    public String getNaziv_mjesta() {
        return naziv_mjesta;
    }

    public void setNaziv_mjesta(String naziv_mjesta) {
        this.naziv_mjesta = naziv_mjesta;
    }

    public String getPostanski_broj() {
        return postanski_broj;
    }

    public void setPostanski_broj(String postanski_broj) {
        this.postanski_broj = postanski_broj;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getBroj_kuce() {
        return broj_kuce;
    }

    public void setBroj_kuce(String broj_kuce) {
        this.broj_kuce = broj_kuce;
    }
    
}
