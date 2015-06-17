/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.ImageIcon;

/**
 *
 * @author Sachi
 */
public class Player{
    String name;
    ImageIcon icon;
    Tictype type;    //type is either dot or cross
    
    public enum Tictype{
        DOT,CROSS;
    }
    
    public Player(String n, Tictype t){
        name=n;
        type=t;
        if(t.equals(Tictype.DOT)){
            icon=new ImageIcon(getClass().getResource("/Resources/dot.png"));
        }
        else{
         icon=new ImageIcon(getClass().getResource("/Resources/cross.png"));   
        }
    }
    
    public ImageIcon geticon(){
        return icon;
    }
    
    public String getname(){
        return name;
    }
}
