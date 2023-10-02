
package kartyatrukk;

import java.util.Scanner;


public class Kartyatrukk {
    Scanner sc = new Scanner(System.in);
    String[] pakli = new String[22];
    public static void main(String[] args) {
        new Kartyatrukk().indit();
    }
    
    public void indit(){
        feltolt();
        for (int i = 0; i < 3; i++) {
            kirak();
            kever(melyikoszlop() );
        }
        ezvolt();
    }
    
    public void feltolt(){
        String[] ertekek = {"A", "Fel", "Als", "X", "IX", "VIII"};
        String[] szinek = {"Sz","Z", "T", "M"};
        int i = 1;
        for (String szin : szinek) {
            for (int e = 0; i < 22 && e<ertekek.length; e++) {
                pakli[i++] = szin + "_" + ertekek[e];
            }
        }
        
    }
    
    public int melyikoszlop(){
        int oszlop;
        do {            
            System.out.print("Melyik oszlopban van a gondolt kártya?: ");
            oszlop = sc.nextInt();
        } while (oszlop < 1 || oszlop > 3);
        return oszlop;
    }
    
    public void kever(int oszlop){
        String[] ujPakli = new String[22];
        switch (oszlop) {
            case 1:
                for (int i = 1; i < 7; i++) {
                    ujPakli[i] = pakli[20-(i-1)*3] ;
                    ujPakli[i+7] = pakli[19-(i-1)*3] ;
                    ujPakli[i+14] = pakli[21-(i-1)*3] ;
                }
            case 2:
                for (int i = 1; i < 7; i++) {
                    ujPakli[i] = pakli[20-(i-1)*3] ;
                    ujPakli[i+7] = pakli[21-(i-1)*3] ;
                    ujPakli[i+14] = pakli[19-(i-1)*3] ;
                }  
            case 3:
                for (int i = 1; i < 7; i++) {
                    ujPakli[i] = pakli[19-(i-1)*3] ;
                    ujPakli[i+7] = pakli[21-(i-1)*3] ;
                    ujPakli[i+14] = pakli[20-(i-1)*3] ;
                }
        }
        pakli = ujPakli;
    }
    
    public void kirak(){
        for (int i = 1; i < pakli.length; i++) {
            System.out.printf("%-8s", pakli[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }
    
    public void ezvolt(){
        System.out.printf("A gondolt kártya: %s\n", pakli[11]);
    }
}
