/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.controller;

import java.util.List;
import org.hibernate.Session;
import rbrezic.zavrsnirad.utility.AgencijaException;
import rbrezic.zavrsnirad.utility.HibernateUtil;

/**
 *
 * @author Korisnik
 */
public abstract class Obrada<T> {
    protected T entitet;
    protected Session sesion;
    
    public abstract List<T> getPodaci();
    protected abstract void kontrolaCreate() throws AgencijaException;
    protected abstract void kontrolaUpdate() throws AgencijaException;
    protected abstract void kontrolaDelete() throws AgencijaException;
    
    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
    }  
    
    public Obrada() {
        this.sesion = HibernateUtil.getSessionFactory().openSession();
    }

    public T create() throws AgencijaException {
        kontrolaCreate();
        save();
        return entitet;
    }
    
    public T createAll(List<T> lista) throws AgencijaException {
        sesion.beginTransaction();
        for (T t : lista) {
            setEntitet(t);
            kontrolaCreate();
            sesion.save(t);
        }
        sesion.getTransaction().commit();
       
      
        return entitet;
    }

    public T update() throws AgencijaException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    public boolean delete() throws AgencijaException {
        kontrolaDelete();
        sesion.beginTransaction();
        sesion.delete(entitet);
        sesion.getTransaction().commit();
        return true;
    }

    private void save() {
        sesion.beginTransaction();
        sesion.save(entitet);
        sesion.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    
}
