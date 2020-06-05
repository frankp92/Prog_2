package smartlab.pj.gui;

/*
Scheda Dettagli Progetto
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import smartlab.pj.Project;
import smartlab.user.gui.User_Menu;

public class Pj_Dettagli extends javax.swing.JFrame {
    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;

    public Pj_Dettagli() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Modify = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Data_label = new javax.swing.JLabel();
        Tipologia_label = new javax.swing.JLabel();
        Durata_label = new javax.swing.JLabel();
        Posti_label = new javax.swing.JLabel();
        Visibilita_label = new javax.swing.JLabel();
        Tag_label = new javax.swing.JLabel();
        Milestone_ProgressBar = new javax.swing.JProgressBar();
        Pj_GDrive_button = new javax.swing.JButton();
        Close_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pj_Descrizione = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        Titolo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Milestone_Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        Milestone_New_Button = new javax.swing.JButton();
        Milestone_Del_Button = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        Tipologia = new javax.swing.JLabel();
        Durata = new javax.swing.JLabel();
        Posti = new javax.swing.JLabel();
        Privacy = new javax.swing.JLabel();
        Tag = new javax.swing.JLabel();
        Milestone_Update_Button = new javax.swing.JButton();
        Milestone_Join_Button = new javax.swing.JButton();
        Milestone_Complete_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 153, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dettagli Progetto");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel9.setPreferredSize(new java.awt.Dimension(140, 17));

        Modify.setText("Modifica");
        Modify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModifyMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 330, Short.MAX_VALUE)
                .addComponent(Modify)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modify))
                .addContainerGap(27, Short.MAX_VALUE))
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
        Visibilita_label.setText("Visibilità");

        Tag_label.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Tag_label.setText("Tipologia");

        Milestone_ProgressBar.setForeground(new java.awt.Color(255, 153, 51));
        Milestone_ProgressBar.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                Milestone_ProgressBarStateChanged(evt);
            }
        });

        Pj_GDrive_button.setText("Google Drive");
        Pj_GDrive_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pj_GDrive_buttonActionPerformed(evt);
            }
        });

        Close_button.setText("Chiudi");
        Close_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Close_buttonActionPerformed(evt);
            }
        });

        Pj_Descrizione.setEditable(false);
        Pj_Descrizione.setColumns(10);
        Pj_Descrizione.setLineWrap(true);
        Pj_Descrizione.setRows(5);
        Pj_Descrizione.setWrapStyleWord(true);
        jScrollPane1.setViewportView(Pj_Descrizione);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Descrizione");

        Titolo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Titolo.setText("jLabel2");

        Milestone_Table.setModel(new javax.swing.table.DefaultTableModel(
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
        Milestone_Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(Milestone_Table);
        if (Milestone_Table.getColumnModel().getColumnCount() > 0) {
            Milestone_Table.getColumnModel().getColumn(0).setResizable(false);
            Milestone_Table.getColumnModel().getColumn(0).setPreferredWidth(5);
            Milestone_Table.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Milestone");

        Milestone_New_Button.setText("Crea");
        Milestone_New_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Milestone_New_ButtonActionPerformed(evt);
            }
        });

        Milestone_Del_Button.setText("Elimina");
        Milestone_Del_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Milestone_Del_ButtonActionPerformed(evt);
            }
        });

        Milestone_Update_Button.setText("Aggiorna");
        Milestone_Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Milestone_Update_ButtonActionPerformed(evt);
            }
        });

        Milestone_Join_Button.setText("Scegli");
        Milestone_Join_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Milestone_Join_ButtonActionPerformed(evt);
            }
        });

        Milestone_Complete_Button.setText("Completa");
        Milestone_Complete_Button.setMaximumSize(new java.awt.Dimension(72, 23));
        Milestone_Complete_Button.setMinimumSize(new java.awt.Dimension(72, 23));
        Milestone_Complete_Button.setPreferredSize(new java.awt.Dimension(72, 23));
        Milestone_Complete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Milestone_Complete_ButtonActionPerformed(evt);
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
                                .addComponent(Titolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(130, 130, 130))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Milestone_Join_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Milestone_Del_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Milestone_Complete_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                            .addComponent(Milestone_New_Button, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
                                    .addComponent(Milestone_Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tipologia_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Tag))
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
                                            .addComponent(Privacy)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tag_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tipologia)
                                        .addGap(76, 76, 76)))
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Posti_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Posti))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Durata_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Durata))))
                            .addComponent(Milestone_ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Close_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Pj_GDrive_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(39, 39, 39))))
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Data_label)
                                    .addComponent(Data)
                                    .addComponent(Durata)
                                    .addComponent(Durata_label))
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
                                .addComponent(Milestone_ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Milestone_Join_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Milestone_Complete_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Milestone_New_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Milestone_Del_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Milestone_Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Pj_GDrive_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(Close_button, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        
    private void Milestone(String Pj_Titolo){
        
        String query1;
        String Pj_ID = get_Pj_ID(Pj_Titolo);

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT milestone.Milestone, milestone.Status FROM milestone, task WHERE (task.IDprogetto='"+Pj_ID+"' AND task.IDmilestone=milestone.IDmilestone)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Milestone_Table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    private String get_GDrive_ID(String Titolo){
    
        String GDrive_ID = null;
        
        try{            

            String query_id = "SELECT GDriveID FROM coordinatore WHERE IDprogetto=(SELECT IDprogetto FROM progetto WHERE Titolo='"+Titolo+"')";
            rs = stm.executeQuery(query_id);
            rs.next();
            GDrive_ID = rs.getString("GDriveID");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return GDrive_ID;
    }
    
    private String get_Pj_ID(String Pj_Titolo){
    
        String Pj_ID = null;
        
        try{            

            String query_id = "SELECT IDprogetto FROM progetto WHERE titolo ='"+Pj_Titolo+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            Pj_ID = rs.getString("IDprogetto");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return Pj_ID;
    }
    
    private void Milestone_Del_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_Del_ButtonActionPerformed
        
        Project milestone = new Project();
        
        int row = Milestone_Table.getSelectedRow();
        String Task;
        
        if(row!=-1){
            
            Task = Milestone_Table.getValueAt(row, 0).toString();
            milestone.Milestone_Del(Task, Titolo.getText());
            Milestone(Titolo.getText());
            
        }else{JOptionPane.showMessageDialog(this,"Seleziona la Milestone");}
    }//GEN-LAST:event_Milestone_Del_ButtonActionPerformed

    private void Close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Close_buttonActionPerformed

    private void Pj_GDrive_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pj_GDrive_buttonActionPerformed
        
        Desktop desktop = Desktop.getDesktop();
        
        String GDrive_ID = get_GDrive_ID(Titolo.getText());
        String GDrive_URL = "https://drive.google.com/open?id="+GDrive_ID;
        
        try {
            
            desktop.browse(new URL(GDrive_URL).toURI());
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(Pj_Dettagli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Pj_Dettagli.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pj_Dettagli.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_Pj_GDrive_buttonActionPerformed

    private void Milestone_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_Update_ButtonActionPerformed
        
        String titolo = Titolo.getText();
        
        int Count_Complete = 0;
        
        Milestone_ProgressBar.setMinimum(0);
        Milestone_ProgressBar.setMaximum(Milestone_Table.getRowCount());
        
        for(int i = 0; i<Milestone_Table.getRowCount(); i++){
            
            if (Milestone_Table.getValueAt(i,1).toString().equals("Complete")) {
                
                Count_Complete+=1;
                
            }
        }
        Milestone_ProgressBar.setValue(Count_Complete);
        Milestone(titolo);
    }//GEN-LAST:event_Milestone_Update_ButtonActionPerformed

    private void Milestone_New_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_New_ButtonActionPerformed
        new Pj_Milestone().setVisible(true);
    }//GEN-LAST:event_Milestone_New_ButtonActionPerformed

    private void Milestone_Join_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_Join_ButtonActionPerformed
        
        Project project = new Project();
        
        int row = Milestone_Table.getSelectedRow();
        
        if(row!=-1){
            
            String status = Milestone_Table.getValueAt(row, 1).toString();
            
            if(status.equals("Non iniziata")){
            
                String ML_Titolo = Milestone_Table.getValueAt(row, 0).toString();
                String User_Email = User_Menu.User.getText();
                project.Milestone_Join(User_Email, ML_Titolo, Titolo.getText());
                JOptionPane.showMessageDialog(this,"Attività iniziata");
                Milestone(Titolo.getText());
                
            }
        }else{
            JOptionPane.showMessageDialog(this,"Non hai selezionato la milestone o è stata già presa in carico");
        }
    }//GEN-LAST:event_Milestone_Join_ButtonActionPerformed

    private void Milestone_Complete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_Complete_ButtonActionPerformed
        
        Project project = new Project();
        
        int row = Milestone_Table.getSelectedRow();
        
        if(row!=-1){
            
            String ML_Status = Milestone_Table.getValueAt(row, 1).toString();
            String ML_Titolo = Milestone_Table.getValueAt(row, 0).toString();
            boolean check = project.check_ML_User(ML_Titolo, User_Menu.User.getText(), Titolo.getText());
            
                if(ML_Status.equals("In Progress") && check==true){
                    
                    project.Milestone_Complete(ML_Titolo);
                    JOptionPane.showMessageDialog(this,"Attività completata");
                    Milestone(Titolo.getText());
                    
                }else{JOptionPane.showMessageDialog(this,"Prima prendi in carico la milestone selezionata");}
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona una milestone");
        }
    }//GEN-LAST:event_Milestone_Complete_ButtonActionPerformed

    private void Milestone_ProgressBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Milestone_ProgressBarStateChanged
     
    }//GEN-LAST:event_Milestone_ProgressBarStateChanged

    private void ModifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModifyMouseClicked
        new Pj_Modify().setVisible(true);
        String ShareTitle = Pj_Dettagli.Titolo.getText();
        Pj_Modify.Titolo.setText(ShareTitle);
    }//GEN-LAST:event_ModifyMouseClicked

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
            java.util.logging.Logger.getLogger(Pj_Dettagli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pj_Dettagli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pj_Dettagli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pj_Dettagli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pj_Dettagli().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close_button;
    public static javax.swing.JLabel Data;
    private javax.swing.JLabel Data_label;
    public static javax.swing.JLabel Durata;
    private javax.swing.JLabel Durata_label;
    public static javax.swing.JButton Milestone_Complete_Button;
    public static javax.swing.JButton Milestone_Del_Button;
    public static javax.swing.JButton Milestone_Join_Button;
    public static javax.swing.JButton Milestone_New_Button;
    public static javax.swing.JProgressBar Milestone_ProgressBar;
    public static javax.swing.JTable Milestone_Table;
    private javax.swing.JButton Milestone_Update_Button;
    private javax.swing.JLabel Modify;
    public static javax.swing.JTextArea Pj_Descrizione;
    private javax.swing.JButton Pj_GDrive_button;
    public static javax.swing.JLabel Posti;
    private javax.swing.JLabel Posti_label;
    public static javax.swing.JLabel Privacy;
    public static javax.swing.JLabel Tag;
    private javax.swing.JLabel Tag_label;
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
