package dcit_23_bsit_1_1_project_nila_final;

import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class SignIn extends javax.swing.JFrame {

    public SignIn() {
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

        pnl_main = new javax.swing.JPanel();
        pnl_title = new javax.swing.JPanel();
        lbl_a = new javax.swing.JLabel();
        lbl_t = new javax.swing.JLabel();
        lbl_m = new javax.swing.JLabel();
        lbl_utomated = new javax.swing.JLabel();
        lbl_eller = new javax.swing.JLabel();
        lbl_achine = new javax.swing.JLabel();
        sep_title = new javax.swing.JSeparator();
        lbl_copyright = new javax.swing.JLabel();
        lbl_subject = new javax.swing.JLabel();
        lbl_section = new javax.swing.JLabel();
        pnl_btns = new javax.swing.JPanel();
        btn_sign_in = new javax.swing.JButton();
        btn_sign_up = new javax.swing.JButton();
        btn_quit = new javax.swing.JButton();
        sep_sec = new javax.swing.JSeparator();
        pnl_cred = new javax.swing.JPanel();
        lbl_usrnm = new javax.swing.JLabel();
        txtfld_acc_usrnm = new javax.swing.JTextField();
        lbl_pin = new javax.swing.JLabel();
        passfld_acc_pin = new javax.swing.JPasswordField();
        chkbx_view = new javax.swing.JCheckBox();
        lbl_header_account_cred = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM | Sign-In");
        setResizable(false);

        pnl_main.setBackground(new java.awt.Color(51, 51, 51));

        pnl_title.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));
        pnl_title.setOpaque(false);

        lbl_a.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lbl_a.setForeground(new java.awt.Color(67, 242, 120));
        lbl_a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_a.setText("A");

        lbl_t.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lbl_t.setForeground(new java.awt.Color(67, 242, 120));
        lbl_t.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_t.setText("T");

        lbl_m.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lbl_m.setForeground(new java.awt.Color(67, 242, 120));
        lbl_m.setText("M");

        lbl_utomated.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lbl_utomated.setForeground(new java.awt.Color(255, 255, 255));
        lbl_utomated.setText("UTOMATED");

        lbl_eller.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lbl_eller.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eller.setText("ELLER");
        lbl_eller.setToolTipText("");

        lbl_achine.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        lbl_achine.setForeground(new java.awt.Color(255, 255, 255));
        lbl_achine.setText("ACHINE");
        lbl_achine.setToolTipText("");

        sep_title.setForeground(new java.awt.Color(51, 51, 51));

        lbl_copyright.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        lbl_copyright.setForeground(new java.awt.Color(255, 255, 255));
        lbl_copyright.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_copyright.setText("© NOMMEL ISANAR LAVAPIE AMOLAT 2019");
        lbl_copyright.setToolTipText("");

        lbl_subject.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        lbl_subject.setForeground(new java.awt.Color(255, 255, 255));
        lbl_subject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_subject.setText("DCIT 23 - MR. CYRIL DAVE M. FLOR");
        lbl_subject.setToolTipText("");

        lbl_section.setFont(new java.awt.Font("Trebuchet MS", 0, 10)); // NOI18N
        lbl_section.setForeground(new java.awt.Color(255, 255, 255));
        lbl_section.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_section.setText("BS INFORMATION TECHNOLOGY 1-1");
        lbl_section.setToolTipText("");

        javax.swing.GroupLayout pnl_titleLayout = new javax.swing.GroupLayout(pnl_title);
        pnl_title.setLayout(pnl_titleLayout);
        pnl_titleLayout.setHorizontalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_title)
                    .addGroup(pnl_titleLayout.createSequentialGroup()
                        .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_a, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_m, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_t, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_eller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_utomated, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(lbl_achine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbl_copyright, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_subject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_section, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_titleLayout.setVerticalGroup(
            pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_a, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_utomated, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_eller, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_t, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_achine, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_m, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sep_title, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_copyright)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_subject)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_section)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_btns.setBackground(new java.awt.Color(102, 102, 102));
        pnl_btns.setOpaque(false);

        btn_sign_in.setBackground(new java.awt.Color(255, 255, 255));
        btn_sign_in.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_sign_in.setForeground(new java.awt.Color(51, 51, 51));
        btn_sign_in.setText("SIGN-IN");
        btn_sign_in.setToolTipText("Access an ATM Accound using the given credentials");
        btn_sign_in.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_sign_in.setBorderPainted(false);
        btn_sign_in.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_sign_inFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_sign_inFocusLost(evt);
            }
        });
        btn_sign_in.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sign_inMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sign_inMouseExited(evt);
            }
        });
        btn_sign_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sign_inActionPerformed(evt);
            }
        });

        btn_sign_up.setBackground(new java.awt.Color(255, 255, 255));
        btn_sign_up.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_sign_up.setForeground(new java.awt.Color(51, 51, 51));
        btn_sign_up.setText("SIGN-UP");
        btn_sign_up.setToolTipText("Register a new account on the ATM database");
        btn_sign_up.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_sign_up.setBorderPainted(false);
        btn_sign_up.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_sign_upFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_sign_upFocusLost(evt);
            }
        });
        btn_sign_up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sign_upMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sign_upMouseExited(evt);
            }
        });
        btn_sign_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sign_upActionPerformed(evt);
            }
        });

        btn_quit.setBackground(new java.awt.Color(255, 255, 255));
        btn_quit.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_quit.setForeground(new java.awt.Color(51, 51, 51));
        btn_quit.setText("QUIT");
        btn_quit.setToolTipText("Terminate the ATM program");
        btn_quit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_quit.setBorderPainted(false);
        btn_quit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_quitFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_quitFocusLost(evt);
            }
        });
        btn_quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_quitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_quitMouseExited(evt);
            }
        });
        btn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_btnsLayout = new javax.swing.GroupLayout(pnl_btns);
        pnl_btns.setLayout(pnl_btnsLayout);
        pnl_btnsLayout.setHorizontalGroup(
            pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnsLayout.createSequentialGroup()
                .addComponent(btn_sign_in, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sign_up, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_quit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_btnsLayout.setVerticalGroup(
            pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_sign_in, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(btn_sign_up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_quit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        sep_sec.setForeground(new java.awt.Color(51, 51, 51));
        sep_sec.setOrientation(javax.swing.SwingConstants.VERTICAL);

        pnl_cred.setBackground(new java.awt.Color(65, 65, 65));
        pnl_cred.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));

        lbl_usrnm.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_usrnm.setForeground(new java.awt.Color(255, 255, 255));
        lbl_usrnm.setText("ACCOUNT USERNAME");
        lbl_usrnm.setToolTipText("");

        txtfld_acc_usrnm.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        txtfld_acc_usrnm.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_acc_usrnm.setToolTipText("Type the account username");

        lbl_pin.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_pin.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pin.setText("ACCOUNT PIN");
        lbl_pin.setToolTipText("");

        passfld_acc_pin.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        passfld_acc_pin.setForeground(new java.awt.Color(51, 51, 51));
        passfld_acc_pin.setToolTipText("Type the 4-digit account PIN");
        passfld_acc_pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passfld_acc_pinKeyTyped(evt);
            }
        });

        chkbx_view.setBackground(new java.awt.Color(102, 102, 102));
        chkbx_view.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        chkbx_view.setToolTipText("Unmask PIN");
        chkbx_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkbx_viewActionPerformed(evt);
            }
        });

        lbl_header_account_cred.setBackground(new java.awt.Color(153, 255, 0));
        lbl_header_account_cred.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        lbl_header_account_cred.setForeground(new java.awt.Color(51, 51, 51));
        lbl_header_account_cred.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_header_account_cred.setText("ACCOUNT CREDENTIALS");
        lbl_header_account_cred.setOpaque(true);

        javax.swing.GroupLayout pnl_credLayout = new javax.swing.GroupLayout(pnl_cred);
        pnl_cred.setLayout(pnl_credLayout);
        pnl_credLayout.setHorizontalGroup(
            pnl_credLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_credLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnl_credLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_usrnm)
                    .addComponent(lbl_pin)
                    .addGroup(pnl_credLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnl_credLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_credLayout.createSequentialGroup()
                                .addComponent(passfld_acc_pin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(chkbx_view, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtfld_acc_usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addComponent(lbl_header_account_cred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_credLayout.setVerticalGroup(
            pnl_credLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_credLayout.createSequentialGroup()
                .addComponent(lbl_header_account_cred)
                .addGap(29, 29, 29)
                .addComponent(lbl_usrnm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfld_acc_usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_pin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_credLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passfld_acc_pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkbx_view, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sep_sec, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_cred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_btns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(pnl_cred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_btns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnl_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sep_sec))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    Color fg = new Color(51, 51, 51), bg = new Color(255, 255, 255), oc = null, oc2 = new Color(67, 242, 120);
    private void btn_sign_inMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sign_inMouseEntered
        btn_sign_in.setForeground(oc);
        btn_sign_in.setBackground(oc2);
    }//GEN-LAST:event_btn_sign_inMouseEntered

    private void btn_sign_inMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sign_inMouseExited
        btn_sign_in.setForeground(fg);
        btn_sign_in.setBackground(bg);
    }//GEN-LAST:event_btn_sign_inMouseExited

    private void btn_sign_upMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sign_upMouseEntered
        btn_sign_up.setForeground(oc);
        btn_sign_up.setBackground(oc2);
    }//GEN-LAST:event_btn_sign_upMouseEntered

    private void btn_sign_upMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sign_upMouseExited
        btn_sign_up.setForeground(fg);
        btn_sign_up.setBackground(bg);
    }//GEN-LAST:event_btn_sign_upMouseExited

    private void btn_quitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quitMouseEntered
        btn_quit.setForeground(oc);
        btn_quit.setBackground(oc2);
    }//GEN-LAST:event_btn_quitMouseEntered

    private void btn_quitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_quitMouseExited
        btn_quit.setForeground(fg);
        btn_quit.setBackground(bg);
    }//GEN-LAST:event_btn_quitMouseExited

    private void btn_quitFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_quitFocusGained
        btn_quit.setForeground(oc);
        btn_quit.setBackground(oc2);
    }//GEN-LAST:event_btn_quitFocusGained

    private void btn_quitFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_quitFocusLost
        btn_quit.setForeground(fg);
        btn_quit.setBackground(bg);
    }//GEN-LAST:event_btn_quitFocusLost

    private void btn_sign_upFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_sign_upFocusGained
        btn_sign_up.setForeground(oc);
        btn_sign_up.setBackground(oc2);
    }//GEN-LAST:event_btn_sign_upFocusGained

    private void btn_sign_upFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_sign_upFocusLost
        btn_sign_up.setForeground(fg);
        btn_sign_up.setBackground(bg);
    }//GEN-LAST:event_btn_sign_upFocusLost

    private void btn_sign_inFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_sign_inFocusGained
        btn_sign_in.setForeground(oc);
        btn_sign_in.setBackground(oc2);
    }//GEN-LAST:event_btn_sign_inFocusGained

    private void btn_sign_inFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_sign_inFocusLost
        btn_sign_in.setForeground(fg);
        btn_sign_in.setBackground(bg);
    }//GEN-LAST:event_btn_sign_inFocusLost

    private void btn_sign_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sign_upActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_sign_upActionPerformed

    private void btn_sign_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sign_inActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_sign_inActionPerformed

    private void btn_quitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_quitActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_quitActionPerformed

    private void chkbx_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkbx_viewActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_chkbx_viewActionPerformed

    private void passfld_acc_pinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passfld_acc_pinKeyTyped
        if (evt.getKeyChar() == '1' || evt.getKeyChar() == '2' || evt.getKeyChar() == '3' || evt.getKeyChar() == '4' || evt.getKeyChar() == '5' || evt.getKeyChar() == '6' || evt.getKeyChar() == '7' || evt.getKeyChar() == '8' || evt.getKeyChar() == '9' || evt.getKeyChar() == '0') {

        } else {
            evt.consume();
        }
    }//GEN-LAST:event_passfld_acc_pinKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_quit;
    public javax.swing.JButton btn_sign_in;
    public javax.swing.JButton btn_sign_up;
    public javax.swing.JCheckBox chkbx_view;
    private javax.swing.JLabel lbl_a;
    private javax.swing.JLabel lbl_achine;
    private javax.swing.JLabel lbl_copyright;
    private javax.swing.JLabel lbl_eller;
    private javax.swing.JLabel lbl_header_account_cred;
    private javax.swing.JLabel lbl_m;
    private javax.swing.JLabel lbl_pin;
    private javax.swing.JLabel lbl_section;
    private javax.swing.JLabel lbl_subject;
    private javax.swing.JLabel lbl_t;
    private javax.swing.JLabel lbl_usrnm;
    private javax.swing.JLabel lbl_utomated;
    public javax.swing.JPasswordField passfld_acc_pin;
    private javax.swing.JPanel pnl_btns;
    private javax.swing.JPanel pnl_cred;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JPanel pnl_title;
    private javax.swing.JSeparator sep_sec;
    private javax.swing.JSeparator sep_title;
    public javax.swing.JTextField txtfld_acc_usrnm;
    // End of variables declaration//GEN-END:variables
}
