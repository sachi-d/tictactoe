/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Sachi
 */
public class TicTacToe {

    JButton[] buts = new JButton[9];
    Board newboard;
    private int nbr1;
    private int nbr2;

    protected boolean checkwin(int i) {
        return checkrow(i) || checkcol(i) || checkdiag(i);
    }

    private void setredborder(int a, int b, int c) {
        buts[a].setBorder(BorderFactory.createLineBorder(Color.red, 5));
        buts[b].setBorder(BorderFactory.createLineBorder(Color.red, 5));
        buts[c].setBorder(BorderFactory.createLineBorder(Color.red, 5));
    }

    private boolean checkdiag(int i) {
        String plnm = buts[i].getActionCommand();

        if (i % 2 == 0) {
            if ((plnm.equals(buts[0].getActionCommand())) && (plnm.equals(buts[4].getActionCommand())) && (plnm.equals(buts[8].getActionCommand()))) {
                setredborder(0, 4, 8);
                return true;
            } else if ((plnm.equals(buts[2].getActionCommand())) && (plnm.equals(buts[6].getActionCommand())) && (plnm.equals(buts[4].getActionCommand()))) {
                setredborder(2, 4, 6);
                return true;
            }
        }

        return false;
    }

    private boolean checkrow(int n) {
        String plnm = buts[n].getActionCommand();
        int k1 = -1;
        int k2 = 1;
        if (n % 3 == 0) {
            k1 = 2;
        }
        if ((n + 1) % 3 == 0) {
            k2 = -2;
        }
        nbr1 = n + k1;
        nbr2 = n + k2;
        if (!plnm.equals("") && plnm.equals(buts[n + k1].getActionCommand()) && plnm.equals(buts[n + k2].getActionCommand())) {
            setredborder(n, n + k1, n + k2);
            return true;
        }
        return false;
    }

    private boolean checkcol(int n) {
        String plnm = buts[n].getActionCommand();
        int k1 = -3;
        int k2 = +3;
        if ((n + 6) < 9) {
            k1 = 3;
            k2 = 6;
        } else if ((n - 6) > -1) {
            k1 = -3;
            k2 = -6;
        }
        nbr1 = n + k1;
        nbr2 = n + k2;
        if (!plnm.equals("") && plnm.equals(buts[n + k1].getActionCommand()) && plnm.equals(buts[n + k2].getActionCommand())) {
            setredborder(n, n + k1, n + k2);
            return true;
        }
        return false;
    }

    protected int computerdecision() {
        int out = 100;
        for (int i = 0; i < 9; i++) {
            if (buts[i].isEnabled()) {
                checkcol(i);//update horizontal neighbors
                System.out.println("checking col- "+i);
                if (buts[nbr1].getActionCommand().equals(buts[nbr2].getActionCommand()) && !buts[nbr1].getActionCommand().equals("")) {
                    return i;
                }
                checkrow(i);//update vertical neighbors
                
                if (buts[nbr1].getActionCommand().equals(buts[nbr2].getActionCommand()) && !buts[nbr1].getActionCommand().equals("")) {
                    return i;
                }
                //check each diagonal member
                if(i!=4 && !buts[4].getActionCommand().equals("")){
                    if (i == 0 && (buts[4].getActionCommand().equals(buts[8].getActionCommand()))) {
                    return 0;
                } else if (i == 2 && (buts[4].getActionCommand().equals(buts[6].getActionCommand())) ) {
                    return 2;
                } else if (i == 6 && (buts[4].getActionCommand().equals(buts[2].getActionCommand())) ) {
                    return 6;
                } else if (i == 8 && (buts[4].getActionCommand().equals(buts[0].getActionCommand())) ) {
                    return 8;
                }
                }
                if (i == 4 && ((buts[8].getActionCommand().equals(buts[0].getActionCommand()) && !buts[0].getActionCommand().equals("")) || (buts[2].getActionCommand().equals(buts[6].getActionCommand()) && !buts[nbr1].getActionCommand().equals("")))) {
                    return 4;
                }
            }

        }
        //above didn't work
        if (buts[4].isEnabled()) {
            return 4;
        }

        for (int j = 0; j < 9; j = j + 2) {//choose a corner
            if (buts[j].isEnabled()) {
                return j;
            }

        }
        for (int j = 1; j < 8; j = j + 2) {
            if (buts[j].isEnabled()) {
                return j;
            }
        }
        if (out > 8) {
            System.out.println("wrong");
            out = 7;
        }
        return out;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicTacToe n = new TicTacToe();
        for (int i = 0; i < 9; i++) {
            n.checkcol(i);
            System.out.println("--------");
        }
    }
}
