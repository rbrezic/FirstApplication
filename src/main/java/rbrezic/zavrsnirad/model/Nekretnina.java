/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.model;

import java.math.BigDecimal;
import javax.persistence.Entity;

/**
 *
 * @author Korisnik
 */
@Entity
public class Nekretnina extends Entitet {
    
    private String naziv;
    private Boolean legalizacija;
    private BigDecimal kvadratura;
    private String opis;

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
   
   
    

    
    
    
}
