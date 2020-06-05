package smartlab.user.gui;

/*
Codice per la registrazione di un nuovo utente, professore o studente
 */

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import smartlab.user.User;
import smartlab.user.User_PersonaleTecnico;
import smartlab.user.User_Professore;
import smartlab.user.User_Studente;
import smartlab.user.User_Tutor;

public class User_Register extends javax.swing.JFrame {

    public User_Register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Parent_panel = new javax.swing.JPanel();
        Form = new javax.swing.JTabbedPane();
        Studente = new javax.swing.JPanel();
        Nome_Ev = new javax.swing.JLabel();
        Cognome_Ev = new javax.swing.JLabel();
        Indirizzo_Ev = new javax.swing.JLabel();
        Codicefis_Ev = new javax.swing.JLabel();
        Tdc_Ev = new javax.swing.JLabel();
        Email_Ev = new javax.swing.JLabel();
        Tele_Ev = new javax.swing.JLabel();
        Tds_Ev = new javax.swing.JLabel();
        Pass_Ev = new javax.swing.JLabel();
        Stud_Nome = new javax.swing.JTextField();
        Stud_Cognome = new javax.swing.JTextField();
        Stud_Indirizzo = new javax.swing.JTextField();
        Stud_CodiceFis = new javax.swing.JTextField();
        Stud_Email = new javax.swing.JTextField();
        Stud_Tel = new javax.swing.JTextField();
        Stud_TDS = new javax.swing.JTextField();
        Stud_Pass = new javax.swing.JTextField();
        Stud_Register_Button = new javax.swing.JButton();
        Stud_TDC = new javax.swing.JComboBox<>();
        Cds_Ev = new javax.swing.JLabel();
        Ac_Ev = new javax.swing.JLabel();
        Stud_CDS = new javax.swing.JTextField();
        Stud_ADC = new javax.swing.JComboBox<>();
        Professore = new javax.swing.JPanel();
        Nome_Pr = new javax.swing.JLabel();
        Cognome_Pr = new javax.swing.JLabel();
        Indirizzo_Pr = new javax.swing.JLabel();
        Codicefis_Pr = new javax.swing.JLabel();
        Dip_Pr = new javax.swing.JLabel();
        Profilo_Pr = new javax.swing.JLabel();
        Email_Pr = new javax.swing.JLabel();
        Tele_Pr = new javax.swing.JLabel();
        Tds_Pr = new javax.swing.JLabel();
        Pass_Pr = new javax.swing.JLabel();
        Prof_Nome = new javax.swing.JTextField();
        Prof_Cognome = new javax.swing.JTextField();
        Prof_Indirizzo = new javax.swing.JTextField();
        Prof_CodiceFis = new javax.swing.JTextField();
        Prof_Dip = new javax.swing.JTextField();
        Prof_Categoria = new javax.swing.JTextField();
        Prof_Email = new javax.swing.JTextField();
        Prof_Tel = new javax.swing.JTextField();
        Prof_TDS = new javax.swing.JTextField();
        Prof_Pass = new javax.swing.JTextField();
        Prof_Register_Button = new javax.swing.JButton();
        PersTec = new javax.swing.JPanel();
        Nome_PT = new javax.swing.JLabel();
        Cognome_PT = new javax.swing.JLabel();
        Indirizzo_PT = new javax.swing.JLabel();
        Codicefis_PT = new javax.swing.JLabel();
        Dip_PT = new javax.swing.JLabel();
        Profilo_PT = new javax.swing.JLabel();
        Email_PT = new javax.swing.JLabel();
        Tele_PT = new javax.swing.JLabel();
        Tds_PT = new javax.swing.JLabel();
        Pass_PT = new javax.swing.JLabel();
        PT_Nome = new javax.swing.JTextField();
        PT_Cognome = new javax.swing.JTextField();
        PT_Indirizzo = new javax.swing.JTextField();
        PT_CF = new javax.swing.JTextField();
        PT_Professione = new javax.swing.JTextField();
        PT_Specializzazione = new javax.swing.JTextField();
        PT_Email = new javax.swing.JTextField();
        PT_Telefono = new javax.swing.JTextField();
        PT_TdS = new javax.swing.JTextField();
        PT_PWD = new javax.swing.JTextField();
        PT_Register_button = new javax.swing.JButton();
        Tutor = new javax.swing.JPanel();
        Nome_PT1 = new javax.swing.JLabel();
        Cognome_PT1 = new javax.swing.JLabel();
        Indirizzo_PT1 = new javax.swing.JLabel();
        Codicefis_PT1 = new javax.swing.JLabel();
        Dip_PT1 = new javax.swing.JLabel();
        Profilo_PT1 = new javax.swing.JLabel();
        Email_PT1 = new javax.swing.JLabel();
        Tele_PT1 = new javax.swing.JLabel();
        Tds_PT1 = new javax.swing.JLabel();
        Pass_PT1 = new javax.swing.JLabel();
        Tutor_Register_Button = new javax.swing.JButton();
        Tutor_Nome = new javax.swing.JTextField();
        Tutor_Cognome = new javax.swing.JTextField();
        Tutor_Indirizzo = new javax.swing.JTextField();
        Tutor_CF = new javax.swing.JTextField();
        Tutor_Qualifica = new javax.swing.JTextField();
        Tutor_Email = new javax.swing.JTextField();
        Tutor_Telefono = new javax.swing.JTextField();
        Tutor_TdS = new javax.swing.JTextField();
        Tutor_PWD = new javax.swing.JTextField();
        Tutor_DataInizio = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registrazione");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(389, 70));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRAZIONE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        Parent_panel.setBackground(new java.awt.Color(0, 102, 102));

        Form.setBackground(new java.awt.Color(0, 102, 102));
        Form.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Form.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FormMouseClicked(evt);
            }
        });

        Studente.setBackground(new java.awt.Color(0, 102, 102));

        Nome_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nome_Ev.setText("Nome :");

        Cognome_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cognome_Ev.setText("Cognome :");

        Indirizzo_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Indirizzo_Ev.setText("Indirizzo :");

        Codicefis_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Codicefis_Ev.setText("Codice Fiscale :");

        Tdc_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tdc_Ev.setText("Tipo di corso :");

        Email_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Email_Ev.setText("Email :");

        Tele_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tele_Ev.setText("Telefono :");

        Tds_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tds_Ev.setText("Titolo di studio :");

        Pass_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pass_Ev.setText("Password :");

        Stud_Register_Button.setText("Registrati");
        Stud_Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stud_Register_ButtonActionPerformed(evt);
            }
        });

        Stud_TDC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Triennale", "Quinquennale" }));
        Stud_TDC.setSelectedIndex(-1);

        Cds_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cds_Ev.setText("Corso di studio :");

        Ac_Ev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ac_Ev.setText("Anno di corso :");

        Stud_ADC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primo", "Secondo", "Terzo", "Quarto", "Quinto", "Sesto", "Settimo", "Ottavo", "Nono", "Decimo", "Più di dieci" }));
        Stud_ADC.setSelectedIndex(-1);

        javax.swing.GroupLayout StudenteLayout = new javax.swing.GroupLayout(Studente);
        Studente.setLayout(StudenteLayout);
        StudenteLayout.setHorizontalGroup(
            StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudenteLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudenteLayout.createSequentialGroup()
                        .addComponent(Nome_Ev)
                        .addGap(157, 157, 157)
                        .addComponent(Cognome_Ev))
                    .addGroup(StudenteLayout.createSequentialGroup()
                        .addComponent(Stud_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(Stud_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(StudenteLayout.createSequentialGroup()
                        .addComponent(Indirizzo_Ev)
                        .addGap(139, 139, 139)
                        .addComponent(Codicefis_Ev))
                    .addGroup(StudenteLayout.createSequentialGroup()
                        .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Stud_Indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tdc_Ev)
                            .addComponent(Email_Ev)
                            .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Stud_TDC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Stud_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addComponent(Tds_Ev)
                            .addComponent(Stud_TDS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tele_Ev)
                            .addComponent(Stud_Tel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(Stud_CodiceFis, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(Cds_Ev)
                            .addComponent(Ac_Ev)
                            .addComponent(Stud_CDS)
                            .addComponent(Stud_ADC, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
            .addGroup(StudenteLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(Stud_Register_Button))
            .addGroup(StudenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stud_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pass_Ev)))
        );
        StudenteLayout.setVerticalGroup(
            StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StudenteLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome_Ev)
                    .addComponent(Cognome_Ev))
                .addGap(6, 6, 6)
                .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stud_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stud_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Indirizzo_Ev)
                    .addComponent(Codicefis_Ev))
                .addGap(6, 6, 6)
                .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Stud_Indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stud_CodiceFis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StudenteLayout.createSequentialGroup()
                        .addComponent(Tdc_Ev)
                        .addGap(6, 6, 6)
                        .addComponent(Stud_TDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(Email_Ev)
                        .addGap(6, 6, 6)
                        .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Stud_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Stud_CDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(StudenteLayout.createSequentialGroup()
                        .addComponent(Tele_Ev)
                        .addGap(6, 6, 6)
                        .addComponent(Stud_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Cds_Ev)))
                .addGap(11, 11, 11)
                .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tds_Ev)
                    .addComponent(Ac_Ev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(StudenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stud_TDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Stud_ADC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pass_Ev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Stud_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Stud_Register_Button)
                .addGap(44, 44, 44))
        );

        Form.addTab("Studente", Studente);

        Professore.setBackground(new java.awt.Color(0, 102, 102));

        Nome_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nome_Pr.setText("Nome :");

        Cognome_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cognome_Pr.setText("Cognome :");

        Indirizzo_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Indirizzo_Pr.setText("Indirizzo :");

        Codicefis_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Codicefis_Pr.setText("Codice Fiscale :");

        Dip_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dip_Pr.setText("Dipartimento :");

        Profilo_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Profilo_Pr.setText("Profilo :");

        Email_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Email_Pr.setText("Email :");

        Tele_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tele_Pr.setText("Telefono :");

        Tds_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tds_Pr.setText("Titolo di studio :");

        Pass_Pr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pass_Pr.setText("Password :");

        Prof_CodiceFis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_CodiceFisActionPerformed(evt);
            }
        });

        Prof_Register_Button.setText("Registrati");
        Prof_Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Prof_Register_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ProfessoreLayout = new javax.swing.GroupLayout(Professore);
        Professore.setLayout(ProfessoreLayout);
        ProfessoreLayout.setHorizontalGroup(
            ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessoreLayout.createSequentialGroup()
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ProfessoreLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(Nome_Pr)
                                .addGap(157, 157, 157)
                                .addComponent(Cognome_Pr))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(Prof_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(Prof_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(Indirizzo_Pr)
                                .addGap(139, 139, 139)
                                .addComponent(Codicefis_Pr))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addComponent(Prof_Indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(Prof_CodiceFis, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Prof_TDS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Tds_Pr))
                                .addGap(79, 79, 79)
                                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pass_Pr)
                                    .addComponent(Prof_Pass)))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Prof_Dip, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Dip_Pr))
                                .addGap(79, 79, 79)
                                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Profilo_Pr)
                                    .addComponent(Prof_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(ProfessoreLayout.createSequentialGroup()
                                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Prof_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email_Pr))
                                .addGap(79, 79, 79)
                                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tele_Pr)
                                    .addComponent(Prof_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(ProfessoreLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(Prof_Register_Button)))
                .addGap(55, 55, 55))
        );
        ProfessoreLayout.setVerticalGroup(
            ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProfessoreLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome_Pr)
                    .addComponent(Cognome_Pr))
                .addGap(6, 6, 6)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Prof_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prof_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Indirizzo_Pr)
                    .addComponent(Codicefis_Pr))
                .addGap(6, 6, 6)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Prof_Indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prof_CodiceFis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dip_Pr)
                    .addComponent(Profilo_Pr))
                .addGap(6, 6, 6)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Prof_Dip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prof_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tele_Pr)
                    .addComponent(Email_Pr))
                .addGap(6, 6, 6)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Prof_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prof_Tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tds_Pr)
                    .addComponent(Pass_Pr))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProfessoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Prof_TDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Prof_Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(Prof_Register_Button)
                .addGap(44, 44, 44))
        );

        Form.addTab("Professore", Professore);

        PersTec.setBackground(new java.awt.Color(0, 102, 102));

        Nome_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nome_PT.setText("Nome :");

        Cognome_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cognome_PT.setText("Cognome :");

        Indirizzo_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Indirizzo_PT.setText("Indirizzo :");

        Codicefis_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Codicefis_PT.setText("Codice Fiscale :");

        Dip_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dip_PT.setText("Professione :");

        Profilo_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Profilo_PT.setText("Specializzazione :");

        Email_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Email_PT.setText("Email :");

        Tele_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tele_PT.setText("Telefono :");

        Tds_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tds_PT.setText("Titolo di studio :");

        Pass_PT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pass_PT.setText("Password :");

        PT_Register_button.setText("Registrati");
        PT_Register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PT_Register_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PersTecLayout = new javax.swing.GroupLayout(PersTec);
        PersTec.setLayout(PersTecLayout);
        PersTecLayout.setHorizontalGroup(
            PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersTecLayout.createSequentialGroup()
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersTecLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(PersTecLayout.createSequentialGroup()
                                    .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nome_PT)
                                        .addComponent(PT_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(79, 79, 79)
                                    .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Cognome_PT)
                                        .addComponent(PT_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(PersTecLayout.createSequentialGroup()
                                    .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(PersTecLayout.createSequentialGroup()
                                            .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Email_PT)
                                                .addComponent(Tds_PT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(98, 98, 98))
                                        .addGroup(PersTecLayout.createSequentialGroup()
                                            .addComponent(PT_TdS)
                                            .addGap(79, 79, 79)))
                                    .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PT_Telefono)
                                        .addComponent(PT_PWD)
                                        .addGroup(PersTecLayout.createSequentialGroup()
                                            .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Pass_PT)
                                                .addComponent(Tele_PT))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(PersTecLayout.createSequentialGroup()
                                    .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(PersTecLayout.createSequentialGroup()
                                            .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Indirizzo_PT)
                                                .addComponent(Dip_PT))
                                            .addGap(110, 110, 110))
                                        .addGroup(PersTecLayout.createSequentialGroup()
                                            .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PT_Indirizzo)
                                                .addComponent(PT_Professione))
                                            .addGap(69, 69, 69)))
                                    .addGap(10, 10, 10)
                                    .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PT_CF, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(PersTecLayout.createSequentialGroup()
                                            .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Codicefis_PT)
                                                .addComponent(Profilo_PT))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(PT_Specializzazione))))
                            .addComponent(PT_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PersTecLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(PT_Register_button)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        PersTecLayout.setVerticalGroup(
            PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersTecLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome_PT)
                    .addComponent(Cognome_PT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PT_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PT_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Indirizzo_PT)
                    .addComponent(Codicefis_PT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PT_Indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PT_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Profilo_PT)
                    .addComponent(Dip_PT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PT_Professione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PT_Specializzazione, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_PT)
                    .addComponent(Tele_PT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PT_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PT_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tds_PT)
                    .addComponent(Pass_PT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersTecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PT_TdS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PT_PWD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(PT_Register_button)
                .addGap(44, 44, 44))
        );

        Form.addTab("Personale Tecnico", PersTec);

        Tutor.setBackground(new java.awt.Color(0, 102, 102));

        Nome_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Nome_PT1.setText("Nome :");

        Cognome_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cognome_PT1.setText("Cognome :");

        Indirizzo_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Indirizzo_PT1.setText("Indirizzo :");

        Codicefis_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Codicefis_PT1.setText("Codice Fiscale :");

        Dip_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dip_PT1.setText("Data inizio :");

        Profilo_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Profilo_PT1.setText("Qualifica :");

        Email_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Email_PT1.setText("Email :");

        Tele_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tele_PT1.setText("Telefono :");

        Tds_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Tds_PT1.setText("Titolo di studio :");

        Pass_PT1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Pass_PT1.setText("Password :");

        Tutor_Register_Button.setText("Registrati");
        Tutor_Register_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tutor_Register_ButtonActionPerformed(evt);
            }
        });

        Tutor_Nome.setText(null);

        Tutor_Cognome.setText(null);

        Tutor_Indirizzo.setText(null);

        Tutor_CF.setText(null);

        Tutor_Qualifica.setText(null);

        Tutor_Email.setText(null);

        Tutor_Telefono.setText(null);

        Tutor_TdS.setText(null);

        Tutor_PWD.setText(null);

        Tutor_DataInizio.setCalendarPreferredSize(new java.awt.Dimension(400, 200));
        Tutor_DataInizio.setNavigateFont(new java.awt.Font("Serif", java.awt.Font.PLAIN, 10));

        javax.swing.GroupLayout TutorLayout = new javax.swing.GroupLayout(Tutor);
        Tutor.setLayout(TutorLayout);
        TutorLayout.setHorizontalGroup(
            TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TutorLayout.createSequentialGroup()
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nome_PT1)
                            .addComponent(Tutor_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cognome_PT1)
                            .addComponent(Tutor_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TutorLayout.createSequentialGroup()
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Indirizzo_PT1)
                            .addComponent(Dip_PT1)
                            .addComponent(Tutor_Indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tutor_DataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tutor_CF)
                            .addComponent(Tutor_Qualifica)
                            .addGroup(TutorLayout.createSequentialGroup()
                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Codicefis_PT1)
                                    .addComponent(Profilo_PT1))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(TutorLayout.createSequentialGroup()
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tutor_TdS)
                            .addComponent(Tds_PT1)
                            .addComponent(Email_PT1)
                            .addComponent(Tutor_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tutor_Telefono)
                            .addComponent(Tutor_PWD)
                            .addGroup(TutorLayout.createSequentialGroup()
                                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tele_PT1)
                                    .addComponent(Pass_PT1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 58, Short.MAX_VALUE))
            .addGroup(TutorLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(Tutor_Register_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TutorLayout.setVerticalGroup(
            TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TutorLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nome_PT1)
                    .addComponent(Cognome_PT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tutor_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tutor_Cognome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Indirizzo_PT1)
                    .addComponent(Codicefis_PT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tutor_Indirizzo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tutor_CF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Profilo_PT1)
                    .addComponent(Dip_PT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tutor_DataInizio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tutor_Qualifica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email_PT1)
                    .addComponent(Tele_PT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tutor_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tutor_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tds_PT1)
                    .addComponent(Pass_PT1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tutor_PWD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tutor_TdS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(Tutor_Register_Button)
                .addGap(44, 44, 44))
        );

        Form.addTab("Tutor", Tutor);

        javax.swing.GroupLayout Parent_panelLayout = new javax.swing.GroupLayout(Parent_panel);
        Parent_panel.setLayout(Parent_panelLayout);
        Parent_panelLayout.setHorizontalGroup(
            Parent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Form)
        );
        Parent_panelLayout.setVerticalGroup(
            Parent_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Form, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        getContentPane().add(Parent_panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Prof_CodiceFisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_CodiceFisActionPerformed
        
    }//GEN-LAST:event_Prof_CodiceFisActionPerformed

    private void FormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FormMouseClicked
        
    }//GEN-LAST:event_FormMouseClicked

    private void Stud_Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stud_Register_ButtonActionPerformed
        
        User_Studente register = new User_Studente();
        User user = new User();
        
        String Nome;
        String Cognome;
        String Indirizzo;
        String Codice_Fiscale;
        String Tipo_di_corso;
        String Email;
        String Telefono;
        String Titolo_di_studio;
        String Password;
        String Corso;
        int Ac;
        String[] Utente = new String [12];
        Boolean Check_EmptyFields;
        
        Nome = Stud_Nome.getText();
        if (!(Pattern.matches("^[a-zA-Z][a-zA-Z0-9-_]{3,32}$", Stud_Nome.getText()))){
            JOptionPane.showMessageDialog(null, "Inserire nome valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Cognome = Stud_Cognome.getText();
        if (!(Pattern.matches("^[a-zA-Z][a-zA-Z0-9-_]{3,32}$", Stud_Cognome.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire cognome valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Indirizzo = Stud_Indirizzo.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Stud_Indirizzo.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un'indirizzo valido(MAX 40 caratteri)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Codice_Fiscale = Stud_CodiceFis.getText().toUpperCase();
        if (!(Pattern.matches("^(([a-z]|[A-Z]){6})(\\d{2})([a-z]|[A-Z])(\\d{2})([a-z]|[A-Z])(\\d{3})([a-z]|[A-Z])$", Stud_CodiceFis.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire codice fiscale valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Tipo_di_corso="";
        int Tdc = Stud_TDC.getSelectedIndex();
        if (Tdc==0){
             Tipo_di_corso = "Triennale";
        }else if(Tdc==1){
             Tipo_di_corso = "Quinquennale";            
        }  
        
        Email = Stud_Email.getText();
        if (!(Pattern.matches("[a-z0-9!#$%&'*+\\=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Stud_Email.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire email valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Telefono = Stud_Tel.getText();
        if (!(Pattern.matches("^\\s*(?:\\+?(\\d{1,3}))?([-. (]*(\\d{3})[-. )]*)?((\\d{3})[-. ]*(\\d{2,4})(?:[-.x ]*(\\d+))?)\\s*$", Stud_Tel.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire telefono valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Titolo_di_studio = Stud_TDS.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Stud_TDS.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un Titolo di studio valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Password = Stud_Pass.getText();
        if (!(Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$", Stud_Pass.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire password valida minimo 8 caratteri, maiuscole, numeri e caratteri speciali", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Corso = Stud_CDS.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Stud_CDS.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un Corso di studio valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Ac = Stud_ADC.getSelectedIndex();
        String An_Corso="";
        if (Ac==0){
             An_Corso = "Primo";
        }else if(Ac==1){
             An_Corso = "Secondo";            
        }else if(Ac==2){
             An_Corso = "Terzo"; 
        }else if(Ac==3){
             An_Corso = "Quarto"; 
        }else if(Ac==4){
             An_Corso = "Quinto"; 
        }else if(Ac==5){
             An_Corso = "Sesto"; 
        }else if(Ac==6){
             An_Corso = "Settimo"; 
        }else if(Ac==7){
             An_Corso = "Ottavo";
        }else if(Ac==8){
             An_Corso = "Nono"; 
        }else if(Ac==9){
             An_Corso = "Decimo";
        }else if(Ac==10){
             An_Corso = "Piu' di dieci"; 
        }             
                        
        Utente[0]=Nome;
        Utente[1]=Cognome;
        Utente[2]=Indirizzo;
        Utente[3]=Telefono;
        Utente[4]=Email;
        Utente[5]=Titolo_di_studio;
        Utente[6]=Codice_Fiscale;
        Utente[7]="studente";
        Utente[8]=Password;
        Utente[9]=Tipo_di_corso;
        Utente[10]=Corso;
        Utente[11]=An_Corso;
        
        Check_EmptyFields = (Nome.isEmpty())|| (Cognome.isEmpty())|| (Indirizzo.isEmpty()) || (Telefono.isEmpty()) || (Email.isEmpty()) || (Codice_Fiscale.isEmpty()) || (Password.isEmpty()) ;
        
        if(Check_EmptyFields==true){
            JOptionPane.showMessageDialog(this,"Campo/i vuoti");
        }else{
                    
            if (user.check_Registrazione(Codice_Fiscale)) {
                JOptionPane.showMessageDialog(this,"Utente già registrato");
            }else{
                    
                register.User_Stud_Register(Utente);
                JOptionPane.showMessageDialog(this,"Registrazione avvenuta con successo");
                new User_Login().setVisible(true);
                this.dispose();
                
            }        
        }
    }//GEN-LAST:event_Stud_Register_ButtonActionPerformed

    private void Prof_Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Prof_Register_ButtonActionPerformed
        
        User_Professore register = new User_Professore();
        User user = new User();
        
        String Nome;
        String Cognome;
        String Indirizzo;
        String Codice_Fiscale;
        String Dipartimento;
        String Email;
        String Telefono;
        String Titolo_di_studio;
        String Profilo;
        String Password;
        String[] Utente= new String [11];
        Boolean Check_EmptyFields;
        
        Nome = Prof_Nome.getText();
        if (!(Pattern.matches("^[a-zA-Z][a-zA-Z0-9-_]{3,32}$", Prof_Nome.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire nome valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Cognome = Prof_Cognome.getText();
        if (!(Pattern.matches("^[a-zA-Z][a-zA-Z0-9-_]{3,32}$", Prof_Cognome.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire nome valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Indirizzo = Prof_Indirizzo.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Prof_Indirizzo.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un'indirizzo valido(MAX 40 caratteri)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Codice_Fiscale = Prof_CodiceFis.getText().toUpperCase();
        if (!(Pattern.matches("^(([a-z]|[A-Z]){6})(\\d{2})([a-z]|[A-Z])(\\d{2})([a-z]|[A-Z])(\\d{3})([a-z]|[A-Z])$", Prof_CodiceFis.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire codice fiscale valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Dipartimento = Prof_Dip.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Prof_Dip.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un dipartimento valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Email = Prof_Email.getText();
        if (!(Pattern.matches("[a-z0-9!#$%&'*+\\=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Prof_Email.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire email valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Telefono = Prof_Tel.getText();
        if (!(Pattern.matches("^\\s*(?:\\+?(\\d{1,3}))?([-. (]*(\\d{3})[-. )]*)?((\\d{3})[-. ]*(\\d{2,4})(?:[-.x ]*(\\d+))?)\\s*$", Prof_Tel.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire email valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Titolo_di_studio = Prof_TDS.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Prof_TDS.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un titolo di studi valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Profilo = Prof_Categoria.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Prof_Categoria.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire una categoria valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Password = Prof_Pass.getText();
        if (!(Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$", Prof_Pass.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire password valida minimo 8 caratteri, maiuscole, numeri e caratteri speciali", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Utente[0]=Nome;
        Utente[1]=Cognome;
        Utente[2]=Indirizzo;
        Utente[3]=Telefono;
        Utente[4]=Email;
        Utente[5]=Titolo_di_studio;
        Utente[6]=Codice_Fiscale;
        Utente[7]="professore";
        Utente[8]=Password;
        Utente[9]=Profilo;
        Utente[10]=Dipartimento;
        
        Check_EmptyFields = (Nome.isEmpty())|| (Cognome.isEmpty())|| (Indirizzo.isEmpty()) || (Telefono.isEmpty()) || (Email.isEmpty()) || (Codice_Fiscale.isEmpty()) || (Password.isEmpty()) || (Dipartimento.isEmpty())||(Titolo_di_studio.isEmpty())||(Profilo.isEmpty()) ;
        
        if(Check_EmptyFields==true){
            JOptionPane.showMessageDialog(this,"Campo/i vuoti");
        }else{
            
            if (user.check_Registrazione(Codice_Fiscale)) {
                JOptionPane.showMessageDialog(this,"Utente già presente");
            }else{
            
                register.User_Prof_Register(Utente);
                JOptionPane.showMessageDialog(this,"Registrazione avvenuta con successo");
                new User_Login().setVisible(true);
                this.dispose();
                
            }
    }//GEN-LAST:event_Prof_Register_ButtonActionPerformed
}
    private void PT_Register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PT_Register_buttonActionPerformed
        User_PersonaleTecnico Register = new User_PersonaleTecnico();
        User user = new User();
        
        String Nome;
        String Cognome;
        String Indirizzo;
        String Codice_Fiscale;
        String Professione;
        String Email;
        String Telefono;
        String Titolo_di_studio;
        String Specializzazione;
        String Password;
        String[] Utente= new String [11];
        Boolean Check_EmptyFields;
        
        Nome = PT_Nome.getText();
        if (!(Pattern.matches("^[a-zA-Z][a-zA-Z0-9-_]{3,32}$", PT_Nome.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire nome valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Cognome = PT_Cognome.getText();
        if (!(Pattern.matches("^[a-zA-Z][a-zA-Z0-9-_]{3,32}$", PT_Cognome.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire Cognome valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Indirizzo = PT_Indirizzo.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", PT_Indirizzo.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un'indirizzo valido(MAX 40 caratteri)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Codice_Fiscale = PT_CF.getText().toUpperCase();
        if (!(Pattern.matches("^(([a-z]|[A-Z]){6})(\\d{2})([a-z]|[A-Z])(\\d{2})([a-z]|[A-Z])(\\d{3})([a-z]|[A-Z])$", PT_CF.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire codice fiscale valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Professione = PT_Professione.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", PT_Professione.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire una professione valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Email = PT_Email.getText();
        if (!(Pattern.matches("[a-z0-9!#$%&'*+\\=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", PT_Email.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire email valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Telefono = PT_Telefono.getText();
        if (!(Pattern.matches("^\\s*(?:\\+?(\\d{1,3}))?([-. (]*(\\d{3})[-. )]*)?((\\d{3})[-. ]*(\\d{2,4})(?:[-.x ]*(\\d+))?)\\s*$", PT_Telefono.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire Telefono valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Titolo_di_studio = PT_TdS.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", PT_TdS.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un titolo di studi valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Specializzazione = PT_Specializzazione.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", PT_Specializzazione.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire una Specializzazione valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Password = PT_PWD.getText();
        if (!(Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$", PT_PWD.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire password valida minimo 8 caratteri, maiuscole, numeri e caratteri speciali", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Utente[0]=Nome;
        Utente[1]=Cognome;
        Utente[2]=Indirizzo;
        Utente[3]=Telefono;
        Utente[4]=Email;
        Utente[5]=Titolo_di_studio;
        Utente[6]=Codice_Fiscale;
        Utente[7]="personale tecnico";
        Utente[8]=Password;
        Utente[9]=Specializzazione;
        Utente[10]=Professione;
        
        Check_EmptyFields = (Nome.isEmpty())|| (Cognome.isEmpty())|| (Indirizzo.isEmpty()) || (Telefono.isEmpty()) || (Email.isEmpty()) || (Codice_Fiscale.isEmpty()) || (Password.isEmpty()) || (Professione.isEmpty())||(Titolo_di_studio.isEmpty())||(Specializzazione.isEmpty()) ;
        
        if(Check_EmptyFields==true){
            JOptionPane.showMessageDialog(this,"Campo/i vuoti");
        }else{
            
            if (user.check_Registrazione(Codice_Fiscale)) {
                JOptionPane.showMessageDialog(this,"Utente già presente");
            }else{
            
                Register.User_PersonaleTecnico_Register(Utente);
                JOptionPane.showMessageDialog(this,"Registrazione avvenuta con successo");
                new User_Login().setVisible(true);
                this.dispose();
                
            }
        }
    }//GEN-LAST:event_PT_Register_buttonActionPerformed

    private void Tutor_Register_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tutor_Register_ButtonActionPerformed
       
             User_Tutor Register = new User_Tutor();
        User user = new User();
        
        String Nome;
        String Cognome;
        String Indirizzo;
        String Codice_Fiscale;
        String Data_Inizio;
        String Email;
        String Telefono;
        String Titolo_di_studio;
        String Qualifica;
        String Password;
        String[] Utente= new String [11];
        Boolean Check_EmptyFields;
        
        Nome = Tutor_Nome.getText();
        if (!(Pattern.matches("^[a-zA-Z][a-zA-Z0-9-_]{3,32}$", Tutor_Nome.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire nome valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Cognome = Tutor_Cognome.getText();
        if (!(Pattern.matches("^[a-zA-Z][a-zA-Z0-9-_]{3,32}$", Tutor_Cognome.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire cognome valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Indirizzo = Tutor_Indirizzo.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Tutor_Indirizzo.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un'indirizzo valido(MAX 40 caratteri)", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Codice_Fiscale = Tutor_CF.getText().toUpperCase();
        if (!(Pattern.matches("^(([a-z]|[A-Z]){6})(\\d{2})([a-z]|[A-Z])(\\d{2})([a-z]|[A-Z])(\\d{3})([a-z]|[A-Z])$", Tutor_CF.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire codice fiscale valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Data_Inizio = Tutor_DataInizio.getText();
        
        
        Email = Tutor_Email.getText();
        if (!(Pattern.matches("[a-z0-9!#$%&'*+\\=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+\\=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Tutor_Email.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire email valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Telefono = Tutor_Telefono.getText();
        if (!(Pattern.matches("^\\s*(?:\\+?(\\d{1,3}))?([-. (]*(\\d{3})[-. )]*)?((\\d{3})[-. ]*(\\d{2,4})(?:[-.x ]*(\\d+))?)\\s*$", Tutor_Telefono.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire telefono valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Titolo_di_studio = Tutor_TdS.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Tutor_TdS.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire un titolo di studi valido", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Qualifica = Tutor_Qualifica.getText();
        if (!(Pattern.matches("^[ -}]{3,40}$", Tutor_Qualifica.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire una qualifica valida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Password = Tutor_PWD.getText();
        if (!(Pattern.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$", Tutor_PWD.getText()))) {
            JOptionPane.showMessageDialog(null, "Inserire password valida minimo 8 caratteri, maiuscole, numeri e caratteri speciali", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Utente[0]=Nome;
        Utente[1]=Cognome;
        Utente[2]=Indirizzo;
        Utente[3]=Telefono;
        Utente[4]=Email;
        Utente[5]=Titolo_di_studio;
        Utente[6]=Codice_Fiscale;
        Utente[7]="tutor";
        Utente[8]=Password;
        Utente[9]=Qualifica;
        Utente[10]=Data_Inizio;
        
        Check_EmptyFields = (Nome.isEmpty())|| (Cognome.isEmpty())|| (Indirizzo.isEmpty()) || (Telefono.isEmpty()) || (Email.isEmpty()) || (Codice_Fiscale.isEmpty()) || (Password.isEmpty()) || (Data_Inizio.isEmpty())||(Titolo_di_studio.isEmpty())||(Qualifica.isEmpty()) ;
        
        if(Check_EmptyFields==true){
            JOptionPane.showMessageDialog(this,"Campo/i vuoti");
        }else{
            
            if (user.check_Registrazione(Codice_Fiscale)) {
                JOptionPane.showMessageDialog(this,"Utente già presente");
            }else{
            
                Register.User_Tutor_Register(Utente);
                JOptionPane.showMessageDialog(this,"Registrazione avvenuta con successo");
                new User_Login().setVisible(true);
                this.dispose();
                
            }
        }   
        
    }//GEN-LAST:event_Tutor_Register_ButtonActionPerformed
    
 
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
            java.util.logging.Logger.getLogger(User_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ac_Ev;
    private javax.swing.JLabel Cds_Ev;
    private javax.swing.JLabel Codicefis_Ev;
    private javax.swing.JLabel Codicefis_PT;
    private javax.swing.JLabel Codicefis_PT1;
    private javax.swing.JLabel Codicefis_Pr;
    private javax.swing.JLabel Cognome_Ev;
    private javax.swing.JLabel Cognome_PT;
    private javax.swing.JLabel Cognome_PT1;
    private javax.swing.JLabel Cognome_Pr;
    private javax.swing.JLabel Dip_PT;
    private javax.swing.JLabel Dip_PT1;
    private javax.swing.JLabel Dip_Pr;
    private javax.swing.JLabel Email_Ev;
    private javax.swing.JLabel Email_PT;
    private javax.swing.JLabel Email_PT1;
    private javax.swing.JLabel Email_Pr;
    private javax.swing.JTabbedPane Form;
    private javax.swing.JLabel Indirizzo_Ev;
    private javax.swing.JLabel Indirizzo_PT;
    private javax.swing.JLabel Indirizzo_PT1;
    private javax.swing.JLabel Indirizzo_Pr;
    private javax.swing.JLabel Nome_Ev;
    private javax.swing.JLabel Nome_PT;
    private javax.swing.JLabel Nome_PT1;
    private javax.swing.JLabel Nome_Pr;
    private javax.swing.JTextField PT_CF;
    private javax.swing.JTextField PT_Cognome;
    private javax.swing.JTextField PT_Email;
    private javax.swing.JTextField PT_Indirizzo;
    private javax.swing.JTextField PT_Nome;
    private javax.swing.JTextField PT_PWD;
    private javax.swing.JTextField PT_Professione;
    private javax.swing.JButton PT_Register_button;
    private javax.swing.JTextField PT_Specializzazione;
    private javax.swing.JTextField PT_TdS;
    private javax.swing.JTextField PT_Telefono;
    private javax.swing.JPanel Parent_panel;
    private javax.swing.JLabel Pass_Ev;
    private javax.swing.JLabel Pass_PT;
    private javax.swing.JLabel Pass_PT1;
    private javax.swing.JLabel Pass_Pr;
    private javax.swing.JPanel PersTec;
    private javax.swing.JTextField Prof_Categoria;
    private javax.swing.JTextField Prof_CodiceFis;
    private javax.swing.JTextField Prof_Cognome;
    private javax.swing.JTextField Prof_Dip;
    private javax.swing.JTextField Prof_Email;
    private javax.swing.JTextField Prof_Indirizzo;
    private javax.swing.JTextField Prof_Nome;
    private javax.swing.JTextField Prof_Pass;
    private javax.swing.JButton Prof_Register_Button;
    private javax.swing.JTextField Prof_TDS;
    private javax.swing.JTextField Prof_Tel;
    private javax.swing.JPanel Professore;
    private javax.swing.JLabel Profilo_PT;
    private javax.swing.JLabel Profilo_PT1;
    private javax.swing.JLabel Profilo_Pr;
    private javax.swing.JComboBox<String> Stud_ADC;
    private javax.swing.JTextField Stud_CDS;
    private javax.swing.JTextField Stud_CodiceFis;
    private javax.swing.JTextField Stud_Cognome;
    private javax.swing.JTextField Stud_Email;
    private javax.swing.JTextField Stud_Indirizzo;
    private javax.swing.JTextField Stud_Nome;
    private javax.swing.JTextField Stud_Pass;
    private javax.swing.JButton Stud_Register_Button;
    private javax.swing.JComboBox<String> Stud_TDC;
    private javax.swing.JTextField Stud_TDS;
    private javax.swing.JTextField Stud_Tel;
    private javax.swing.JPanel Studente;
    private javax.swing.JLabel Tdc_Ev;
    private javax.swing.JLabel Tds_Ev;
    private javax.swing.JLabel Tds_PT;
    private javax.swing.JLabel Tds_PT1;
    private javax.swing.JLabel Tds_Pr;
    private javax.swing.JLabel Tele_Ev;
    private javax.swing.JLabel Tele_PT;
    private javax.swing.JLabel Tele_PT1;
    private javax.swing.JLabel Tele_Pr;
    private javax.swing.JPanel Tutor;
    private javax.swing.JTextField Tutor_CF;
    private javax.swing.JTextField Tutor_Cognome;
    private datechooser.beans.DateChooserCombo Tutor_DataInizio;
    private javax.swing.JTextField Tutor_Email;
    private javax.swing.JTextField Tutor_Indirizzo;
    private javax.swing.JTextField Tutor_Nome;
    private javax.swing.JTextField Tutor_PWD;
    private javax.swing.JTextField Tutor_Qualifica;
    private javax.swing.JButton Tutor_Register_Button;
    private javax.swing.JTextField Tutor_TdS;
    private javax.swing.JTextField Tutor_Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
