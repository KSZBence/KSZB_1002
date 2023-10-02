
package kartyatrukk;

import java.util.Scanner;


public class Kartyatrukk {
    Scanner sc = new Scanner(System.in);
    String[] pakli = new String[22];
    public static void main(String[] args) {
        new Kartyatrukk().indit();
        
    }
    
    public void indit(){
        kirak();
        for (int i = 0; i < pakli.length; i++) {
            System.out.println(pakli[i]);
        }
    }
    
    public void kirak(){
        String[] ertekek = {"A", "Fel", "Als", "X", "IX", "VIII"};
        String[] szinek = {"Sz","Z", "T", "M"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; i < 22 && e<ertekek.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }
        
    }
    
}
