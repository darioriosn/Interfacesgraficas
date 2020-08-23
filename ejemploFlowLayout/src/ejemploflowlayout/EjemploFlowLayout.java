/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploflowlayout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author una
 */
public class EjemploFlowLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame ventana = new JFrame();
       ventana.setTitle("FlowLayout Manager");   
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana.setSize(500,300);
       ventana.setLocationRelativeTo(null);       
       ventana.setResizable(true);       
       ventana.setLayout(new FlowLayout());
       
       //Dos botones
       //btnAceptar - btnCancelar
       JButton btnAceptar = new JButton("Aceptar");
       JButton btnCancelar = new JButton("Cancelar");
       
       ventana.getContentPane().add(btnCancelar);
       ventana.getContentPane().add(btnAceptar);
       
       
       
       ventana.setVisible(true);
    }
    
}
