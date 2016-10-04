
package boletín2_5;

import javax.swing.JOptionPane;


public class Boletín2_5 {

    public static void main(String[] args) {
      double millas;
      final int MILES =1852;
       
      
      millas = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el número de millas"));
      JOptionPane.showMessageDialog(null, "los metros son " + millas*MILES);
       
    }
    
}
