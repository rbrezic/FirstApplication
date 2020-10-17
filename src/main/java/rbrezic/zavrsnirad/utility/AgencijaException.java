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
      private String komponenta;

    public AgencijaException(String poruka) {
        this.poruka=poruka;
        this.komponenta="";
    }
    
     public AgencijaException(String komponenta, String poruka) {
        this(poruka);
        this.komponenta=komponenta;
    }

    public String getPoruka() {
        return poruka;
    }
    public String getKomponenta() {
        return komponenta;
    }

    public void setKomponenta(String komponenta) {
        this.komponenta = komponenta;
    }
    
    
}
