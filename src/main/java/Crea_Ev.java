/*
Codice contenente sia le operazioni di creazione Evento(I/O, Query al DB) sia l'interfaccia grafica
 */

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Crea_Ev extends javax.swing.JFrame {

    public Crea_Ev() {
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
        Titolo_Ev = new javax.swing.JTextField();
        Ora_Ev = new javax.swing.JTextField();
        Durata_Ev = new javax.swing.JTextField();
        Posti_Ev = new javax.swing.JTextField();
        Crea_Ev = new javax.swing.JButton();
        Prvacy_Ev = new javax.swing.JComboBox<>();
        Tag_Ev = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Data_Ev = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descrizione_Ev = new javax.swing.JTextArea();

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

        Titolo_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Titolo_EvActionPerformed(evt);
            }
        });

        Crea_Ev.setText("Crea");
        Crea_Ev.setPreferredSize(new java.awt.Dimension(60, 23));
        Crea_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Crea_EvActionPerformed(evt);
            }
        });

        Prvacy_Ev.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pubblica", "Privata" }));
        Prvacy_Ev.setSelectedIndex(-1);

        Tag_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tag_EvActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Tag :");

        Data_Ev.setCalendarPreferredSize(new java.awt.Dimension(400, 200));
        Data_Ev.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 10));

        Descrizione_Ev.setColumns(10);
        Descrizione_Ev.setLineWrap(true);
        Descrizione_Ev.setRows(5);
        Descrizione_Ev.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Descrizione_Ev);

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
                            .addComponent(Prvacy_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Posti_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(Tag_Ev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Durata_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Data_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ora_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titolo)
                            .addComponent(jLabel2)
                            .addComponent(Titolo_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(Crea_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titolo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Titolo_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(Ora_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Data_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Posti_Ev)
                    .addComponent(Durata_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Prvacy_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tag_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Crea_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tag_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tag_EvActionPerformed

    }//GEN-LAST:event_Tag_EvActionPerformed

    private void Crea_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Crea_EvActionPerformed

        Librerie conn = new Librerie();

        String Titolo;
        String Descrizione;
        String Data;
        String Ora;
        String Durata;
        String Posti;
        String Tag;
        String Privacy;
        String[] Evento= new String [8];
        Boolean Check_EmptyFields;

        Titolo = Titolo_Ev.getText();
        if (!(Pattern.matches("^[ -}]{3,32}$", Titolo_Ev.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire titolo valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Descrizione = Descrizione_Ev.getText();
        if (!(Pattern.matches("^[ -}]{3,500}$", Descrizione_Ev.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire una descrizione valida(MAX 500 caratteri)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Data = Data_Ev.getText();
        Ora = Ora_Ev.getText();
        if (!(Pattern.matches("^(((0|1)[0-9])|2[0-3]):[0-5][0-9]$", Ora_Ev.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire ora valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Durata = Durata_Ev.getText();
        if (!(Pattern.matches("^[0-9]{1,3}$", Durata_Ev.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire durata valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Posti = Posti_Ev.getText();
        if (!(Pattern.matches("^[1-9]{1,3}$", Posti_Ev.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire posti validi", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Tag = Tag_Ev.getText();
        if (!(Pattern.matches("^[ -}]{1,24}$", Tag_Ev.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire Tag valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Privacy="";
        int prv = Prvacy_Ev.getSelectedIndex();
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
            
            conn.crea_Evento(Evento,Menu.IDutente_hidden.getText());
            this.dispose();
            
        }
    }//GEN-LAST:event_Crea_EvActionPerformed

    private void Titolo_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Titolo_EvActionPerformed

    }//GEN-LAST:event_Titolo_EvActionPerformed

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
            java.util.logging.Logger.getLogger(Crea_Ev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crea_Ev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crea_Ev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crea_Ev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crea_Ev().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Crea_Ev;
    private datechooser.beans.DateChooserCombo Data_Ev;
    private javax.swing.JTextArea Descrizione_Ev;
    private javax.swing.JTextField Durata_Ev;
    private javax.swing.JTextField Ora_Ev;
    private javax.swing.JTextField Posti_Ev;
    private javax.swing.JComboBox<String> Prvacy_Ev;
    private javax.swing.JTextField Tag_Ev;
    private javax.swing.JLabel Titolo;
    private javax.swing.JTextField Titolo_Ev;
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

