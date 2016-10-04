
package boletín2_4;

import javax.swing.JOptionPane;


public class Boletín2_4 {


    public static void main(String[] args) {
      float  n1,n2;
      n1 = Float.parseFloat(JOptionPane.showInputDialog("introduzca un número 1 "));
      n2 = Float.parseFloat(JOptionPane.showInputDialog("introduzca un número 2 "));
      JOptionPane.showMessageDialog(null,"\n El resultado de la suma es "+(n1+n2)+ " \n El resultado de la resta es "+
      (n1-n2)+ " \n El resultado de la multiplicación es "+ (n1*n2)+ " \n El  resultado de la división es "+ (n1/n2));
    }
    
}
