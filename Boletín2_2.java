
package boletín2_2;

import javax.swing.JOptionPane;


public class Boletín2_2 {

    public static void main(String[] args) {
        int lado;
        lado= Integer.parseInt(JOptionPane.showInputDialog("introduzca el lado"));
        JOptionPane.showMessageDialog(null,"El area del cuadrado es "+ lado*lado );
    
    }
    
}
