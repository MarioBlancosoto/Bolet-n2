
package boletin2_12;

import javax.swing.JOptionPane;


public class Boletin2_12 {

 
    public static void main(String[] args) {
        float soldofixo,vendas,kilometraxe,dietas,seguridadsocial,ret;
       
    soldofixo = Float.parseFloat(JOptionPane.showInputDialog("Introduzca o soldo fixo"));
    vendas = Float.parseFloat(JOptionPane.showInputDialog("introduzca o número de vendas"));
    kilometraxe = Float.parseFloat(JOptionPane.showInputDialog("Introduzca os kilometros"));
    dietas = Float.parseFloat(JOptionPane.showInputDialog("Introduzca dias de dietas"));
    seguridadsocial = 36;
    JOptionPane.showMessageDialog(null, "el sueldo líquido es de " + (soldofixo+vendas*5/100+kilometraxe*2 +dietas*30-seguridadsocial*0.89)+ "€");
     
    }
    
}
