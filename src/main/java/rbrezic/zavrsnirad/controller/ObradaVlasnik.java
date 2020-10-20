/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;


import java.math.BigDecimal;
import java.util.List;
import rbrezic.zavrsnirad.model.Vlasnik;
import rbrezic.zavrsnirad.utility.AgencijaException;
import rbrezic.zavrsnirad.utility.Oib;

/**
 *
 * @author Korisnik
 * 
 */
public class ObradaVlasnik extends ObradaOsoba<Vlasnik>  {
    
    @Override
    public List<Vlasnik> getPodaci() {
      return session.createQuery("from Vlasnik").list();
    }
    
    public List<Vlasnik> getPodaci(String uvjet) {
      return session.createQuery("from Vlasnik v "
              + " where concat(v.ime, ' ', v.prezime, ' ', v.oib) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
    }
    
    
    @Override
    protected void kontrolaCreate() throws AgencijaException{
        super.kontrolaCreate();
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOib();
        kontrolaOibBazaKreiraj();
    }
    
    @Override
    protected void kontrolaUpdate() throws AgencijaException{
        super.kontrolaUpdate();
        kontrolaIme();
        kontrolaPrezime();
        kontrolaOibBazaPromjeni();
        kontrolaOib();
    }
    
    protected void kontrolaOib() throws AgencijaException{
        if(entitet.getOib()==null || entitet.getOib().isEmpty()){
            throw new AgencijaException("OIB obavezan");
        }
        if(!Oib.isValjan(entitet.getOib())){
            throw new AgencijaException("OIB nije valjan");
        }
    }
    protected void kontrolaIme() throws AgencijaException{
         if(entitet.getIme().isEmpty()){
            throw new AgencijaException("Ime nije postavljeno, unijeti ime");
        }
        boolean broj=false;
        try {
            new BigDecimal(entitet.getIme());
            broj=true;
        } catch (Exception e) {
        }
        if(broj){
            throw new AgencijaException("Ime ne može biti broj, unijeti ime");
        }
        
        if(entitet.getIme().length()>50){
            throw new AgencijaException("Dužina imena ne može biti veća od 50 znakova");
        }
    }
    
    
    private void kontrolaOibBazaKreiraj() throws AgencijaException{
       List<Vlasnik> lista = session.createQuery(""
               + " from Vlasnik v "
               + " where v.oib=:oib "
               )
               .setParameter("oib", entitet.getOib())
               .list();
       if(lista.size()>0){
           throw  new AgencijaException("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", odaberite drugi OIB");
       }
       
    }
    
    private void kontrolaOibBazaPromjeni() throws AgencijaException{
       List<Vlasnik> lista = session.createQuery(""
               + " from Vlasnik v "
               + " where v.oib=:oib and v.id!=:id"
               )
               .setParameter("oib", entitet.getOib())
               .setParameter("id", entitet.getId())
               .list();
       if(lista.size()>0){
           throw  new AgencijaException("Oib je dodjeljen " + lista.get(0).getImePrezime() + ", odaberite drugi OIB");
       }
       
    }


    @Override
    protected void kontrolaDelete() throws AgencijaException {
        if (!entitet.getNekretnine().isEmpty()){
            throw new AgencijaException("NEMOGUĆE (Vlasnik posjeduje nekretninu)");
        }
        }

    private void kontrolaPrezime() throws AgencijaException {
        if(entitet.getPrezime().isEmpty()){
            throw new AgencijaException("Prezime nije postavljeno, unijeti prezime");
        }
        boolean broj=false;
        try {
            new BigDecimal(entitet.getPrezime());
            broj=true;
        } catch (Exception e) {
        }
        if(broj){
            throw new AgencijaException("Prezime ne može biti broj, unijeti prezime");
        }
        
        if(entitet.getPrezime().length()>50){
            throw new AgencijaException("Dužina prezimena ne može biti veća od 50 znakova");
        }}

}

   
    



    
    
    
    

