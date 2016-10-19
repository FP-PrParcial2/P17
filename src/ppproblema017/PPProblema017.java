/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppproblema017;
import javax.swing.*;

/**
 *
 * @author karen
 17.	Realiza un programa que contenga una función que calcule el máximo común divisor de dos números.*/
public class PPProblema017 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here

        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer Número"));

        b = Integer.parseInt(JOptionPane.showInputDialog("Introduce el Segundo Número "));

        JOptionPane.showMessageDialog(null, " Maximo Comun Divisor de:"+ a +", " + b + "es: " + op(a, b));

    }

    public static int op(int b, int a) {

        if (a> b) { 

            
        } else {
        int ax=b;
            b=a;
            a=ax;
        }
    int c;
            c=1;
        while(c!=0){
            c=b%a;
        if(c!=0){
            b=a;
            a=c;
            
            }
        }
        return a;
    }
   
}
