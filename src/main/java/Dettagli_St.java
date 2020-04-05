/*
Scheda Dettagli Progetto
 */

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Desktop;
import java.net.URL;
import net.proteanit.sql.DbUtils;

public class Dettagli_St extends javax.swing.JFrame {
    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;

    public Dettagli_St() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        IDprogetto_hidden = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Data_label = new javax.swing.JLabel();
        Tipologia_label = new javax.swing.JLabel();
        Durata_label = new javax.swing.JLabel();
        Posti_label = new javax.swing.JLabel();
        Visibilita_label = new javax.swing.JLabel();
        Tag_label = new javax.swing.JLabel();
        ProgressBar = new javax.swing.JProgressBar();
        GDrive_button = new javax.swing.JButton();
        Chat_button = new javax.swing.JButton();
        Close_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Descrizione = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Titolo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tasks = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        CreaTask_Button = new javax.swing.JButton();
        EliminaTask_Button = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        Tipologia = new javax.swing.JLabel();
        Durata = new javax.swing.JLabel();
        Posti = new javax.swing.JLabel();
        Privacy = new javax.swing.JLabel();
        Tag = new javax.swing.JLabel();
        AggiornaTask_Button = new javax.swing.JButton();
        JoinTask_Button = new javax.swing.JButton();
        CompleteTask_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(IDprogetto_hidden)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDprogetto_hidden))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        Data_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Data_label.setText("Data");

        Tipologia_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tipologia_label.setText("Tag");

        Durata_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Durata_label.setText("Durata");

        Posti_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Posti_label.setText("Posti");

        Visibilita_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Visibilita_label.setText("VisibilitÓ");

        Tag_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tag_label.setText("Tipologia");

        ProgressBar.setForeground(new java.awt.Color(255, 153, 51));

        GDrive_button.setText("Google Drive");
        GDrive_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GDrive_buttonActionPerformed(evt);
            }
        });

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

        Descrizione.setColumns(10);
        Descrizione.setLineWrap(true);
        Descrizione.setRows(5);
        Descrizione.setWrapStyleWord(true);
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
                true, false
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
        jLabel3.setText("Milestone");

        CreaTask_Button.setText("Crea");
        CreaTask_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreaTask_ButtonActionPerformed(evt);
            }
        });

        EliminaTask_Button.setText("Elimina");
        EliminaTask_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminaTask_ButtonActionPerformed(evt);
            }
        });

        AggiornaTask_Button.setText("Aggiorna");
        AggiornaTask_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AggiornaTask_ButtonActionPerformed(evt);
            }
        });

        JoinTask_Button.setText("Scegli");
        JoinTask_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinTask_ButtonActionPerformed(evt);
            }
        });

        CompleteTask_Button.setText("Completa");
        CompleteTask_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompleteTask_ButtonActionPerformed(evt);
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
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(337, 337, 337)
                                .addComponent(Titolo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addGap(130, 130, 130))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(AggiornaTask_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(EliminaTask_Button)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CreaTask_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(JoinTask_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CompleteTask_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tipologia_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tag))
                                    .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Data_label)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Data)
                                                    .addGap(70, 70, 70))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Visibilita_label)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Privacy)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Tag_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Tipologia)
                                                .addGap(76, 76, 76)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Posti_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Posti))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(Durata_label)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Durata)))))
                                .addGap(0, 73, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Close_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Chat_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(GDrive_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Titolo)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Durata_label, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Data_label)
                                        .addComponent(Data)
                                        .addComponent(Durata)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tipologia)
                                    .addComponent(Tag_label)
                                    .addComponent(Posti_label)
                                    .addComponent(Posti))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Visibilita_label)
                                    .addComponent(Privacy))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Tipologia_label)
                                    .addComponent(Tag))
                                .addGap(41, 41, 41)
                                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JoinTask_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CompleteTask_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CreaTask_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EliminaTask_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AggiornaTask_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GDrive_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Chat_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void Task(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT milestone.Milestone, milestone.Status FROM milestone, task WHERE (task.IDprogetto='"+IDprogetto_hidden.getText()+"' AND task.IDmilestone=milestone.IDmilestone)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Tasks.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    private void Chat_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chat_buttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Chat_buttonActionPerformed

    private void EliminaTask_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminaTask_ButtonActionPerformed
        
        int row;
        String Task;
        Librerie conn;
        
        row = Tasks.getSelectedRow();
        if(row!=-1){
            
            Task = Tasks.getValueAt(row, 0).toString();
            conn = new Librerie();
            conn.Del_Task(Task, IDprogetto_hidden.getText());
            Task();
        }
    }//GEN-LAST:event_EliminaTask_ButtonActionPerformed

    private void Close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Close_buttonActionPerformed

    private void GDrive_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GDrive_buttonActionPerformed
        
        String query1;
        String GDriveID;
        Desktop desktop = Desktop.getDesktop();
        String URLDrive;
        
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT GDriveID FROM coordinatore WHERE IDprogetto=(SELECT IDprogetto FROM progetto WHERE Titolo='"+Titolo.getText()+"')";    
            stm = con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            rs.next();
            GDriveID = rs.getString("GDriveID"); 
            URLDrive = "https://drive.google.com/open?id="+GDriveID;
            desktop.browse(new URL(URLDrive).toURI());
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
    }//GEN-LAST:event_GDrive_buttonActionPerformed

    private void AggiornaTask_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AggiornaTask_ButtonActionPerformed
        Task();
    }//GEN-LAST:event_AggiornaTask_ButtonActionPerformed

    private void CreaTask_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreaTask_ButtonActionPerformed
        new Task().setVisible(true);
    }//GEN-LAST:event_CreaTask_ButtonActionPerformed

    private void JoinTask_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinTask_ButtonActionPerformed
        
    }//GEN-LAST:event_JoinTask_ButtonActionPerformed

    private void CompleteTask_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompleteTask_ButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompleteTask_ButtonActionPerformed

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
                new Dettagli_St().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AggiornaTask_Button;
    private javax.swing.JButton Chat_button;
    private javax.swing.JButton Close_button;
    public static javax.swing.JButton CompleteTask_Button;
    public static javax.swing.JButton CreaTask_Button;
    public static javax.swing.JLabel Data;
    private javax.swing.JLabel Data_label;
    public static javax.swing.JTextArea Descrizione;
    public static javax.swing.JLabel Durata;
    private javax.swing.JLabel Durata_label;
    public static javax.swing.JButton EliminaTask_Button;
    private javax.swing.JButton GDrive_button;
    public static javax.swing.JLabel IDprogetto_hidden;
    public static javax.swing.JButton JoinTask_Button;
    public static javax.swing.JLabel Posti;
    private javax.swing.JLabel Posti_label;
    public static javax.swing.JLabel Privacy;
    private javax.swing.JProgressBar ProgressBar;
    public static javax.swing.JLabel Tag;
    private javax.swing.JLabel Tag_label;
    public static javax.swing.JTable Tasks;
    public static javax.swing.JLabel Tipologia;
    private javax.swing.JLabel Tipologia_label;
    public static javax.swing.JLabel Titolo;
    private javax.swing.JLabel Visibilita_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
