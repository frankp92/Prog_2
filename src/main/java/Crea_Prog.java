/*
Codice contenente sia le operazioni di creazione Progetto(I/O, Query al DB) sia l'interfaccia grafica
 */

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Crea_Prog extends javax.swing.JFrame {

    public Crea_Prog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Titolo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Titolo_Pj = new javax.swing.JTextField();
        Durata_Pj = new javax.swing.JTextField();
        Posti_Pj = new javax.swing.JTextField();
        Tag_Pj = new javax.swing.JTextField();
        Crea_button = new javax.swing.JButton();
        Tipologia_Pj = new javax.swing.JComboBox<>();
        Privacy_Pj = new javax.swing.JComboBox<>();
        Data_Pj = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descrizione_Pj = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Creazione Progetto");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setPreferredSize(new java.awt.Dimension(140, 17));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        Titolo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Titolo.setText("Titolo :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Descrizione :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Data :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Tipologia :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Durata mesi :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Posti :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Privacy evento :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tag :");

        Titolo_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titolo_PjActionPerformed(evt);
            }
        });

        Tag_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tag_PjActionPerformed(evt);
            }
        });

        Crea_button.setText("Crea");
        Crea_button.setPreferredSize(new java.awt.Dimension(60, 23));
        Crea_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crea_buttonActionPerformed(evt);
            }
        });

        Tipologia_Pj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lavoro", "Tesi", "Tirocinio" }));
        Tipologia_Pj.setSelectedIndex(-1);
        Tipologia_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipologia_PjActionPerformed(evt);
            }
        });

        Privacy_Pj.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pubblica", "Privata" }));
        Privacy_Pj.setSelectedIndex(-1);
        Privacy_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Privacy_PjActionPerformed(evt);
            }
        });

        Data_Pj.setCalendarPreferredSize(new java.awt.Dimension(400, 200));

        Descrizione_Pj.setColumns(10);
        Descrizione_Pj.setLineWrap(true);
        Descrizione_Pj.setRows(5);
        Descrizione_Pj.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Descrizione_Pj);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Titolo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titolo_Pj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Data_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(Posti_Pj)
                                    .addComponent(Tipologia_Pj, 0, 139, Short.MAX_VALUE)
                                    .addComponent(Tag_Pj)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Privacy_Pj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Durata_Pj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(Crea_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Titolo_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Data_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Tipologia_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Durata_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Posti_Pj))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tag_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Privacy_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Crea_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(416, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Titolo_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titolo_PjActionPerformed
       
    }//GEN-LAST:event_Titolo_PjActionPerformed

    private void Crea_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crea_buttonActionPerformed
        
        Librerie conn = new Librerie();
        
        String Titolo;
        String Descrizione;
        String Data;
        String Tipologia;
        String Durata;
        String Posti;
        String Tag;
        String Privacy;
        String[] Progetto= new String [8];
        Boolean Check_EmptyFields;
        
        Titolo = Titolo_Pj.getText();
        if (!(Pattern.matches("^[ -}]{3,32}$", Titolo_Pj.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire titolo valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Descrizione = Descrizione_Pj.getText();
        if (!(Pattern.matches("^[ -}]{3,500}$", Descrizione_Pj.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire una descrizione valida(MAX 500 caratteri)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Data = Data_Pj.getText();
        Tag = Tag_Pj.getText();
        if (!(Pattern.matches("^[ -}]{3,500}$", Tag_Pj.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un tag valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Tipologia="";
        int tip = Tipologia_Pj.getSelectedIndex();
        if (tip==0){
             Tipologia = "Lavoro";
        }else if(tip==1){
             Tipologia = "Tesi";            
        }else if(tip==2) {
             Tipologia = "Tirocinio";       
        }
        Durata = Durata_Pj.getText();
        if (!(Pattern.matches("^[0-9]{1,3}$", Durata_Pj.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire durata valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
        Posti = Posti_Pj.getText();
        if (!(Pattern.matches("^[0-9]{1,3}$", Posti_Pj.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire posti validi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
        Privacy="";
        int prv = Privacy_Pj.getSelectedIndex();
        if (prv==0){
             Privacy = "Pubblico";
        }else if(prv==1){
             Privacy = "Privato";            
        }       
                
        Progetto[1]=Titolo;
        Progetto[2]=Descrizione;
        Progetto[0]=Data;
        Progetto[3]=Tipologia;
        Progetto[4]=Durata;
        Progetto[5]=Posti;
        Progetto[6]=Privacy;
        Progetto[7]=Tag;
        
        Check_EmptyFields = (Titolo.isEmpty())|| (Descrizione.isEmpty())|| (Data.isEmpty()) || (Tipologia.isEmpty()) || (Durata.isEmpty()) || (Posti.isEmpty()) || (Privacy.isEmpty())|| (Tag.isEmpty()) ;
        
        if(Check_EmptyFields==true){
            
            JOptionPane.showMessageDialog(null, "Compila tutti i campi", "Error", JOptionPane.ERROR_MESSAGE);
            
        }else{
            if ((prv==0) || (prv==1)){
                conn.crea_Progetto(Progetto,Menu.hidden2.getText() );
                JOptionPane.showMessageDialog(this,"Progetto creato con successo");
                try {
                    GDrive.Creazione_cartella(Titolo);
                } catch (IOException ex) {
                    Logger.getLogger(Crea_Prog.class.getName()).log(Level.SEVERE, null, ex);
                } catch (GeneralSecurityException ex) {
                    Logger.getLogger(Crea_Prog.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
            }else {
                JOptionPane.showMessageDialog(this,"Errore, seleziona Privacy");
            }
        }
    }//GEN-LAST:event_Crea_buttonActionPerformed

    private void Privacy_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Privacy_PjActionPerformed
        
    }//GEN-LAST:event_Privacy_PjActionPerformed

    private void Tipologia_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipologia_PjActionPerformed
        
    }//GEN-LAST:event_Tipologia_PjActionPerformed

    private void Tag_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tag_PjActionPerformed
       
    }//GEN-LAST:event_Tag_PjActionPerformed

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
            java.util.logging.Logger.getLogger(Crea_Prog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crea_Prog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crea_Prog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crea_Prog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crea_Prog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Crea_button;
    private datechooser.beans.DateChooserCombo Data_Pj;
    private javax.swing.JTextArea Descrizione_Pj;
    private javax.swing.JTextField Durata_Pj;
    private javax.swing.JTextField Posti_Pj;
    private javax.swing.JComboBox<String> Privacy_Pj;
    private javax.swing.JTextField Tag_Pj;
    private javax.swing.JComboBox<String> Tipologia_Pj;
    private javax.swing.JLabel Titolo;
    private javax.swing.JTextField Titolo_Pj;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
