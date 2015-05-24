/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Sachi
 */
public class Button {
    String type;
    int name;
    
    public Button(int n,String t){
        name=n;
        type=t;
    }

    public int getname(){
        return name;
    }
    public String gettype() {
        return type;
    }
    
    public int getnorth(){
        int n=name;
        if(n<=3){
            n=n+9;
        }
        return n-3;
    }
    
    public int getsouth(){
        int n=name;
        if(n>=7){
            n=n-9;
        }
        return n+3;
    }
    
    public int getwest(){
        int n=name;
        if((n+2)%3==0){
            n=n+3;
        }
        return n-1;
    }
    
    public int geteast(){
        int n=name;
        if(n%3==0){
            n=n-3;
        }
        return n+1;
    }
    
    public int getnortheast(){
        if(name==3 ){
            return 7;
        }
        else if(name==5){
            return 3;
        }
        else if(name==7){
            return 5;
        }
        else{
            return 0;
        }
    }
    
    public int getsoutheast(){
        if(name==1){
            return 5;
        }
        else if(name==5){
            return 9;
        }
        else if(name==9){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public int getsouthwest(){
        if(name==3 ){
            return 5;
        }
        else if(name==5){
            return 7;
        }
        else if(name==7){
            return 3;
        }
        else{
            return 0;
        }
    }

    public int getnorthwest(){
        if(name==1){
            return 9;
        }
        else if(name==9){
            return 5;
        }
        else if(name==5){
            return 1;
        }
        else{
            return 0;
        }
    }
    private boolean ismytype(Button b){
        if (b.gettype()== this.type){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
}
