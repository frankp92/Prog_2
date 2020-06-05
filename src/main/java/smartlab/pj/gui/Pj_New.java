package smartlab.pj.gui;

/*
Codice contenente sia le operazioni di creazione Evento(I/O, Query al DB) sia l'interfaccia grafica
 */

import smartlab.ev.gui.Ev_New;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import smartlab.Service_GDrive;
import smartlab.pj.Project;
import smartlab.user.gui.User_Menu;

public class Pj_New extends javax.swing.JFrame {

    public Pj_New() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Titolo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Pj_Titolo = new javax.swing.JTextField();
        Pj_Durata = new javax.swing.JTextField();
        Pj_Posti = new javax.swing.JTextField();
        Pj_Tag = new javax.swing.JTextField();
        Pj_New_button = new javax.swing.JButton();
        Pj_Tipologia = new javax.swing.JComboBox<>();
        Pj_Privacy = new javax.swing.JComboBox<>();
        Pj_Data = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pj_Descrizione = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crea Progetto");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Creazione Progetto");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel10.setPreferredSize(new java.awt.Dimension(140, 17));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 470));

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

        Pj_Titolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pj_TitoloActionPerformed(evt);
            }
        });

        Pj_Tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pj_TagActionPerformed(evt);
            }
        });

        Pj_New_button.setText("Crea");
        Pj_New_button.setPreferredSize(new java.awt.Dimension(60, 23));
        Pj_New_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pj_New_buttonActionPerformed(evt);
            }
        });

        Pj_Tipologia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lavoro", "Tesi", "Tirocinio" }));
        Pj_Tipologia.setSelectedIndex(-1);
        Pj_Tipologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pj_TipologiaActionPerformed(evt);
            }
        });

        Pj_Privacy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pubblica", "Privata" }));
        Pj_Privacy.setSelectedIndex(-1);
        Pj_Privacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pj_PrivacyActionPerformed(evt);
            }
        });

        Pj_Data.setCalendarPreferredSize(new java.awt.Dimension(400, 200));

        Pj_Descrizione.setColumns(10);
        Pj_Descrizione.setLineWrap(true);
        Pj_Descrizione.setRows(5);
        Pj_Descrizione.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Pj_Descrizione);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Titolo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pj_Titolo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(Pj_New_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(Pj_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(70, 70, 70)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(Pj_Posti)
                                    .addComponent(Pj_Tipologia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Pj_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(Pj_Privacy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pj_Durata, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pj_Titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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
                        .addComponent(Pj_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Pj_Tipologia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Pj_Durata)
                    .addComponent(Pj_Posti, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pj_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pj_Privacy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Pj_New_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Pj_TitoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pj_TitoloActionPerformed

    }//GEN-LAST:event_Pj_TitoloActionPerformed

    private void Pj_TagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pj_TagActionPerformed

    }//GEN-LAST:event_Pj_TagActionPerformed

    private void Pj_New_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pj_New_buttonActionPerformed

        Project project = new Project();

        String Titolo;
        String Descrizione;
        String Data;
        String Tipologia;
        String Durata;
        String Posti;
        String Tag;
        String Privacy;
        String[] Progetto = new String [8];
        Boolean Check_EmptyFields;
        String FolderID;

        Titolo = Pj_Titolo.getText();
        if (!(Pattern.matches("^[ -}]{3,32}$", Pj_Titolo.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire titolo valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Descrizione = Pj_Descrizione.getText();
        if (!(Pattern.matches("^[ -}]{3,500}$", Pj_Descrizione.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire una descrizione valida(MAX 500 caratteri)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Data = Pj_Data.getText();
        
        Tag = Pj_Tag.getText();
        if (!(Pattern.matches("^[ -}]{3,500}$", Pj_Tag.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un tag valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Tipologia="";
        int tip = Pj_Tipologia.getSelectedIndex();
        if (tip==0){
            Tipologia = "Lavoro";
        }else if(tip==1){
            Tipologia = "Tesi";
        }else if(tip==2) {
            Tipologia = "Tirocinio";
        }
        
        Durata = Pj_Durata.getText();
        if (!(Pattern.matches("^[0-9]{1,3}$", Pj_Durata.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire durata valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Posti = Pj_Posti.getText();
        if (!(Pattern.matches("^[0-9]{1,3}$", Pj_Posti.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire posti validi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Privacy="";
        int prv = Pj_Privacy.getSelectedIndex();
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
            
            project.Pj_New(Progetto, User_Menu.User.getText() );
            
            try {
                FolderID = Service_GDrive.SharedFolder_New(Titolo);
                project.Pj_GDriveFolderID(FolderID, Titolo);
            } catch (IOException ex) {
                Logger.getLogger(Pj_New.class.getName()).log(Level.SEVERE, null, ex);
            } catch (GeneralSecurityException ex) {
                Logger.getLogger(Pj_New.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.dispose();
        }
    }//GEN-LAST:event_Pj_New_buttonActionPerformed

    private void Pj_TipologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pj_TipologiaActionPerformed

    }//GEN-LAST:event_Pj_TipologiaActionPerformed

    private void Pj_PrivacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pj_PrivacyActionPerformed

    }//GEN-LAST:event_Pj_PrivacyActionPerformed

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
            java.util.logging.Logger.getLogger(Ev_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ev_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ev_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ev_New.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pj_New().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo Pj_Data;
    private javax.swing.JTextArea Pj_Descrizione;
    private javax.swing.JTextField Pj_Durata;
    public static javax.swing.JButton Pj_New_button;
    private javax.swing.JTextField Pj_Posti;
    private javax.swing.JComboBox<String> Pj_Privacy;
    private javax.swing.JTextField Pj_Tag;
    private javax.swing.JComboBox<String> Pj_Tipologia;
    private javax.swing.JTextField Pj_Titolo;
    private javax.swing.JLabel Titolo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

