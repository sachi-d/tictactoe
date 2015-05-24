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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Sachi
 */
public class Board extends javax.swing.JFrame {

    Player activeplayer;
    Player p1;
    Player p2;
    JButton[] buts=new JButton[9];
    JLabel p;
    JPanel bigb;
    /**
     * Creates new form Board
     */
    public Board() {
        
        
        Player me=new Player("Player1", "dot");
        activeplayer=me;
        p1=me;
        Player you=new Player("Player2", "cross");
        p2=you;
        
        
        getContentPane().setBackground(Color.white);
        initComponents();
        startup();
        
        p=playername;
        
        setLocationRelativeTo(null);
    }

    private void startup(){
        final JPanel board=new JPanel(new GridLayout(3, 3,5,5));
        board.setBackground(Color.black);
        for(int i=0;i<9;i++){
            final int j=i;
            final JButton but=new JButton();
            buts[i]=but;
            but.setPreferredSize(new Dimension(120, 120));
            but.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    but.setActionCommand(activeplayer.getname());
                    
                    but.setEnabled(false);
                    but.setDisabledIcon(activeplayer.geticon());
                    but.setIcon(activeplayer.geticon());
                    p.setText(activeplayer.getname());
                    if(checkwin(j)){
                        for(int b=0;b<9;b++){
                            buts[b].setEnabled(false);
                        }
                        p.setText(activeplayer.getname()+"wins");
                    }
                    
                    changeplayer();
                }
            });
            
            board.add(but);
        }
        bigbb.add(board,BorderLayout.CENTER);
        board.setVisible(true);
        pack();
        repaint();
    }
    
    private void changeplayer(){
        if(activeplayer==p1){
            activeplayer=p2;
        }
        else{
            activeplayer=p1;
        }
    }
    private boolean checkwin(int i){
        if(checkrow(i)|| checkcol(i)|| checkdiag(i)){
            return true;
        }
        return false;
    }
    private boolean checkrow(int i){
        String plnm=buts[i].getActionCommand();
        if(i==1 || i==2|| i==0){
            if((plnm.equals(buts[1].getActionCommand()))&&(plnm.equals(buts[2].getActionCommand())) && (plnm.equals(buts[0].getActionCommand()))){
                return true;
            }
        }
        else if(i==4 || i==5|| i==3){
            if((plnm.equals(buts[4].getActionCommand()))&&(plnm.equals(buts[5].getActionCommand())) && (plnm.equals(buts[3].getActionCommand()))){
                return true;
            }
        }
        else if(i==7 || i==8|| i==6){
            if((plnm.equals(buts[7].getActionCommand()))&&(plnm.equals(buts[8].getActionCommand())) && (plnm.equals(buts[6].getActionCommand()))){
                return true;
            }
        }
        return false;
    }
    private boolean checkcol(int i){
        String plnm=buts[i].getActionCommand();
        if(i==3 || i==6|| i==0){
            if((plnm.equals(buts[3].getActionCommand()))&&(plnm.equals(buts[6].getActionCommand())) && (plnm.equals(buts[0].getActionCommand()))){
                return true;
            }
        }
        else if(i==4 || i==7|| i==1){
            if((plnm.equals(buts[4].getActionCommand()))&&(plnm.equals(buts[7].getActionCommand())) && (plnm.equals(buts[1].getActionCommand()))){
                return true;
            }
        }
        else if(i==2 || i==8|| i==5){
            if((plnm.equals(buts[2].getActionCommand()))&&(plnm.equals(buts[8].getActionCommand())) && (plnm.equals(buts[5].getActionCommand()))){
                return true;
            }
        }
        return false;
    }
    private boolean checkdiag(int i){
        String plnm=buts[i].getActionCommand();
        if(i==0 || i==8 ||i==4){
            if((plnm.equals(buts[0].getActionCommand()))&&(plnm.equals(buts[4].getActionCommand())) && (plnm.equals(buts[8].getActionCommand()))){
                return true;
            }
        }
        else if(i==2||i==6||i==4){
            if((plnm.equals(buts[2].getActionCommand()))&&(plnm.equals(buts[6].getActionCommand())) && (plnm.equals(buts[4].getActionCommand()))){
                return true;
            }
        }
            
        return false;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        playername.setBackground(new java.awt.Color(255, 255, 255));

        bigbb.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Restart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bigbb, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playername, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(playername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(bigbb, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        Board bb=new Board();
//        bb.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Board().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bigbb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel playername;
    // End of variables declaration//GEN-END:variables
}
