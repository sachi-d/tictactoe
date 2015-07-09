/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Sachi
 */
public class Player {

    String name;
    Icon icon;
    Tictype type;    //type is either dot or cross

    public enum Tictype {

        DOT, CROSS;
    }

    public Player(String n, Tictype t) {
        name = n;
        type = t;
        if (t.equals(Tictype.DOT)) {
            icon = new ImageIcon(getClass().getResource("/Resources/finaldot.gif"));
        } else {
            icon = new ImageIcon(getClass().getResource("/Resources/finalcross.gif"));
        }
    }

    public Icon geticon() {
        return this.icon;
    }

    public String getname() {
        return name;
    }
}
