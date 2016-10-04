
package boletin2_9;

import javax.swing.JOptionPane;


public class Boletin2_9 {

    public static void main(String[] args) {
        int b100,b20,b5,mon1,cantidade;

      b100 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca os billetes de 100"));
      b20 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca os billetes de 20"));
      b5 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca os billetes de 5"));
      mon1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca as moedas de 1"));
      b100=b100*100;
      b20=b20*20;
      b5=b5*5;
      mon1=mon1*1;
      
      JOptionPane.showMessageDialog(null,"A cantidade total de euros e "+(b100+b20+b5+mon1));
    

       
       
    
    }
    
}
