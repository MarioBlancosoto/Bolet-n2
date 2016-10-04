
package boletín2_6;

import javax.swing.JOptionPane;

public class Boletín2_6 {

    public static void main(String[] args) {
    float Ppagado,Ptarifa;
    
    Ppagado = Float.parseFloat(JOptionPane.showInputDialog("introduzca el precio pagado"));
    Ptarifa = Float.parseFloat(JOptionPane.showInputDialog("introduzca el precio de la tarifa"));
    JOptionPane.showMessageDialog(null,"el descuento sobre la tarifa es del "+ ((Ptarifa-Ppagado)*100/Ptarifa)+ "%");
  
    }
      
    
}
