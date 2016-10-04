/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg7;

import javax.swing.JOptionPane;

/**
 *
 * @author ytaly
 */
public class Boletin27 {

    public static void main(String[] args) {
      float i,t,n;
      i = 1/1200;
     
      
      
     
      
      n =Float.parseFloat(JOptionPane.showInputDialog(null,"Inserte o nominal"));
      t =Float.parseFloat(JOptionPane.showInputDialog("Inserte o numero de anos"));
      JOptionPane.showMessageDialog(null,"a renda mensual e " + (n * (Math.pow(1+i,t)*i)/ Math.pow(1+i,t)-1));
      t = (t*12);
    
        
    }   
}
