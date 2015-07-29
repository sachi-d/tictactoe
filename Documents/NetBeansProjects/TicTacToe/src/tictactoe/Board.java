/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import tictactoe.Player;

/**
 *
 * @author Sachi
 */
public class Board extends javax.swing.JFrame {

    Player activeplayer;
    Player p1;
    Player p2;
    StartGame startpane;
    JLabel p;
    JPanel bigb;
    boolean issingle;
    TicTacToe newgame;
    int clickcount;
    JDBC connection;

    /**
     * Creates new form Board
     *
     * @param pl1
     * @param pl2
     * @param game
     */
    public Board(Player pl1, Player pl2, StartGame game) {
        
        connection=new JDBC();
        newgame= new TicTacToe();
        startpane = game;
        p1 = pl1;
        activeplayer = p1;

        p2 = pl2;

        getContentPane().setBackground(Color.white);

        initComponents();
        
        
        
        startup();
        
        setLocationRelativeTo(null);
    }

    private void startup() {
        dance1.setVisible(false);
        dance2.setVisible(false);
        namelabel1.setText(p1.getname());
        namelabel2.setText(p2.getname());
        p1score.setText(String.valueOf(p1.getScore()));
        if(!issingle){
            p2score.setText(String.valueOf(p2.getScore()));
        }
        jButton1.setBackground(new Color(250,105,0));
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        
        playername.setText(activeplayer.getname() + "'s chance");
        final JPanel board = new JPanel(new GridLayout(3, 3, 5, 5));
        board.setBackground(new Color(100,200,220));
        for (int i = 0; i < 9; i++) {
            final int j = i;
            final JButton but = new JButton();
            newgame.buts[i] = but;
            newgame.newboard = this;
            but.setPreferredSize(new Dimension(60, 60));
            but.setBackground(Color.WHITE);
            but.setContentAreaFilled(false);
            but.setOpaque(true);
            but.setActionCommand(null);
            but.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    clickcount++;
                    but.setActionCommand(activeplayer.getname());
                    but.setEnabled(false);
                    but.setDisabledIcon(activeplayer.geticon());
                    but.setIcon(activeplayer.geticon());
                    if (!issingle) {
                        if (activeplayer == p1) {
                            playername.setText(p2.getname() + "'s chance");
                        } else {
                            playername.setText(p1.getname() + "'s chance");
                        }
                    }
                    if (newgame.checkwin(j)) {
                        for (int b = 0; b < 9; b++) {
                            newgame.buts[b].setEnabled(false);
                        }
                        jButton1.setText("New Game");
                        jButton1.setContentAreaFilled(false);
                        jButton1.setOpaque(true);
                        dance1.setVisible(true);
                        dance2.setVisible(true);
                        playername.setText("Congratulations!!  " + activeplayer.getname() + " wins");
                        activeplayer.updateScore(true);
                    } else {
                        if (clickcount == 9) {
                            playername.setText("Draw");
                            return;
                        }
                        changeplayer();
                    }
                }
            });
            board.add(but);
        }

        bigbb.add(board, BorderLayout.CENTER);
        board.setVisible(true);
    }

    public void setplayertype(Boolean sing){
        issingle=sing;
    }

    private void changeplayer() {
        if (activeplayer == p1) {
            activeplayer = p2;
        } else {
            activeplayer = p1;
        }
        if (issingle) {
            int num = newgame.computerdecision();
            //do something to hold the computer decision for about a second-----------------------------------------
            
            newgame.buts[num].setActionCommand(activeplayer.getname());
            newgame.buts[num].setEnabled(false);
            newgame.buts[num].setDisabledIcon(activeplayer.geticon());
            newgame.buts[num].setIcon(activeplayer.geticon());
            clickcount++;
            if (newgame.checkwin(num)) {
                for (int b = 0; b < 9; b++) {
                    newgame.buts[b].setEnabled(false);
                }
                jButton1.setText("New Game");
                jButton1.setContentAreaFilled(false);
                jButton1.setOpaque(true);
                dance1.setVisible(true);
                dance2.setVisible(true);
                playername.setText("Computer wins! Try again!");
            } else {
                if (clickcount == 9) {
                    playername.setText("Draw");
                }
            }
            activeplayer = p1;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        playername = new javax.swing.JLabel();
        bigbb = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        dance1 = new javax.swing.JLabel();
        dance2 = new javax.swing.JLabel();
        dance3 = new javax.swing.JLabel();
        dance4 = new javax.swing.JLabel();
        namelabel1 = new javax.swing.JLabel();
        namelabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        p1score = new javax.swing.JLabel();
        p2score = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        playername.setBackground(new java.awt.Color(43, 87, 151));
        playername.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        playername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        bigbb.setBackground(new java.awt.Color(250, 105, 0));
        bigbb.setAutoscrolls(true);
        bigbb.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(new java.awt.Color(250, 105, 0));
        jButton1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jButton1.setText("Go Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        dance1.setBackground(new java.awt.Color(235, 101, 160));
        dance1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dance1.gif"))); // NOI18N

        dance2.setBackground(new java.awt.Color(235, 101, 160));
        dance2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dance2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/dance2.gif"))); // NOI18N

        dance3.setBackground(new java.awt.Color(155, 83, 156));
        dance3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dance3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/finaldot.gif"))); // NOI18N
        dance3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dance4.setBackground(new java.awt.Color(155, 83, 156));
        dance4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dance4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/finalcross.gif"))); // NOI18N
        dance4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        namelabel1.setBackground(new java.awt.Color(43, 87, 151));
        namelabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        namelabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        namelabel2.setBackground(new java.awt.Color(43, 87, 151));
        namelabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        namelabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setBackground(new java.awt.Color(250, 105, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jLabel1.setOpaque(true);

        p1score.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        p1score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1score.setText(" ");

        p2score.setBackground(new java.awt.Color(255, 255, 255));
        p2score.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        p2score.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Score");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Score");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(dance1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(namelabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(dance3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1score, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(playername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bigbb, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dance2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namelabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dance4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p2score, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dance2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namelabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dance4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p2score, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bigbb, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dance1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(namelabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dance3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p1score, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);

        startpane.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /*
//         * Set the Nimbus look and feel
//         */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /*
//         * If Nimbus (introduced in Java SE 6) is not available, stay with the
//         * default look and feel. For details see
//         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /*
//         * Create and display the form
//         */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//
//            public void run() {
//                new Board().setVisible(true);
//            }
//        });
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bigbb;
    private javax.swing.JLabel dance1;
    private javax.swing.JLabel dance2;
    private javax.swing.JLabel dance3;
    private javax.swing.JLabel dance4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel namelabel1;
    private javax.swing.JLabel namelabel2;
    private javax.swing.JLabel p1score;
    private javax.swing.JLabel p2score;
    private javax.swing.JLabel playername;
    // End of variables declaration//GEN-END:variables
}
