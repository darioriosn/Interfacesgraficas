/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploborderlayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author una
 */
public class EjemploBorderLayout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame ventana = new JFrame();
       ventana.setTitle("BorderLayout Manager");   
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana.setSize(500,300);
       ventana.setLocationRelativeTo(null);       
       ventana.setResizable(true);       
       ventana.setLayout(new BorderLayout());
       //Dos etiquetas
       //lbEtiqueta1 - lbEtiqueta2
       JLabel lbEtiqueta1 = new JLabel("Etiqueta1");
       JLabel lbEtiqueta2 = new JLabel("Etiqueta2");
       //Dos botones
       //btnIzquierdo - btnDerecho
       JButton btnIzquierdo = new JButton("Izquierdo");
       JButton btnDerecho = new JButton("Derecho");
       //Una caja de texto
       //txtCaja
       JTextField txtCaja = new JTextField();
       
       ventana.getContentPane().add(txtCaja, BorderLayout.CENTER);
       ventana.getContentPane().add(btnIzquierdo, BorderLayout.WEST);
       //ventana.getContentPane().add(btnIzquierdo, BorderLayout.LINE_START);
       //ventana.getContentPane().add(btnDerecho, BorderLayout.EAST);
       ventana.getContentPane().add(btnDerecho, BorderLayout.LINE_END);
       //ventana.getContentPane().add(lbEtiqueta1, BorderLayout.NORTH);
       ventana.getContentPane().add(lbEtiqueta1, BorderLayout.PAGE_START);
       //ventana.getContentPane().add(lbEtiqueta2, BorderLayout.SOUTH);
       ventana.getContentPane().add(lbEtiqueta2, BorderLayout.PAGE_END);
       
       ventana.setVisible(true);
       
    }
    
}
