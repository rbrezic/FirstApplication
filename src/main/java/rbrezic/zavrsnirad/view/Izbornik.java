/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rbrezic.zavrsnirad.view;

/**
 *
 * @author Korisnik
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        jmNaslovGrana.setText(Aplikacija.NASLOV_APP);
        lblPrijavljeni.setText("Prijavljeni kao - " + Aplikacija.operater.getImePrezime());
        //setTitle(Aplikacija.operater.getImePrezime());
        
        jmiOperateri.setVisible(Aplikacija.isAdmin());
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPrijavljeni = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmNaslovGrana = new javax.swing.JMenu();
        jmiOperateri = new javax.swing.JMenuItem();
        jmiNekretnine = new javax.swing.JMenuItem();
        jmiVlasnici = new javax.swing.JMenuItem();
        jmiLokacije = new javax.swing.JMenuItem();
        jmiVrste = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiIzlaz = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblPrijavljeni.setText("Prijavljeni");

        jmNaslovGrana.setText("NASLOV");
        jmNaslovGrana.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jmiOperateri.setText("Operateri");
        jmNaslovGrana.add(jmiOperateri);

        jmiNekretnine.setText("Nekretnine");
        jmiNekretnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNekretnineActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiNekretnine);

        jmiVlasnici.setText("Vlasnici");
        jmiVlasnici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVlasniciActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiVlasnici);

        jmiLokacije.setText("Lokacije");
        jmiLokacije.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLokacijeActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiLokacije);

        jmiVrste.setText("Vrste");
        jmNaslovGrana.add(jmiVrste);
        jmNaslovGrana.add(jSeparator1);

        jmiIzlaz.setBackground(new java.awt.Color(255, 255, 255));
        jmiIzlaz.setText("Izlaz");
        jmiIzlaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiIzlazActionPerformed(evt);
            }
        });
        jmNaslovGrana.add(jmiIzlaz);

        jMenuBar1.add(jmNaslovGrana);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblPrijavljeni, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 308, Short.MAX_VALUE)
                .addComponent(lblPrijavljeni))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiNekretnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNekretnineActionPerformed
        new Nekretnine().setVisible(true);
    }//GEN-LAST:event_jmiNekretnineActionPerformed

    private void jmiVlasniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVlasniciActionPerformed
        new Vlasnici().setVisible(true);
    }//GEN-LAST:event_jmiVlasniciActionPerformed

    private void jmiIzlazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiIzlazActionPerformed
                                      
        dispose(); 
    }//GEN-LAST:event_jmiIzlazActionPerformed

    private void jmiLokacijeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLokacijeActionPerformed
        new Lokacije().setVisible(true);
    }//GEN-LAST:event_jmiLokacijeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Izbornik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Izbornik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu jmNaslovGrana;
    private javax.swing.JMenuItem jmiIzlaz;
    private javax.swing.JMenuItem jmiLokacije;
    private javax.swing.JMenuItem jmiNekretnine;
    private javax.swing.JMenuItem jmiOperateri;
    private javax.swing.JMenuItem jmiVlasnici;
    private javax.swing.JMenuItem jmiVrste;
    private javax.swing.JLabel lblPrijavljeni;
    // End of variables declaration//GEN-END:variables

}


