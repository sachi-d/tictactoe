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

    int id;
    int score;
    String name;
    Icon icon;
    Tictype type;    //type is either dot or cross

    public enum Tictype {

        DOT, CROSS;
    }

    public Player(String n, Tictype t,String Id,String Score) {
        name = n;
        type = t;
        id=Integer.parseInt(Id);
        score=Integer.parseInt(Score);
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

    public int getScore() {
        return score;
    }
    
    public void updateScore(Boolean didwin){
        if(didwin){
            this.score++;
        }
        
        JDBC newcon = new JDBC();
        newcon.putData("UPDATE users SET Score== '" +score+ "'  WHERE UserID= '" +id+ "'  ");
    }
    
}
