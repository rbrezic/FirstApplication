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
public class Operater extends Osoba  {
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
}
