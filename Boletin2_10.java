
package boletin2_10;

import javax.swing.JOptionPane;


public class Boletin2_10 {

    
    public static void main(String[] args) {
        int b100,b20,b5,mon1,cantidade;
        cantidade = Integer.parseInt(JOptionPane.showInputDialog("Introduzca a cantidade de diñeiro"));
        b100=cantidade/100;
        b20=cantidade%100/20;
        b5=cantidade%20/5;
        mon1=cantidade%5/1;
        JOptionPane.showMessageDialog(null," A cantidade de billetes de 100 e "+ b100 +" \n A cantidade de billetes de 20 e "+b20+ " \n A cantidade de billetes de 5 e "+b5+" \n A cantidade de moedas de 1 € e "+mon1 );

        
        
       
        
             }
    }
