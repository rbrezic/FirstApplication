/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.view;


import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import rbrezic.zavrsnirad.model.Vlasnik;

/**
 *
 * @author Korisnik
 */
public class VlasnikCellRenderer extends JLabel implements ListCellRenderer<Vlasnik> {

    @Override
    public Component getListCellRendererComponent(JList<? extends Vlasnik> list, Vlasnik value, int index, boolean isSelected, boolean cellHasFocus) {
        setText(value.getIme() + " " + value.getPrezime());
        if (isSelected) {
            setBackground(Color.BLUE);
            setForeground(Color.RED);
        } else {
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        return this;
    }

}
