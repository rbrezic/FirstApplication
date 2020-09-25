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
    protected Session session;
    
    public abstract List<T> getPodaci();
    protected abstract void kontrolaCreate() throws AgencijaException;
    protected abstract void kontrolaUpdate() throws AgencijaException;
    protected abstract void kontrolaDelete() throws AgencijaException;
    
    public Obrada(T entitet) {
        this();
        this.entitet = entitet;
    }  
    
    public Obrada() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    public T create() throws AgencijaException {
        kontrolaCreate();
        save();
        return entitet;
    }
    
    public T createAll(List<T> lista) throws AgencijaException {
        session.beginTransaction();
        for (T t : lista) {
            setEntitet(t);
            kontrolaCreate();
            session.save(t);
        }
        session.getTransaction().commit();
       
      
        return entitet;
    }

    public T update() throws AgencijaException {
        kontrolaUpdate();
        save();
        return entitet;
    }

    public boolean delete() throws AgencijaException {
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
        return true;
    }

    private void save() {
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
    }

    public T getEntitet() {
        return entitet;
    }

    public void setEntitet(T entitet) {
        this.entitet = entitet;
    }

    
}
