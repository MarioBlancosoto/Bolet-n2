/
package boletín2.pkg8;

import javax.swing.JOptionPane;


public class Boletín28 {


    public static void main(String[] args) {
        
       float grados,kelvin= 273;
       
      grados = Float.parseFloat(JOptionPane.showInputDialog("introduzca los grados"));
      JOptionPane.showMessageDialog(null, "la cantidad de grados kelvin es " + (grados+kelvin) );
      JOptionPane.showMessageDialog(null,"y los farnheit " + (grados*(37*9)/5));
      
    }
    
}
