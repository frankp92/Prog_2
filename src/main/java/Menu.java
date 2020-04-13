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

public class Menu extends javax.swing.JFrame {
    
    Connection con = null;
    Statement stm = null;
    ResultSet rs = null;        

    public Menu() {
        
        initComponents();
        EventTable1();
        EventTable2();
        ProgTable1();
        ProgTable2();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        Events_button = new javax.swing.JButton();
        Projects_button = new javax.swing.JButton();
        User = new javax.swing.JLabel();
        Logout_link = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        IDutente_hidden = new javax.swing.JLabel();
        categoria_hidden = new javax.swing.JLabel();
        Parent_panel = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        Prof_Event_Card = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Prof_Event_Tab = new javax.swing.JTable();
        Prof_Create_Ev = new javax.swing.JButton();
        Prof_Del_Ev = new javax.swing.JButton();
        Prof_Refr_Ev = new javax.swing.JButton();
        Stud_Event_Card = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Stud_Event_Tab = new javax.swing.JTable();
        Stud_Part_Ev = new javax.swing.JButton();
        Stud_NPart_Ev = new javax.swing.JButton();
        Stud_Refr_Ev = new javax.swing.JButton();
        Prof_Prog_Card = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Prof_Prog_Tab = new javax.swing.JTable();
        Prof_Create_Pj = new javax.swing.JButton();
        Prof_Del_Pj = new javax.swing.JButton();
        Prof_Det_Pj = new javax.swing.JButton();
        Prof_Refr_Pj = new javax.swing.JButton();
        Stud_Prog_Card = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Stud_Prog_Tab = new javax.swing.JTable();
        Stud_Part_Pj = new javax.swing.JButton();
        Stud_Det_Pj = new javax.swing.JButton();
        Stud_NPart_Pj = new javax.swing.JButton();
        Stud_Refr_Pj = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartLab");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        logo = new JLabel(new ImageIcon("img/logo.png"));

        Events_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Events_button.setText("Eventi");
        Events_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Events_buttonActionPerformed(evt);
            }
        });

        Projects_button.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Projects_button.setText("Progetti");
        Projects_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Projects_buttonActionPerformed(evt);
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
                        .addComponent(categoria_hidden))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(Events_button)
                        .addGap(35, 35, 35)
                        .addComponent(Projects_button)
                        .addGap(40, 40, 40)
                        .addComponent(User)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(Logout_link)
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(409, 409, 409)
                    .addComponent(IDutente_hidden)
                    .addContainerGap(409, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(categoria_hidden)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Events_button)
                    .addComponent(Projects_button)
                    .addComponent(User)
                    .addComponent(Logout_link))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(50, 50, 50)
                    .addComponent(IDutente_hidden)
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

        Prof_Event_Card.setBackground(new java.awt.Color(0, 102, 102));

        Prof_Event_Tab.setModel(new javax.swing.table.DefaultTableModel(
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
        Prof_Event_Tab.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Prof_Event_Tab);

        Prof_Create_Ev.setText("Crea Evento");
        Prof_Create_Ev.setPreferredSize(new java.awt.Dimension(130, 23));
        Prof_Create_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Create_EvActionPerformed(evt);
            }
        });

        Prof_Del_Ev.setText("Cancella Evento");
        Prof_Del_Ev.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Del_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Del_EvActionPerformed(evt);
            }
        });

        Prof_Refr_Ev.setText("Aggiorna");
        Prof_Refr_Ev.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Refr_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Refr_EvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Prof_Event_CardLayout = new javax.swing.GroupLayout(Prof_Event_Card);
        Prof_Event_Card.setLayout(Prof_Event_CardLayout);
        Prof_Event_CardLayout.setHorizontalGroup(
            Prof_Event_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prof_Event_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Prof_Event_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Prof_Del_Ev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Create_Ev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Refr_Ev, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Prof_Event_CardLayout.setVerticalGroup(
            Prof_Event_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
            .addGroup(Prof_Event_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Prof_Create_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Del_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Refr_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Prof_Event_Card, "card2");

        Stud_Event_Card.setBackground(new java.awt.Color(0, 102, 102));

        Stud_Event_Tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        Stud_Event_Tab.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(Stud_Event_Tab);

        Stud_Part_Ev.setText("Partecipa");
        Stud_Part_Ev.setPreferredSize(new java.awt.Dimension(130, 23));
        Stud_Part_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Part_EvActionPerformed(evt);
            }
        });

        Stud_NPart_Ev.setText("Non Partecipa");
        Stud_NPart_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_NPart_EvActionPerformed(evt);
            }
        });

        Stud_Refr_Ev.setText("Aggiorna");
        Stud_Refr_Ev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Refr_EvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Stud_Event_CardLayout = new javax.swing.GroupLayout(Stud_Event_Card);
        Stud_Event_Card.setLayout(Stud_Event_CardLayout);
        Stud_Event_CardLayout.setHorizontalGroup(
            Stud_Event_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stud_Event_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Stud_Event_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stud_Part_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stud_NPart_Ev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stud_Refr_Ev, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Stud_Event_CardLayout.setVerticalGroup(
            Stud_Event_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
            .addGroup(Stud_Event_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Stud_Part_Ev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_NPart_Ev)
                .addGap(18, 18, 18)
                .addComponent(Stud_Refr_Ev)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Stud_Event_Card, "card2");

        Prof_Prog_Card.setBackground(new java.awt.Color(0, 102, 102));

        Prof_Prog_Tab.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(Prof_Prog_Tab);

        Prof_Create_Pj.setText("Crea Progetto");
        Prof_Create_Pj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Create_Pj.setPreferredSize(new java.awt.Dimension(130, 23));
        Prof_Create_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Create_PjActionPerformed(evt);
            }
        });

        Prof_Del_Pj.setText("Cancella Progetto");
        Prof_Del_Pj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Del_Pj.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Del_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Del_PjActionPerformed(evt);
            }
        });

        Prof_Det_Pj.setText("Dettagli");
        Prof_Det_Pj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Det_Pj.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Det_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Det_PjActionPerformed(evt);
            }
        });

        Prof_Refr_Pj.setText("Aggiorna");
        Prof_Refr_Pj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Refr_Pj.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Refr_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Refr_PjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Prof_Prog_CardLayout = new javax.swing.GroupLayout(Prof_Prog_Card);
        Prof_Prog_Card.setLayout(Prof_Prog_CardLayout);
        Prof_Prog_CardLayout.setHorizontalGroup(
            Prof_Prog_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prof_Prog_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Prof_Prog_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Prof_Del_Pj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Create_Pj, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(Prof_Det_Pj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Refr_Pj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        Prof_Prog_CardLayout.setVerticalGroup(
            Prof_Prog_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Prof_Prog_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Prof_Create_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Del_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Det_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Refr_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        Parent_panel.add(Prof_Prog_Card, "card3");

        Stud_Prog_Card.setBackground(new java.awt.Color(0, 102, 102));

        Stud_Prog_Tab.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(Stud_Prog_Tab);

        Stud_Part_Pj.setText("Partecipa");
        Stud_Part_Pj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stud_Part_Pj.setPreferredSize(new java.awt.Dimension(130, 23));
        Stud_Part_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Part_PjActionPerformed(evt);
            }
        });

        Stud_Det_Pj.setText("Dettagli");
        Stud_Det_Pj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stud_Det_Pj.setPreferredSize(new java.awt.Dimension(110, 23));
        Stud_Det_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Det_PjActionPerformed(evt);
            }
        });

        Stud_NPart_Pj.setText("Non Partecipa");
        Stud_NPart_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_NPart_PjActionPerformed(evt);
            }
        });

        Stud_Refr_Pj.setText("Aggiorna");
        Stud_Refr_Pj.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stud_Refr_Pj.setPreferredSize(new java.awt.Dimension(110, 23));
        Stud_Refr_Pj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Refr_PjActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Stud_Prog_CardLayout = new javax.swing.GroupLayout(Stud_Prog_Card);
        Stud_Prog_Card.setLayout(Stud_Prog_CardLayout);
        Stud_Prog_CardLayout.setHorizontalGroup(
            Stud_Prog_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Stud_Prog_CardLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Stud_Prog_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Stud_Part_Pj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stud_Det_Pj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stud_NPart_Pj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stud_Refr_Pj, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Stud_Prog_CardLayout.setVerticalGroup(
            Stud_Prog_CardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Stud_Prog_CardLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Stud_Part_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_NPart_Pj)
                .addGap(18, 18, 18)
                .addComponent(Stud_Det_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stud_Refr_Pj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        Parent_panel.add(Stud_Prog_Card, "card3");

        getContentPane().add(Parent_panel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(836, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EventTable1(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT evento.Titolo,evento.Descrizione,evento.Data,evento.Ora,evento.Posti,evento.Durata,evento.Privacy,area_tematica.Titolo as Tag FROM evento, tag_e, area_tematica WHERE (evento.IDevento=tag_e.IDevento AND tag_e.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Prof_Event_Tab.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void EventTable2(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT evento.Titolo,evento.Descrizione,evento.Data,evento.Ora,evento.Posti,evento.Durata,evento.Privacy,area_tematica.Titolo as Tag FROM evento, tag_e, area_tematica WHERE (evento.IDevento=tag_e.IDevento AND tag_e.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Stud_Event_Tab.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void ProgTable1(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT progetto.Titolo,progetto.Descrizione,progetto.Data,progetto.Tipologia,progetto.Posti,progetto.Durata,progetto.Privacy,area_tematica.Titolo as Tag FROM progetto, tag_p, area_tematica WHERE (progetto.IDprogetto=tag_p.IDprogetto AND tag_p.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Prof_Prog_Tab.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void ProgTable2(){
        
        String query1;

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            query1 = "SELECT progetto.Titolo,progetto.Descrizione,progetto.Data,progetto.Tipologia,progetto.Posti,progetto.Durata,progetto.Privacy,area_tematica.Titolo as Tag FROM progetto, tag_p, area_tematica WHERE (progetto.IDprogetto=tag_p.IDprogetto AND tag_p.IDareatematica=area_tematica.IDareatematica)";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            Stud_Prog_Tab.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void Projects_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Projects_buttonActionPerformed

       if(categoria_hidden.getText().equals("professore")){
           
            Parent_panel.removeAll();
            Parent_panel.add(Prof_Prog_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }else{
           
            Parent_panel.removeAll();
            Parent_panel.add(Stud_Prog_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }
    }//GEN-LAST:event_Projects_buttonActionPerformed

    private void Events_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Events_buttonActionPerformed
      
        if(categoria_hidden.getText().equals("professore")){
            
            Parent_panel.removeAll();
            Parent_panel.add(Prof_Event_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }else{
            
            Parent_panel.removeAll();
            Parent_panel.add(Stud_Event_Card);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }
    }//GEN-LAST:event_Events_buttonActionPerformed

    private void Prof_Create_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Create_EvActionPerformed
        new Crea_Ev().setVisible(true);
           }//GEN-LAST:event_Prof_Create_EvActionPerformed

    private void Logout_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout_linkMouseClicked
        
        new Login_form().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_Logout_linkMouseClicked

    private void Prof_Det_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Det_PjActionPerformed
        
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
        
        row = Prof_Prog_Tab.getSelectedRow();
        
        if(row!=-1){
            
            Titolo = Prof_Prog_Tab.getValueAt(row, 0).toString();
            Descrizione = Prof_Prog_Tab.getValueAt(row, 1).toString();
            Data = Prof_Prog_Tab.getValueAt(row, 2).toString();
            Tipologia = Prof_Prog_Tab.getValueAt(row, 3).toString();
            Posti = Prof_Prog_Tab.getValueAt(row, 4).toString();
            Durata = Prof_Prog_Tab.getValueAt(row, 5).toString();
            Privacy = Prof_Prog_Tab.getValueAt(row, 6).toString();
            Tag = Prof_Prog_Tab.getValueAt(row, 7).toString();
            
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
            
            new Dettagli_St().setVisible(true);
            
            Dettagli_St.CompleteTask_Button.setVisible(false);
            Dettagli_St.JoinTask_Button.setVisible(false);
            Dettagli_St.Titolo.setText(Titolo);
            Dettagli_St.Descrizione.setText(Descrizione);
            Dettagli_St.Data.setText(Data);
            Dettagli_St.Tipologia.setText(Tipologia);
            Dettagli_St.Durata.setText(Durata);
            Dettagli_St.Posti.setText(Posti);
            Dettagli_St.Privacy.setText(Privacy);
            Dettagli_St.Tag.setText(Tag);
            Dettagli_St.IDprogetto_hidden.setText(IDprogetto);
            Dettagli_St.IDprogetto_hidden.setVisible(false);
            Dettagli_St.Tasks.setModel(DbUtils.resultSetToTableModel(rs));
            
        }else{JOptionPane.showMessageDialog(this,"Seleziona il progetto");}
    }//GEN-LAST:event_Prof_Det_PjActionPerformed

    private void Prof_Create_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Create_PjActionPerformed
        new Crea_Prog().setVisible(true);
    }//GEN-LAST:event_Prof_Create_PjActionPerformed

    private void Stud_Part_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Part_EvActionPerformed
        
        int row;
        String Posti;
        String Titolo;
        String query_IDevento;
        String IDevento;
        String query_check;
        Boolean check_partecipazione;
        String update_Posti;
        String query_partecipazione;
        
        row = Stud_Event_Tab.getSelectedRow();
        if(row!=-1){
            
            Posti = Stud_Event_Tab.getValueAt(row, 4).toString();
            if (Posti=="0") {
                
                JOptionPane.showMessageDialog(this,"Posti esauriti");
                
            }else{
            
               Titolo = Stud_Event_Tab.getValueAt(row, 0).toString(); 
            
                try{

                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                    query_IDevento = "SELECT IDevento FROM evento WHERE titolo ='"+Titolo+"'";    
                    stm = con.prepareStatement(query_IDevento);
                    rs = stm.executeQuery(query_IDevento);
                    rs.next();
                    IDevento = rs.getString("IDevento");
                    query_check = "SELECT IDevento, IDpartecipante FROM partecipa WHERE IDevento ='"+IDevento+"' AND IDpartecipante ='"+IDutente_hidden.getText()+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                    if(check_partecipazione!=true){
                        update_Posti = "UPDATE evento SET posti = posti-1 WHERE IDevento = '"+IDevento+"'";
                        stm.executeUpdate(update_Posti);
                        query_partecipazione = "INSERT INTO partecipa (IDpartecipante, IDevento) VALUES ('"+IDutente_hidden.getText()+"', '"+IDevento+"')";
                        stm.executeUpdate(query_partecipazione);
                        JOptionPane.showMessageDialog(this,"Iscritto con successo");
                        EventTable2();
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
    }//GEN-LAST:event_Stud_Part_EvActionPerformed

    private void Stud_Part_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Part_PjActionPerformed
        
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
        
        row = Stud_Prog_Tab.getSelectedRow();
        if(row!=-1){
            
            Posti = Stud_Prog_Tab.getValueAt(row, 4).toString();
            if (Posti=="0") {
                
                JOptionPane.showMessageDialog(this,"Posti esauriti");
                
            }else{
            
                Titolo_prog = Stud_Prog_Tab.getValueAt(row, 0).toString(); 
            
                try{

                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                    query_infoProgetto = "SELECT IDprogetto, Tipologia FROM progetto WHERE titolo ='"+Titolo_prog+"'";    
                    stm = con.prepareStatement(query_infoProgetto);
                    rs = stm.executeQuery(query_infoProgetto);
                    rs.next();
                    IDprogetto = rs.getString("IDprogetto");
                    Tipologia = rs.getString("Tipologia");
                    
                    if(Tipologia.equals("Lavoro")){

                        query_check = "SELECT IDlavoratore, IDprogetto FROM lavoro WHERE IDlavoratore ='"+IDutente_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                        stm = con.prepareStatement(query_check);
                        rs = stm.executeQuery(query_check);
                        check_partecipazione = rs.next();

                    }else if (Tipologia.equals("Tesi")) {

                        query_check = "SELECT IDtesista, IDprogetto FROM tesi WHERE IDtesista ='"+IDutente_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                        stm = con.prepareStatement(query_check);
                        rs = stm.executeQuery(query_check);
                        check_partecipazione = rs.next();

                    } else if (Tipologia.equals("Tirocinio")) {

                        query_check = "SELECT IDtirocinante, IDprogetto FROM tirocinio WHERE IDtirocinante ='"+IDutente_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                        stm = con.prepareStatement(query_check);
                        rs = stm.executeQuery(query_check);
                        check_partecipazione = rs.next();

                    }

                    if(check_partecipazione!=true){
                        
                        query_checkPartecipazione = "UPDATE progetto SET posti = posti-1 WHERE IDprogetto = '"+IDprogetto+"'";
                        stm.executeUpdate(query_checkPartecipazione);

                        if(Tipologia.equals("Lavoro")){

                            query_partecipazione = "INSERT INTO lavoro (IDlavoratore, IDprogetto) VALUES ('"+IDutente_hidden.getText()+"', '"+IDprogetto+"')";
                            stm.executeUpdate(query_partecipazione);
                            JOptionPane.showMessageDialog(this,"Iscritto con successo");
                            ProgTable2();

                        }else if (Tipologia.equals("Tesi")) {

                            query_partecipazione = "INSERT INTO tesi (IDtesista, IDprogetto) VALUES ('"+IDutente_hidden.getText()+"', '"+IDprogetto+"')";
                            stm.executeUpdate(query_partecipazione);
                            JOptionPane.showMessageDialog(this,"Iscritto con successo");
                            ProgTable2();

                        } else if (Tipologia.equals("Tirocinio")) {

                            query_partecipazione = "INSERT INTO tirocinio (IDtirocinante, IDprogetto) VALUES ('"+IDutente_hidden.getText()+"', '"+IDprogetto+"')";
                            stm.executeUpdate(query_partecipazione);
                            JOptionPane.showMessageDialog(this,"Iscritto con successo");
                            ProgTable2();

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
    }//GEN-LAST:event_Stud_Part_PjActionPerformed

    private void Stud_Det_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Det_PjActionPerformed
        
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
        
        row = Stud_Prog_Tab.getSelectedRow();
        Tipologia = Stud_Prog_Tab.getValueAt(row, 3).toString();
        Titolo = Stud_Prog_Tab.getValueAt(row, 0).toString();
        
        if(row!=-1){
            
            try{
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                query1 = "SELECT IDprogetto FROM progetto WHERE titolo ='"+Titolo+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                IDprogetto = rs.getString("IDprogetto");
                
                if(Tipologia.equals("Lavoro")){

                    query_check = "SELECT IDlavoratore, IDprogetto FROM lavoro WHERE IDlavoratore ='"+IDutente_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                }else if (Tipologia.equals("Tesi")) {

                    query_check = "SELECT IDtesista, IDprogetto FROM tesi WHERE IDtesista ='"+IDutente_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                } else if (Tipologia.equals("Tirocinio")) {

                    query_check = "SELECT IDtirocinante, IDprogetto FROM tirocinio WHERE IDtirocinante ='"+IDutente_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                }

            }catch(Exception ex){
                System.out.println(ex);
            }
            
            if(check_partecipazione!=false){
            
                Descrizione = Stud_Prog_Tab.getValueAt(row, 1).toString();
                Data = Stud_Prog_Tab.getValueAt(row, 2).toString();
                Durata = Stud_Prog_Tab.getValueAt(row, 5).toString();
                Posti = Stud_Prog_Tab.getValueAt(row, 4).toString();
                Privacy = Stud_Prog_Tab.getValueAt(row, 6).toString();
                Tag = Stud_Prog_Tab.getValueAt(row, 7).toString();

                new Dettagli_St().setVisible(true);

                try{

                    query2 = "SELECT m.Milestone, m.Status FROM milestone AS m, task AS t WHERE (t.IDprogetto='"+IDprogetto+"' AND t.IDmilestone=m.IDmilestone)";    
                    stm=con.prepareStatement(query2);
                    rs = stm.executeQuery(query2);

                }catch(Exception ex){
                        System.out.println("Error: "+ex);
                }

                Dettagli_St.CreaTask_Button.setVisible(false);
                Dettagli_St.EliminaTask_Button.setVisible(false);
                Dettagli_St.Titolo.setText(Titolo);
                Dettagli_St.Descrizione.setText(Descrizione);
                Dettagli_St.Data.setText(Data);
                Dettagli_St.Tipologia.setText(Tipologia);
                Dettagli_St.Durata.setText(Durata);
                Dettagli_St.Posti.setText(Posti);
                Dettagli_St.Privacy.setText(Privacy);
                Dettagli_St.Tag.setText(Tag);
                Dettagli_St.IDprogetto_hidden.setText(IDprogetto);
                Dettagli_St.IDprogetto_hidden.setVisible(false);
                Dettagli_St.Tasks.setModel(DbUtils.resultSetToTableModel(rs));
            
            }else{
                JOptionPane.showMessageDialog(this,"Prima devi partecipare al progetto");
            }
            
        }else{JOptionPane.showMessageDialog(this,"Seleziona il progetto");}
    }//GEN-LAST:event_Stud_Det_PjActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        Parent_panel.removeAll();
        Parent_panel.add(home);
        Parent_panel.repaint();
        Parent_panel.revalidate();    }//GEN-LAST:event_jLabel1MouseClicked

    private void Stud_NPart_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_NPart_EvActionPerformed
        
        int row;
        String data;
        String query1;
        String IDevento;
        String query_check;
        Boolean check_partecipazione;
        String query2;
        String query3;
        
        row = Stud_Event_Tab.getSelectedRow();
        if(row!=-1){
            
            data = Stud_Event_Tab.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                query1 = "SELECT IDevento FROM evento WHERE titolo ='"+data+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                IDevento = rs.getString("IDevento");
                query_check = "SELECT IDevento, IDpartecipante FROM partecipa WHERE IDevento ='"+IDevento+"' AND IDpartecipante ='"+IDutente_hidden.getText()+"'";
                stm = con.prepareStatement(query_check);
                rs = stm.executeQuery(query_check);
                check_partecipazione = rs.next();
                
                if(check_partecipazione!=false){
                    query2 = "UPDATE evento SET posti = posti+1 WHERE IDevento = '"+IDevento+"'";
                    stm.executeUpdate(query2);
                    query3 = "DELETE FROM partecipa WHERE IDpartecipante = '"+IDutente_hidden.getText()+"' AND IDevento = '"+IDevento+"'";
                    stm.executeUpdate(query3);
                    JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                    EventTable2();
                }else{
                    JOptionPane.showMessageDialog(this,"Non partecipi all'evento");
                }
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona l'evento");
        }         
    }//GEN-LAST:event_Stud_NPart_EvActionPerformed

    private void Prof_Del_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Del_PjActionPerformed
        
        int row;
        String titolo;
        Librerie conn;
        
        row = Prof_Prog_Tab.getSelectedRow();
        if(row!=-1){
            
            titolo = Prof_Prog_Tab.getValueAt(row, 0).toString();
            conn = new Librerie();
            conn.del_Progetto(titolo);
            ProgTable1();
        }else{JOptionPane.showMessageDialog(this,"Seleziona il progetto");}
    }//GEN-LAST:event_Prof_Del_PjActionPerformed

    private void Stud_NPart_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_NPart_PjActionPerformed
    
        int row;
        String Titolo;
        String Tipologia;
        String query_infoProgetto;
        String IDprogetto;
        String query_check;
        Boolean check_partecipazione = null;
        String update_posti;
        String query_Partecipazione;
        
        row = Stud_Prog_Tab.getSelectedRow();
        if(row!=-1){
            
            Titolo = Stud_Prog_Tab.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                query_infoProgetto = "SELECT IDprogetto, Tipologia FROM progetto WHERE titolo ='"+Titolo+"'";    
                stm = con.prepareStatement(query_infoProgetto);
                rs = stm.executeQuery(query_infoProgetto);
                rs.next();
                IDprogetto = rs.getString("IDprogetto");;
                Tipologia = rs.getString("Tipologia");
                
                if(Tipologia.equals("Lavoro")){
                
                    query_check = "SELECT IDlavoratore, IDprogetto FROM lavoro WHERE IDlavoratore ='"+IDutente_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                }else if (Tipologia.equals("Tesi")) {

                    query_check = "SELECT IDtesista, IDprogetto FROM tesi WHERE IDtesista ='"+IDutente_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                } else if (Tipologia.equals("Tirocinio")) {

                    query_check = "SELECT IDtirocinante, IDprogetto FROM tirocinio WHERE IDtirocinante ='"+IDutente_hidden.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                    stm = con.prepareStatement(query_check);
                    rs = stm.executeQuery(query_check);
                    check_partecipazione = rs.next();

                }
                
                if(check_partecipazione!=false){
                    
                    update_posti = "UPDATE progetto SET posti = posti+1 WHERE IDprogetto = '"+IDprogetto+"'";
                    stm.executeUpdate(update_posti);
                    
                    if(Tipologia.equals("Lavoro")){
                
                        query_Partecipazione = "DELETE FROM lavoro WHERE IDlavoratore = '"+IDutente_hidden.getText()+"' AND IDprogetto = '"+IDprogetto+"'";
                        stm.executeUpdate(query_Partecipazione);
                        JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                        ProgTable2();

                    }else if (Tipologia.equals("Tesi")) {

                        query_Partecipazione = "DELETE FROM tesi WHERE IDtesista = '"+IDutente_hidden.getText()+"' AND IDprogetto = '"+IDprogetto+"'";
                        stm.executeUpdate(query_Partecipazione);
                        JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                        ProgTable2();

                    } else if (Tipologia.equals("Tirocinio")) {

                        query_Partecipazione = "DELETE FROM tirocinio WHERE IDtirocinante = '"+IDutente_hidden.getText()+"' AND IDprogetto = '"+IDprogetto+"'";
                        stm.executeUpdate(query_Partecipazione);
                        JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                        ProgTable2();

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
    }//GEN-LAST:event_Stud_NPart_PjActionPerformed

    private void Prof_Del_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Del_EvActionPerformed
        
        int row;
        String titolo;
        Librerie conn;
        
        row = Prof_Event_Tab.getSelectedRow();
        if(row!=-1){
            
            titolo = Prof_Event_Tab.getValueAt(row, 0).toString();
            conn = new Librerie();
            conn.del_Evento(titolo);
            EventTable1();
        }else{JOptionPane.showMessageDialog(this,"Seleziona l'evento");}
    }//GEN-LAST:event_Prof_Del_EvActionPerformed

    private void Prof_Refr_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Refr_EvActionPerformed
        EventTable1();
    }//GEN-LAST:event_Prof_Refr_EvActionPerformed

    private void Stud_Refr_EvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Refr_EvActionPerformed
        EventTable2();
    }//GEN-LAST:event_Stud_Refr_EvActionPerformed

    private void Stud_Refr_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Refr_PjActionPerformed
        ProgTable2();
    }//GEN-LAST:event_Stud_Refr_PjActionPerformed

    private void Prof_Refr_PjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Refr_PjActionPerformed
        ProgTable1();
    }//GEN-LAST:event_Prof_Refr_PjActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Menu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Events_button;
    public static javax.swing.JLabel IDutente_hidden;
    private javax.swing.JLabel Logout_link;
    private javax.swing.JPanel Parent_panel;
    private javax.swing.JButton Prof_Create_Ev;
    private javax.swing.JButton Prof_Create_Pj;
    private javax.swing.JButton Prof_Del_Ev;
    private javax.swing.JButton Prof_Del_Pj;
    private javax.swing.JButton Prof_Det_Pj;
    private javax.swing.JPanel Prof_Event_Card;
    private javax.swing.JTable Prof_Event_Tab;
    private javax.swing.JPanel Prof_Prog_Card;
    private javax.swing.JTable Prof_Prog_Tab;
    private javax.swing.JButton Prof_Refr_Ev;
    private javax.swing.JButton Prof_Refr_Pj;
    private javax.swing.JButton Projects_button;
    private javax.swing.JButton Stud_Det_Pj;
    private javax.swing.JPanel Stud_Event_Card;
    private javax.swing.JTable Stud_Event_Tab;
    javax.swing.JButton Stud_NPart_Ev;
    private javax.swing.JButton Stud_NPart_Pj;
    private javax.swing.JButton Stud_Part_Ev;
    private javax.swing.JButton Stud_Part_Pj;
    private javax.swing.JPanel Stud_Prog_Card;
    private javax.swing.JTable Stud_Prog_Tab;
    javax.swing.JButton Stud_Refr_Ev;
    private javax.swing.JButton Stud_Refr_Pj;
    static javax.swing.JLabel User;
    public static javax.swing.JLabel categoria_hidden;
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