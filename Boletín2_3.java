
package boletín2_3;

import javax.swing.JOptionPane;


public class Boletín2_3 {

    public static void main(String[] args) {
        float euros; //declaro euros
        euros = Float.parseFloat(JOptionPane.showInputDialog("introduzca la cantidad de euros "));
        JOptionPane.showMessageDialog(null," La cantidad de cambio a dolares es de "+  euros*0.89);
    }
    
}
