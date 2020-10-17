/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;

import java.math.BigDecimal;
import java.util.List;

import rbrezic.zavrsnirad.model.Lokacija;
import rbrezic.zavrsnirad.utility.AgencijaException;

/**
 *
 * @author Korisnik
 * 
 */
public class ObradaLokacija extends Obrada<Lokacija> {
    
    @Override
    public List<Lokacija> getPodaci() {
        return session.createQuery("from Lokacija").list();
         }

    

    @Override
    protected void kontrolaCreate() throws AgencijaException {
        kontrolaZupanija();
        kontrolaNazivMjesta();
        kontrolaPostanskiBroj();
        kontrolaUlica();
        kontrolaBrojKuce();
    }
    public List<Lokacija> getPodaci(String uvjet) {
      return session.createQuery("from Lokacija l "
              + " where concat(l.nazivMjesta) "
              + " like :uvjet ")
              .setParameter("uvjet", "%"+uvjet+"%")
              .setMaxResults(20)
              .list();
    }

    @Override
    protected void kontrolaUpdate() throws AgencijaException {
        kontrolaCreate();
        
    }

    @Override
    protected void kontrolaDelete() throws AgencijaException {
        if (!entitet.getNekretnine().isEmpty()){
            throw new AgencijaException("NEMOGUĆE (Nekretnina posjeduje ovu lokaciju)");
        }
        
    }   

    private void kontrolaZupanija() throws AgencijaException {
        //if(entitet.getZupanija()==null || entitet.getZupanija().isEmpty() ){
        //  throw  new AgencijaException("Unos županije obavezan");
        //}
    }
    private void kontrolaNazivMjesta() throws AgencijaException {
        if(entitet.getNazivMjesta().isEmpty()){
            throw new AgencijaException("Naziv nije postavljen, unijeti naziv");
        }
        boolean broj=false;
        try {
            new BigDecimal(entitet.getNazivMjesta());
            broj=true;
        } catch (Exception e) {
        }
        if(broj){
            throw new AgencijaException("Naziv ne može biti broj, unijeti naziv");
        }
           if(entitet.getNazivMjesta().length()>50){
            throw new AgencijaException("Dužina naziva ne može biti veća od 50 znakova");
        
        }
       
    }

    private void kontrolaPostanskiBroj() throws AgencijaException {
        if(entitet.getPostanskiBroj().isEmpty()){
            throw new AgencijaException("Poštanski broj nije postavljen");
        }
        
        boolean PostanskiBroj=true;
        try {
            new BigDecimal(entitet.getPostanskiBroj());
            PostanskiBroj=false;
        } catch (Exception e) {
        }
        if(PostanskiBroj){
            throw new AgencijaException("Nepravilan poštanski broj");
        }
        
        
        int i=Integer.parseInt(entitet.getPostanskiBroj()); 
        if(i<10000 || i>53296){
            throw  new AgencijaException("Nepravilan poštanski broj");
        }
        
        
       /*if (!entitet.getPostanskiBroj().matches("[0-9]+")){
            throw  new AgencijaException("Nepravilan poštanski broj");
        }
      && entitet.getPostanskiBroj().length() > 2
        */
    }

    private void kontrolaUlica() throws AgencijaException {
        if(entitet.getUlica()==null || entitet.getUlica().isEmpty() ){
          throw  new AgencijaException("Unos ulice obavezan");
        }
       
    }

    private void kontrolaBrojKuce() throws AgencijaException {
        if(entitet.getBrojKuce().isEmpty()){
            throw new AgencijaException("Broj kuće nije postavljen");
        }
        
        boolean KucniBroj=true;
        try {
            new BigDecimal(entitet.getBrojKuce());
            KucniBroj=false;
        } catch (Exception e) {
        }
        if(KucniBroj){
            throw new AgencijaException("Nepravilan broj kuće");
        }}
        
    }

    





