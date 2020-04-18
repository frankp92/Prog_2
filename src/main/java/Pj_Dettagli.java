/*
Scheda Dettagli Progetto
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Desktop;
import java.net.URL;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

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
        IDpj_hidden = new javax.swing.JLabel();
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(334, 334, 334)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                .addComponent(IDpj_hidden)
                .addGap(31, 31, 31))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDpj_hidden))
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

    private void Milestone_ProgressBar(){
    
        Milestone_ProgressBar.setMinimum(0);
        Milestone_ProgressBar.setMaximum(Milestone_Table.getRowCount());
        Milestone_ProgressBar.setValue(1);
    
    }
    
    private String check_partecipante(String IDutente){
    
        String query1;
        String check_utente;
        String result_check = null;
        
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT l.IDlavoratore FROM lavoro AS l WHERE l.IDlavoratore='"+IDpj_hidden.getText()+"'";    
            stm = con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            rs.next();
            check_utente = rs.getString("IDutente");
            System.out.println(check_utente);
            if (check_utente==null){
                
                JOptionPane.showMessageDialog(null, "Mi dispiace, non partecipi a questo progetto", "Error", JOptionPane.ERROR_MESSAGE);
                result_check="non_partecipi";
                
            } else{
                
                result_check="partecipi";
                
            }
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
        return result_check;
    }
    
    private String check_coordinatore(String IDutente){
    
        String query1;
        String check_utente;
        String result_check = null;
        
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT IDutente FROM task WHERE IDprogetto='"+IDpj_hidden.getText()+"'";    
            stm = con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            rs.next();
            check_utente = rs.getString("IDutente");
            System.out.println(check_utente);
            
            if (check_utente==null){
                
                JOptionPane.showMessageDialog(null, "Mi dispiace, non partecipi a questo progetto", "Error", JOptionPane.ERROR_MESSAGE);
                result_check="non_partecipi";
                
            } else{
                
                result_check="partecipi";
                
            }
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
        return result_check;
    }
    
    private void Milestone(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT milestone.Milestone, milestone.Status FROM milestone, task WHERE (task.IDprogetto='"+IDpj_hidden.getText()+"' AND task.IDmilestone=milestone.IDmilestone)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Milestone_Table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    private void Milestone_Del_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_Del_ButtonActionPerformed
        
        int row;
        String Task;
        Librerie conn;
        
        row = Milestone_Table.getSelectedRow();
        if(row!=-1){
            
            Task = Milestone_Table.getValueAt(row, 0).toString();
            conn = new Librerie();
            conn.Milestone_Del(Task, IDpj_hidden.getText());
            Milestone();
        }
    }//GEN-LAST:event_Milestone_Del_ButtonActionPerformed

    private void Close_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Close_buttonActionPerformed
        this.dispose();
    }//GEN-LAST:event_Close_buttonActionPerformed

    private void Pj_GDrive_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pj_GDrive_buttonActionPerformed
        
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
    }//GEN-LAST:event_Pj_GDrive_buttonActionPerformed

    private void Milestone_Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_Update_ButtonActionPerformed
        Milestone();
        int Count_Complete = 0;
        Milestone_ProgressBar.setMinimum(0);
        Milestone_ProgressBar.setMaximum(Milestone_Table.getRowCount());
        
        for(int i = 0; i<Milestone_Table.getRowCount(); i++){
            
            if (Milestone_Table.getValueAt(i,1).toString().equals("Complete")) {
                
                Count_Complete+=1;
                
            }
        }
        
        Milestone_ProgressBar.setValue(Count_Complete);
    }//GEN-LAST:event_Milestone_Update_ButtonActionPerformed

    private void Milestone_New_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_New_ButtonActionPerformed
        new Pj_Milestone().setVisible(true);
    }//GEN-LAST:event_Milestone_New_ButtonActionPerformed

    private void Milestone_Join_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_Join_ButtonActionPerformed
        
        int row;
        String data;
        String query1;
        String IDmilestone;
        String query_check;
        Boolean check;
        String query2;
        String query3;
        
        row = Milestone_Table.getSelectedRow();
        
        if(row!=-1){
            
            data = Milestone_Table.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                query1 = "SELECT IDmilestone FROM milestone WHERE Milestone ='"+data+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                IDmilestone = rs.getString("IDmilestone");
                query_check = "SELECT IDmilestone, IDprogetto, IDutente FROM task WHERE IDmilestone ='"+IDmilestone+"' AND IDprogetto='"+IDpj_hidden.getText()+"' AND IDutente ='"+User_Menu.User_ID_hidden.getText()+"'";
                stm = con.prepareStatement(query_check);
                rs = stm.executeQuery(query_check);
                check = rs.next();
                
                if(check!=true){
                    query2 = "UPDATE task SET IDutente ='"+User_Menu.User_ID_hidden.getText()+"' WHERE IDmilestone ='"+IDmilestone+"' AND IDprogetto='"+IDpj_hidden.getText()+"'";
                    stm.executeUpdate(query2);
                    query3 = "UPDATE milestone SET Status ='In Progress' WHERE IDmilestone ='"+IDmilestone+"'";
                    stm.executeUpdate(query3);
                    JOptionPane.showMessageDialog(this,"Attività iniziata");
                    Milestone();
                }else{
                    JOptionPane.showMessageDialog(this,"Già presa in carico");
                }
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona la Milestone");
        }
    }//GEN-LAST:event_Milestone_Join_ButtonActionPerformed

    private void Milestone_Complete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Milestone_Complete_ButtonActionPerformed
        int row;
        String data;
        String query1;
        String IDmilestone;
        String query_check;
        Boolean check;
        String query2;
        String query3;
        
        row = Milestone_Table.getSelectedRow();
        
        if(row!=-1){
            
            data = Milestone_Table.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                query1 = "SELECT IDmilestone FROM milestone WHERE Milestone ='"+data+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                IDmilestone = rs.getString("IDmilestone");
                query_check = "SELECT IDmilestone, IDprogetto, IDutente FROM task WHERE IDmilestone ='"+IDmilestone+"' AND IDprogetto='"+IDpj_hidden.getText()+"' AND IDutente ='"+User_Menu.User_ID_hidden.getText()+"'";
                stm = con.prepareStatement(query_check);
                rs = stm.executeQuery(query_check);
                check = rs.next();
                
                if(check!=false){
                    query2 = "UPDATE task SET IDutente ='"+User_Menu.User_ID_hidden.getText()+"' WHERE IDmilestone ='"+IDmilestone+"' AND IDprogetto='"+IDpj_hidden.getText()+"'";
                    stm.executeUpdate(query2);
                    query3 = "UPDATE milestone SET Status ='Complete' WHERE IDmilestone ='"+IDmilestone+"'";
                    stm.executeUpdate(query3);
                    Milestone();
                }else{JOptionPane.showMessageDialog(this,"Prima prendi in carico la milestone selezionata");}
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona la milestone");
        }
    }//GEN-LAST:event_Milestone_Complete_ButtonActionPerformed

    private void Milestone_ProgressBarStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_Milestone_ProgressBarStateChanged
        
        
        
        
    }//GEN-LAST:event_Milestone_ProgressBarStateChanged

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
                //ProgressBar();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close_button;
    public static javax.swing.JLabel Data;
    private javax.swing.JLabel Data_label;
    public static javax.swing.JLabel Durata;
    private javax.swing.JLabel Durata_label;
    public static javax.swing.JLabel IDpj_hidden;
    public static javax.swing.JButton Milestone_Complete_Button;
    public static javax.swing.JButton Milestone_Del_Button;
    public static javax.swing.JButton Milestone_Join_Button;
    public static javax.swing.JButton Milestone_New_Button;
    public static javax.swing.JProgressBar Milestone_ProgressBar;
    public static javax.swing.JTable Milestone_Table;
    private javax.swing.JButton Milestone_Update_Button;
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
