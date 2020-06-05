package smartlab.user.gui;

/*
Schermata principale, dallaquale si possono effettuare varie operazioni:
-   Visualizzazione degli Eventi
-   Visualizzazione dei Progetti
-   Partecipazione ad un Progetto/Evento
-   Non partecipazione ad un Evento/Progetto
-   Aggiornamento del contenuto
-   Logout
 */

import smartlab.pj.gui.Pj_New;
import smartlab.pj.gui.Pj_Dettagli;
import smartlab.ev.gui.Ev_New;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import smartlab.ev.Event;
import smartlab.pj.Project;
import smartlab.user.User;

public class User_Menu extends javax.swing.JFrame {
    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;        

    public User_Menu() {
        
        initComponents();
        User_Ev_Table(User.getText());
        User_Pj_Table(User.getText());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Ev_button = new javax.swing.JButton();
        Pj_button = new javax.swing.JButton();
        User = new javax.swing.JLabel();
        Logout_link = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MyPj_button = new javax.swing.JButton();
        MyEv_button = new javax.swing.JButton();
        Parent_panel = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        Prof_Ev_Card = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Prof_Ev_Tab = new javax.swing.JTable();
        Prof_Ev_Join = new javax.swing.JButton();
        Prof_Ev_Update = new javax.swing.JButton();
        Prof_MyEv_Card = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        Prof_MyEv_Tab = new javax.swing.JTable();
        Prof_MyEv_Del = new javax.swing.JButton();
        Prof_MyEv_Modify = new javax.swing.JButton();
        Prof_MyEv_Update = new javax.swing.JButton();
        Prof_MyEv_New = new javax.swing.JButton();
        Prof_MyEv_UnJoin = new javax.swing.JButton();
        Stud_Ev_Card = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Stud_Ev_Tab = new javax.swing.JTable();
        Stud_Ev_Join = new javax.swing.JButton();
        Stud_Ev_Update = new javax.swing.JButton();
        Stud_MyEv_Card = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        Stud_MyEv_Tab = new javax.swing.JTable();
        Stud_MyEv_UnJoin = new javax.swing.JButton();
        Stud_MyEv_Update = new javax.swing.JButton();
        Stud_MyEv_Proposta = new javax.swing.JButton();
        Prof_Pj_Card = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prof_Pj_Tab = new javax.swing.JTable();
        Prof_Pj_Join = new javax.swing.JButton();
        Prof_Pj_Details = new javax.swing.JButton();
        Prof_Pj_Update = new javax.swing.JButton();
        Prof_Pj_UnJoin = new javax.swing.JButton();
        Prof_MyPj_Card = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Prof_MyPj_Tab = new javax.swing.JTable();
        Prof_MyPj_Del = new javax.swing.JButton();
        Prof_MyPj_Details = new javax.swing.JButton();
        Prof_MyPj_Update = new javax.swing.JButton();
        Prof_MyPj_New = new javax.swing.JButton();
        Stud_Pj_Card = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Stud_Pj_Tab = new javax.swing.JTable();
        Stud_Pj_Join = new javax.swing.JButton();
        Stud_Pj_Details = new javax.swing.JButton();
        Stud_Pj_Update = new javax.swing.JButton();
        Stud_MyPj_Card = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Stud_MyPj_Tab = new javax.swing.JTable();
        Stud_MyPj_Details = new javax.swing.JButton();
        Stud_MyPj_UnJoin = new javax.swing.JButton();
        Stud_MyPj_Update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartLab");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        logo = new JLabel(new ImageIcon("img/logo.png"));

        Ev_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Ev_button.setText("Eventi");
        Ev_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ev_buttonActionPerformed(evt);
            }
        });

        Pj_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Pj_button.setText("Progetti");
        Pj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pj_buttonActionPerformed(evt);
            }
        });

        Logout_link.setText("Logout");
        Logout_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logout_linkMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ravie", 1, 24)); // NOI18N
        jLabel1.setText("SmartLab");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        MyPj_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MyPj_button.setText("Mie Progetti");
        MyPj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyPj_buttonActionPerformed(evt);
            }
        });

        MyEv_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MyEv_button.setText("Mie Eventi");
        MyEv_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MyEv_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Ev_button)
                    .addComponent(MyEv_button))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Pj_button)
                        .addGap(43, 43, 43)
                        .addComponent(User))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MyPj_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(Logout_link)
                        .addGap(47, 47, 47))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(User)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ev_button)
                    .addComponent(Pj_button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MyPj_button)
                    .addComponent(MyEv_button)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Logout_link))
            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        Parent_panel.setLayout(new java.awt.CardLayout());

        home.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        Parent_panel.add(home, "card2");

        Prof_Ev_Card.setBackground(new java.awt.Color(0, 102, 102));

        Prof_Ev_Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titolo", "Descrizione", "Data", "Ora", "Posti", "Privacy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Prof_Ev_Tab.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Prof_Ev_Tab);

        Prof_Ev_Join.setText("Partecipa");
        Prof_Ev_Join.setPreferredSize(new java.awt.Dimension(130, 23));
        Prof_Ev_Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Ev_JoinActionPerformed(evt);
            }
        });

        Prof_Ev_Update.setText("Aggiorna");
        Prof_Ev_Update.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Ev_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Ev_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Prof_Ev_CardLayout = new javax.swing.GroupLayout(Prof_Ev_Card);
        Prof_Ev_Card.setLayout(Prof_Ev_CardLayout);
        Prof_Ev_CardLayout.setHorizontalGroup(
            Prof_Ev_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prof_Ev_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Prof_Ev_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Prof_Ev_Join, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Ev_Update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Prof_Ev_CardLayout.setVerticalGroup(
            Prof_Ev_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Prof_Ev_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Prof_Ev_Join, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Ev_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Prof_Ev_Card, "card2");

        Prof_MyEv_Card.setBackground(new java.awt.Color(0, 102, 102));

        Prof_MyEv_Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titolo", "Descrizione", "Data", "Ora", "Posti", "Privacy"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Prof_MyEv_Tab.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(Prof_MyEv_Tab);

        Prof_MyEv_Del.setText("Cancella Evento");
        Prof_MyEv_Del.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_MyEv_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_MyEv_DelActionPerformed(evt);
            }
        });

        Prof_MyEv_Modify.setText("Modifica");
        Prof_MyEv_Modify.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_MyEv_Modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_MyEv_ModifyActionPerformed(evt);
            }
        });

        Prof_MyEv_Update.setText("Aggiorna");
        Prof_MyEv_Update.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_MyEv_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_MyEv_UpdateActionPerformed(evt);
            }
        });

        Prof_MyEv_New.setText("Crea Evento");
        Prof_MyEv_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_MyEv_NewActionPerformed(evt);
            }
        });

        Prof_MyEv_UnJoin.setText("Non Partecipa");
        Prof_MyEv_UnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_MyEv_UnJoinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Prof_MyEv_CardLayout = new javax.swing.GroupLayout(Prof_MyEv_Card);
        Prof_MyEv_Card.setLayout(Prof_MyEv_CardLayout);
        Prof_MyEv_CardLayout.setHorizontalGroup(
            Prof_MyEv_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prof_MyEv_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Prof_MyEv_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Prof_MyEv_UnJoin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Prof_MyEv_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Prof_MyEv_Del, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(Prof_MyEv_Modify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Prof_MyEv_New, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Prof_MyEv_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Prof_MyEv_CardLayout.setVerticalGroup(
            Prof_MyEv_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Prof_MyEv_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Prof_MyEv_New)
                .addGap(18, 18, 18)
                .addComponent(Prof_MyEv_Del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_MyEv_Modify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_MyEv_UnJoin)
                .addGap(18, 18, 18)
                .addComponent(Prof_MyEv_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Prof_MyEv_Card, "card2");

        Stud_Ev_Card.setBackground(new java.awt.Color(0, 102, 102));

        Stud_Ev_Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Stud_Ev_Tab.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(Stud_Ev_Tab);

        Stud_Ev_Join.setText("Partecipa");
        Stud_Ev_Join.setPreferredSize(new java.awt.Dimension(130, 23));
        Stud_Ev_Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Ev_JoinActionPerformed(evt);
            }
        });

        Stud_Ev_Update.setText("Aggiorna");
        Stud_Ev_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Ev_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Stud_Ev_CardLayout = new javax.swing.GroupLayout(Stud_Ev_Card);
        Stud_Ev_Card.setLayout(Stud_Ev_CardLayout);
        Stud_Ev_CardLayout.setHorizontalGroup(
            Stud_Ev_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stud_Ev_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Stud_Ev_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stud_Ev_Join, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stud_Ev_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Stud_Ev_CardLayout.setVerticalGroup(
            Stud_Ev_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
            .addGroup(Stud_Ev_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Stud_Ev_Join, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_Ev_Update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Stud_Ev_Card, "card2");

        Stud_MyEv_Card.setBackground(new java.awt.Color(0, 102, 102));

        Stud_MyEv_Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Stud_MyEv_Tab.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(Stud_MyEv_Tab);

        Stud_MyEv_UnJoin.setText("Non Partecipa");
        Stud_MyEv_UnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_MyEv_UnJoinActionPerformed(evt);
            }
        });

        Stud_MyEv_Update.setText("Aggiorna");
        Stud_MyEv_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_MyEv_UpdateActionPerformed(evt);
            }
        });

        Stud_MyEv_Proposta.setText("Proposta");
        Stud_MyEv_Proposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_MyEv_PropostaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Stud_MyEv_CardLayout = new javax.swing.GroupLayout(Stud_MyEv_Card);
        Stud_MyEv_Card.setLayout(Stud_MyEv_CardLayout);
        Stud_MyEv_CardLayout.setHorizontalGroup(
            Stud_MyEv_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stud_MyEv_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Stud_MyEv_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Stud_MyEv_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Stud_MyEv_UnJoin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Stud_MyEv_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Stud_MyEv_Proposta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Stud_MyEv_CardLayout.setVerticalGroup(
            Stud_MyEv_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Stud_MyEv_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Stud_MyEv_UnJoin)
                .addGap(18, 18, 18)
                .addComponent(Stud_MyEv_Update)
                .addGap(18, 18, 18)
                .addComponent(Stud_MyEv_Proposta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Stud_MyEv_Card, "card2");

        Prof_Pj_Card.setBackground(new java.awt.Color(0, 102, 102));

        Prof_Pj_Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titolo", "Descrizione", "Data creazione", "Ora", "Posti"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Prof_Pj_Tab);

        Prof_Pj_Join.setText("Partecipa");
        Prof_Pj_Join.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Pj_Join.setPreferredSize(new java.awt.Dimension(130, 23));
        Prof_Pj_Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Pj_JoinActionPerformed(evt);
            }
        });

        Prof_Pj_Details.setText("Dettagli");
        Prof_Pj_Details.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Pj_Details.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Pj_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Pj_DetailsActionPerformed(evt);
            }
        });

        Prof_Pj_Update.setText("Aggiorna");
        Prof_Pj_Update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Pj_Update.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Pj_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Pj_UpdateActionPerformed(evt);
            }
        });

        Prof_Pj_UnJoin.setText("Non partecipa");

        javax.swing.GroupLayout Prof_Pj_CardLayout = new javax.swing.GroupLayout(Prof_Pj_Card);
        Prof_Pj_Card.setLayout(Prof_Pj_CardLayout);
        Prof_Pj_CardLayout.setHorizontalGroup(
            Prof_Pj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prof_Pj_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Prof_Pj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Prof_Pj_Join, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(Prof_Pj_Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Pj_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Pj_UnJoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Prof_Pj_CardLayout.setVerticalGroup(
            Prof_Pj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Prof_Pj_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Prof_Pj_Join, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Pj_UnJoin)
                .addGap(18, 18, 18)
                .addComponent(Prof_Pj_Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Pj_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Prof_Pj_Card, "card3");

        Prof_MyPj_Card.setBackground(new java.awt.Color(0, 102, 102));

        Prof_MyPj_Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titolo", "Descrizione", "Data creazione", "Ora", "Posti"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(Prof_MyPj_Tab);

        Prof_MyPj_Del.setText("Cancella Progetto");
        Prof_MyPj_Del.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_MyPj_Del.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_MyPj_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_MyPj_DelActionPerformed(evt);
            }
        });

        Prof_MyPj_Details.setText("Dettagli");
        Prof_MyPj_Details.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_MyPj_Details.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_MyPj_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_MyPj_DetailsActionPerformed(evt);
            }
        });

        Prof_MyPj_Update.setText("Aggiorna");
        Prof_MyPj_Update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_MyPj_Update.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_MyPj_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_MyPj_UpdateActionPerformed(evt);
            }
        });

        Prof_MyPj_New.setText("Crea Progetto");
        Prof_MyPj_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_MyPj_NewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Prof_MyPj_CardLayout = new javax.swing.GroupLayout(Prof_MyPj_Card);
        Prof_MyPj_Card.setLayout(Prof_MyPj_CardLayout);
        Prof_MyPj_CardLayout.setHorizontalGroup(
            Prof_MyPj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prof_MyPj_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Prof_MyPj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Prof_MyPj_Del, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(Prof_MyPj_Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_MyPj_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_MyPj_New, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        Prof_MyPj_CardLayout.setVerticalGroup(
            Prof_MyPj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Prof_MyPj_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Prof_MyPj_New)
                .addGap(18, 18, 18)
                .addComponent(Prof_MyPj_Del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_MyPj_Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_MyPj_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Prof_MyPj_Card, "card3");

        Stud_Pj_Card.setBackground(new java.awt.Color(0, 102, 102));

        Stud_Pj_Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titolo", "Descrizione", "Data creazione", "Ora", "Posti"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(Stud_Pj_Tab);

        Stud_Pj_Join.setText("Partecipa");
        Stud_Pj_Join.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stud_Pj_Join.setPreferredSize(new java.awt.Dimension(130, 23));
        Stud_Pj_Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Pj_JoinActionPerformed(evt);
            }
        });

        Stud_Pj_Details.setText("Dettagli");
        Stud_Pj_Details.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stud_Pj_Details.setPreferredSize(new java.awt.Dimension(110, 23));
        Stud_Pj_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Pj_DetailsActionPerformed(evt);
            }
        });

        Stud_Pj_Update.setText("Aggiorna");
        Stud_Pj_Update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stud_Pj_Update.setPreferredSize(new java.awt.Dimension(110, 23));
        Stud_Pj_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Pj_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Stud_Pj_CardLayout = new javax.swing.GroupLayout(Stud_Pj_Card);
        Stud_Pj_Card.setLayout(Stud_Pj_CardLayout);
        Stud_Pj_CardLayout.setHorizontalGroup(
            Stud_Pj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stud_Pj_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Stud_Pj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Stud_Pj_Join, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stud_Pj_Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stud_Pj_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Stud_Pj_CardLayout.setVerticalGroup(
            Stud_Pj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Stud_Pj_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Stud_Pj_Join, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_Pj_Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_Pj_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        Parent_panel.add(Stud_Pj_Card, "card3");

        Stud_MyPj_Card.setBackground(new java.awt.Color(0, 102, 102));

        Stud_MyPj_Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titolo", "Descrizione", "Data creazione", "Ora", "Posti"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(Stud_MyPj_Tab);

        Stud_MyPj_Details.setText("Dettagli");
        Stud_MyPj_Details.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stud_MyPj_Details.setPreferredSize(new java.awt.Dimension(110, 23));
        Stud_MyPj_Details.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_MyPj_DetailsActionPerformed(evt);
            }
        });

        Stud_MyPj_UnJoin.setText("Non Partecipa");
        Stud_MyPj_UnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_MyPj_UnJoinActionPerformed(evt);
            }
        });

        Stud_MyPj_Update.setText("Aggiorna");
        Stud_MyPj_Update.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stud_MyPj_Update.setPreferredSize(new java.awt.Dimension(110, 23));
        Stud_MyPj_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_MyPj_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Stud_MyPj_CardLayout = new javax.swing.GroupLayout(Stud_MyPj_Card);
        Stud_MyPj_Card.setLayout(Stud_MyPj_CardLayout);
        Stud_MyPj_CardLayout.setHorizontalGroup(
            Stud_MyPj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stud_MyPj_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Stud_MyPj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Stud_MyPj_Details, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(Stud_MyPj_UnJoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stud_MyPj_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        Stud_MyPj_CardLayout.setVerticalGroup(
            Stud_MyPj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Stud_MyPj_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Stud_MyPj_UnJoin)
                .addGap(18, 18, 18)
                .addComponent(Stud_MyPj_Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_MyPj_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Stud_MyPj_Card, "card3");

        getContentPane().add(Parent_panel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(836, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void User_Ev_Table(String email){
        
        User user = new User();
        String User_ID = user.get_User_ID(email);
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT evento.Titolo,evento.Descrizione,evento.Data,evento.Ora,evento.Posti,evento.Durata,evento.Privacy,area_tematica.Titolo as Tag FROM evento, tag_e, area_tematica WHERE (evento.IDevento=tag_e.IDevento AND tag_e.IDareatematica=area_tematica.IDareatematica)";    
            stm = con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Prof_Ev_Tab.setModel(DbUtils.resultSetToTableModel(rs));
            
            String query2 = "SELECT DISTINCT evento.Titolo, evento.Descrizione, evento.Data, evento.Ora, evento.Posti, evento.Durata, evento.Privacy, area_tematica.Titolo as Tag FROM evento, tag_e, area_tematica, moderatore, partecipa, utente WHERE (evento.IDevento=tag_e.IDevento AND tag_e.IDareatematica=area_tematica.IDareatematica AND ((evento.IDevento = moderatore.IDevento AND moderatore.IDmoderatore = '2') OR (evento.IDevento = partecipa.IDevento AND partecipa.IDpartecipante = '"+User_ID+"')))";    
            stm = con.prepareStatement(query2);
            rs = stm.executeQuery(query2);
            Prof_MyEv_Tab.setModel(DbUtils.resultSetToTableModel(rs));
            
            String query3 = "SELECT evento.Titolo,evento.Descrizione,evento.Data,evento.Ora,evento.Posti,evento.Durata,evento.Privacy,area_tematica.Titolo as Tag FROM evento, tag_e, area_tematica WHERE (evento.IDevento=tag_e.IDevento AND tag_e.IDareatematica=area_tematica.IDareatematica)";    
            stm = con.prepareStatement(query3);
            rs = stm.executeQuery(query3);
            Stud_Ev_Tab.setModel(DbUtils.resultSetToTableModel(rs));
            
            String query4 = "SELECT DISTINCT evento.Titolo, evento.Descrizione, evento.Data, evento.Ora, evento.Posti, evento.Durata, evento.Privacy, area_tematica.Titolo as Tag FROM evento, tag_e, area_tematica, partecipa, utente WHERE (evento.IDevento=tag_e.IDevento AND  tag_e.IDareatematica=area_tematica.IDareatematica AND evento.IDevento = partecipa.IDevento AND partecipa.IDpartecipante = '"+User_ID+"')";    
            stm = con.prepareStatement(query4);
            rs = stm.executeQuery(query4);
            Stud_MyEv_Tab.setModel(DbUtils.resultSetToTableModel(rs));
            

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void User_Pj_Table(String email){
        
        User user = new User();
        String User_ID = user.get_User_ID(email);
        String query1;
        
        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT progetto.Titolo,progetto.Descrizione,progetto.Data,progetto.Tipologia,progetto.Posti,progetto.Durata,progetto.Privacy,area_tematica.Titolo as Tag FROM progetto, tag_p, area_tematica WHERE (progetto.IDprogetto=tag_p.IDprogetto AND tag_p.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Prof_Pj_Tab.setModel(DbUtils.resultSetToTableModel(rs));
            
            String query2 = "SELECT DISTINCT progetto.Titolo,progetto.Descrizione,progetto.Data,progetto.Tipologia,progetto.Posti,progetto.Durata,progetto.Privacy,area_tematica.Titolo as Tag FROM progetto, tag_p, area_tematica, coordinatore WHERE (progetto.IDprogetto = tag_p.IDprogetto AND tag_p.IDareatematica = area_tematica.IDareatematica AND (progetto.IDprogetto = coordinatore.IDprogetto AND coordinatore.IDcoordinatore = '"+User_ID+"'))";    
            stm=con.prepareStatement(query2);
            rs = stm.executeQuery(query2);
            Prof_MyPj_Tab.setModel(DbUtils.resultSetToTableModel(rs));
            
            String query3 = "SELECT progetto.Titolo,progetto.Descrizione,progetto.Data,progetto.Tipologia,progetto.Posti,progetto.Durata,progetto.Privacy,area_tematica.Titolo as Tag FROM progetto, tag_p, area_tematica WHERE (progetto.IDprogetto=tag_p.IDprogetto AND tag_p.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query3);
            rs = stm.executeQuery(query3);
            Stud_Pj_Tab.setModel(DbUtils.resultSetToTableModel(rs));
            
            String query4 = "SELECT DISTINCT progetto.Titolo,progetto.Descrizione,progetto.Data,progetto.Tipologia,progetto.Posti,progetto.Durata,progetto.Privacy,area_tematica.Titolo as Tag FROM progetto, tag_p, area_tematica, lavoro, tirocinio, tesi, utente WHERE (progetto.IDprogetto = tag_p.IDprogetto AND  tag_p.IDareatematica = area_tematica.IDareatematica AND ((progetto.IDprogetto = lavoro.IDprogetto AND lavoro.IDlavoratore = '"+User_ID+"') OR (progetto.IDprogetto = tesi.IDprogetto AND tesi.IDtesista = '"+User_ID+"') OR (progetto.IDprogetto = tirocinio.IDprogetto AND tirocinio.IDtirocinante = '"+User_ID+"')))";    
            stm=con.prepareStatement(query4);
            rs = stm.executeQuery(query4);
            Stud_MyPj_Tab.setModel(DbUtils.resultSetToTableModel(rs));
            

        }
        catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    private void ML_Details_Table(String Pj_Titolo){
        
        String Pj_ID = get_Pj_ID(Pj_Titolo);
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT m.Milestone, m.Status FROM milestone AS m, task AS t WHERE (t.IDprogetto='"+Pj_ID+"' AND t.IDmilestone=m.IDmilestone)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Pj_Dettagli.Milestone_Table.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }
    
    private String get_Pj_ID(String Pj_Titolo){
    
        String ID = null;
        
        try{            

            String query_id = "SELECT IDprogetto FROM progetto WHERE titolo ='"+Pj_Titolo+"'";
            rs = stm.executeQuery(query_id);
            rs.next();
            ID = rs.getString("IDprogetto");

        }catch(Exception ex){
            System.out.println(ex);
        }
        return ID;
    }

    private void Prof_Ev_JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Ev_JoinActionPerformed
        Event event = new Event();
        
        int row = Prof_Ev_Tab.getSelectedRow();
        String Ev_Posti;
        String Ev_Titolo;
        Boolean check_partecipazione;
        
        if(row!=-1){
            
            Ev_Posti = Prof_Ev_Tab.getValueAt(row, 4).toString();
            
            if (Ev_Posti=="0") {
                JOptionPane.showMessageDialog(this,"Posti esauriti");
            }else{
            
                Ev_Titolo = Prof_Ev_Tab.getValueAt(row, 0).toString();
                check_partecipazione = event.check_Ev_Join(Ev_Titolo, User.getText());
                boolean check_moderatore = event.check_Moderatore(Ev_Titolo, User.getText());

                if(check_partecipazione!=true && check_moderatore!=true){
                    
                    event.Ev_Join(User.getText(), Ev_Titolo);
                    JOptionPane.showMessageDialog(this,"Iscritto con successo");
                    User_Ev_Table(User.getText());
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Gia iscritto all'evento");
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona l'evento");
        }
           }//GEN-LAST:event_Prof_Ev_JoinActionPerformed

    private void Stud_Ev_JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Ev_JoinActionPerformed
        
        Event event = new Event();
        
        int row = Stud_Ev_Tab.getSelectedRow();
        String Ev_Posti;
        String Ev_Titolo;
        Boolean check_partecipazione;
        
        if(row!=-1){
            
            Ev_Posti = Stud_Ev_Tab.getValueAt(row, 4).toString();
            
            if (Ev_Posti=="0") {
                JOptionPane.showMessageDialog(this,"Posti esauriti");
            }else{
            
                Ev_Titolo = Stud_Ev_Tab.getValueAt(row, 0).toString();
                check_partecipazione = event.check_Ev_Join(Ev_Titolo, User.getText());

                if(check_partecipazione!=true){
                    
                    event.Ev_Join(User.getText(), Ev_Titolo);
                    JOptionPane.showMessageDialog(this,"Iscritto con successo");
                    User_Ev_Table(User.getText());
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Gia�iscritto all'evento");
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona l'evento");
        }
    }//GEN-LAST:event_Stud_Ev_JoinActionPerformed

    private void Stud_Pj_JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Pj_JoinActionPerformed
        
        Project project = new Project();
        
        int row = Stud_Pj_Tab.getSelectedRow();
        String Pj_Posti;
        String Pj_Titolo;
        
        if(row!=-1){
            
            Pj_Posti = Stud_Pj_Tab.getValueAt(row, 4).toString();
            
            if (Pj_Posti=="0") {
                JOptionPane.showMessageDialog(this,"Posti esauriti");
            }else{
            
                Pj_Titolo = Stud_Pj_Tab.getValueAt(row, 0).toString();

                boolean check_lavoratore = project.check_Pj_Lavoratore(Pj_Titolo, User.getText());
                boolean check_tesista = project.check_Pj_Tesista(Pj_Titolo, User.getText());
                boolean check_tirocinante = project.check_Pj_Tirocinante(Pj_Titolo, User.getText());

                if(check_lavoratore!=true && check_tesista!=true && check_tirocinante!=true){

                    project.set_Pj_Posti_Join(Pj_Titolo);

                    if(Stud_Pj_Tab.getValueAt(row, 3).toString().equals("Lavoro")){

                        project.Pj_Lavoro_Join(User.getText(), Pj_Titolo);
                        
                    }else if (Stud_Pj_Tab.getValueAt(row, 3).toString().equals("Tesi")) {

                        project.Pj_Tesi_Join(User.getText(), Pj_Titolo);

                    } else if (Stud_Pj_Tab.getValueAt(row, 3).toString().equals("Tirocinio")) {

                        project.Pj_Tirocinio_Join(User.getText(), Pj_Titolo);

                    }
                    
                    JOptionPane.showMessageDialog(this,"Iscritto con successo");
                    User_Pj_Table(User.getText());
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Gia� iscritto al progetto");
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
        }
    }//GEN-LAST:event_Stud_Pj_JoinActionPerformed

    private void Stud_Pj_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Pj_DetailsActionPerformed
        
        Project project = new Project();
        
        int row = Stud_Pj_Tab.getSelectedRow();
        int Count_Complete = 0;
        
        if(row!=-1){
            
            String Titolo = Stud_Pj_Tab.getValueAt(row, 0).toString();
            String Descrizione = Stud_Pj_Tab.getValueAt(row, 1).toString();
            String Data = Stud_Pj_Tab.getValueAt(row, 2).toString();
            String Tipologia = Stud_Pj_Tab.getValueAt(row, 3).toString();
            String Durata = Stud_Pj_Tab.getValueAt(row, 5).toString();
            String Posti = Stud_Pj_Tab.getValueAt(row, 4).toString();
            String Privacy = Stud_Pj_Tab.getValueAt(row, 6).toString();
            String Tag = Stud_Pj_Tab.getValueAt(row, 7).toString();
                
            boolean check_lavoratore = project.check_Pj_Lavoratore(Titolo, User.getText());
            boolean check_tesista = project.check_Pj_Tesista(Titolo, User.getText());
            boolean check_tirocinante = project.check_Pj_Tirocinante(Titolo, User.getText());

            if(check_lavoratore!=false && check_tesista!=false && check_tirocinante!=false){
            
                new Pj_Dettagli().setVisible(true);

                ML_Details_Table(Titolo);

                Pj_Dettagli.Milestone_New_Button.setVisible(false);
                Pj_Dettagli.Milestone_Del_Button.setVisible(false);
                
                Pj_Dettagli.Titolo.setText(Titolo);
                Pj_Dettagli.Pj_Descrizione.setText(Descrizione);
                Pj_Dettagli.Data.setText(Data);
                Pj_Dettagli.Tipologia.setText(Tipologia);
                Pj_Dettagli.Durata.setText(Durata);
                Pj_Dettagli.Posti.setText(Posti);
                Pj_Dettagli.Privacy.setText(Privacy);
                Pj_Dettagli.Tag.setText(Tag);
                
                Pj_Dettagli.Milestone_ProgressBar.setMinimum(0);
                Pj_Dettagli.Milestone_ProgressBar.setMaximum(Pj_Dettagli.Milestone_Table.getRowCount());
        
                for(int ML_row = 0; ML_row<Pj_Dettagli.Milestone_Table.getRowCount(); ML_row++){

                    if (Pj_Dettagli.Milestone_Table.getValueAt(ML_row,1).toString().equals("Complete")) {

                        Count_Complete+=1;

                    }
                }

                Pj_Dettagli.Milestone_ProgressBar.setValue(Count_Complete);
            
            }else{
                JOptionPane.showMessageDialog(this,"Prima devi partecipare al progetto");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
        }
    }//GEN-LAST:event_Stud_Pj_DetailsActionPerformed

    private void Prof_Ev_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Ev_UpdateActionPerformed
        User_Ev_Table(User.getText());
    }//GEN-LAST:event_Prof_Ev_UpdateActionPerformed

    private void Stud_Pj_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Pj_UpdateActionPerformed
        User_Pj_Table(User.getText());
    }//GEN-LAST:event_Stud_Pj_UpdateActionPerformed

    private void Prof_Pj_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Pj_UpdateActionPerformed
        User_Pj_Table(User.getText());
    }//GEN-LAST:event_Prof_Pj_UpdateActionPerformed

    private void Ev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ev_buttonActionPerformed

        User user = new User();
        
        String User_Categoria = user.get_User_Categoria(User.getText());
        
        if(User_Categoria.equals("professore")){

            Parent_panel.removeAll();
            Parent_panel.add(Prof_Ev_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }else{

            Parent_panel.removeAll();
            Parent_panel.add(Stud_Ev_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }
    }//GEN-LAST:event_Ev_buttonActionPerformed

    private void Pj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pj_buttonActionPerformed

        User user = new User();
        
        String User_Categoria = user.get_User_Categoria(User.getText());
        
        if(User_Categoria.equals("professore")){

            Parent_panel.removeAll();
            Parent_panel.add(Prof_Pj_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }else{

            Parent_panel.removeAll();
            Parent_panel.add(Stud_Pj_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }
    }//GEN-LAST:event_Pj_buttonActionPerformed

    private void Logout_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_linkMouseClicked

        new User_Login().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_Logout_linkMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        Parent_panel.removeAll();
        Parent_panel.add(home);
        Parent_panel.repaint();
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void MyPj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyPj_buttonActionPerformed
        
        User user = new User();
        
        String User_Categoria = user.get_User_Categoria(User.getText());
        
        if(User_Categoria.equals("professore")){

            Parent_panel.removeAll();
            Parent_panel.add(Prof_MyPj_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }else{

            Parent_panel.removeAll();
            Parent_panel.add(Stud_MyPj_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();}
    }//GEN-LAST:event_MyPj_buttonActionPerformed

    private void MyEv_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MyEv_buttonActionPerformed
        
        User user = new User();
        
        String User_Categoria = user.get_User_Categoria(User.getText());
        
        if(User_Categoria.equals("professore")){

            Parent_panel.removeAll();
            Parent_panel.add(Prof_MyEv_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }else{

            Parent_panel.removeAll();
            Parent_panel.add(Stud_MyEv_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();}
    }//GEN-LAST:event_MyEv_buttonActionPerformed

    private void Prof_MyEv_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_MyEv_DelActionPerformed

        Event event = new Event();
        
        int row = Prof_Ev_Tab.getSelectedRow();
        String titolo;

        if(row!=-1){
            
            

            titolo = Prof_Ev_Tab.getValueAt(row, 0).toString();
            event.Ev_Del(titolo);
            User_Ev_Table(User.getText());
            
        }
    }//GEN-LAST:event_Prof_MyEv_DelActionPerformed

    private void Prof_MyEv_ModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_MyEv_ModifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Prof_MyEv_ModifyActionPerformed

    private void Stud_MyEv_UnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_MyEv_UnJoinActionPerformed
        
        Event event = new Event();
        
        int row = Stud_Ev_Tab.getSelectedRow();
        String Ev_Titolo;
        Boolean check_partecipazione;
        
        if(row!=-1){
            
            Ev_Titolo = Stud_Ev_Tab.getValueAt(row, 0).toString();
            check_partecipazione = event.check_Ev_Join(Ev_Titolo, User.getText());

            if(check_partecipazione!=false){
                
                event.Ev_UnJoin(User.getText(), Ev_Titolo);
                JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                User_Ev_Table(User.getText());
                
            }else{
                JOptionPane.showMessageDialog(this,"Non partecipi all'evento");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona l'evento");
        }         
    }//GEN-LAST:event_Stud_MyEv_UnJoinActionPerformed

    private void Stud_MyEv_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_MyEv_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stud_MyEv_UpdateActionPerformed

    private void Prof_MyPj_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_MyPj_DelActionPerformed
        
        Project project = new Project();
        
        int row = Prof_Pj_Tab.getSelectedRow();
        String Pj_Titolo;
        
        if(row!=-1){
            
            Pj_Titolo = Prof_Pj_Tab.getValueAt(row, 0).toString();
            project.Pj_Del(Pj_Titolo);
            User_Pj_Table(User.getText());
            
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
        }
    }//GEN-LAST:event_Prof_MyPj_DelActionPerformed

    private void Prof_MyPj_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_MyPj_DetailsActionPerformed
        
        int row = Prof_MyPj_Tab.getSelectedRow();
        
        if(row!=-1){
            
            String Titolo = Prof_MyPj_Tab.getValueAt(row, 0).toString();
            String Descrizione = Prof_MyPj_Tab.getValueAt(row, 1).toString();
            String Data = Prof_MyPj_Tab.getValueAt(row, 2).toString();
            String Tipologia = Prof_MyPj_Tab.getValueAt(row, 3).toString();
            String Posti = Prof_MyPj_Tab.getValueAt(row, 4).toString();
            String Durata = Prof_MyPj_Tab.getValueAt(row, 5).toString();
            String Privacy = Prof_MyPj_Tab.getValueAt(row, 6).toString();
            String Tag = Prof_MyPj_Tab.getValueAt(row, 7).toString();
            
            new Pj_Dettagli().setVisible(true);
            
            ML_Details_Table(Titolo);
            
            Pj_Dettagli.Milestone_Complete_Button.setVisible(false);
            Pj_Dettagli.Milestone_Join_Button.setVisible(false);
            
            Pj_Dettagli.Titolo.setText(Titolo);
            Pj_Dettagli.Pj_Descrizione.setText(Descrizione);
            Pj_Dettagli.Data.setText(Data);
            Pj_Dettagli.Tipologia.setText(Tipologia);
            Pj_Dettagli.Durata.setText(Durata);
            Pj_Dettagli.Posti.setText(Posti);
            Pj_Dettagli.Privacy.setText(Privacy);
            Pj_Dettagli.Tag.setText(Tag);
            Pj_Dettagli.Milestone_Table.setModel(DbUtils.resultSetToTableModel(rs));
            
            int Count_Complete = 0;
            
            Pj_Dettagli.Milestone_ProgressBar.setMinimum(0);
            Pj_Dettagli.Milestone_ProgressBar.setMaximum(Pj_Dettagli.Milestone_Table.getRowCount());

            for(int i = 0; i<Pj_Dettagli.Milestone_Table.getRowCount(); i++){

                if (Pj_Dettagli.Milestone_Table.getValueAt(i,1).toString().equals("Complete")) {

                    Count_Complete+=1;

                }
            }

            Pj_Dettagli.Milestone_ProgressBar.setValue(Count_Complete);
            
        }else{JOptionPane.showMessageDialog(this,"Seleziona il progetto");}    }//GEN-LAST:event_Prof_MyPj_DetailsActionPerformed

    private void Prof_MyPj_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_MyPj_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Prof_MyPj_UpdateActionPerformed

    private void Stud_MyPj_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_MyPj_DetailsActionPerformed

        Project project = new Project();
        
        int row = Stud_Pj_Tab.getSelectedRow();
        int Count_Complete = 0;
        
        if(row!=-1){
                
            String Titolo = Stud_Pj_Tab.getValueAt(row, 0).toString();
            String Descrizione = Stud_Pj_Tab.getValueAt(row, 1).toString();
            String Data = Stud_Pj_Tab.getValueAt(row, 2).toString();
            String Tipologia = Stud_Pj_Tab.getValueAt(row, 3).toString();
            String Durata = Stud_Pj_Tab.getValueAt(row, 5).toString();
            String Posti = Stud_Pj_Tab.getValueAt(row, 4).toString();
            String Privacy = Stud_Pj_Tab.getValueAt(row, 6).toString();
            String Tag = Stud_Pj_Tab.getValueAt(row, 7).toString();
            
            boolean check_lavoratore = project.check_Pj_Lavoratore(Titolo, User.getText());
            boolean check_tesista = project.check_Pj_Tesista(Titolo, User.getText());
            boolean check_tirocinante = project.check_Pj_Tirocinante(Titolo, User.getText());

            if(check_lavoratore!=false || check_tesista!=false || check_tirocinante!=false){
            
                new Pj_Dettagli().setVisible(true);

                ML_Details_Table(Titolo);

                Pj_Dettagli.Milestone_New_Button.setVisible(false);
                Pj_Dettagli.Milestone_Del_Button.setVisible(false);
                
                Pj_Dettagli.Titolo.setText(Titolo);
                Pj_Dettagli.Pj_Descrizione.setText(Descrizione);
                Pj_Dettagli.Data.setText(Data);
                Pj_Dettagli.Tipologia.setText(Tipologia);
                Pj_Dettagli.Durata.setText(Durata);
                Pj_Dettagli.Posti.setText(Posti);
                Pj_Dettagli.Privacy.setText(Privacy);
                Pj_Dettagli.Tag.setText(Tag);
                
                Pj_Dettagli.Milestone_ProgressBar.setMinimum(0);
                Pj_Dettagli.Milestone_ProgressBar.setMaximum(Pj_Dettagli.Milestone_Table.getRowCount());
        
                for(int ML_row = 0; ML_row<Pj_Dettagli.Milestone_Table.getRowCount(); ML_row++){

                    if (Pj_Dettagli.Milestone_Table.getValueAt(ML_row,1).toString().equals("Complete")) {

                        Count_Complete+=1;

                    }
                }

                Pj_Dettagli.Milestone_ProgressBar.setValue(Count_Complete);
            
            }else{
                JOptionPane.showMessageDialog(this,"Prima devi partecipare al progetto");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
        }

    }//GEN-LAST:event_Stud_MyPj_DetailsActionPerformed

    private void Stud_MyPj_UnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_MyPj_UnJoinActionPerformed

        Project project = new Project();
        
        int row = Stud_Pj_Tab.getSelectedRow();
        String Titolo;

        if(row!=-1){

            Titolo = Stud_Pj_Tab.getValueAt(row, 0).toString();

            boolean check_lavoratore = project.check_Pj_Lavoratore(Titolo, User.getText());
            boolean check_tesista = project.check_Pj_Tesista(Titolo, User.getText());
            boolean check_tirocinante = project.check_Pj_Tirocinante(Titolo, User.getText());
            
            if(check_lavoratore!=false || check_tesista!=false || check_tirocinante!=false){

                project.set_Pj_Posti_UnJoin(Titolo);

                if(Stud_Pj_Tab.getValueAt(row, 3).toString().equals("Lavoro")){

                    project.Pj_Lavoro_UnJoin(User.getText(), Titolo);

                }else if (Stud_Pj_Tab.getValueAt(row, 3).toString().equals("Tesi")) {

                    project.Pj_Tesi_UnJoin(User.getText(), Titolo);

                } else if (Stud_Pj_Tab.getValueAt(row, 3).toString().equals("Tirocinio")) {

                    project.Pj_Lavoro_UnJoin(User.getText(), Titolo);

                }
                    
                JOptionPane.showMessageDialog(this,"Disicritto con successo");
                User_Pj_Table(User.getText());

            }else{
                JOptionPane.showMessageDialog(this,"Gia� non partecipi al progetto");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");}
    }//GEN-LAST:event_Stud_MyPj_UnJoinActionPerformed

    private void Stud_MyPj_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_MyPj_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stud_MyPj_UpdateActionPerformed

    private void Prof_MyEv_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_MyEv_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Prof_MyEv_UpdateActionPerformed

    private void Stud_Ev_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Ev_UpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stud_Ev_UpdateActionPerformed

    private void Prof_Pj_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Pj_DetailsActionPerformed

        int row = Prof_Pj_Tab.getSelectedRow();
        
        if(row!=-1){
            
            String Titolo = Prof_Pj_Tab.getValueAt(row, 0).toString();
            String Descrizione = Prof_Pj_Tab.getValueAt(row, 1).toString();
            String Data = Prof_Pj_Tab.getValueAt(row, 2).toString();
            String Tipologia = Prof_Pj_Tab.getValueAt(row, 3).toString();
            String Posti = Prof_Pj_Tab.getValueAt(row, 4).toString();
            String Durata = Prof_Pj_Tab.getValueAt(row, 5).toString();
            String Privacy = Prof_Pj_Tab.getValueAt(row, 6).toString();
            String Tag = Prof_Pj_Tab.getValueAt(row, 7).toString();
            
            new Pj_Dettagli().setVisible(true);
            
            ML_Details_Table(Titolo);
            
            Pj_Dettagli.Milestone_Complete_Button.setVisible(false);
            Pj_Dettagli.Milestone_Join_Button.setVisible(false);
            
            Pj_Dettagli.Titolo.setText(Titolo);
            Pj_Dettagli.Pj_Descrizione.setText(Descrizione);
            Pj_Dettagli.Data.setText(Data);
            Pj_Dettagli.Tipologia.setText(Tipologia);
            Pj_Dettagli.Durata.setText(Durata);
            Pj_Dettagli.Posti.setText(Posti);
            Pj_Dettagli.Privacy.setText(Privacy);
            Pj_Dettagli.Tag.setText(Tag);
            
            int Count_Complete = 0;
            
            Pj_Dettagli.Milestone_ProgressBar.setMinimum(0);
            Pj_Dettagli.Milestone_ProgressBar.setMaximum(Pj_Dettagli.Milestone_Table.getRowCount());

            for(int i = 0; i<Pj_Dettagli.Milestone_Table.getRowCount(); i++){

                if (Pj_Dettagli.Milestone_Table.getValueAt(i,1).toString().equals("Complete")) {

                    Count_Complete+=1;

                }
            }

            Pj_Dettagli.Milestone_ProgressBar.setValue(Count_Complete);
            
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
        }
    }//GEN-LAST:event_Prof_Pj_DetailsActionPerformed

    private void Prof_Pj_JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Pj_JoinActionPerformed
//        Project project = new Project();
//        
//        int row = Prof_Pj_Tab.getSelectedRow();
//        String Pj_Posti;
//        String Pj_Titolo;
//        
//        if(row!=-1){
//            
//            Pj_Posti = Prof_Pj_Tab.getValueAt(row, 4).toString();
//            
//            if (Pj_Posti=="0") {
//                JOptionPane.showMessageDialog(this,"Posti esauriti");
//            }else{
//            
//                Pj_Titolo = Prof_Pj_Tab.getValueAt(row, 0).toString();
//
//                boolean check_lavoratore = project.check_Pj_Lavoratore(Pj_Titolo, User.getText());
//                boolean check_tesista = project.check_Pj_Tesista(Pj_Titolo, User.getText());
//                boolean check_tirocinante = project.check_Pj_Tirocinante(Pj_Titolo, User.getText());
//
//                if(check_lavoratore!=true && check_tesista!=true && check_tirocinante!=true){
//
//                    project.set_Pj_Posti_Join(Pj_Titolo);
//
//                    if(Prof_Pj_Tab.getValueAt(row, 3).toString().equals("Lavoro")){
//
//                        project.Pj_Lavoro_Join(User.getText(), Pj_Titolo);
//                        
//                    }else if (Prof_Pj_Tab.getValueAt(row, 3).toString().equals("Tesi")) {
//
//                        project.Pj_Tesi_Join(User.getText(), Pj_Titolo);
//
//                    } else if (Stud_Pj_Tab.getValueAt(row, 3).toString().equals("Tirocinio")) {
//
//                        project.Pj_Tirocinio_Join(User.getText(), Pj_Titolo);
//
//                    }
//                    
//                    JOptionPane.showMessageDialog(this,"Iscritto con successo");
//                    User_Pj_Table();
//                    
//                }else{
//                    JOptionPane.showMessageDialog(this,"Gia� iscritto al progetto");
//                }
//            }
//        }else{
//            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
//        }
    }//GEN-LAST:event_Prof_Pj_JoinActionPerformed

    private void Prof_MyPj_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_MyPj_NewActionPerformed
        new Pj_New().setVisible(true);    
    }//GEN-LAST:event_Prof_MyPj_NewActionPerformed

    private void Prof_MyEv_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_MyEv_NewActionPerformed
        new Ev_New().setVisible(true);
    }//GEN-LAST:event_Prof_MyEv_NewActionPerformed

    private void Stud_MyEv_PropostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_MyEv_PropostaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Stud_MyEv_PropostaActionPerformed

    private void Prof_MyEv_UnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_MyEv_UnJoinActionPerformed
       
        Event event = new Event();
        
        int row = Prof_MyEv_Tab.getSelectedRow();
        String Ev_Titolo;
        Boolean check_partecipazione;
        
        if(row!=-1){
            
            Ev_Titolo = Prof_MyEv_Tab.getValueAt(row, 0).toString();
            check_partecipazione = event.check_Ev_Join(Ev_Titolo, User.getText());

            if(check_partecipazione!=false){
                
                event.Ev_UnJoin(User.getText(), Ev_Titolo);
                JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                User_Ev_Table(User.getText());
                
            }else{
                JOptionPane.showMessageDialog(this,"Non partecipi all'evento");
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona l'evento");
        } 
    }//GEN-LAST:event_Prof_MyEv_UnJoinActionPerformed

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
            java.util.logging.Logger.getLogger(User_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new User_Menu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ev_button;
    private javax.swing.JLabel Logout_link;
    private javax.swing.JButton MyEv_button;
    private javax.swing.JButton MyPj_button;
    private javax.swing.JPanel Parent_panel;
    private javax.swing.JButton Pj_button;
    private javax.swing.JPanel Prof_Ev_Card;
    private javax.swing.JButton Prof_Ev_Join;
    private javax.swing.JTable Prof_Ev_Tab;
    private javax.swing.JButton Prof_Ev_Update;
    private javax.swing.JPanel Prof_MyEv_Card;
    private javax.swing.JButton Prof_MyEv_Del;
    private javax.swing.JButton Prof_MyEv_Modify;
    private javax.swing.JButton Prof_MyEv_New;
    private javax.swing.JTable Prof_MyEv_Tab;
    private javax.swing.JButton Prof_MyEv_UnJoin;
    private javax.swing.JButton Prof_MyEv_Update;
    private javax.swing.JPanel Prof_MyPj_Card;
    private javax.swing.JButton Prof_MyPj_Del;
    private javax.swing.JButton Prof_MyPj_Details;
    private javax.swing.JButton Prof_MyPj_New;
    private javax.swing.JTable Prof_MyPj_Tab;
    private javax.swing.JButton Prof_MyPj_Update;
    private javax.swing.JPanel Prof_Pj_Card;
    private javax.swing.JButton Prof_Pj_Details;
    private javax.swing.JButton Prof_Pj_Join;
    private javax.swing.JTable Prof_Pj_Tab;
    private javax.swing.JButton Prof_Pj_UnJoin;
    private javax.swing.JButton Prof_Pj_Update;
    private javax.swing.JPanel Stud_Ev_Card;
    private javax.swing.JButton Stud_Ev_Join;
    private javax.swing.JTable Stud_Ev_Tab;
    javax.swing.JButton Stud_Ev_Update;
    private javax.swing.JPanel Stud_MyEv_Card;
    private javax.swing.JButton Stud_MyEv_Proposta;
    private javax.swing.JTable Stud_MyEv_Tab;
    javax.swing.JButton Stud_MyEv_UnJoin;
    javax.swing.JButton Stud_MyEv_Update;
    private javax.swing.JPanel Stud_MyPj_Card;
    private javax.swing.JButton Stud_MyPj_Details;
    private javax.swing.JTable Stud_MyPj_Tab;
    private javax.swing.JButton Stud_MyPj_UnJoin;
    private javax.swing.JButton Stud_MyPj_Update;
    private javax.swing.JPanel Stud_Pj_Card;
    private javax.swing.JButton Stud_Pj_Details;
    private javax.swing.JButton Stud_Pj_Join;
    private javax.swing.JTable Stud_Pj_Tab;
    private javax.swing.JButton Stud_Pj_Update;
    public static javax.swing.JLabel User;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

}