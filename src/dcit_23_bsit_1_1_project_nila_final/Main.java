/*
    © Nommel Isanar Lavapie Amolat 2019
    DCIT 23 - Mr. Cyril Dave M. Flor
    Bachelor of Science in Information Technology 1-1
    
    Second Semester - Project
    Last Edited: 13th of May 2019
 */
package dcit_23_bsit_1_1_project_nila_final;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.*;

public class Main implements ActionListener {

    public final DecimalFormat DECFOR_TWO = new DecimalFormat("0.00");
    public static File file_data, file_dir;

    public final String[] STR_SEC_LBL = {"---> ACCOUNT INFORMATION <---", "---> PERSONAL INFORMATION <---", "---> TRANSACTION LOG <---"};
    public final String[] STR_INFO_LBL = {"> Account Type", "> Account Number", "> Account Username", "> Account PIN", "> Account Balance", "> Recent Account Access", "> First Name", "> Middle Name", "> Last Name", "> Sex", "> Birthdate", "> Mobile Number"};
    public final String STR_CRED_MARK = ">>";

    public static DefaultTableModel deftblmdl;

    public static double dbl_acc_bal;
    public static String str_acc_type, str_acc_num, str_acc_usrnm, str_acc_pin, str_rec_access, str_rec_access_temp, str_fn, str_mn, str_ln, str_sex, str_bday, str_mob_num, str_log_entry_time, str_sort_type;
    public static char char_echo_char;
    public static int int_page_num, int_page_max;

    public static String[] str_log, str_log_temp;
    public static JFrame frm;

    static SignIn sign_in = new SignIn();
    static Main main = new Main();
    static SignUp sign_up = new SignUp();
    static Dashboard dashboard = new Dashboard();
    static Transaction transaction = new Transaction();

    public static void main(String[] args) {
        main = new Main();
        main.splashScreen();
    }

    public void splashScreen() {
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
        frm = new JFrame("ATM | Splash Screen");
        frm.setContentPane(new SplashScreen());
        frm.setUndecorated(true);
        frm.setSize(650, 355);
        frm.setPreferredSize(new java.awt.Dimension(650, 355));
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
        frm.setTitle("ATM | Splash Screen");
        frm.pack();
        frm.setVisible(true);
        for (double i = -999999999; i <= 999999999; i++) {
            if (i == 999999999) {
                frm.dispose();
                sign_in = new SignIn();
                sign_in.setVisible(true);
            }
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sign_in.btn_sign_up) {
            sign_up = new SignUp();
            sign_up.txtfld_acc_usrnm.setText(sign_in.txtfld_acc_usrnm.getText().trim());
            sign_up.passfld_acc_pin_init.setText(sign_in.passfld_acc_pin.getText().trim());
            sign_in.dispose();
            sign_up.setVisible(true);
        } else if (e.getSource() == sign_in.chkbx_view) {
            if (sign_in.chkbx_view.isSelected() == true) {
                sign_in.chkbx_view.setToolTipText("Mask PIN");
                char_echo_char = sign_in.passfld_acc_pin.getEchoChar();
                sign_in.passfld_acc_pin.setEchoChar((char) 0);
                sign_in.chkbx_view.setBackground(Color.WHITE);
            } else {
                sign_in.chkbx_view.setToolTipText("Unmask PIN");
                sign_in.passfld_acc_pin.setEchoChar('\u2022');
                sign_in.passfld_acc_pin.setEchoChar(char_echo_char);
                sign_in.chkbx_view.setBackground(new Color(102, 102, 102));
            }
        } else if (e.getSource() == sign_in.btn_sign_in) {
            if (!sign_in.txtfld_acc_usrnm.getText().trim().isEmpty() && !sign_in.passfld_acc_pin.getText().trim().isEmpty()) {
                if (sign_in.passfld_acc_pin.getText().trim().length() == 4) {
                    str_acc_usrnm = sign_in.txtfld_acc_usrnm.getText().trim();
                    fileCreation("check");
                    if (file_data.exists()) {
                        readData();
                        if (sign_in.passfld_acc_pin.getText().trim().equals(str_acc_pin) && str_acc_usrnm.equals(sign_in.txtfld_acc_usrnm.getText().trim())) {
                            str_rec_access_temp = str_rec_access;
                            str_rec_access = timeLog("access");
                            writeData();
                            readData();
                            str_log_temp = new String[]{};
                            int_page_num = 0;
                            int_page_max = 0;
                            str_sort_type = null;
                            dashboard = new Dashboard();
                            dashboard.txtfld_fn.setText(nameConcat());
                            dashboard.lbl_acc_num_bel.setText(str_acc_type.toUpperCase() + " NUMBER");
                            dashboard.lbl_acc_num.setText(str_acc_num);
                            dashboard.lbl_rec_access.setText(str_rec_access_temp);
                            dashboard.txtfld_bal.setText("\u20b1" + DECFOR_TWO.format(dbl_acc_bal));
                            deftblmdl = new DefaultTableModel(new String[]{"TRANSACTION DATE", "TRANSACTION TYPE", "TRANSACTION AMOUNT"}, 15);
                            dashboard.tbl_log.setModel(deftblmdl);
                            sign_in.dispose();
                            dashboard.setVisible(true);
                        } else {
                            if (!str_acc_usrnm.equals(sign_in.txtfld_acc_usrnm.getText().trim())) {
                                JOptionPane.showMessageDialog(null, "Account with the given username does not exist! Make sure that the username you typed is correct.", "ATM | Sign-In Error", 0);
                            } else if (!str_acc_pin.equals(sign_in.passfld_acc_pin.getText().trim())) {
                                JOptionPane.showMessageDialog(null, "Account PIN is incorrect! Make sure that the PIN you typed is correct.", "ATM | Sign-In Error", 0);
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid account! No account with the provided credentials exists.", "ATM | Sign-In Error", 0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid PIN! PIN must only be four digits.", "ATM | Sign-In Error", 0);
                }
            } else {

                if (sign_in.txtfld_acc_usrnm.getText().trim().isEmpty() && sign_in.passfld_acc_pin.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Account credentials are missing! Please provide all the needed information.", "ATM | Sign-In Error", 0);
                } else if (sign_in.txtfld_acc_usrnm.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Account username is missing! Please provide the username for the account.", "ATM | Sign-In Error", 0);
                } else if (sign_in.passfld_acc_pin.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Account PIN is missing! Please provide the PIN for the account.", "ATM | Sign-In Error", 0);
                }
            }
        } else if (e.getSource() == sign_in.btn_quit) {
            int q = JOptionPane.showConfirmDialog(null, "You wished to exit the program. ATM program will now terminate.", "ATM | Quit", 2, 1);
            if (q == 0) {
                System.exit(0);
            } else {

            }
        } else if (e.getSource() == sign_up.btn_reg) {
            if (sign_up.cmbbx_acc_type.getSelectedIndex() >= 0 && sign_up.txtfld_acc_num.getText().trim().isEmpty() != true
                    && sign_up.txtfld_acc_usrnm.getText().trim().isEmpty() != true && sign_up.passfld_acc_pin_init.getText().trim().isEmpty() != true
                    && sign_up.passfld_acc_pin_con.getText().trim().isEmpty() != true && sign_up.txtfld_init_dep.getText().trim().isEmpty() != true
                    && sign_up.txtfld_fn.getText().trim().isEmpty() != true && (sign_up.txtfld_mn.getText().trim().isEmpty() != true || sign_up.txtfld_mn.getText().trim().isEmpty() == true)
                    && sign_up.txtfld_ln.getText().trim().isEmpty() != true && (sign_up.rdbtn_male.isSelected() == true || sign_up.rdbtn_fem.isSelected() == true)
                    && sign_up.cmbbx_month.getSelectedIndex() >= 0 && sign_up.cmbbx_day.getSelectedIndex() >= 0 && sign_up.cmbbx_yr.getSelectedIndex() >= 0 && sign_up.txtfld_mob_num.getText().trim().isEmpty() != true) {

                if (sign_up.txtfld_acc_num.getText().trim().length() == 8) {

                    if (sign_up.passfld_acc_pin_init.getText().trim().length() == 4) {

                        if (sign_up.passfld_acc_pin_init.getText().trim().equals(sign_up.passfld_acc_pin_con.getText())) {

                            if (sign_up.txtfld_mob_num.getText().trim().length() == 11) {

                                if (!(Double.parseDouble(sign_up.txtfld_init_dep.getText()) <= 0)) {

                                    if (sign_up.cmbbx_acc_type.getSelectedIndex() == 0 && Double.parseDouble(sign_up.txtfld_init_dep.getText()) < 5000) {
                                        JOptionPane.showMessageDialog(null, "Invalid amount for initial cash deposit! A checking account must atleast have \u20b15000.00 worth of deposit.", "ATM | Sign-Up Error", 0);
                                    } else if (sign_up.cmbbx_acc_type.getSelectedIndex() == 1 && Double.parseDouble(sign_up.txtfld_init_dep.getText()) < 2000) {
                                        JOptionPane.showMessageDialog(null, "Invalid amount for initial cash deposit! A savings account must atleast have \u20b12000.00 worth of deposit.", "ATM | Sign-Up Error", 0);
                                    } else {
                                        str_acc_usrnm = sign_up.txtfld_acc_usrnm.getText().trim();
                                        fileCreation("check");
                                        if (!file_data.exists()) {
                                            if (sign_up.cmbbx_acc_type.getSelectedIndex() == 0) {
                                                str_acc_type = "Checking Account";
                                            } else if (sign_up.cmbbx_acc_type.getSelectedIndex() == 1) {
                                                str_acc_type = "Savings Account";
                                            }
                                            str_acc_num = sign_up.txtfld_acc_num.getText().trim();
                                            str_acc_usrnm = sign_up.txtfld_acc_usrnm.getText().trim();
                                            str_acc_pin = sign_up.passfld_acc_pin_init.getText().trim();
                                            dbl_acc_bal = Double.parseDouble(sign_up.txtfld_init_dep.getText());
                                            str_rec_access = "\"NOT ASSIGNED\"";
                                            str_fn = sign_up.txtfld_fn.getText().trim();
                                            str_log_entry_time = timeLog("log");
                                            str_log = new String[1];
                                            str_log[0] = str_log_entry_time + " - \u20b1" + DECFOR_TWO.format(Double.parseDouble(sign_up.txtfld_init_dep.getText())) + " has been deposited into the account.";
                                            if (sign_up.txtfld_mn.getText().trim().isEmpty()) {
                                                str_mn = "\"NOT ASSIGNED\"";
                                            } else {
                                                str_mn = sign_up.txtfld_mn.getText().trim();
                                            }
                                            str_ln = sign_up.txtfld_ln.getText().trim();
                                            if (sign_up.rdbtn_male.isSelected()) {
                                                str_sex = "Male";
                                            } else {
                                                str_sex = "Female";
                                            }
                                            str_bday = sign_up.str_month[sign_up.cmbbx_month.getSelectedIndex()] + " " + (sign_up.cmbbx_day.getSelectedIndex() + 1) + ", " + sign_up.str_yr[sign_up.cmbbx_yr.getSelectedIndex()];
                                            str_mob_num = sign_up.txtfld_mob_num.getText().trim();
                                            fileCreation("data");
                                            writeData();
                                            JOptionPane.showMessageDialog(null, "Account registration has been successful! You will now be redirected to the log-in page.", "ATM | Sign-Up Successful", 1);
                                            sign_in = new SignIn();
                                            sign_up.dispose();
                                            sign_in.setVisible(true);
                                        } else {
                                            JOptionPane.showMessageDialog(null, "Account already exists! An account with the same username is already registered.", "ATM | Sign-Up Error", 0);
                                        }
                                    }

                                } else {
                                    JOptionPane.showMessageDialog(null, "Invalid amount for initial cash deposit! Enter a valid amount.", "ATM | Sign-Up Error", 0);
                                }

                            } else {
                                JOptionPane.showMessageDialog(null, "Invalid mobile number! Mobile number must be in 11-digit format.", "ATM | Sign-Up Error", 0);
                            }

                        } else {
                            JOptionPane.showMessageDialog(null, "PINs do not match! Ensure that the PINs are typed correctly.", "ATM | Sign-Up Error", 0);
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid PIN! PIN must be in 4 digits.", "ATM | Sign-Up Error", 0);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid account number! Account number must be in 8 digits.", "ATM | Sign-Up Error", 0);
                }

            } else {

                JOptionPane.showMessageDialog(null, "All of the input fields are necessary! Please fill out all the fields.", "ATM | Sign-Up Error", 0);

            }
        } else if (e.getSource() == sign_up.chkbx_view_init) {
            if (sign_up.chkbx_view_init.isSelected() == true) {
                sign_up.chkbx_view_init.setToolTipText("Mask PIN");
                char_echo_char = sign_up.passfld_acc_pin_init.getEchoChar();
                sign_up.passfld_acc_pin_init.setEchoChar((char) 0);
                sign_up.chkbx_view_init.setBackground(Color.WHITE);
            } else {
                sign_up.chkbx_view_init.setToolTipText("Unmask PIN");
                sign_up.passfld_acc_pin_init.setEchoChar(char_echo_char);
                sign_up.chkbx_view_init.setBackground(new Color(102, 102, 102));
            }
        } else if (e.getSource() == sign_up.chkbx_view_con) {
            if (sign_up.chkbx_view_con.isSelected() == true) {
                sign_up.chkbx_view_con.setToolTipText("Mask PIN");
                char_echo_char = sign_up.passfld_acc_pin_con.getEchoChar();
                sign_up.passfld_acc_pin_con.setEchoChar((char) 0);
                sign_up.chkbx_view_con.setBackground(Color.WHITE);
            } else {
                sign_up.chkbx_view_con.setToolTipText("Unmask PIN");
                sign_up.passfld_acc_pin_con.setEchoChar(char_echo_char);
                sign_up.chkbx_view_con.setBackground(new Color(102, 102, 102));
            }
        } else if (e.getSource() == sign_up.btn_return) {
            sign_up.dispose();
            sign_in = new SignIn();
            sign_in.setVisible(true);
        } else if (e.getSource() == sign_up.btn_clr) {
            sign_up.cmbbx_acc_type.setSelectedIndex(-1);
            sign_up.cmbbx_month.setSelectedIndex(-1);
            sign_up.cmbbx_day.setSelectedIndex(-1);
            sign_up.cmbbx_yr.setSelectedIndex(-1);
            sign_up.txtfld_acc_num.setText(null);
            sign_up.txtfld_acc_usrnm.setText(null);
            sign_up.txtfld_fn.setText(null);
            sign_up.txtfld_init_dep.setText(null);
            sign_up.txtfld_ln.setText(null);
            sign_up.txtfld_mn.setText(null);
            sign_up.txtfld_mob_num.setText(null);
            sign_up.passfld_acc_pin_con.setText(null);
            sign_up.passfld_acc_pin_init.setText(null);
            sign_up.btngrp_sex.clearSelection();

        } else if (e.getSource() == dashboard.menuitem_sign_out) {
            dashboard.dispose();
            sign_in = new SignIn();
            sign_in.setVisible(true);
        } else if (e.getSource() == dashboard.menuitem_quick_dep) {
            deposit();
        } else if (e.getSource() == dashboard.menuitem_quick_with) {
            withdraw();
        } else if (e.getSource() == dashboard.btn_load_log) {
            if (str_log_temp.length == (str_log.length)) {
                JOptionPane.showMessageDialog(null, "The table of transactions is already up to date. No recent and additional transactions were made yet.", "ATM | Dashboard", 1);
            } else {
                readData();
                str_log_temp = str_log.clone();
                if (str_log.length % 15 != 0) {
                    int_page_max = ((str_log.length - (str_log.length % 15)) / 15) + 1;
                } else {
                    int_page_max = str_log.length / 15;
                }
                if (int_page_num == 0) {
                    int_page_num++;
                }
                if (str_sort_type == null) {
                    str_sort_type = "old";
                }
                tableDisplay(int_page_num, str_sort_type);
                if (int_page_max != 1) {
                    if (int_page_num != int_page_max) {
                        dashboard.btn_next_pg.setEnabled(true);
                        dashboard.btn_next_pg.setFocusable(true);
                        dashboard.btn_next_pg.setToolTipText("Go to the page " + (int_page_num + 1) + " of transactions");
                    }
                } else {
                    dashboard.btn_next_pg.setEnabled(false);
                    dashboard.btn_next_pg.setFocusable(false);
                }
                if (str_log_temp.length > 1) {
                    dashboard.btn_sort.setEnabled(true);
                    dashboard.btn_sort.setFocusable(true);
                } else {
                    dashboard.btn_sort.setEnabled(false);
                    dashboard.btn_sort.setFocusable(false);
                }
                dashboard.lbl_page_stat.setText(int_page_num + " / " + int_page_max);
                dashboard.btn_load_log.setText("RELOAD TRANSACTIONS");
            }
        } else if (e.getSource() == dashboard.btn_sort) {
            if (str_sort_type.equals("old")) {
                tableDisplay(int_page_num, "new");
                dashboard.btn_sort.setToolTipText("Sort the list from oldest to newest");
                dashboard.btn_sort.setText("\u21f2");
                str_sort_type = "new";
            } else if (str_sort_type.equals("new")) {
                tableDisplay(int_page_num, "old");
                dashboard.btn_sort.setToolTipText("Sort the list from newest to oldest");
                dashboard.btn_sort.setText("\u21f1");
                str_sort_type = "old";
            }
        } else if (e.getSource() == dashboard.btn_prev_pg) {
            tableDisplay(int_page_num - 1, str_sort_type);
            int_page_num--;
            dashboard.btn_prev_pg.setToolTipText("Go to the page " + (int_page_num - 1) + " of transactions");
            dashboard.btn_next_pg.setToolTipText("Go to the page " + (int_page_num + 1) + " of transactions");
            if (int_page_num - 1 == 0) {
                dashboard.btn_prev_pg.setEnabled(false);
                dashboard.btn_prev_pg.setFocusable(false);
                dashboard.btn_prev_pg.setToolTipText("Go to the previous page of transactions");
            }
            if (int_page_num == int_page_max - 1) {
                dashboard.btn_next_pg.setEnabled(true);
                dashboard.btn_next_pg.setFocusable(true);
                dashboard.btn_next_pg.setToolTipText("Go to the page " + (int_page_num + 1) + " of transactions");
            }
            dashboard.lbl_page_stat.setText(int_page_num + " / " + int_page_max);
        } else if (e.getSource() == dashboard.btn_next_pg) {
            tableDisplay(int_page_num + 1, str_sort_type);
            int_page_num++;
            dashboard.btn_next_pg.setToolTipText("Go to the page " + (int_page_num + 1) + " of transactions");
            dashboard.btn_prev_pg.setToolTipText("Go to the page " + (int_page_num - 1) + " of transactions");
            if (int_page_num == int_page_max) {
                dashboard.btn_next_pg.setEnabled(false);
                dashboard.btn_next_pg.setFocusable(false);
                dashboard.btn_next_pg.setToolTipText("Go to the next page of transactions");
            }
            if (int_page_num == 0 + 2) {
                dashboard.btn_prev_pg.setEnabled(true);
                dashboard.btn_prev_pg.setFocusable(true);
                dashboard.btn_prev_pg.setToolTipText("Go to the page " + (int_page_num - 1) + " of transactions");
            }
            dashboard.lbl_page_stat.setText(int_page_num + " / " + int_page_max);
        } else if (e.getSource() == dashboard.menuitem_trnsct) {
            dashboard.dispose();
            transaction = new Transaction();
            transaction.txtfld_bal.setText("\u20b1" + DECFOR_TWO.format(dbl_acc_bal));
            transaction.setVisible(true);
        } else if (e.getSource() == transaction.btn_return) {
            transaction.dispose();
            str_log_temp = new String[]{};
            int_page_num = 0;
            int_page_max = 0;
            str_sort_type = null;
            dashboard = new Dashboard();
            dashboard.txtfld_fn.setText(nameConcat());
            dashboard.lbl_acc_num_bel.setText(str_acc_type.toUpperCase() + " NUMBER");
            dashboard.lbl_acc_num.setText(str_acc_num);
            dashboard.lbl_rec_access.setText(str_rec_access_temp);
            dashboard.txtfld_bal.setText("\u20b1" + DECFOR_TWO.format(dbl_acc_bal));
            deftblmdl = new DefaultTableModel(new String[]{"TRANSACTION DATE", "TRANSACTION TYPE", "TRANSACTION AMOUNT"}, 15);
            dashboard.tbl_log.setModel(deftblmdl);
            dashboard.setVisible(true);
        } else if (e.getSource() == transaction.btn_dep) {
            deposit();
        } else if (e.getSource() == transaction.btn_with) {
            withdraw();
        }

    }

    public void tableDisplay(int page_number, String sort_type) {

        Object[][] info_temp = new Object[str_log_temp.length][3];
        int i = 0, i2 = 0, i3 = 0, i4 = 0;

        if (sort_type.equals("old")) {
            for (String a : str_log_temp) {
                info_temp[i][i2] = str_log_temp[i].substring(0, str_log_temp[i].indexOf(" - "));
                if (str_log_temp[i].substring(str_log_temp[i].indexOf("been") + 5, str_log_temp[i].indexOf("been") + 14).equals("deposited")) {
                    info_temp[i][i2 + 1] = "Cash Deposit";
                } else {
                    info_temp[i][i2 + 1] = "Cash Withdrawal";
                }
                info_temp[i][i2 + 2] = str_log_temp[i].substring(str_log_temp[i].indexOf(" - ") + 3, str_log_temp[i].indexOf("has") - 1);
                i++;
            }
        } else if (sort_type.equals("new")) {
            for (String a : str_log_temp) {
                info_temp[i][i2] = str_log_temp[((str_log_temp.length - 1) - i)].substring(0, str_log_temp[((str_log_temp.length - 1) - i)].indexOf(" - "));
                if (str_log_temp[((str_log_temp.length - 1) - i)].substring(str_log_temp[((str_log_temp.length - 1) - i)].indexOf("been") + 5, str_log_temp[((str_log_temp.length - 1) - i)].indexOf("been") + 14).equals("deposited")) {
                    info_temp[i][i2 + 1] = "Cash Deposit";
                } else {
                    info_temp[i][i2 + 1] = "Cash Withdrawal";
                }
                info_temp[i][i2 + 2] = str_log_temp[((str_log_temp.length - 1) - i)].substring(str_log_temp[((str_log.length - 1) - i)].indexOf(" - ") + 3, str_log_temp[((str_log_temp.length - 1) - i)].indexOf("has") - 1);
                i++;
            }
        }

        deftblmdl = new DefaultTableModel(new String[]{"TRANSACTION DATE", "TRANSACTION TYPE", "TRANSACTION AMOUNT"}, 15);
        dashboard.tbl_log.setModel(deftblmdl);

        if ((page_number <= int_page_max) && (page_number >= 1)) {
            for (i = ((page_number - 1) * 15), i2 = 0, i3 = 0; (i < (((page_number - 1) * 15) + 15)) && (i < str_log_temp.length); i++, i3++) {
                dashboard.tbl_log.getModel().setValueAt(info_temp[i][i2], i3, i2);
                dashboard.tbl_log.getModel().setValueAt(info_temp[i][i2 + 1], i3, i2 + 1);
                dashboard.tbl_log.getModel().setValueAt(info_temp[i][i2 + 2], i3, i2 + 2);
            }
        }

    }

    public void deposit() {
        try {
            Double val = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount of cash you wish to deposit:", "ATM | Cash Deposit", 3));
            if (val <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid amount! Withdraw amount must be atleast \u20b11.00.", "ATM | Cash Deposit Error", 0);
                deposit();
            } else {
                dbl_acc_bal += val;
                String[] str_log_entry = str_log.clone();
                str_log = new String[str_log.length + 1];
                str_log_entry_time = timeLog("log");
                for (int i = 0; i < str_log.length; i++) {
                    if (i == str_log.length - 1) {
                        str_log[i] = str_log_entry_time + " - \u20b1" + DECFOR_TWO.format(val) + " has been deposited into the account.";
                    } else {
                        str_log[i] = str_log_entry[i];
                    }
                }

                writeData();
                readData();
                JOptionPane.showMessageDialog(null, "Successful cash deposit! \u20b1" + val + " has been transferred into your account.", "ATM | Cash Deposit Success", 1);
                if (dashboard.isShowing()) {
                    dashboard.txtfld_bal.setText("\u20b1" + DECFOR_TWO.format(dbl_acc_bal));
                } else if (transaction.isShowing()) {
                    transaction.txtfld_bal.setText("\u20b1" + DECFOR_TWO.format(dbl_acc_bal));
                }
            }

        } catch (Exception e) {
            if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
                JOptionPane.showMessageDialog(null, "Invalid amount! Please enter a valid amount to be withdrawn.", "ATM | Cash Deposit Error", 0);
                withdraw();
            } else if (e.getClass().toString().equals("class java.lang.NullPointerException")) {

            }

        }
    }

    public void withdraw() {
        try {
            Double val = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the amount of cash you wish to withdraw:", "ATM | Cash Withdrawal", 3));
            if (val <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid amount! Withdraw amount must be atleast \u20b11.00.", "ATM | Cash Withdrawal Error", 0);
                withdraw();
            } else if (val > dbl_acc_bal) {
                JOptionPane.showMessageDialog(null, "Cash withdrawal is unsuccessful! Account has insufficient amount of balance.", "ATM | Cash Withdrawal Error", 0);
                withdraw();

            } else {
                dbl_acc_bal -= val;
                String[] str_log_entry = str_log.clone();
                str_log = new String[str_log.length + 1];
                str_log_entry_time = timeLog("log");
                for (int i = 0; i < str_log.length; i++) {
                    if (i == str_log.length - 1) {
                        str_log[i] = str_log_entry_time + " - \u20b1" + DECFOR_TWO.format(val) + " has been withdrawn from the account.";
                    } else {
                        str_log[i] = str_log_entry[i];
                    }
                }
                writeData();
                readData();
                JOptionPane.showMessageDialog(null, "Successful cash withdrawal! \u20b1" + val + " has been deducted from your account.", "ATM | Cash Withdrawal Success", 1);
                if (dashboard.isShowing()) {
                    dashboard.txtfld_bal.setText("\u20b1" + DECFOR_TWO.format(dbl_acc_bal));
                } else if (transaction.isShowing()) {
                    transaction.txtfld_bal.setText("\u20b1" + DECFOR_TWO.format(dbl_acc_bal));
                }

            }
        } catch (Exception e) {
            if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
                JOptionPane.showMessageDialog(null, "Invalid amount! Please enter a valid amount to be withdrawn.", "ATM | Cash Withdrawal Error", 0);
                withdraw();
            } else if (e.getClass().toString().equals("class java.lang.NullPointerException")) {

            }

        }

    }

    public String nameConcat() {
        String return_data = "";
        if (str_mn.isEmpty() || str_mn.equals("\"Not Assigned\"")) {
            return_data = str_fn.toUpperCase() + " " + str_ln.toUpperCase();
        } else {
            return_data = str_fn.toUpperCase() + " " + str_mn.toUpperCase() + " " + str_ln.toUpperCase();
        }
        return return_data;
    }

    public String timeLog(String type) {
        SignUp sign_up_1 = new SignUp();
        String return_data = "";
        if (type.equals("access")) {
            int m = LocalDateTime.now().getMonthValue();
            int d = LocalDateTime.now().getDayOfMonth();
            String d2 = ("" + LocalDateTime.now().getDayOfWeek()).substring(0, 1).toUpperCase() + ("" + LocalDateTime.now().getDayOfWeek()).substring(1).toLowerCase();
            int y = LocalDateTime.now().getYear();
            int hr = LocalDateTime.now().getHour();
            int min = LocalDateTime.now().getMinute();
            String stat, min_new, hr_new;

            if (hr >= 0 && hr < 12) {
                stat = "A.M.";
            } else {
                stat = "P.M.";
            }
            if (min < 10) {
                min_new = "0" + min;
            } else {
                min_new = "" + min;
            }
            if (hr % 12 == 0) {
                hr_new = "12";
            } else {
                hr_new = "" + (hr % 12);
            }

            return_data = d2 + ", " + d + " " + sign_up_1.str_month[m - 1] + " " + y + " - " + hr_new + ":" + min_new + " " + stat;

        } else if (type.equals("log")) {
            int m = LocalDateTime.now().getMonthValue();
            int d = LocalDateTime.now().getDayOfMonth();
            String d2 = ("" + LocalDateTime.now().getDayOfWeek()).substring(0, 1).toUpperCase() + ("" + LocalDateTime.now().getDayOfWeek()).substring(1).toLowerCase();
            int y = LocalDateTime.now().getYear();
            int hr = LocalDateTime.now().getHour();
            int min = LocalDateTime.now().getMinute();
            String stat, min_new, m_new, d_new, hr_new;

            if (hr >= 0 && hr < 12) {
                stat = "A.M.";
            } else {
                stat = "P.M.";
            }
            if (min < 10) {
                min_new = "0" + min;
            } else {
                min_new = "" + min;
            }
            if (m < 10) {
                m_new = "0" + m;
            } else {
                m_new = "" + m;
            }
            if (d < 10) {
                d_new = "0" + d;
            } else {
                d_new = "" + d;
            }
            if (hr % 12 == 0) {
                hr_new = "12";
            } else {
                hr_new = "" + (hr % 12);
            }
            return_data = y + "-" + m_new + "-" + d_new + " (" + hr_new + ":" + min_new + " " + stat + ")";
        }
        return return_data;
    }

    public void fileCreation(String type) {
        if (type.equals("check")) {
            file_dir = new File("ATM Account Database/" + str_acc_usrnm + " - Account Credentials");
            file_data = new File(file_dir, str_acc_usrnm + " - Account Data.txt");

        } else if (type.equals("data")) {
            file_dir = new File("ATM Account Database/" + str_acc_usrnm + " - Account Credentials");
            file_dir.mkdirs();
            file_data = new File(file_dir, str_acc_usrnm + " - Account Data.txt");
            file_data.setReadOnly();
        }
    }

    public void readData() {
        try {
            Scanner s;
            s = new Scanner(file_data);
            for (String temp = ""; s.hasNext();) {
                if (s.next().equals(">")) {
                    temp = ">" + s.nextLine();
                    if (s.next().equals(STR_CRED_MARK)) {
                        if (temp.equals(STR_INFO_LBL[0])) {
                            str_acc_type = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[1])) {
                            str_acc_num = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[2])) {
                            str_acc_usrnm = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[3])) {
                            str_acc_pin = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[4])) {
                            dbl_acc_bal = Double.parseDouble(s.nextLine().trim().substring(1));
                        } else if (temp.equals(STR_INFO_LBL[5])) {
                            str_rec_access = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[6])) {
                            str_fn = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[7])) {
                            str_mn = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[8])) {
                            str_ln = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[9])) {
                            str_sex = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[10])) {
                            str_bday = s.nextLine().trim();
                        } else if (temp.equals(STR_INFO_LBL[11])) {
                            str_mob_num = s.nextLine().trim();
                        }
                    }
                }

            }

            s.close();
            int i = 0;
            s = new Scanner(file_data);
            for (String temp = ""; s.hasNext();) {
                if (s.next().equals(">")) {
                    temp = ">" + s.nextLine();
                    if (temp.equals("> Log Entry # " + (i + 1))) {
                        i++;
                    }
                }
            }
            s.close();

            str_log = new String[i];
            i = 0;
            s = new Scanner(file_data);
            for (String temp = ""; s.hasNext();) {
                if (s.next().equals(">")) {
                    temp = ">" + s.nextLine();
                    if (temp.equals("> Log Entry # " + (i + 1))) {
                        str_log[i] = s.nextLine().trim().substring(3);
                        i++;
                    }
                }
            }
            s.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void writeData() {
        try {
            String mn_temp;
            if (str_mn.isEmpty()) {
                mn_temp = "\"Not Assigned\"";
            } else {
                mn_temp = str_mn;
            }

            PrintWriter pw = new PrintWriter(file_data);

            pw.println(STR_SEC_LBL[0]);
            pw.println();
            pw.println();
            pw.println(STR_INFO_LBL[0]);
            pw.println("\t" + STR_CRED_MARK + " " + str_acc_type);
            pw.println(STR_INFO_LBL[1]);
            pw.println("\t" + STR_CRED_MARK + " " + str_acc_num);
            pw.println(STR_INFO_LBL[2]);
            pw.println("\t" + STR_CRED_MARK + " " + str_acc_usrnm);
            pw.println(STR_INFO_LBL[3]);
            pw.println("\t" + STR_CRED_MARK + " " + str_acc_pin);
            pw.println(STR_INFO_LBL[4]);
            pw.println("\t" + STR_CRED_MARK + " " + "\u20b1" + DECFOR_TWO.format(dbl_acc_bal));
            pw.println(STR_INFO_LBL[5]);
            pw.println("\t" + STR_CRED_MARK + " " + str_rec_access);

            pw.println();
            pw.println();
            pw.println(STR_SEC_LBL[1]);
            pw.println();
            pw.println();
            pw.println(STR_INFO_LBL[6]);
            pw.println("\t" + STR_CRED_MARK + " " + str_fn);
            pw.println(STR_INFO_LBL[7]);
            pw.println("\t" + STR_CRED_MARK + " " + mn_temp);
            pw.println(STR_INFO_LBL[8]);
            pw.println("\t" + STR_CRED_MARK + " " + str_ln);
            pw.println(STR_INFO_LBL[9]);
            pw.println("\t" + STR_CRED_MARK + " " + str_sex);
            pw.println(STR_INFO_LBL[10]);
            pw.println("\t" + STR_CRED_MARK + " " + str_bday);
            pw.println(STR_INFO_LBL[11]);
            pw.println("\t" + STR_CRED_MARK + " " + str_mob_num);

            pw.println();
            pw.println();
            pw.println(STR_SEC_LBL[2]);
            pw.println();
            pw.println();
            for (int i = 0; i < str_log.length; i++) {
                pw.println("> Log Entry # " + (i + 1));
                pw.println("\t" + STR_CRED_MARK + " " + str_log[i]);
            }
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
