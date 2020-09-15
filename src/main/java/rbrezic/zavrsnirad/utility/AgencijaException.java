/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.utility;

/**
 *
 * @author Korisnik
 */
public class AgencijaException extends Exception {
    
      private String poruka;

    public AgencijaException(String poruka) {
        this.poruka=poruka;
    }

    public String getPoruka() {
        return poruka;
    }
    
    
}
