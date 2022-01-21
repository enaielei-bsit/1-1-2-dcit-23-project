package dcit_23_bsit_1_1_project_nila_final;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Transaction extends javax.swing.JFrame {

    public Transaction() {
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
        pnl_bal = new javax.swing.JPanel();
        pnl_bal_in = new javax.swing.JPanel();
        txtfld_bal = new javax.swing.JTextField();
        pnl_btns = new javax.swing.JPanel();
        btn_with = new javax.swing.JButton();
        btn_dep = new javax.swing.JButton();
        btn_return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM | Transaction");
        setResizable(false);

        pnl_main.setBackground(new java.awt.Color(51, 51, 51));

        pnl_bal.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(51, 51, 51)), "CURRENT REMAINING BALANCE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        pnl_bal.setOpaque(false);

        pnl_bal_in.setBackground(new java.awt.Color(65, 65, 65));
        pnl_bal_in.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));

        txtfld_bal.setEditable(false);
        txtfld_bal.setBackground(new java.awt.Color(65, 65, 65));
        txtfld_bal.setFont(new java.awt.Font("Consolas", 1, 60)); // NOI18N
        txtfld_bal.setForeground(new java.awt.Color(204, 255, 51));
        txtfld_bal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtfld_bal.setText("2000.00");
        txtfld_bal.setBorder(null);
        txtfld_bal.setDisabledTextColor(new java.awt.Color(204, 255, 51));
        txtfld_bal.setOpaque(false);
        txtfld_bal.setSelectionColor(new java.awt.Color(204, 255, 51));

        javax.swing.GroupLayout pnl_bal_inLayout = new javax.swing.GroupLayout(pnl_bal_in);
        pnl_bal_in.setLayout(pnl_bal_inLayout);
        pnl_bal_inLayout.setHorizontalGroup(
            pnl_bal_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_bal_inLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfld_bal)
                .addContainerGap())
        );
        pnl_bal_inLayout.setVerticalGroup(
            pnl_bal_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_bal_inLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtfld_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_balLayout = new javax.swing.GroupLayout(pnl_bal);
        pnl_bal.setLayout(pnl_balLayout);
        pnl_balLayout.setHorizontalGroup(
            pnl_balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_balLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_bal_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_balLayout.setVerticalGroup(
            pnl_balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_balLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_bal_in, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_btns.setOpaque(false);

        btn_with.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_with.setText("WTIHDRAW");
        btn_with.setToolTipText("Extract a specific amount of cash from the account");
        btn_with.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_with.setBorderPainted(false);
        btn_with.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_depFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_depFocusLost(evt);
            }
        });
        btn_with.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_depMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_depMouseExited(evt);
            }
        });
        btn_with.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_withActionPerformed(evt);
            }
        });

        btn_dep.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_dep.setText("DEPOSIT");
        btn_dep.setToolTipText("Load a specific amount of cash to the account");
        btn_dep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_dep.setBorderPainted(false);
        btn_dep.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_depFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_depFocusLost(evt);
            }
        });
        btn_dep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_depMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_depMouseExited(evt);
            }
        });
        btn_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_depActionPerformed(evt);
            }
        });

        btn_return.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_return.setText("RETURN");
        btn_return.setToolTipText("Go back and return to the dashboard");
        btn_return.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_return.setBorderPainted(false);
        btn_return.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_depFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_depFocusLost(evt);
            }
        });
        btn_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_depMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_depMouseExited(evt);
            }
        });
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_btnsLayout = new javax.swing.GroupLayout(pnl_btns);
        pnl_btns.setLayout(pnl_btnsLayout);
        pnl_btnsLayout.setHorizontalGroup(
            pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnsLayout.createSequentialGroup()
                .addComponent(btn_with, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_dep, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_btnsLayout.setVerticalGroup(
            pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_with, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addComponent(btn_dep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_return, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnl_bal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_btns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_btns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
Color fg = new Color(51, 51, 51), bg = new Color(255, 255, 255), oc = null, oc2 = new Color(67, 242, 120);
    private void btn_depMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_depMouseEntered
        if (evt.getSource() == btn_with) {
            btn_with.setForeground(oc);
            btn_with.setBackground(oc2);
        } else if (evt.getSource() == btn_dep) {
            btn_dep.setForeground(oc);
            btn_dep.setBackground(oc2);
        }
        if (evt.getSource() == btn_return) {
            btn_return.setForeground(oc);
            btn_return.setBackground(oc2);
        }
    }//GEN-LAST:event_btn_depMouseEntered

    private void btn_depMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_depMouseExited
        if (evt.getSource() == btn_with) {
            btn_with.setForeground(fg);
            btn_with.setBackground(bg);
        } else if (evt.getSource() == btn_dep) {
            btn_dep.setForeground(fg);
            btn_dep.setBackground(bg);
        }
        if (evt.getSource() == btn_return) {
            btn_return.setForeground(fg);
            btn_return.setBackground(bg);
        }
    }//GEN-LAST:event_btn_depMouseExited

    private void btn_depFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_depFocusGained
        if (evt.getSource() == btn_with) {
            btn_with.setForeground(oc);
            btn_with.setBackground(oc2);
        } else if (evt.getSource() == btn_dep) {
            btn_dep.setForeground(oc);
            btn_dep.setBackground(oc2);
        }
        if (evt.getSource() == btn_return) {
            btn_return.setForeground(oc);
            btn_return.setBackground(oc2);
        }
    }//GEN-LAST:event_btn_depFocusGained

    private void btn_depFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_depFocusLost
        if (evt.getSource() == btn_with) {
            btn_with.setForeground(fg);
            btn_with.setBackground(bg);
        } else if (evt.getSource() == btn_dep) {
            btn_dep.setForeground(fg);
            btn_dep.setBackground(bg);
        }
        if (evt.getSource() == btn_return) {
            btn_return.setForeground(fg);
            btn_return.setBackground(bg);
        }
    }//GEN-LAST:event_btn_depFocusLost

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_returnActionPerformed

    private void btn_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_depActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_depActionPerformed

    private void btn_withActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_withActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_withActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_dep;
    public javax.swing.JButton btn_return;
    public javax.swing.JButton btn_with;
    private javax.swing.JPanel pnl_bal;
    private javax.swing.JPanel pnl_bal_in;
    private javax.swing.JPanel pnl_btns;
    private javax.swing.JPanel pnl_main;
    public javax.swing.JTextField txtfld_bal;
    // End of variables declaration//GEN-END:variables

}
