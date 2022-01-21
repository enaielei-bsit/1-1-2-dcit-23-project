package dcit_23_bsit_1_1_project_nila_final;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SignUp extends javax.swing.JFrame {

    String[] str_yr;
    String[] str_month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    public SignUp() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrp_sex = new javax.swing.ButtonGroup();
        pnl_main = new javax.swing.JPanel();
        pnl_fill_up = new javax.swing.JPanel();
        sep_sec = new javax.swing.JSeparator();
        pnl_acc_set = new javax.swing.JPanel();
        txtfld_acc_num = new javax.swing.JTextField();
        lbl_header_acc_set = new javax.swing.JLabel();
        txtfld_acc_usrnm = new javax.swing.JTextField();
        lbl_acc_usrnm = new javax.swing.JLabel();
        lbl_acc_pin_init = new javax.swing.JLabel();
        passfld_acc_pin_init = new javax.swing.JPasswordField();
        passfld_acc_pin_con = new javax.swing.JPasswordField();
        lbl_acc_pin_con = new javax.swing.JLabel();
        lbl_acc_num = new javax.swing.JLabel();
        cmbbx_acc_type = new javax.swing.JComboBox<>();
        lbl_acc_type = new javax.swing.JLabel();
        lbl_init_dep = new javax.swing.JLabel();
        txtfld_init_dep = new javax.swing.JTextField();
        chkbx_view_init = new javax.swing.JCheckBox();
        chkbx_view_con = new javax.swing.JCheckBox();
        pnl_int_info = new javax.swing.JPanel();
        lbl_fn = new javax.swing.JLabel();
        txtfld_fn = new javax.swing.JTextField();
        txtfld_mn = new javax.swing.JTextField();
        lbl_mn = new javax.swing.JLabel();
        txtfld_ln = new javax.swing.JTextField();
        lbl_ln = new javax.swing.JLabel();
        lbl_sex = new javax.swing.JLabel();
        rdbtn_male = new javax.swing.JRadioButton();
        rdbtn_fem = new javax.swing.JRadioButton();
        lbl_bday = new javax.swing.JLabel();
        cmbbx_month = new javax.swing.JComboBox<>();
        cmbbx_yr = new javax.swing.JComboBox<>();
        lbl_mob_num = new javax.swing.JLabel();
        txtfld_mob_num = new javax.swing.JTextField();
        lbl_header_int_info = new javax.swing.JLabel();
        cmbbx_day = new javax.swing.JComboBox<>();
        pnl_btns = new javax.swing.JPanel();
        btn_return = new javax.swing.JButton();
        btn_clr = new javax.swing.JButton();
        btn_reg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM | Sign-Up");
        setResizable(false);

        pnl_main.setBackground(new java.awt.Color(51, 51, 51));

        pnl_fill_up.setBackground(new java.awt.Color(65, 65, 65));
        pnl_fill_up.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));

        sep_sec.setForeground(new java.awt.Color(51, 51, 51));
        sep_sec.setOrientation(javax.swing.SwingConstants.VERTICAL);

        pnl_acc_set.setOpaque(false);

        txtfld_acc_num.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        txtfld_acc_num.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_acc_num.setToolTipText("Type an 8-digit account number");
        txtfld_acc_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfld_acc_numKeyTyped(evt);
            }
        });

        lbl_header_acc_set.setBackground(new java.awt.Color(153, 255, 0));
        lbl_header_acc_set.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lbl_header_acc_set.setForeground(new java.awt.Color(51, 51, 51));
        lbl_header_acc_set.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_header_acc_set.setText("ACCOUNT SETUP");
        lbl_header_acc_set.setOpaque(true);

        txtfld_acc_usrnm.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        txtfld_acc_usrnm.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_acc_usrnm.setToolTipText("Type an account username");

        lbl_acc_usrnm.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_acc_usrnm.setForeground(new java.awt.Color(255, 255, 255));
        lbl_acc_usrnm.setText("ACCOUNT USERNAME");

        lbl_acc_pin_init.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_acc_pin_init.setForeground(new java.awt.Color(255, 255, 255));
        lbl_acc_pin_init.setText("ACCOUNT PIN");

        passfld_acc_pin_init.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        passfld_acc_pin_init.setToolTipText("Type a 4-digit account PIN");
        passfld_acc_pin_init.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passfld_acc_pin_initKeyTyped(evt);
            }
        });

        passfld_acc_pin_con.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        passfld_acc_pin_con.setToolTipText("Confirm the 4-digit PIN");
        passfld_acc_pin_con.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passfld_acc_pin_conKeyTyped(evt);
            }
        });

        lbl_acc_pin_con.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_acc_pin_con.setForeground(new java.awt.Color(255, 255, 255));
        lbl_acc_pin_con.setText("PIN CONFIRMATION");

        lbl_acc_num.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_acc_num.setForeground(new java.awt.Color(255, 255, 255));
        lbl_acc_num.setText("ACCOUNT NUMBER");

        cmbbx_acc_type.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        cmbbx_acc_type.setMaximumRowCount(5);
        cmbbx_acc_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Checking Account", "Savings Account" }));
        cmbbx_acc_type.setSelectedIndex(-1);
        cmbbx_acc_type.setSelectedItem(null);
        cmbbx_acc_type.setToolTipText("Select the type of ATM account");
        cmbbx_acc_type.setLightWeightPopupEnabled(false);

        lbl_acc_type.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_acc_type.setForeground(new java.awt.Color(255, 255, 255));
        lbl_acc_type.setText("ACCOUNT TYPE");

        lbl_init_dep.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_init_dep.setForeground(new java.awt.Color(255, 255, 255));
        lbl_init_dep.setText("INITIAL DEPOSIT");

        txtfld_init_dep.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        txtfld_init_dep.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_init_dep.setToolTipText("Deposit an initial amount of cash to the account");
        txtfld_init_dep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfld_init_depKeyTyped(evt);
            }
        });

        chkbx_view_init.setBackground(new java.awt.Color(102, 102, 102));
        chkbx_view_init.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        chkbx_view_init.setToolTipText("Unmask PIN");
        chkbx_view_init.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbx_view_initActionPerformed(evt);
            }
        });

        chkbx_view_con.setBackground(new java.awt.Color(102, 102, 102));
        chkbx_view_con.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        chkbx_view_con.setToolTipText("Unmask PIN");
        chkbx_view_con.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbx_view_conActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_acc_setLayout = new javax.swing.GroupLayout(pnl_acc_set);
        pnl_acc_set.setLayout(pnl_acc_setLayout);
        pnl_acc_setLayout.setHorizontalGroup(
            pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_header_acc_set, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnl_acc_setLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cmbbx_acc_type, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_acc_num)
                            .addGroup(pnl_acc_setLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtfld_acc_num, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_acc_type)))
                    .addComponent(lbl_acc_usrnm)
                    .addComponent(lbl_acc_pin_init)
                    .addComponent(lbl_acc_pin_con)
                    .addComponent(lbl_init_dep)
                    .addGroup(pnl_acc_setLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfld_acc_usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtfld_init_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnl_acc_setLayout.createSequentialGroup()
                                        .addComponent(passfld_acc_pin_con, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkbx_view_con, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnl_acc_setLayout.createSequentialGroup()
                                        .addComponent(passfld_acc_pin_init, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(chkbx_view_init, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_acc_setLayout.setVerticalGroup(
            pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_acc_setLayout.createSequentialGroup()
                .addComponent(lbl_header_acc_set)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(lbl_acc_type)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbbx_acc_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_acc_num)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfld_acc_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_acc_usrnm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfld_acc_usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_acc_pin_init)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkbx_view_init, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(passfld_acc_pin_init))
                .addGap(18, 18, 18)
                .addComponent(lbl_acc_pin_con)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_acc_setLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chkbx_view_con, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(passfld_acc_pin_con))
                .addGap(18, 18, 18)
                .addComponent(lbl_init_dep)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfld_init_dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );

        pnl_int_info.setOpaque(false);

        lbl_fn.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_fn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_fn.setText("GIVEN NAME");

        txtfld_fn.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        txtfld_fn.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_fn.setToolTipText("Type your first name");

        txtfld_mn.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        txtfld_mn.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_mn.setToolTipText("Type your middle name, can be optional");

        lbl_mn.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_mn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mn.setText("MIDDLE NAME");

        txtfld_ln.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        txtfld_ln.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_ln.setToolTipText("Type your last name");

        lbl_ln.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_ln.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ln.setText("FAMILY NAME");

        lbl_sex.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_sex.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sex.setText("SEX");

        btngrp_sex.add(rdbtn_male);
        rdbtn_male.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        rdbtn_male.setForeground(new java.awt.Color(255, 255, 255));
        rdbtn_male.setText("Male");
        rdbtn_male.setToolTipText("Select male");
        rdbtn_male.setOpaque(false);
        rdbtn_male.setPreferredSize(new java.awt.Dimension(47, 19));

        btngrp_sex.add(rdbtn_fem);
        rdbtn_fem.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        rdbtn_fem.setForeground(new java.awt.Color(255, 255, 255));
        rdbtn_fem.setText("Female");
        rdbtn_fem.setToolTipText("Select female");
        rdbtn_fem.setOpaque(false);
        rdbtn_fem.setPreferredSize(new java.awt.Dimension(59, 19));

        lbl_bday.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_bday.setForeground(new java.awt.Color(255, 255, 255));
        lbl_bday.setText("BIRTHDATE");

        cmbbx_month.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        cmbbx_month.setMaximumRowCount(5);
        cmbbx_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC" }));
        cmbbx_month.setSelectedIndex(-1);
        cmbbx_month.setSelectedItem(null);
        cmbbx_month.setToolTipText("Select a month");

        str_yr = new String[(LocalDateTime.now().getYear()-1900)+1];
        for(int i = 0, i2 = 2019; i < str_yr.length; i++, i2--){
            str_yr[i] = ""+i2;
            cmbbx_yr.addItem(str_yr[i]);
        }
        cmbbx_yr.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        cmbbx_yr.setMaximumRowCount(5);
        cmbbx_yr.setSelectedItem(null);
        cmbbx_yr.setToolTipText("Select a year");
        cmbbx_yr.setPreferredSize(new java.awt.Dimension(29, 19));

        lbl_mob_num.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_mob_num.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mob_num.setText("MOBILE NUMBER");

        txtfld_mob_num.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        txtfld_mob_num.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_mob_num.setToolTipText("Type an 11-digit mobile number");
        txtfld_mob_num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfld_mob_numKeyTyped(evt);
            }
        });

        lbl_header_int_info.setBackground(new java.awt.Color(153, 255, 0));
        lbl_header_int_info.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lbl_header_int_info.setForeground(new java.awt.Color(51, 51, 51));
        lbl_header_int_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_header_int_info.setText("INTIMATE INFORMATION");
        lbl_header_int_info.setOpaque(true);

        cmbbx_day.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        cmbbx_day.setMaximumRowCount(5);
        cmbbx_day.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cmbbx_day.setSelectedIndex(-1);
        cmbbx_day.setSelectedItem(null);
        cmbbx_day.setToolTipText("Select a day");

        javax.swing.GroupLayout pnl_int_infoLayout = new javax.swing.GroupLayout(pnl_int_info);
        pnl_int_info.setLayout(pnl_int_infoLayout);
        pnl_int_infoLayout.setHorizontalGroup(
            pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_int_infoLayout.createSequentialGroup()
                .addComponent(lbl_header_int_info, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnl_int_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnl_int_infoLayout.createSequentialGroup()
                            .addComponent(lbl_sex)
                            .addGap(147, 147, 147))
                        .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ln)
                            .addGroup(pnl_int_infoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtfld_ln, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_mn)
                                    .addGroup(pnl_int_infoLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txtfld_mn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_fn)
                                    .addGroup(pnl_int_infoLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txtfld_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(pnl_int_infoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(rdbtn_male, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbtn_fem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnl_int_infoLayout.createSequentialGroup()
                            .addComponent(lbl_bday)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_int_infoLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtfld_mob_num, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnl_int_infoLayout.createSequentialGroup()
                                    .addComponent(cmbbx_month, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbbx_day, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cmbbx_yr, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lbl_mob_num))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_int_infoLayout.setVerticalGroup(
            pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_int_infoLayout.createSequentialGroup()
                .addComponent(lbl_header_int_info)
                .addGap(18, 18, 18)
                .addComponent(lbl_fn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfld_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_mn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfld_mn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_ln)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfld_ln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_sex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbtn_fem, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbtn_male, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(lbl_bday)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_int_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbx_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbbx_yr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbbx_day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_mob_num)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfld_mob_num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_fill_upLayout = new javax.swing.GroupLayout(pnl_fill_up);
        pnl_fill_up.setLayout(pnl_fill_upLayout);
        pnl_fill_upLayout.setHorizontalGroup(
            pnl_fill_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fill_upLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_acc_set, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sep_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_int_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_fill_upLayout.setVerticalGroup(
            pnl_fill_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fill_upLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fill_upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sep_sec)
                    .addComponent(pnl_int_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_acc_set, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_btns.setOpaque(false);

        btn_return.setBackground(new java.awt.Color(255, 255, 255));
        btn_return.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_return.setForeground(new java.awt.Color(51, 51, 51));
        btn_return.setText("RETURN");
        btn_return.setToolTipText("Go back to the sign-in page");
        btn_return.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_return.setBorderPainted(false);
        btn_return.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_clrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_clrFocusLost(evt);
            }
        });
        btn_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_regMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_regMouseExited(evt);
            }
        });
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        btn_clr.setBackground(new java.awt.Color(255, 255, 255));
        btn_clr.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_clr.setForeground(new java.awt.Color(51, 51, 51));
        btn_clr.setText("CLEAR");
        btn_clr.setToolTipText("Empty all the input fields");
        btn_clr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_clr.setBorderPainted(false);
        btn_clr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_clrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_clrFocusLost(evt);
            }
        });
        btn_clr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_regMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_regMouseExited(evt);
            }
        });
        btn_clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clrActionPerformed(evt);
            }
        });

        btn_reg.setBackground(new java.awt.Color(255, 255, 255));
        btn_reg.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_reg.setForeground(new java.awt.Color(51, 51, 51));
        btn_reg.setText("REGISTER A NEW ACCOUNT");
        btn_reg.setToolTipText("Create a new account using the given credentials");
        btn_reg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_reg.setBorderPainted(false);
        btn_reg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_clrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_clrFocusLost(evt);
            }
        });
        btn_reg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_regMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_regMouseExited(evt);
            }
        });
        btn_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_btnsLayout = new javax.swing.GroupLayout(pnl_btns);
        pnl_btns.setLayout(pnl_btnsLayout);
        pnl_btnsLayout.setHorizontalGroup(
            pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnsLayout.createSequentialGroup()
                .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_clr, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_btnsLayout.setVerticalGroup(
            pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnsLayout.createSequentialGroup()
                .addComponent(btn_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btn_return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_clr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_fill_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_btns, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_fill_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_btns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, 446, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_regActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_returnActionPerformed
    Color fg = new Color(51, 51, 51), bg = new Color(255, 255, 255), oc = null, oc2 = new Color(67, 242, 120);
    private void btn_regMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regMouseEntered
        if (evt.getSource() == btn_return) {
            btn_return.setForeground(oc);
            btn_return.setBackground(oc2);
        } else if (evt.getSource() == btn_clr) {
            btn_clr.setForeground(oc);
            btn_clr.setBackground(oc2);
        } else if (evt.getSource() == btn_reg) {
            btn_reg.setForeground(oc);
            btn_reg.setBackground(oc2);
        }
    }//GEN-LAST:event_btn_regMouseEntered

    private void btn_regMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regMouseExited
        if (evt.getSource() == btn_return) {
            btn_return.setForeground(fg);
            btn_return.setBackground(bg);
        } else if (evt.getSource() == btn_clr) {
            btn_clr.setForeground(fg);
            btn_clr.setBackground(bg);
        } else if (evt.getSource() == btn_reg) {
            btn_reg.setForeground(fg);
            btn_reg.setBackground(bg);
        }
    }//GEN-LAST:event_btn_regMouseExited

    private void btn_clrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_clrFocusGained
        if (evt.getSource() == btn_return) {
            btn_return.setForeground(oc);
            btn_return.setBackground(oc2);
        } else if (evt.getSource() == btn_clr) {
            btn_clr.setForeground(oc);
            btn_clr.setBackground(oc2);
        } else if (evt.getSource() == btn_reg) {
            btn_reg.setForeground(oc);
            btn_reg.setBackground(oc2);
        }
    }//GEN-LAST:event_btn_clrFocusGained

    private void btn_clrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_clrFocusLost
        if (evt.getSource() == btn_return) {
            btn_return.setForeground(fg);
            btn_return.setBackground(bg);
        } else if (evt.getSource() == btn_clr) {
            btn_clr.setForeground(fg);
            btn_clr.setBackground(bg);
        } else if (evt.getSource() == btn_reg) {
            btn_reg.setForeground(fg);
            btn_reg.setBackground(bg);
        }
    }//GEN-LAST:event_btn_clrFocusLost

    private void chkbx_view_initActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbx_view_initActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_chkbx_view_initActionPerformed

    private void chkbx_view_conActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbx_view_conActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_chkbx_view_conActionPerformed

    private void btn_clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clrActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_clrActionPerformed

    private void txtfld_acc_numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfld_acc_numKeyTyped
        if (evt.getKeyChar() == '1' || evt.getKeyChar() == '2' || evt.getKeyChar() == '3' || evt.getKeyChar() == '4' || evt.getKeyChar() == '5' || evt.getKeyChar() == '6' || evt.getKeyChar() == '7' || evt.getKeyChar() == '8' || evt.getKeyChar() == '9' || evt.getKeyChar() == '0') {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtfld_acc_numKeyTyped

    private void passfld_acc_pin_initKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passfld_acc_pin_initKeyTyped
        if (evt.getKeyChar() == '1' || evt.getKeyChar() == '2' || evt.getKeyChar() == '3' || evt.getKeyChar() == '4' || evt.getKeyChar() == '5' || evt.getKeyChar() == '6' || evt.getKeyChar() == '7' || evt.getKeyChar() == '8' || evt.getKeyChar() == '9' || evt.getKeyChar() == '0') {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_passfld_acc_pin_initKeyTyped

    private void passfld_acc_pin_conKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passfld_acc_pin_conKeyTyped
        if (evt.getKeyChar() == '1' || evt.getKeyChar() == '2' || evt.getKeyChar() == '3' || evt.getKeyChar() == '4' || evt.getKeyChar() == '5' || evt.getKeyChar() == '6' || evt.getKeyChar() == '7' || evt.getKeyChar() == '8' || evt.getKeyChar() == '9' || evt.getKeyChar() == '0') {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_passfld_acc_pin_conKeyTyped

    private void txtfld_init_depKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfld_init_depKeyTyped
        if (evt.getKeyChar() == '1' || evt.getKeyChar() == '2' || evt.getKeyChar() == '3' || evt.getKeyChar() == '4' || evt.getKeyChar() == '5' || evt.getKeyChar() == '6' || evt.getKeyChar() == '7' || evt.getKeyChar() == '8' || evt.getKeyChar() == '9' || evt.getKeyChar() == '0' || evt.getKeyChar() == '.') {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtfld_init_depKeyTyped

    private void txtfld_mob_numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfld_mob_numKeyTyped
        if (evt.getKeyChar() == '1' || evt.getKeyChar() == '2' || evt.getKeyChar() == '3' || evt.getKeyChar() == '4' || evt.getKeyChar() == '5' || evt.getKeyChar() == '6' || evt.getKeyChar() == '7' || evt.getKeyChar() == '8' || evt.getKeyChar() == '9' || evt.getKeyChar() == '0') {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_txtfld_mob_numKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_clr;
    public javax.swing.JButton btn_reg;
    public javax.swing.JButton btn_return;
    public javax.swing.ButtonGroup btngrp_sex;
    public javax.swing.JCheckBox chkbx_view_con;
    public javax.swing.JCheckBox chkbx_view_init;
    public javax.swing.JComboBox<String> cmbbx_acc_type;
    public javax.swing.JComboBox<String> cmbbx_day;
    public javax.swing.JComboBox<String> cmbbx_month;
    public javax.swing.JComboBox<String> cmbbx_yr;
    private javax.swing.JLabel lbl_acc_num;
    private javax.swing.JLabel lbl_acc_pin_con;
    private javax.swing.JLabel lbl_acc_pin_init;
    private javax.swing.JLabel lbl_acc_type;
    private javax.swing.JLabel lbl_acc_usrnm;
    private javax.swing.JLabel lbl_bday;
    private javax.swing.JLabel lbl_fn;
    private javax.swing.JLabel lbl_header_acc_set;
    private javax.swing.JLabel lbl_header_int_info;
    private javax.swing.JLabel lbl_init_dep;
    private javax.swing.JLabel lbl_ln;
    private javax.swing.JLabel lbl_mn;
    private javax.swing.JLabel lbl_mob_num;
    private javax.swing.JLabel lbl_sex;
    public javax.swing.JPasswordField passfld_acc_pin_con;
    public javax.swing.JPasswordField passfld_acc_pin_init;
    private javax.swing.JPanel pnl_acc_set;
    private javax.swing.JPanel pnl_btns;
    private javax.swing.JPanel pnl_fill_up;
    private javax.swing.JPanel pnl_int_info;
    private javax.swing.JPanel pnl_main;
    public javax.swing.JRadioButton rdbtn_fem;
    public javax.swing.JRadioButton rdbtn_male;
    private javax.swing.JSeparator sep_sec;
    public javax.swing.JTextField txtfld_acc_num;
    public javax.swing.JTextField txtfld_acc_usrnm;
    public javax.swing.JTextField txtfld_fn;
    public javax.swing.JTextField txtfld_init_dep;
    public javax.swing.JTextField txtfld_ln;
    public javax.swing.JTextField txtfld_mn;
    public javax.swing.JTextField txtfld_mob_num;
    // End of variables declaration//GEN-END:variables
}
