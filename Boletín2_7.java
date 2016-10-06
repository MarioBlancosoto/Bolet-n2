
package boletín2_7;

import javax.swing.JOptionPane;


public class Boletín2_7 {

    
    public static void main(String[] args) {
        float n,i,t;
        i= 1/1200;
        
        n = Float.parseFloat(JOptionPane.showInputDialog(" introduzca o nominal"));
        i = Float.parseFloat(JOptionPane.showInputDialog(" introduzca o interés"));
        t = Float.parseFloat(JOptionPane.showInputDialog(" introduzca o número de anos"));
       
        t= t*12;
        i= 1/1200;
        m = Math.pow((1+i),t);
        JOptionPane.showMessageDialog(null,"A renda mensual e "+ ( n*m*i/(m)-1));
    }
    
}
