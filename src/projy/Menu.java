/*
Schermata principale, dallaquale si possono effettuare varie operazioni:
-   Visualizzazione degli Eventi
-   Visualizzazione dei Progetti
-   Partecipazione ad un Progetto/Evento
-   Non partecipazione ad un Evento/Progetto
-   Aggiornamento del contenuto
-   Logout
 */

package projy;

import java.awt.Dialog.ModalityType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Menu extends javax.swing.JFrame {
    
    Connection con = null;
    Statement stm=null;
    ResultSet rs=null;        

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
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        User = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        hidden = new javax.swing.JLabel();
        Parent_panel = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        Event_Card_prof = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EventTab1 = new javax.swing.JTable();
        Create_Ev_button = new javax.swing.JButton();
        Del_Ev_button = new javax.swing.JButton();
        Prof_Refr_Ev_button = new javax.swing.JButton();
        Event_Card_stud_p = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        EventTab2 = new javax.swing.JTable();
        Part_Ev_button = new javax.swing.JButton();
        Stud_Refr_Ev_button = new javax.swing.JButton();
        NPart_Ev_button = new javax.swing.JButton();
        hidden2 = new javax.swing.JLabel();
        Prog_Card_prof = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProgTabl1 = new javax.swing.JTable();
        Cre_Pj_button = new javax.swing.JButton();
        Del_Pj_button = new javax.swing.JButton();
        Prof_Refr_Pj_button = new javax.swing.JButton();
        Prog_Card_stud_p = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ProgTabl2 = new javax.swing.JTable();
        Part_Pj_button = new javax.swing.JButton();
        Stud_Refr_Pj_button = new javax.swing.JButton();
        NPart_Pj_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartLab");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        logo = new JLabel(new ImageIcon("img/logo.png"));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Eventi");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Progetti");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
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
                        .addComponent(hidden))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addComponent(jButton6)
                        .addGap(35, 35, 35)
                        .addComponent(jButton7)
                        .addGap(40, 40, 40)
                        .addComponent(User)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(logout)
                        .addGap(76, 76, 76))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(hidden)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(User)
                    .addComponent(logout))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        Event_Card_prof.setBackground(new java.awt.Color(0, 102, 102));

        EventTab1.setModel(new javax.swing.table.DefaultTableModel(
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
        EventTab1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(EventTab1);

        Create_Ev_button.setText("Crea Evento");
        Create_Ev_button.setPreferredSize(new java.awt.Dimension(130, 23));
        Create_Ev_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Create_Ev_buttonActionPerformed(evt);
            }
        });

        Del_Ev_button.setText("Cancella Evento");
        Del_Ev_button.setPreferredSize(new java.awt.Dimension(110, 23));
        Del_Ev_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_Ev_buttonActionPerformed(evt);
            }
        });

        Prof_Refr_Ev_button.setText("Update");
        Prof_Refr_Ev_button.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Refr_Ev_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Refr_Ev_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Event_Card_profLayout = new javax.swing.GroupLayout(Event_Card_prof);
        Event_Card_prof.setLayout(Event_Card_profLayout);
        Event_Card_profLayout.setHorizontalGroup(
            Event_Card_profLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Event_Card_profLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Event_Card_profLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Del_Ev_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Create_Ev_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Prof_Refr_Ev_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Event_Card_profLayout.setVerticalGroup(
            Event_Card_profLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Event_Card_profLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Create_Ev_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Del_Ev_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Refr_Ev_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Event_Card_prof, "card2");

        Event_Card_stud_p.setBackground(new java.awt.Color(0, 102, 102));

        EventTab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        EventTab2.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(EventTab2);

        Part_Ev_button.setText("Partecipa");
        Part_Ev_button.setPreferredSize(new java.awt.Dimension(130, 23));
        Part_Ev_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Part_Ev_buttonActionPerformed(evt);
            }
        });

        Stud_Refr_Ev_button.setText("Update");
        Stud_Refr_Ev_button.setPreferredSize(new java.awt.Dimension(110, 23));
        Stud_Refr_Ev_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Refr_Ev_buttonActionPerformed(evt);
            }
        });

        NPart_Ev_button.setText("Non Partecipa");
        NPart_Ev_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPart_Ev_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Event_Card_stud_pLayout = new javax.swing.GroupLayout(Event_Card_stud_p);
        Event_Card_stud_p.setLayout(Event_Card_stud_pLayout);
        Event_Card_stud_pLayout.setHorizontalGroup(
            Event_Card_stud_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Event_Card_stud_pLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Event_Card_stud_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Event_Card_stud_pLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Event_Card_stud_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Event_Card_stud_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Stud_Refr_Ev_button, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Part_Ev_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NPart_Ev_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Event_Card_stud_pLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hidden2)
                        .addContainerGap())))
        );
        Event_Card_stud_pLayout.setVerticalGroup(
            Event_Card_stud_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Event_Card_stud_pLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Part_Ev_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NPart_Ev_button)
                .addGap(18, 18, 18)
                .addComponent(Stud_Refr_Ev_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hidden2)
                .addContainerGap())
        );

        Parent_panel.add(Event_Card_stud_p, "card2");

        Prog_Card_prof.setBackground(new java.awt.Color(0, 102, 102));

        ProgTabl1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(ProgTabl1);

        Cre_Pj_button.setText("Crea Progetto");
        Cre_Pj_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Cre_Pj_button.setPreferredSize(new java.awt.Dimension(130, 23));
        Cre_Pj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cre_Pj_buttonActionPerformed(evt);
            }
        });

        Del_Pj_button.setText("Cancella Progetto");
        Del_Pj_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Del_Pj_button.setPreferredSize(new java.awt.Dimension(110, 23));
        Del_Pj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Del_Pj_buttonActionPerformed(evt);
            }
        });

        Prof_Refr_Pj_button.setText("Update");
        Prof_Refr_Pj_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Prof_Refr_Pj_button.setPreferredSize(new java.awt.Dimension(110, 23));
        Prof_Refr_Pj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Refr_Pj_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Prog_Card_profLayout = new javax.swing.GroupLayout(Prog_Card_prof);
        Prog_Card_prof.setLayout(Prog_Card_profLayout);
        Prog_Card_profLayout.setHorizontalGroup(
            Prog_Card_profLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prog_Card_profLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Prog_Card_profLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Del_Pj_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cre_Pj_button, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(Prof_Refr_Pj_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Prog_Card_profLayout.setVerticalGroup(
            Prog_Card_profLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Prog_Card_profLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Cre_Pj_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Del_Pj_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Prof_Refr_Pj_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Prog_Card_prof, "card3");

        Prog_Card_stud_p.setBackground(new java.awt.Color(0, 102, 102));

        ProgTabl2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(ProgTabl2);

        Part_Pj_button.setText("Partecipa");
        Part_Pj_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Part_Pj_button.setPreferredSize(new java.awt.Dimension(130, 23));
        Part_Pj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Part_Pj_buttonActionPerformed(evt);
            }
        });

        Stud_Refr_Pj_button.setText("Update");
        Stud_Refr_Pj_button.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Stud_Refr_Pj_button.setPreferredSize(new java.awt.Dimension(110, 23));
        Stud_Refr_Pj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Refr_Pj_buttonActionPerformed(evt);
            }
        });

        NPart_Pj_button.setText("Non Partecipa");
        NPart_Pj_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NPart_Pj_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Prog_Card_stud_pLayout = new javax.swing.GroupLayout(Prog_Card_stud_p);
        Prog_Card_stud_p.setLayout(Prog_Card_stud_pLayout);
        Prog_Card_stud_pLayout.setHorizontalGroup(
            Prog_Card_stud_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Prog_Card_stud_pLayout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(Prog_Card_stud_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Part_Pj_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Stud_Refr_Pj_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NPart_Pj_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Prog_Card_stud_pLayout.setVerticalGroup(
            Prog_Card_stud_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
            .addGroup(Prog_Card_stud_pLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Part_Pj_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(NPart_Pj_button)
                .addGap(18, 18, 18)
                .addComponent(Stud_Refr_Pj_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Parent_panel.add(Prog_Card_stud_p, "card3");

        getContentPane().add(Parent_panel, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(836, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void EventTable1(){

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            String query1 = "SELECT `Titolo`, `Descrizione`, `Data`, `Ora`, `Durata`, `Posti`, `Privacy` FROM `evento`";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            EventTab1.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    public void EventTable2(){

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            String query1 = "SELECT `Titolo`, `Descrizione`, `Data`, `Ora`, `Durata`, `Posti`, `Privacy` FROM `evento`";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            EventTab2.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    public void ProgTable1(){

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            String query1 = "SELECT `Titolo`, `Descrizione`, `Data`, `Tipologia`, `Durata`, `Posti`, `Privacy` FROM `progetto`";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            ProgTabl1.setModel(DbUtils.resultSetToTableModel(rs));

        }
        catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    public void ProgTable2(){

        try{

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
            String query1 = "SELECT `Titolo`, `Descrizione`, `Data`, `Tipologia`, `Durata`, `Posti`, `Privacy` FROM `progetto`";    
            stm=con.prepareStatement(query1);
            rs = stm.executeQuery(query1);
            ProgTabl2.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
    }

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

       if(hidden.getText().equals("professore")){
           
            Parent_panel.removeAll();
            Parent_panel.add(Prog_Card_prof);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }else{
           
            Parent_panel.removeAll();
            Parent_panel.add(Prog_Card_stud_p);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      
        if(hidden.getText().equals("professore")){
            
            Parent_panel.removeAll();
            Parent_panel.add(Event_Card_prof);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }else{
            
            Parent_panel.removeAll();
            Parent_panel.add(Event_Card_stud_p);
            Parent_panel.repaint();
            Parent_panel.revalidate();

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Create_Ev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Create_Ev_buttonActionPerformed
        new Crea_Ev().setVisible(true);
           }//GEN-LAST:event_Create_Ev_buttonActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        
        new Login_form().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_logoutMouseClicked

    private void Prof_Refr_Pj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Refr_Pj_buttonActionPerformed
        ProgTable1();
    }//GEN-LAST:event_Prof_Refr_Pj_buttonActionPerformed

    private void Cre_Pj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cre_Pj_buttonActionPerformed
        new Crea_Prog().setVisible(true);
    }//GEN-LAST:event_Cre_Pj_buttonActionPerformed

    private void Part_Ev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Part_Ev_buttonActionPerformed
        
        int row = EventTab2.getSelectedRow();
        if(row!=-1){
            
            String data = EventTab2.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                String query1 = "SELECT IDevento FROM evento WHERE titolo ='"+data+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                String IDevento = rs.getString("IDevento");
                String query_check = "SELECT IDevento, IDpartecipante FROM partecipa WHERE IDevento ='"+IDevento+"' AND IDpartecipante ='"+hidden2.getText()+"'";
                stm = con.prepareStatement(query_check);
                rs = stm.executeQuery(query_check);
                Boolean check = rs.next();
                
                if(check!=true){
                    String query2 = "UPDATE evento SET posti = posti-1 WHERE IDevento = '"+IDevento+"'";
                    stm.executeUpdate(query2);
                    String query3 = "INSERT INTO partecipa (IDpartecipante, IDevento) VALUES ('"+hidden2.getText()+"', '"+IDevento+"')";
                    stm.executeUpdate(query3);
                    JOptionPane.showMessageDialog(this,"Iscritto con successo");
                    EventTable2();
                }else{
                    JOptionPane.showMessageDialog(this,"Già iscritto all'evento");
                }
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona l'evento");
        }
    }//GEN-LAST:event_Part_Ev_buttonActionPerformed

    private void Part_Pj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Part_Pj_buttonActionPerformed
                
        int row = ProgTabl2.getSelectedRow();
        if(row!=-1){
            
            String data = ProgTabl2.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                String query1 = "SELECT IDprogetto FROM progetto WHERE titolo ='"+data+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                String IDprogetto = rs.getString("IDprogetto");
                String query_check = "SELECT IDlavoratore, IDprogetto FROM lavoro WHERE IDlavoratore ='"+hidden2.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                stm = con.prepareStatement(query_check);
                rs = stm.executeQuery(query_check);
                Boolean check = rs.next();
                
                if(check!=true){
                    String query2 = "UPDATE progetto SET posti = posti-1 WHERE IDprogetto = '"+IDprogetto+"'";
                    stm.executeUpdate(query2);
                    String query3 = "INSERT INTO lavoro (IDlavoratore, IDprogetto) VALUES ('"+hidden2.getText()+"', '"+IDprogetto+"')";
                    stm.executeUpdate(query3);
                    JOptionPane.showMessageDialog(this,"Iscritto con successo");
                    ProgTable2();
                }else{
                    JOptionPane.showMessageDialog(this,"Già iscritto al progetto");
                }
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
        }
    }//GEN-LAST:event_Part_Pj_buttonActionPerformed

    private void Stud_Refr_Pj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Refr_Pj_buttonActionPerformed
        ProgTable2();
    }//GEN-LAST:event_Stud_Refr_Pj_buttonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        Parent_panel.removeAll();
        Parent_panel.add(home);
        Parent_panel.repaint();
        Parent_panel.revalidate();    }//GEN-LAST:event_jLabel1MouseClicked

    private void NPart_Ev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPart_Ev_buttonActionPerformed
        
        int row = EventTab2.getSelectedRow();
        if(row!=-1){
            
            String data = EventTab2.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                String query1 = "SELECT IDevento FROM evento WHERE titolo ='"+data+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                String IDevento = rs.getString("IDevento");
                String query_check = "SELECT IDevento, IDpartecipante FROM partecipa WHERE IDevento ='"+IDevento+"' AND IDpartecipante ='"+hidden2.getText()+"'";
                stm = con.prepareStatement(query_check);
                rs = stm.executeQuery(query_check);
                Boolean check = rs.next();
                
                if(check!=false){
                    String query2 = "UPDATE evento SET posti = posti+1 WHERE IDevento = '"+IDevento+"'";
                    stm.executeUpdate(query2);
                    String query3 = "DELETE FROM partecipa WHERE IDpartecipante = '"+hidden2.getText()+"' AND IDevento = '"+IDevento+"'";
                    stm.executeUpdate(query3);
                    JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                    EventTable2();
                }else{
                    JOptionPane.showMessageDialog(this,"Già non partecipi all'evento");
                }
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona l'evento");
        }         
    }//GEN-LAST:event_NPart_Ev_buttonActionPerformed

    private void Stud_Refr_Ev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Refr_Ev_buttonActionPerformed
        EventTable2();
    }//GEN-LAST:event_Stud_Refr_Ev_buttonActionPerformed

    private void Del_Pj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del_Pj_buttonActionPerformed
        int row = ProgTabl1.getSelectedRow();
        if(row!=-1){
            
            String titolo = ProgTabl1.getValueAt(row, 0).toString();
            db_conn conn = new db_conn();
            conn.del_Progetto(titolo);
        }
    }//GEN-LAST:event_Del_Pj_buttonActionPerformed

    private void NPart_Pj_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NPart_Pj_buttonActionPerformed
    
        int row = ProgTabl2.getSelectedRow();
        if(row!=-1){
            
            String data = ProgTabl2.getValueAt(row, 0).toString(); 
            
            try{

                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smartlab?serverTimezone=UTC", "root", "123456");
                String query1 = "SELECT IDprogetto FROM progetto WHERE titolo ='"+data+"'";    
                stm = con.prepareStatement(query1);
                rs = stm.executeQuery(query1);
                rs.next();
                String IDprogetto = rs.getString("IDprogetto");
                String query_check = "SELECT IDlavoratore, IDprogetto FROM lavoro WHERE IDlavoratore ='"+hidden2.getText()+"' AND IDprogetto ='"+IDprogetto+"'";
                stm = con.prepareStatement(query_check);
                rs = stm.executeQuery(query_check);
                Boolean check = rs.next();
                
                if(check!=false){
                    String query2 = "UPDATE progetto SET posti = posti+1 WHERE IDprogetto = '"+IDprogetto+"'";
                    stm.executeUpdate(query2);
                    String query3 = "DELETE FROM lavoro WHERE IDlavoratore = '"+hidden2.getText()+"' AND IDprogetto = '"+IDprogetto+"'";
                    stm.executeUpdate(query3);
                    JOptionPane.showMessageDialog(this,"Disiscritto con successo");
                    ProgTable2();
                }else{
                    JOptionPane.showMessageDialog(this,"Già non partecipi al progetto");
                }
     
            }catch(Exception ex){
                System.out.println("Error: "+ex);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seleziona il progetto");
        } 
    }//GEN-LAST:event_NPart_Pj_buttonActionPerformed

    private void Prof_Refr_Ev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Refr_Ev_buttonActionPerformed
        EventTable1();
    }//GEN-LAST:event_Prof_Refr_Ev_buttonActionPerformed

    private void Del_Ev_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Del_Ev_buttonActionPerformed
        int row = EventTab1.getSelectedRow();
        if(row!=-1){
            
            String titolo = EventTab1.getValueAt(row, 0).toString();
            db_conn conn = new db_conn();
            conn.del_Evento(titolo);
        }
    }//GEN-LAST:event_Del_Ev_buttonActionPerformed

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
    private javax.swing.JButton Cre_Pj_button;
    private javax.swing.JButton Create_Ev_button;
    private javax.swing.JButton Del_Ev_button;
    private javax.swing.JButton Del_Pj_button;
    private javax.swing.JTable EventTab1;
    private javax.swing.JTable EventTab2;
    private javax.swing.JPanel Event_Card_prof;
    private javax.swing.JPanel Event_Card_stud_p;
    javax.swing.JButton NPart_Ev_button;
    private javax.swing.JButton NPart_Pj_button;
    private javax.swing.JPanel Parent_panel;
    private javax.swing.JButton Part_Ev_button;
    private javax.swing.JButton Part_Pj_button;
    private javax.swing.JButton Prof_Refr_Ev_button;
    private javax.swing.JButton Prof_Refr_Pj_button;
    private javax.swing.JTable ProgTabl1;
    private javax.swing.JTable ProgTabl2;
    private javax.swing.JPanel Prog_Card_prof;
    private javax.swing.JPanel Prog_Card_stud_p;
    private javax.swing.JButton Stud_Refr_Ev_button;
    private javax.swing.JButton Stud_Refr_Pj_button;
    static javax.swing.JLabel User;
    public static javax.swing.JLabel hidden;
    public static javax.swing.JLabel hidden2;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel logout;
    // End of variables declaration//GEN-END:variables

}