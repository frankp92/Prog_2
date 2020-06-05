package smartlab.ev.gui;

/*
Codice contenente sia le operazioni di creazione Evento(I/O, Query al DB) sia l'interfaccia grafica
 */

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import smartlab.ev.Event;
import smartlab.user.gui.User_Menu;

public class Ev_New extends javax.swing.JFrame {

    public Ev_New() {
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
        Ev_Titolo = new javax.swing.JTextField();
        Ev_Ora = new javax.swing.JTextField();
        Ev_Durata = new javax.swing.JTextField();
        Ev_Posti = new javax.swing.JTextField();
        Ev_New = new javax.swing.JButton();
        Ev_Privacy = new javax.swing.JComboBox<>();
        Ev_Tag = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Ev_Data = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ev_Descrizione = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crea Evento");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Creazione Evento");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setPreferredSize(new java.awt.Dimension(140, 17));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        Titolo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Titolo.setText("Titolo :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Descrizione :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Data :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ora di inizio :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Durata ore :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Posti :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Privacy evento :");

        Ev_Titolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ev_TitoloActionPerformed(evt);
            }
        });

        Ev_New.setText("Crea");
        Ev_New.setPreferredSize(new java.awt.Dimension(60, 23));
        Ev_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ev_NewActionPerformed(evt);
            }
        });

        Ev_Privacy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pubblica", "Privata" }));
        Ev_Privacy.setSelectedIndex(-1);

        Ev_Tag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ev_TagActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tag :");

        Ev_Data.setCalendarPreferredSize(new java.awt.Dimension(400, 200));
        Ev_Data.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 10));

        Ev_Descrizione.setColumns(10);
        Ev_Descrizione.setLineWrap(true);
        Ev_Descrizione.setRows(5);
        Ev_Descrizione.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Ev_Descrizione);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(Ev_Privacy, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Ev_Posti, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(Ev_Tag, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ev_Durata, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ev_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ev_Ora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titolo)
                            .addComponent(jLabel2)
                            .addComponent(Ev_Titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(Ev_New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Ev_Titolo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ev_Ora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ev_Data, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ev_Posti)
                    .addComponent(Ev_Durata, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ev_Privacy, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ev_Tag, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Ev_New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Ev_TagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ev_TagActionPerformed

    }//GEN-LAST:event_Ev_TagActionPerformed

    private void Ev_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ev_NewActionPerformed

        Event event = new Event();

        String Titolo;
        String Descrizione;
        String Data;
        String Ora;
        String Durata;
        String Posti;
        String Tag;
        String Privacy;
        Boolean Check_EmptyFields;
        String[] Evento= new String [8];

        Titolo = Ev_Titolo.getText();
        if (!(Pattern.matches("^[ -}]{3,32}$", Ev_Titolo.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire titolo valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Descrizione = Ev_Descrizione.getText();
        if (!(Pattern.matches("^[ -}]{3,500}$", Ev_Descrizione.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire una descrizione valida(MAX 500 caratteri)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Data = Ev_Data.getText();
        Ora = Ev_Ora.getText();
        if (!(Pattern.matches("^(((0|1)[0-9])|2[0-3]):[0-5][0-9]$", Ev_Ora.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire ora valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Durata = Ev_Durata.getText();
        if (!(Pattern.matches("^[0-9]{1,3}$", Ev_Durata.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire durata valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Posti = Ev_Posti.getText();
        if (!(Pattern.matches("^[0-9]{1,3}$", Ev_Posti.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire posti validi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Tag = Ev_Tag.getText();
        if (!(Pattern.matches("^[ -}]{1,24}$", Ev_Tag.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire Tag valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Privacy="";
        int prv = Ev_Privacy.getSelectedIndex();
        if (prv==0){
            Privacy = "Pubblico";
        }else if(prv==1){
            Privacy = "Privato";
        }

        Evento[0]=Titolo;
        Evento[1]=Descrizione;
        Evento[2]=Data;
        Evento[3]=Ora;
        Evento[4]=Durata;
        Evento[5]=Posti;
        Evento[6]=Privacy;
        Evento[7]=Tag;

        Check_EmptyFields = (Titolo.isEmpty())|| (Descrizione.isEmpty())|| (Data.isEmpty()) || (Ora.isEmpty()) || (Durata.isEmpty()) || (Posti.isEmpty())|| (Tag.isEmpty()) ;

        if(Check_EmptyFields==true){

            JOptionPane.showMessageDialog(null, "Compila tutti i campi", "Error", JOptionPane.ERROR_MESSAGE);

        }else{
            
            event.Ev_New(Evento,User_Menu.User.getText());
            this.dispose();
            
        }
    }//GEN-LAST:event_Ev_NewActionPerformed

    private void Ev_TitoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ev_TitoloActionPerformed

    }//GEN-LAST:event_Ev_TitoloActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ev_New().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo Ev_Data;
    private javax.swing.JTextArea Ev_Descrizione;
    private javax.swing.JTextField Ev_Durata;
    private javax.swing.JButton Ev_New;
    private javax.swing.JTextField Ev_Ora;
    private javax.swing.JTextField Ev_Posti;
    private javax.swing.JComboBox<String> Ev_Privacy;
    private javax.swing.JTextField Ev_Tag;
    private javax.swing.JTextField Ev_Titolo;
    private javax.swing.JLabel Titolo;
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

