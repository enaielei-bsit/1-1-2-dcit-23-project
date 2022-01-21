package dcit_23_bsit_1_1_project_nila_final;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
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
        pnl_fn = new javax.swing.JPanel();
        txtfld_fn = new javax.swing.JTextField();
        pnl_add_info = new javax.swing.JPanel();
        pnl_add_info_inner = new javax.swing.JPanel();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_rec_access_bel = new javax.swing.JLabel();
        lbl_acc_num = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_rec_access = new javax.swing.JLabel();
        lbl_acc_num_bel = new javax.swing.JLabel();
        pnl_trnsctns = new javax.swing.JPanel();
        pnl_btns = new javax.swing.JPanel();
        btn_load_log = new javax.swing.JButton();
        btn_sort = new javax.swing.JButton();
        btn_prev_pg = new javax.swing.JButton();
        btn_next_pg = new javax.swing.JButton();
        lbl_page_stat = new javax.swing.JLabel();
        txtfld_header_trnsctns = new javax.swing.JTextField();
        scrllpn_tbl = new javax.swing.JScrollPane();
        tbl_log = new javax.swing.JTable();
        pnl_bal = new javax.swing.JPanel();
        txtfld_header_bal = new javax.swing.JTextField();
        txtfld_bal = new javax.swing.JTextField();
        menubar_main = new javax.swing.JMenuBar();
        menu_main = new javax.swing.JMenu();
        menu_sub = new javax.swing.JMenu();
        menuitem_trnsct = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuitem_quick_with = new javax.swing.JMenuItem();
        menuitem_quick_dep = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuitem_sign_out = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ATM | Dashboard");
        setResizable(false);

        pnl_main.setBackground(new java.awt.Color(51, 51, 51));

        pnl_fn.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, null, new java.awt.Color(51, 51, 51)), "ACCOUNT USER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Black", 0, 10), new java.awt.Color(255, 255, 255))); // NOI18N
        pnl_fn.setOpaque(false);

        txtfld_fn.setEditable(false);
        txtfld_fn.setBackground(new java.awt.Color(65, 65, 65));
        txtfld_fn.setFont(new java.awt.Font("Arial Black", 1, 13)); // NOI18N
        txtfld_fn.setForeground(new java.awt.Color(204, 255, 51));
        txtfld_fn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_fn.setText("NOMMEL ISANAR LAVAPIE AMOLAT");
        txtfld_fn.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));
        txtfld_fn.setDisabledTextColor(new java.awt.Color(204, 255, 0));
        txtfld_fn.setEnabled(false);
        txtfld_fn.setFocusable(false);

        javax.swing.GroupLayout pnl_fnLayout = new javax.swing.GroupLayout(pnl_fn);
        pnl_fn.setLayout(pnl_fnLayout);
        pnl_fnLayout.setHorizontalGroup(
            pnl_fnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfld_fn, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_fnLayout.setVerticalGroup(
            pnl_fnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fnLayout.createSequentialGroup()
                .addComponent(txtfld_fn, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_add_info.setBackground(new java.awt.Color(65, 65, 65));
        pnl_add_info.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));
        pnl_add_info.setOpaque(false);

        pnl_add_info_inner.setOpaque(false);

        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));

        lbl_rec_access_bel.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_rec_access_bel.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rec_access_bel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rec_access_bel.setText("RECENT ACCOUNT ACCESS");

        lbl_acc_num.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lbl_acc_num.setForeground(new java.awt.Color(255, 255, 255));
        lbl_acc_num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_acc_num.setText("SAVINGS ACCOUNT NUMBER");

        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));

        lbl_rec_access.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        lbl_rec_access.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rec_access.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rec_access.setText("TIME LOG");

        lbl_acc_num_bel.setFont(new java.awt.Font("Arial Black", 0, 9)); // NOI18N
        lbl_acc_num_bel.setForeground(new java.awt.Color(255, 255, 255));
        lbl_acc_num_bel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_acc_num_bel.setText("ACCOUNT NUMBER");

        javax.swing.GroupLayout pnl_add_info_innerLayout = new javax.swing.GroupLayout(pnl_add_info_inner);
        pnl_add_info_inner.setLayout(pnl_add_info_innerLayout);
        pnl_add_info_innerLayout.setHorizontalGroup(
            pnl_add_info_innerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_add_info_innerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(pnl_add_info_innerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5)
                    .addComponent(lbl_acc_num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_acc_num_bel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_rec_access, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_rec_access_bel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4))
                .addGap(40, 40, 40))
        );
        pnl_add_info_innerLayout.setVerticalGroup(
            pnl_add_info_innerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_info_innerLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_acc_num)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_acc_num_bel)
                .addGap(18, 18, 18)
                .addComponent(lbl_rec_access)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_rec_access_bel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnl_add_infoLayout = new javax.swing.GroupLayout(pnl_add_info);
        pnl_add_info.setLayout(pnl_add_infoLayout);
        pnl_add_infoLayout.setHorizontalGroup(
            pnl_add_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_add_info_inner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_add_infoLayout.setVerticalGroup(
            pnl_add_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_add_infoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_add_info_inner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_trnsctns.setBackground(new java.awt.Color(65, 65, 65));
        pnl_trnsctns.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));

        pnl_btns.setOpaque(false);

        btn_load_log.setBackground(new java.awt.Color(255, 255, 255));
        btn_load_log.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btn_load_log.setForeground(new java.awt.Color(51, 51, 51));
        btn_load_log.setText("LOAD TRANSACTIONS");
        btn_load_log.setToolTipText("View all transactions made by the user");
        btn_load_log.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_load_log.setBorderPainted(false);
        btn_load_log.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_sortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_sortFocusLost(evt);
            }
        });
        btn_load_log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sortMouseExited(evt);
            }
        });
        btn_load_log.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_load_logActionPerformed(evt);
            }
        });

        btn_sort.setBackground(new java.awt.Color(255, 255, 255));
        btn_sort.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_sort.setForeground(new java.awt.Color(51, 51, 51));
        btn_sort.setText("\u21f1");
        btn_sort.setToolTipText("Sort the list from newest to oldest");
        btn_sort.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_sort.setBorderPainted(false);
        btn_sort.setEnabled(false);
        btn_sort.setFocusable(false);
        btn_sort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_sortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_sortFocusLost(evt);
            }
        });
        btn_sort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sortMouseExited(evt);
            }
        });
        btn_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sortActionPerformed(evt);
            }
        });

        btn_prev_pg.setBackground(new java.awt.Color(255, 255, 255));
        btn_prev_pg.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_prev_pg.setForeground(new java.awt.Color(51, 51, 51));
        btn_prev_pg.setText("\u2b9c");
        btn_prev_pg.setToolTipText("Go to the previous page of transactions");
        btn_prev_pg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_prev_pg.setBorderPainted(false);
        btn_prev_pg.setEnabled(false);
        btn_prev_pg.setFocusable(false);
        btn_prev_pg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_sortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_sortFocusLost(evt);
            }
        });
        btn_prev_pg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sortMouseExited(evt);
            }
        });
        btn_prev_pg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prev_pgActionPerformed(evt);
            }
        });

        btn_next_pg.setBackground(new java.awt.Color(255, 255, 255));
        btn_next_pg.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btn_next_pg.setForeground(new java.awt.Color(51, 51, 51));
        btn_next_pg.setText("\u2b9e");
        btn_next_pg.setToolTipText("Go to the next page of transactions");
        btn_next_pg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        btn_next_pg.setBorderPainted(false);
        btn_next_pg.setEnabled(false);
        btn_next_pg.setFocusable(false);
        btn_next_pg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_sortFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_sortFocusLost(evt);
            }
        });
        btn_next_pg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_sortMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_sortMouseExited(evt);
            }
        });
        btn_next_pg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_next_pgActionPerformed(evt);
            }
        });

        lbl_page_stat.setBackground(new java.awt.Color(250, 250, 250));
        lbl_page_stat.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        lbl_page_stat.setForeground(new java.awt.Color(51, 51, 51));
        lbl_page_stat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_page_stat.setText(" / ");
        lbl_page_stat.setToolTipText("Page Status");
        lbl_page_stat.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));
        lbl_page_stat.setOpaque(true);

        javax.swing.GroupLayout pnl_btnsLayout = new javax.swing.GroupLayout(pnl_btns);
        pnl_btns.setLayout(pnl_btnsLayout);
        pnl_btnsLayout.setHorizontalGroup(
            pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_btnsLayout.createSequentialGroup()
                .addComponent(btn_load_log, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_prev_pg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_page_stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_next_pg, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_btnsLayout.setVerticalGroup(
            pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_load_log, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(btn_next_pg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_sort))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_btnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbl_page_stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_prev_pg))
        );

        txtfld_header_trnsctns.setEditable(false);
        txtfld_header_trnsctns.setBackground(new java.awt.Color(153, 255, 0));
        txtfld_header_trnsctns.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtfld_header_trnsctns.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_header_trnsctns.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_header_trnsctns.setText("TRANSACTION HISTORY");
        txtfld_header_trnsctns.setBorder(null);
        txtfld_header_trnsctns.setFocusable(false);
        txtfld_header_trnsctns.setPreferredSize(new java.awt.Dimension(255, 17));

        scrllpn_tbl.setBackground(new java.awt.Color(51, 51, 51));
        scrllpn_tbl.setOpaque(false);

        tbl_log.setBackground(new java.awt.Color(51, 51, 51));
        tbl_log.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        tbl_log.setForeground(new java.awt.Color(255, 255, 255));
        tbl_log.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "                  DATE", "            TRANSACTION", "                 AMOUNT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_log.setEnabled(false);
        tbl_log.setSelectionBackground(new java.awt.Color(204, 255, 153));
        tbl_log.setSelectionForeground(new java.awt.Color(51, 51, 51));
        scrllpn_tbl.setViewportView(tbl_log);

        javax.swing.GroupLayout pnl_trnsctnsLayout = new javax.swing.GroupLayout(pnl_trnsctns);
        pnl_trnsctns.setLayout(pnl_trnsctnsLayout);
        pnl_trnsctnsLayout.setHorizontalGroup(
            pnl_trnsctnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_trnsctnsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_trnsctnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrllpn_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_btns, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(txtfld_header_trnsctns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_trnsctnsLayout.setVerticalGroup(
            pnl_trnsctnsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_trnsctnsLayout.createSequentialGroup()
                .addComponent(txtfld_header_trnsctns, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrllpn_tbl, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_btns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnl_bal.setBackground(new java.awt.Color(65, 65, 65));
        pnl_bal.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(51, 51, 51)));

        txtfld_header_bal.setEditable(false);
        txtfld_header_bal.setBackground(new java.awt.Color(153, 255, 0));
        txtfld_header_bal.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        txtfld_header_bal.setForeground(new java.awt.Color(51, 51, 51));
        txtfld_header_bal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_header_bal.setText("ACCOUNT BALANCE");
        txtfld_header_bal.setBorder(null);
        txtfld_header_bal.setFocusable(false);
        txtfld_header_bal.setPreferredSize(new java.awt.Dimension(255, 17));

        txtfld_bal.setEditable(false);
        txtfld_bal.setFont(new java.awt.Font("Consolas", 1, 45)); // NOI18N
        txtfld_bal.setForeground(new java.awt.Color(255, 255, 255));
        txtfld_bal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfld_bal.setText("2000.00");
        txtfld_bal.setBorder(null);
        txtfld_bal.setFocusable(false);
        txtfld_bal.setOpaque(false);

        javax.swing.GroupLayout pnl_balLayout = new javax.swing.GroupLayout(pnl_bal);
        pnl_bal.setLayout(pnl_balLayout);
        pnl_balLayout.setHorizontalGroup(
            pnl_balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_balLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfld_bal)
                .addContainerGap())
            .addComponent(txtfld_header_bal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_balLayout.setVerticalGroup(
            pnl_balLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_balLayout.createSequentialGroup()
                .addComponent(txtfld_header_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtfld_bal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_mainLayout = new javax.swing.GroupLayout(pnl_main);
        pnl_main.setLayout(pnl_mainLayout);
        pnl_mainLayout.setHorizontalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_add_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_fn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_bal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_trnsctns, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_mainLayout.setVerticalGroup(
            pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnl_trnsctns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_mainLayout.createSequentialGroup()
                        .addComponent(pnl_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnl_add_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menubar_main.setBackground(new java.awt.Color(153, 255, 0));
        menubar_main.setBorder(null);
        menubar_main.setPreferredSize(new java.awt.Dimension(80, 35));

        menu_main.setBackground(new java.awt.Color(65, 65, 65));
        menu_main.setForeground(new java.awt.Color(67, 242, 120));
        menu_main.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        menu_main.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_main.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_main.setLabel("ACCOUNT MENU");
        menu_main.setMargin(new java.awt.Insets(2, 8, 2, 8));
        menu_main.setOpaque(true);
        menu_main.setPreferredSize(new java.awt.Dimension(138, 20));
        menu_main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_mainActionPerformed(evt);
            }
        });

        menu_sub.setBackground(new java.awt.Color(51, 51, 51));
        menu_sub.setBorder(null);
        menu_sub.setForeground(new java.awt.Color(255, 255, 255));
        menu_sub.setText("ATM Transactions");
        menu_sub.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        menu_sub.setHideActionText(true);
        menu_sub.setIconTextGap(0);
        menu_sub.setMargin(new java.awt.Insets(2, 12, 2, 2));
        menu_sub.setOpaque(true);

        menuitem_trnsct.setBackground(new java.awt.Color(51, 51, 51));
        menuitem_trnsct.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        menuitem_trnsct.setForeground(new java.awt.Color(255, 255, 255));
        menuitem_trnsct.setText("ATM Transactions Page");
        menuitem_trnsct.setToolTipText("Open the ATM transaction page");
        menuitem_trnsct.setOpaque(true);
        menuitem_trnsct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_trnsctActionPerformed(evt);
            }
        });
        menu_sub.add(menuitem_trnsct);

        jSeparator1.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator1.setForeground(new java.awt.Color(153, 255, 0));
        jSeparator1.setOpaque(true);
        menu_sub.add(jSeparator1);

        menuitem_quick_with.setBackground(new java.awt.Color(51, 51, 51));
        menuitem_quick_with.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        menuitem_quick_with.setForeground(new java.awt.Color(255, 255, 255));
        menuitem_quick_with.setText("Quick Withdraw");
        menuitem_quick_with.setToolTipText("Quickly extract a specific amount of cash from the account");
        menuitem_quick_with.setOpaque(true);
        menuitem_quick_with.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_quick_withActionPerformed(evt);
            }
        });
        menu_sub.add(menuitem_quick_with);

        menuitem_quick_dep.setBackground(new java.awt.Color(51, 51, 51));
        menuitem_quick_dep.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        menuitem_quick_dep.setForeground(new java.awt.Color(255, 255, 255));
        menuitem_quick_dep.setText("Quick Deposit");
        menuitem_quick_dep.setToolTipText("Quickly load a specific amount of cash to the account");
        menuitem_quick_dep.setOpaque(true);
        menuitem_quick_dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_quick_depActionPerformed(evt);
            }
        });
        menu_sub.add(menuitem_quick_dep);

        menu_main.add(menu_sub);

        jSeparator2.setBackground(new java.awt.Color(51, 51, 51));
        jSeparator2.setForeground(new java.awt.Color(153, 255, 0));
        jSeparator2.setOpaque(true);
        menu_main.add(jSeparator2);

        menuitem_sign_out.setBackground(new java.awt.Color(51, 51, 51));
        menuitem_sign_out.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        menuitem_sign_out.setForeground(new java.awt.Color(255, 255, 255));
        menuitem_sign_out.setToolTipText("Quit current session and go back to sign-in page");
        menuitem_sign_out.setBorder(null);
        menuitem_sign_out.setIconTextGap(0);
        menuitem_sign_out.setLabel("Sign-Out");
        menuitem_sign_out.setMargin(new java.awt.Insets(2, 12, 2, 2));
        menuitem_sign_out.setOpaque(true);
        menuitem_sign_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuitem_sign_outActionPerformed(evt);
            }
        });
        menu_main.add(menuitem_sign_out);

        menubar_main.add(menu_main);

        setJMenuBar(menubar_main);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuitem_trnsctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_trnsctActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_menuitem_trnsctActionPerformed

    private void menuitem_quick_withActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_quick_withActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_menuitem_quick_withActionPerformed

    private void menuitem_quick_depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_quick_depActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_menuitem_quick_depActionPerformed

    private void menuitem_sign_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuitem_sign_outActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_menuitem_sign_outActionPerformed

    private void menu_mainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_mainActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_menu_mainActionPerformed

    private void btn_load_logActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_load_logActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_load_logActionPerformed

    private void btn_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sortActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_sortActionPerformed

    private void btn_prev_pgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prev_pgActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_prev_pgActionPerformed

    private void btn_next_pgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_next_pgActionPerformed
        new Main().actionPerformed(evt);
    }//GEN-LAST:event_btn_next_pgActionPerformed
    Color fg = new Color(51, 51, 51), bg = new Color(255, 255, 255), oc = null, oc2 = new Color(67, 242, 120);
    private void btn_sortMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sortMouseEntered
        if (evt.getSource() == btn_load_log) {
            btn_load_log.setForeground(oc);
            btn_load_log.setBackground(oc2);
        } else if (evt.getSource() == btn_sort) {
            btn_sort.setForeground(oc);
            btn_sort.setBackground(oc2);
        } else if (evt.getSource() == btn_prev_pg) {
            btn_prev_pg.setForeground(oc);
            btn_prev_pg.setBackground(oc2);
        } else if (evt.getSource() == btn_next_pg) {
            btn_next_pg.setForeground(oc);
            btn_next_pg.setBackground(oc2);
        }
    }//GEN-LAST:event_btn_sortMouseEntered

    private void btn_sortMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sortMouseExited
        if (evt.getSource() == btn_load_log) {
            btn_load_log.setForeground(fg);
            btn_load_log.setBackground(bg);
        } else if (evt.getSource() == btn_sort) {
            btn_sort.setForeground(fg);
            btn_sort.setBackground(bg);
        } else if (evt.getSource() == btn_prev_pg) {
            btn_prev_pg.setForeground(fg);
            btn_prev_pg.setBackground(bg);
        } else if (evt.getSource() == btn_next_pg) {
            btn_next_pg.setForeground(fg);
            btn_next_pg.setBackground(bg);
        }

    }//GEN-LAST:event_btn_sortMouseExited

    private void btn_sortFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_sortFocusGained
        if (evt.getSource() == btn_load_log) {
            btn_load_log.setForeground(oc);
            btn_load_log.setBackground(oc2);
        } else if (evt.getSource() == btn_sort) {
            btn_sort.setForeground(oc);
            btn_sort.setBackground(oc2);
        } else if (evt.getSource() == btn_prev_pg) {
            btn_prev_pg.setForeground(oc);
            btn_prev_pg.setBackground(oc2);
        } else if (evt.getSource() == btn_next_pg) {
            btn_next_pg.setForeground(oc);
            btn_next_pg.setBackground(oc2);
        }
    }//GEN-LAST:event_btn_sortFocusGained

    private void btn_sortFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_sortFocusLost
        if (evt.getSource() == btn_load_log) {
            btn_load_log.setForeground(fg);
            btn_load_log.setBackground(bg);
        } else if (evt.getSource() == btn_sort) {
            btn_sort.setForeground(fg);
            btn_sort.setBackground(bg);
        } else if (evt.getSource() == btn_prev_pg) {
            btn_prev_pg.setForeground(fg);
            btn_prev_pg.setBackground(bg);
        } else if (evt.getSource() == btn_next_pg) {
            btn_next_pg.setForeground(fg);
            btn_next_pg.setBackground(bg);
        }
    }//GEN-LAST:event_btn_sortFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_load_log;
    public javax.swing.JButton btn_next_pg;
    public javax.swing.JButton btn_prev_pg;
    public javax.swing.JButton btn_sort;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JLabel lbl_acc_num;
    public javax.swing.JLabel lbl_acc_num_bel;
    public javax.swing.JLabel lbl_page_stat;
    public javax.swing.JLabel lbl_rec_access;
    private javax.swing.JLabel lbl_rec_access_bel;
    public javax.swing.JMenu menu_main;
    public javax.swing.JMenu menu_sub;
    public javax.swing.JMenuBar menubar_main;
    public javax.swing.JMenuItem menuitem_quick_dep;
    public javax.swing.JMenuItem menuitem_quick_with;
    public javax.swing.JMenuItem menuitem_sign_out;
    public javax.swing.JMenuItem menuitem_trnsct;
    private javax.swing.JPanel pnl_add_info;
    private javax.swing.JPanel pnl_add_info_inner;
    private javax.swing.JPanel pnl_bal;
    private javax.swing.JPanel pnl_btns;
    private javax.swing.JPanel pnl_fn;
    private javax.swing.JPanel pnl_main;
    private javax.swing.JPanel pnl_trnsctns;
    private javax.swing.JScrollPane scrllpn_tbl;
    public javax.swing.JTable tbl_log;
    public javax.swing.JTextField txtfld_bal;
    public javax.swing.JTextField txtfld_fn;
    private javax.swing.JTextField txtfld_header_bal;
    private javax.swing.JTextField txtfld_header_trnsctns;
    // End of variables declaration//GEN-END:variables
}
