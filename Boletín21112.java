
package boletín2.pkg11.pkg12;

import javax.swing.JOptionPane;


public class Boletín21112 {


    public static void main(String[] args) {
    float soldofixo,vendas,kilometraxe,dietas;
       
    soldofixo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca o soldo fixo"));
    vendas = Float.parseFloat(JOptionPane.showInputDialog("introduzca o número de vendas"));
    kilometraxe = Float.parseFloat(JOptionPane.showInputDialog("Introduzca os kilometros"));
    dietas = Float.parseFloat(JOptionPane.showInputDialog("Introduzca dias de dietas"));
    JOptionPane.showMessageDialog(null, "el sueldo líquido es de " + (soldofixo+vendas*5/100+kilometraxe*2 +dietas*30) +"€");
    }
    
}
