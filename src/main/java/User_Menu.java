/*
Schermata principale, dallaquale si possono effettuare varie operazioni:
-   Visualizzazione degli Eventi
-   Visualizzazione dei Progetti
-   Partecipazione ad un Progetto/Evento
-   Non partecipazione ad un Evento/Progetto
-   Aggiornamento del contenuto
-   Logout
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class User_Menu extends javax.swing.JFrame {
    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;        

    public User_Menu() {
        
        initComponents();
        Prof_Ev_Table();
        Stud_Ev_Table();
        Prof_Pj_Table();
        Stud_Pj_Table();
        
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
        User_ID_hidden = new javax.swing.JLabel();
        User_Categoria_hidden = new javax.swing.JLabel();
        Parent_panel = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        Prof_Ev_Card = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Prof_Ev_Tab = new javax.swing.JTable();
        Prof_Ev_New = new javax.swing.JButton();
        Prof_Ev_Del = new javax.swing.JButton();
        Prof_Ev_Update = new javax.swing.JButton();
        Stud_Ev_Card = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Stud_Ev_Tab = new javax.swing.JTable();
        Stud_Ev_Join = new javax.swing.JButton();
        Stud_Ev_UnJoin = new javax.swing.JButton();
        Stud_Ev_Update = new javax.swing.JButton();
        Prof_Pj_Card = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prof_Pj_Tab = new javax.swing.JTable();
        Prof_Pj_New = new javax.swing.JButton();
        Prof_Pj_Del = new javax.swing.JButton();
        Prof_Pj_Details = new javax.swing.JButton();
        Prof_Pj_Update = new javax.swing.JButton();
        Stud_Pj_Card = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Stud_Pj_Tab = new javax.swing.JTable();
        Stud_Pj_Join = new javax.swing.JButton();
        Stud_Pj_Details = new javax.swing.JButton();
        Stud_Pj_UnJoin = new javax.swing.JButton();
        Stud_Pj_Update = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(User_Categoria_hidden))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(Ev_button)
                        .addGap(35, 35, 35)
                        .addComponent(Pj_button)
                        .addGap(40, 40, 40)
                        .addComponent(User)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(Logout_link)
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(409, 409, 409)
                    .addComponent(User_ID_hidden)
                    .addContainerGap(409, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(User_Categoria_hidden)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ev_button)
                    .addComponent(Pj_button)
                    .addComponent(User)
                    .addComponent(Logout_link))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(User_ID_hidden)
                    .addContainerGap(50, Short.MAX_VALUE)))
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

        Prof_Ev_New.setText("Crea Evento");
        Prof_Ev_New.setPreferredSize(new java.awt.Dimension(130, 23));
        Prof_Ev_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Ev_NewActionPerformed(evt);
            }
        });

        Prof_Ev_Del.setText("Cancella Evento");
        Prof_Ev_Del.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Ev_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Ev_DelActionPerformed(evt);
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
                    .addComponent(Prof_Ev_Del, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Ev_New, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Ev_Update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Prof_Ev_CardLayout.setVerticalGroup(
            Prof_Ev_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
            .addGroup(Prof_Ev_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Prof_Ev_New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Ev_Del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Ev_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Prof_Ev_Card, "card2");

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

        Stud_Ev_UnJoin.setText("Non Partecipa");
        Stud_Ev_UnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Ev_UnJoinActionPerformed(evt);
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
                    .addComponent(Stud_Ev_UnJoin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stud_Ev_Update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Stud_Ev_CardLayout.setVerticalGroup(
            Stud_Ev_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
            .addGroup(Stud_Ev_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Stud_Ev_Join, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_Ev_UnJoin)
                .addGap(18, 18, 18)
                .addComponent(Stud_Ev_Update)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Stud_Ev_Card, "card2");

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

        Prof_Pj_New.setText("Crea Progetto");
        Prof_Pj_New.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Pj_New.setPreferredSize(new java.awt.Dimension(130, 23));
        Prof_Pj_New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Pj_NewActionPerformed(evt);
            }
        });

        Prof_Pj_Del.setText("Cancella Progetto");
        Prof_Pj_Del.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Pj_Del.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Pj_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Pj_DelActionPerformed(evt);
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

        javax.swing.GroupLayout Prof_Pj_CardLayout = new javax.swing.GroupLayout(Prof_Pj_Card);
        Prof_Pj_Card.setLayout(Prof_Pj_CardLayout);
        Prof_Pj_CardLayout.setHorizontalGroup(
            Prof_Pj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prof_Pj_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Prof_Pj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Prof_Pj_Del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Pj_New, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(Prof_Pj_Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Pj_Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Prof_Pj_CardLayout.setVerticalGroup(
            Prof_Pj_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Prof_Pj_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Prof_Pj_New, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Pj_Del, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Pj_Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Pj_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        Parent_panel.add(Prof_Pj_Card, "card3");

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

        Stud_Pj_UnJoin.setText("Non Partecipa");
        Stud_Pj_UnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Pj_UnJoinActionPerformed(evt);
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
                    .addComponent(Stud_Pj_UnJoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(Stud_Pj_UnJoin)
                .addGap(18, 18, 18)
                .addComponent(Stud_Pj_Details, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_Pj_Update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        Parent_panel.add(Stud_Pj_Card, "card3");

        getContentPane().add(Parent_panel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(836, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Prof_Ev_Table(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT evento.Titolo,evento.Descrizione,evento.Data,evento.Ora,evento.Posti,evento.Durata,evento.Privacy,area_tematica.Titolo as Tag FROM evento, tag_e, area_tematica WHERE (evento.IDevento=tag_e.IDevento AND tag_e.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Prof_Ev_Tab.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void Stud_Ev_Table(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT evento.Titolo,evento.Descrizione,evento.Data,evento.Ora,evento.Posti,evento.Durata,evento.Privacy,area_tematica.Titolo as Tag FROM evento, tag_e, area_tematica WHERE (evento.IDevento=tag_e.IDevento AND tag_e.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Stud_Ev_Tab.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void Prof_Pj_Table(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT progetto.Titolo,progetto.Descrizione,progetto.Data,progetto.Tipologia,progetto.Posti,progetto.Durata,progetto.Privacy,area_tematica.Titolo as Tag FROM progetto, tag_p, area_tematica WHERE (progetto.IDprogetto=tag_p.IDprogetto AND tag_p.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Prof_Pj_Tab.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void Stud_Pj_Table(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT progetto.Titolo,progetto.Descrizione,progetto.Data,progetto.Tipologia,progetto.Posti,progetto.Durata,progetto.Privacy,area_tematica.Titolo as Tag FROM progetto, tag_p, area_tematica WHERE (progetto.IDprogetto=tag_p.IDprogetto AND tag_p.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Stud_Pj_Tab.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void Pj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pj_buttonActionPerformed

       if(User_Categoria_hidden.getText().equals("professore")){
           
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

    private void Ev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ev_buttonActionPerformed
      
        if(User_Categoria_hidden.getText().equals("professore")){
            
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

    private void Prof_Ev_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Ev_NewActionPerformed
        new Ev_New().setVisible(true);
           }//GEN-LAST:event_Prof_Ev_NewActionPerformed

    private void Logout_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_linkMouseClicked
        
        new User_Login().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Logout_linkMouseClicked

    private void Prof_Pj_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Pj_DetailsActionPerformed
        
        int row;
        
        String Titolo;
        String IDprogetto = null;
        String Descrizione;
        String Data;
        String Tipologia;
        String Durata;
        String Posti;
        String Privacy;
        String Tag;
        String query1;
        String query2;
        
        row = Prof_Pj_Tab.getSelectedRow();
        
        if(row!=-1){
            
            Titolo = Prof_Pj_Tab.getValueAt(row, 0).toString();
            Descrizione = Prof_Pj_Tab.getValueAt(row, 1).toString();
            Data = Prof_Pj_Tab.getValueAt(row, 2).toString();
            Tipologia = Prof_Pj_Tab.getValueAt(row, 3).toString();
            Posti = Prof_Pj_Tab.getValueAt(row, 4).toString();
            Durata = Prof_Pj_Tab.getValueAt(row, 5).toString();
            Privacy = Prof_Pj_Tab.getValueAt(row, 6).toString();
            Tag = Prof_Pj_Tab.getValueAt(row, 7).toString();
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                query1 = "SELECT IDprogetto FROM progetto WHERE titolo ='"+Titolo+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                IDprogetto = rs.getString("IDprogetto");
                query2 = "SELECT milestone.Milestone, milestone.Status FROM milestone, task WHERE (task.IDprogetto='"+IDprogetto+"' AND task.IDmilestone=milestone.IDmilestone)";    
                stm=con.prepareStatement(query2);
                rs = stm.executeQuery(query2);

            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
            
            new Pj_Dettagli().setVisible(true);
            
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
            Pj_Dettagli.IDpj_hidden.setText(IDprogetto);
            Pj_Dettagli.IDpj_hidden.setVisible(false);
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
            
        }else{JOptionPane.showMessageDialog(this,"Seleziona il progetto");}
    }//GEN-LAST:event_Prof_Pj_DetailsActionPerformed

    private void Prof_Pj_NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Pj_NewActionPerformed
        new Pj_New().setVisible(true);
    }//GEN-LAST:event_Prof_Pj_NewActionPerformed

    private void Stud_Ev_JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Ev_JoinActionPerformed
        
        int row;
        String Posti;
        String Titolo;
        String query_IDevento;
        String IDevento;
        String query_check;
        Boolean check_partecipazione;
        String update_Posti;
        String query_partecipazione;
        
        row = Stud_Ev_Tab.getSelectedRow();
        if(row!=-1){
            
            Posti = Stud_Ev_Tab.getValueAt(row, 4).toString();
            if (Posti=="0") {
                
                JOptionPane.showMessageDialog(this,"Posti esauriti");
                
            }else{
            
               Titolo = Stud_Ev_Tab.getValueAt(row, 0).toString(); 
            
                try{

                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                    query_IDevento = "SELECT IDevento FROM evento WHERE titolo ='"+Titolo+"'";    
                    stm = con.prepareStatement(query_IDevento);
                    rs = stm.executeQuery(query_IDevento);
                    rs.next();
                    IDevento = rs.getString("IDevento");
                    query_check = "SELECT IDevento, IDpartecipante FROM partecipa WHERE IDevento ='"+IDevento+"' AND IDpartecipante ='"+User_ID_hidden.getText()+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                    if(check_partecipazione!=true){
                        update_Posti = "UPDATE evento SET posti = posti-1 WHERE IDevento = '"+IDevento+"'";
                        stm.executeUpdate(update_Posti);
                        query_partecipazione = "INSERT INTO partecipa (IDpartecipante, IDevento) VALUES ('"+User_ID_hidden.getText()+"', '"+IDevento+"')";
                        stm.executeUpdate(query_partecipazione);
                        JOptionPane.showMessageDialog(this,"Iscritto con successo");
                        Stud_Ev_Table();
                    }else{
                        JOptionPane.showMessageDialog(this,"Gia  iscritto all'evento");
                    }
                }catch(Exception ex){
                    System.out.println("Error: "+ex);
                } 
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona l'evento");
        }
    }//GEN-LAST:event_Stud_Ev_JoinActionPerformed

    private void Stud_Pj_JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Pj_JoinActionPerformed
        
        int row;
        String Posti;
        String Titolo_prog;
        String query_infoProgetto;
        String IDprogetto;
        String Tipologia;
        String query_check;
        Boolean check_partecipazione = null;
        String query_checkPartecipazione;
        String query_partecipazione;
        
        row = Stud_Pj_Tab.getSelectedRow();
        if(row!=-1){
            
            Posti = Stud_Pj_Tab.getValueAt(row, 4).toString();
            if (Posti=="0") {
                
                JOptionPane.showMessageDialog(this,"Posti esauriti");
                
            }else{
            
                Titolo_prog = Stud_Pj_Tab.getValueAt(row, 0).toString(); 
            
                try{

                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                    query_infoProgetto = "SELECT IDprogetto, Tipologia FROM progetto WHERE titolo ='"+Titolo_prog+"'";    
                    stm = con.prepareStatement(query_infoProgetto);
                    rs = stm.executeQuery(query_infoProgetto);
                    rs.next();
                    IDprogetto = rs.getString("IDprogetto");
                    Tipologia = rs.getString("Tipologia");
                    
                    if(Tipologia.equals("Lavoro")){

                        query_check = "SELECT IDlavoratore, IDprogetto FROM lavoro WHERE IDlavoratore ='"+User_ID_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                        stm = con.prepareStatement(query_check);
                        rs = stm.executeQuery(query_check);
                        check_partecipazione = rs.next();

                    }else if (Tipologia.equals("Tesi")) {

                        query_check = "SELECT IDtesista, IDprogetto FROM tesi WHERE IDtesista ='"+User_ID_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                        stm = con.prepareStatement(query_check);
                        rs = stm.executeQuery(query_check);
                        check_partecipazione = rs.next();

                    } else if (Tipologia.equals("Tirocinio")) {

                        query_check = "SELECT IDtirocinante, IDprogetto FROM tirocinio WHERE IDtirocinante ='"+User_ID_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                        stm = con.prepareStatement(query_check);
                        rs = stm.executeQuery(query_check);
                        check_partecipazione = rs.next();

                    }

                    if(check_partecipazione!=true){
                        
                        query_checkPartecipazione = "UPDATE progetto SET posti = posti-1 WHERE IDprogetto = '"+IDprogetto+"'";
                        stm.executeUpdate(query_checkPartecipazione);

                        if(Tipologia.equals("Lavoro")){

                            query_partecipazione = "INSERT INTO lavoro (IDlavoratore, IDprogetto) VALUES ('"+User_ID_hidden.getText()+"', '"+IDprogetto+"')";
                            stm.executeUpdate(query_partecipazione);
                            JOptionPane.showMessageDialog(this,"Iscritto con successo");
                            Stud_Pj_Table();

                        }else if (Tipologia.equals("Tesi")) {

                            query_partecipazione = "INSERT INTO tesi (IDtesista, IDprogetto) VALUES ('"+User_ID_hidden.getText()+"', '"+IDprogetto+"')";
                            stm.executeUpdate(query_partecipazione);
                            JOptionPane.showMessageDialog(this,"Iscritto con successo");
                            Stud_Pj_Table();

                        } else if (Tipologia.equals("Tirocinio")) {

                            query_partecipazione = "INSERT INTO tirocinio (IDtirocinante, IDprogetto) VALUES ('"+User_ID_hidden.getText()+"', '"+IDprogetto+"')";
                            stm.executeUpdate(query_partecipazione);
                            JOptionPane.showMessageDialog(this,"Iscritto con successo");
                            Stud_Pj_Table();

                        }
                    }else{
                        JOptionPane.showMessageDialog(this,"Gia  iscritto al progetto");
                    }
                }catch(Exception ex){
                    System.out.println("Error: "+ex);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
        }
    }//GEN-LAST:event_Stud_Pj_JoinActionPerformed

    private void Stud_Pj_DetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Pj_DetailsActionPerformed
        
        int row;
        
        String Titolo;
        String Descrizione;
        String Data;
        String Tipologia;
        String Durata;
        String Posti;
        String Privacy;
        String Tag;
        String query1;
        String query2;
        String IDprogetto = null;
        String query_check;
        Boolean check_partecipazione = null;
        
        row = Stud_Pj_Tab.getSelectedRow();
        Tipologia = Stud_Pj_Tab.getValueAt(row, 3).toString();
        Titolo = Stud_Pj_Tab.getValueAt(row, 0).toString();
        
        if(row!=-1){
            
            try{
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                query1 = "SELECT IDprogetto FROM progetto WHERE titolo ='"+Titolo+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                IDprogetto = rs.getString("IDprogetto");
                
                if(Tipologia.equals("Lavoro")){

                    query_check = "SELECT IDlavoratore, IDprogetto FROM lavoro WHERE IDlavoratore ='"+User_ID_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                }else if (Tipologia.equals("Tesi")) {

                    query_check = "SELECT IDtesista, IDprogetto FROM tesi WHERE IDtesista ='"+User_ID_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                } else if (Tipologia.equals("Tirocinio")) {

                    query_check = "SELECT IDtirocinante, IDprogetto FROM tirocinio WHERE IDtirocinante ='"+User_ID_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                }

            }catch(Exception ex){
                System.out.println(ex);
            }
            
            if(check_partecipazione!=false){
            
                Descrizione = Stud_Pj_Tab.getValueAt(row, 1).toString();
                Data = Stud_Pj_Tab.getValueAt(row, 2).toString();
                Durata = Stud_Pj_Tab.getValueAt(row, 5).toString();
                Posti = Stud_Pj_Tab.getValueAt(row, 4).toString();
                Privacy = Stud_Pj_Tab.getValueAt(row, 6).toString();
                Tag = Stud_Pj_Tab.getValueAt(row, 7).toString();

                new Pj_Dettagli().setVisible(true);

                try{

                    query2 = "SELECT m.Milestone, m.Status FROM milestone AS m, task AS t WHERE (t.IDprogetto='"+IDprogetto+"' AND t.IDmilestone=m.IDmilestone)";    
                    stm=con.prepareStatement(query2);
                    rs = stm.executeQuery(query2);

                }catch(Exception ex){
                        System.out.println("Error: "+ex);
                }

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
                Pj_Dettagli.IDpj_hidden.setText(IDprogetto);
                Pj_Dettagli.IDpj_hidden.setVisible(false);
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
            
            }else{
                JOptionPane.showMessageDialog(this,"Prima devi partecipare al progetto");
            }
            
        }else{JOptionPane.showMessageDialog(this,"Seleziona il progetto");}
    }//GEN-LAST:event_Stud_Pj_DetailsActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        Parent_panel.removeAll();
        Parent_panel.add(home);
        Parent_panel.repaint();
        Parent_panel.revalidate();    }//GEN-LAST:event_jLabel1MouseClicked

    private void Stud_Ev_UnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Ev_UnJoinActionPerformed
        
        int row;
        String data;
        String query1;
        String IDevento;
        String query_check;
        Boolean check_partecipazione;
        String query2;
        String query3;
        
        row = Stud_Ev_Tab.getSelectedRow();
        if(row!=-1){
            
            data = Stud_Ev_Tab.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                query1 = "SELECT IDevento FROM evento WHERE titolo ='"+data+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                IDevento = rs.getString("IDevento");
                query_check = "SELECT IDevento, IDpartecipante FROM partecipa WHERE IDevento ='"+IDevento+"' AND IDpartecipante ='"+User_ID_hidden.getText()+"'";
                stm = con.prepareStatement(query_check);
                rs = stm.executeQuery(query_check);
                check_partecipazione = rs.next();
                
                if(check_partecipazione!=false){
                    query2 = "UPDATE evento SET posti = posti+1 WHERE IDevento = '"+IDevento+"'";
                    stm.executeUpdate(query2);
                    query3 = "DELETE FROM partecipa WHERE IDpartecipante = '"+User_ID_hidden.getText()+"' AND IDevento = '"+IDevento+"'";
                    stm.executeUpdate(query3);
                    JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                    Stud_Ev_Table();
                }else{
                    JOptionPane.showMessageDialog(this,"Non partecipi all'evento");
                }
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona l'evento");
        }         
    }//GEN-LAST:event_Stud_Ev_UnJoinActionPerformed

    private void Prof_Pj_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Pj_DelActionPerformed
        
        int row;
        String titolo;
        Librerie conn;
        
        row = Prof_Pj_Tab.getSelectedRow();
        if(row!=-1){
            
            titolo = Prof_Pj_Tab.getValueAt(row, 0).toString();
            conn = new Librerie();
            conn.Pj_Del(titolo);
            Prof_Pj_Table();
        }else{JOptionPane.showMessageDialog(this,"Seleziona il progetto");}
    }//GEN-LAST:event_Prof_Pj_DelActionPerformed

    private void Stud_Pj_UnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Pj_UnJoinActionPerformed
    
        int row;
        String Titolo;
        String Tipologia;
        String query_infoProgetto;
        String IDprogetto;
        String query_check;
        Boolean check_partecipazione = null;
        String update_posti;
        String query_Partecipazione;
        
        row = Stud_Pj_Tab.getSelectedRow();
        if(row!=-1){
            
            Titolo = Stud_Pj_Tab.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                query_infoProgetto = "SELECT IDprogetto, Tipologia FROM progetto WHERE titolo ='"+Titolo+"'";    
                stm = con.prepareStatement(query_infoProgetto);
                rs = stm.executeQuery(query_infoProgetto);
                rs.next();
                IDprogetto = rs.getString("IDprogetto");;
                Tipologia = rs.getString("Tipologia");
                
                if(Tipologia.equals("Lavoro")){
                
                    query_check = "SELECT IDlavoratore, IDprogetto FROM lavoro WHERE IDlavoratore ='"+User_ID_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                }else if (Tipologia.equals("Tesi")) {

                    query_check = "SELECT IDtesista, IDprogetto FROM tesi WHERE IDtesista ='"+User_ID_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                } else if (Tipologia.equals("Tirocinio")) {

                    query_check = "SELECT IDtirocinante, IDprogetto FROM tirocinio WHERE IDtirocinante ='"+User_ID_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                }
                
                if(check_partecipazione!=false){
                    
                    update_posti = "UPDATE progetto SET posti = posti+1 WHERE IDprogetto = '"+IDprogetto+"'";
                    stm.executeUpdate(update_posti);
                    
                    if(Tipologia.equals("Lavoro")){
                
                        query_Partecipazione = "DELETE FROM lavoro WHERE IDlavoratore = '"+User_ID_hidden.getText()+"' AND IDprogetto = '"+IDprogetto+"'";
                        stm.executeUpdate(query_Partecipazione);
                        JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                        Stud_Pj_Table();

                    }else if (Tipologia.equals("Tesi")) {

                        query_Partecipazione = "DELETE FROM tesi WHERE IDtesista = '"+User_ID_hidden.getText()+"' AND IDprogetto = '"+IDprogetto+"'";
                        stm.executeUpdate(query_Partecipazione);
                        JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                        Stud_Pj_Table();

                    } else if (Tipologia.equals("Tirocinio")) {

                        query_Partecipazione = "DELETE FROM tirocinio WHERE IDtirocinante = '"+User_ID_hidden.getText()+"' AND IDprogetto = '"+IDprogetto+"'";
                        stm.executeUpdate(query_Partecipazione);
                        JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                        Stud_Pj_Table();

                    }
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Gia  non partecipi al progetto");
                }
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
        } 
    }//GEN-LAST:event_Stud_Pj_UnJoinActionPerformed

    private void Prof_Ev_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Ev_DelActionPerformed
        
        int row;
        String titolo;
        Librerie conn;
        
        row = Prof_Ev_Tab.getSelectedRow();
        if(row!=-1){
            
            titolo = Prof_Ev_Tab.getValueAt(row, 0).toString();
            conn = new Librerie();
            conn.Ev_Del(titolo);
            Prof_Ev_Table();
        }else{JOptionPane.showMessageDialog(this,"Seleziona l'evento");}
    }//GEN-LAST:event_Prof_Ev_DelActionPerformed

    private void Prof_Ev_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Ev_UpdateActionPerformed
        Prof_Ev_Table();
    }//GEN-LAST:event_Prof_Ev_UpdateActionPerformed

    private void Stud_Ev_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Ev_UpdateActionPerformed
        Stud_Ev_Table();
    }//GEN-LAST:event_Stud_Ev_UpdateActionPerformed

    private void Stud_Pj_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Pj_UpdateActionPerformed
        Stud_Pj_Table();
    }//GEN-LAST:event_Stud_Pj_UpdateActionPerformed

    private void Prof_Pj_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Pj_UpdateActionPerformed
        Prof_Pj_Table();
    }//GEN-LAST:event_Prof_Pj_UpdateActionPerformed

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
    private javax.swing.JPanel Parent_panel;
    private javax.swing.JButton Pj_button;
    private javax.swing.JPanel Prof_Ev_Card;
    private javax.swing.JButton Prof_Ev_Del;
    private javax.swing.JButton Prof_Ev_New;
    private javax.swing.JTable Prof_Ev_Tab;
    private javax.swing.JButton Prof_Ev_Update;
    private javax.swing.JPanel Prof_Pj_Card;
    private javax.swing.JButton Prof_Pj_Del;
    private javax.swing.JButton Prof_Pj_Details;
    private javax.swing.JButton Prof_Pj_New;
    private javax.swing.JTable Prof_Pj_Tab;
    private javax.swing.JButton Prof_Pj_Update;
    private javax.swing.JPanel Stud_Ev_Card;
    private javax.swing.JButton Stud_Ev_Join;
    private javax.swing.JTable Stud_Ev_Tab;
    javax.swing.JButton Stud_Ev_UnJoin;
    javax.swing.JButton Stud_Ev_Update;
    private javax.swing.JPanel Stud_Pj_Card;
    private javax.swing.JButton Stud_Pj_Details;
    private javax.swing.JButton Stud_Pj_Join;
    private javax.swing.JTable Stud_Pj_Tab;
    private javax.swing.JButton Stud_Pj_UnJoin;
    private javax.swing.JButton Stud_Pj_Update;
    static javax.swing.JLabel User;
    public static javax.swing.JLabel User_Categoria_hidden;
    public static javax.swing.JLabel User_ID_hidden;
    private javax.swing.JPanel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

}