/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Sachi
 */
public class Player {
    String name;
    ImageIcon icon;
    String type;    //type is either dot or cross
    
    public Player(String n, String t){
        name=n;
        type=t;
        if(t.equals("dot")){
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
