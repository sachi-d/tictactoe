/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListCellRenderer;
import org.apache.log4j.Logger;

/**
 *
 * @author Sachi
 */
public class StartGame extends javax.swing.JFrame {

    /**
     * Creates new form StartGame
     */
    private static final Logger logger = Logger.getLogger(StartGame.class);
    boolean issingle = true;
    JDBC connection;
    Player player1;
    Player player2;

    public StartGame() {

        connection = new JDBC();
        
        getContentPane().setBackground(Color.white);
        initComponents();
        //add background pic
        ImagePanel board = new ImagePanel(new ImageIcon(getClass().getResource("/Resources/board.jpg")).getImage());
        add(board);
        
        try {
            ResultSet rs = connection.getData("SELECT * FROM users");

            while (rs.next()) {
                player1list.addItem(rs.getString(2));

                player2list.addItem(rs.getString(2));
            }
            player1list.removeItemAt(0);
            player2list.removeItemAt(0);

        } catch (Exception ex) {

        }

        startbut.setContentAreaFilled(false);
        startbut.setOpaque(true);
        playertype.setRenderer(new MyComboBoxRenderer());
        difficulty.setRenderer(new MyComboBoxRenderer());

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        startbut = new javax.swing.JButton();
        difficulty = new javax.swing.JComboBox();
        playertype = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pl1name = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pl2name = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pl2newuser = new javax.swing.JRadioButton();
        pl2exist = new javax.swing.JRadioButton();
        player2list = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        pl1newuser = new javax.swing.JRadioButton();
        pl1exist = new javax.swing.JRadioButton();
        player1list = new javax.swing.JComboBox();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        startbut.setBackground(new java.awt.Color(100, 200, 220));
        startbut.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        startbut.setForeground(new java.awt.Color(255, 255, 255));
        startbut.setText("Start Game!");
        startbut.setBorder(null);
        startbut.setOpaque(false);
        startbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startbutActionPerformed(evt);
            }
        });

        difficulty.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        difficulty.setForeground(new java.awt.Color(250, 105, 0));
        difficulty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easy", "Okay", "Difficult" }));
        difficulty.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(100, 200, 220), 5));
        difficulty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                difficultyActionPerformed(evt);
            }
        });

        playertype.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        playertype.setForeground(new java.awt.Color(250, 105, 0));
        playertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single Player", "Two Players" }));
        playertype.setSelectedItem(0);
        playertype.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 105, 0), 4));
        playertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playertypeActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(250, 105, 0));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Tic Tac Toe");
        jLabel3.setOpaque(true);

        jPanel4.setBackground(new java.awt.Color(250, 105, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(120, 44));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player1 name");

        pl1name.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pl1name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pl1name)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pl1name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(100, 200, 220));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player2 name");

        pl2name.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pl2name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pl2name.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pl2name)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(pl2name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(250, 105, 0));

        pl2newuser.setBackground(new java.awt.Color(250, 105, 0));
        buttonGroup2.add(pl2newuser);
        pl2newuser.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        pl2newuser.setForeground(new java.awt.Color(255, 255, 255));
        pl2newuser.setSelected(true);
        pl2newuser.setText("New User");
        pl2newuser.setEnabled(false);
        pl2newuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pl2newuserActionPerformed(evt);
            }
        });

        pl2exist.setBackground(new java.awt.Color(250, 105, 0));
        buttonGroup2.add(pl2exist);
        pl2exist.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        pl2exist.setForeground(new java.awt.Color(255, 255, 255));
        pl2exist.setText("Existing user");
        pl2exist.setEnabled(false);

        player2list.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        player2list.setEnabled(false);
        player2list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2listActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pl2newuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pl2exist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player2list, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pl2newuser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pl2exist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player2list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(100, 200, 220));

        pl1newuser.setBackground(new java.awt.Color(100, 200, 220));
        buttonGroup3.add(pl1newuser);
        pl1newuser.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        pl1newuser.setForeground(new java.awt.Color(255, 255, 255));
        pl1newuser.setSelected(true);
        pl1newuser.setText("New User");
        pl1newuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pl1newuserActionPerformed(evt);
            }
        });

        pl1exist.setBackground(new java.awt.Color(100, 200, 220));
        buttonGroup3.add(pl1exist);
        pl1exist.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        pl1exist.setForeground(new java.awt.Color(255, 255, 255));
        pl1exist.setText("Existing user");

        player1list.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        player1list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1listActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pl1newuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pl1exist, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(player1list, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(pl1newuser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pl1exist)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(player1list, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(startbut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playertype, 0, 125, Short.MAX_VALUE)
                            .addComponent(difficulty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(playertype, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(difficulty, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(startbut, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JDBC getConnection() {
        return connection;
    }


    private void startbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startbutActionPerformed

        if ("".equals(pl1name.getText()) || "".equals(pl2name.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter player names", "Empty player details", JOptionPane.ERROR_MESSAGE);
        } else if (pl1name.getText().equalsIgnoreCase("Computer")) {

            JOptionPane.showMessageDialog(this, "Please enter a different player name", "False player details", JOptionPane.ERROR_MESSAGE);
        } else {

            //get player1 details----
            ResultSet m;
            if (pl1newuser.isSelected()) {
                String player1name = pl1name.getText();
                connection.putData("INSERT INTO users(Name,Score) VALUES ('" + player1name + "','0')");
                try {
                    m = connection.getData("SELECT * FROM users WHERE Name='" + player1name + "'");
                    if (m.next()) {
                        player1 = new Player(m.getString(2), Player.Tictype.DOT, m.getString(1), m.getString(3));
                    }
                } catch (Exception ex) {
                    logger.error("Player 1 new user selection failed");
                }
            } else {
                String player1name = player1list.getSelectedItem().toString();
                try {
                    m = connection.getData("SELECT * FROM users WHERE Name='" + player1name + "' ");
                    if (m.next()) {
                        player1 = new Player(m.getString(2), Player.Tictype.DOT, m.getString(1), m.getString(3));
                    }
                } catch (Exception ex) {
                    logger.error("Player 1 existing user selection failed");
                }
            }

            if (issingle) {
                player2 = new Player("Computer", Player.Tictype.CROSS, "001", "0");
            } else {
                ResultSet n;
                if (pl2newuser.isSelected()) {
                    String player2name = pl2name.getText();
                    connection.putData("INSERT INTO users(Name,Score) VALUES ('" + player2name + "',0");
                    try {
                        n = connection.getData("SELECT * FROM users WHERE Name='" + player2name + "' ");
                        if (n.next()) {
                            player2 = new Player(n.getString(2), Player.Tictype.DOT, n.getString(1), n.getString(3));
                        }
                    } catch (Exception ex) {
                        logger.error("Player 2 new user selection failed");
                    }
                } else {
                    String player2name = player2list.getSelectedItem().toString();
                    try {
                        n = connection.getData("SELECT * FROM users WHERE Name='" + player2name + "' ");
                        if (n.next()) {
                            player2 = new Player(n.getString(2), Player.Tictype.DOT, n.getString(1), n.getString(3));
                        }
                    } catch (Exception ex) {
                        logger.error("Player 2 existing user selection failed");
                    }
                }
            }
            //-------------players defined

            Board newboard = new Board(player1, player2, this);
            newboard.setplayertype(issingle);
            if (difficulty.getSelectedIndex() == 0) {
                newboard.newgame.difficulty = "easy";
            } else if (difficulty.getSelectedIndex() == 1) {
                newboard.newgame.difficulty = "okay";
            } else {
                newboard.newgame.difficulty = "hard";
            }

            this.setVisible(false);
            newboard.setVisible(true);
        }
    }//GEN-LAST:event_startbutActionPerformed

    private void difficultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyActionPerformed
        if (difficulty.getSelectedIndex() == 0) {
            System.out.println("easy");
        }
    }//GEN-LAST:event_difficultyActionPerformed

    private void playertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playertypeActionPerformed
        if (playertype.getSelectedIndex() == 0) {//if single
            pl2name.setText("Computer");
            pl2name.setEditable(false);
            issingle = true;
            difficulty.setEnabled(true);
            pl2newuser.setEnabled(false);
            pl2exist.setEnabled(false);
            player2list.setEnabled(false);
        } else {
            pl2exist.setEnabled(true);
            pl2newuser.setEnabled(true);
            player2list.setEnabled(true);
            pl2name.setEnabled(true);
            pl2name.setEditable(true);
            if (pl2name.getText().equals("Computer")) {
                pl2name.setText("");
            }
            issingle = false;
            difficulty.setEnabled(false);
        }
    }//GEN-LAST:event_playertypeActionPerformed

    private void pl2newuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pl2newuserActionPerformed
        pl2name.setText("");
    }//GEN-LAST:event_pl2newuserActionPerformed

    private void pl1newuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pl1newuserActionPerformed
        pl1name.setText("");
    }//GEN-LAST:event_pl1newuserActionPerformed

    private void player2listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2listActionPerformed
        pl2name.setText(player1list.getSelectedItem().toString());
        pl2exist.setSelected(true);
    }//GEN-LAST:event_player2listActionPerformed

    private void player1listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1listActionPerformed
        pl1name.setText(player1list.getSelectedItem().toString());
        pl1exist.setSelected(true);
    }//GEN-LAST:event_player1listActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox difficulty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButton pl1exist;
    private javax.swing.JTextField pl1name;
    private javax.swing.JRadioButton pl1newuser;
    private javax.swing.JRadioButton pl2exist;
    private javax.swing.JTextField pl2name;
    private javax.swing.JRadioButton pl2newuser;
    private javax.swing.JComboBox player1list;
    private javax.swing.JComboBox player2list;
    private javax.swing.JComboBox playertype;
    private javax.swing.JButton startbut;
    // End of variables declaration//GEN-END:variables

    public class MyComboBoxRenderer extends JLabel implements ListCellRenderer {

        public MyComboBoxRenderer() {

            setOpaque(true);
            //change only selected cell - achini
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean cellHasFocus) {
            setText(value.toString());
            return this;
        }

    }
}
