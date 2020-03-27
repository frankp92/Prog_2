/*
Scheda Dettagli Progetto
 */

import java.io.File;
import javax.swing.JFileChooser;

public class Dettagli_St extends javax.swing.JFrame {

    public Dettagli_St(String Titolo) {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Data = new javax.swing.JLabel();
        Tipologia = new javax.swing.JLabel();
        Durata = new javax.swing.JLabel();
        Posti = new javax.swing.JLabel();
        Visibilita = new javax.swing.JLabel();
        Tag = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        Download_button = new javax.swing.JButton();
        Chat_button = new javax.swing.JButton();
        Close_button = new javax.swing.JButton();
        Upload_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descrizione = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Titolo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tasks = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Data.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Data.setText("Data");

        Tipologia.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tipologia.setText("Tipologia");

        Durata.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Durata.setText("Durata");

        Posti.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Posti.setText("Posti");

        Visibilita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Visibilita.setText("Visibilità");

        Tag.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tag.setText("Tag");

        ProgressBar.setForeground(new java.awt.Color(255, 153, 51));

        Download_button.setText("Download");

        Chat_button.setText("Chat");
        Chat_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chat_buttonActionPerformed(evt);
            }
        });

        Close_button.setText("Chiudi");
        Close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_buttonActionPerformed(evt);
            }
        });

        Upload_button.setText("Upload");
        Upload_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Upload_buttonActionPerformed(evt);
            }
        });

        Descrizione.setColumns(20);
        Descrizione.setRows(5);
        jScrollPane1.setViewportView(Descrizione);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Descrizione");

        Titolo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Titolo.setText("jLabel2");

        Tasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Utente", "Task"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tasks.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Tasks);
        if (Tasks.getColumnModel().getColumnCount() > 0) {
            Tasks.getColumnModel().getColumn(0).setResizable(false);
            Tasks.getColumnModel().getColumn(0).setPreferredWidth(5);
            Tasks.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Task");

        jButton4.setText("Scegli");

        jButton6.setText("Status");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(Titolo, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                                .addGap(130, 130, 130))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Visibilita)
                                    .addComponent(Data, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Durata, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tipologia)
                                    .addComponent(Posti)
                                    .addComponent(Tag)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Close_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Chat_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Upload_button, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Download_button))))
                        .addGap(39, 39, 39))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Titolo)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Data)
                                    .addComponent(Tipologia))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Durata)
                                    .addComponent(Posti))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Visibilita)
                                    .addComponent(Tag))
                                .addGap(41, 41, 41)
                                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Download_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Upload_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Chat_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dettagli Progetto");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setPreferredSize(new java.awt.Dimension(140, 17));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Upload_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Upload_buttonActionPerformed

        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();

    }//GEN-LAST:event_Upload_buttonActionPerformed

    private void Chat_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chat_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Chat_buttonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Close_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Dettagli_St.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dettagli_St.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dettagli_St.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dettagli_St.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dettagli_St(Titolo.getText()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Chat_button;
    private javax.swing.JButton Close_button;
    private javax.swing.JLabel Data;
    private javax.swing.JTextArea Descrizione;
    private javax.swing.JButton Download_button;
    private javax.swing.JLabel Durata;
    private javax.swing.JLabel Posti;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel Tag;
    private javax.swing.JTable Tasks;
    private javax.swing.JLabel Tipologia;
    public static javax.swing.JLabel Titolo;
    private javax.swing.JButton Upload_button;
    private javax.swing.JLabel Visibilita;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
