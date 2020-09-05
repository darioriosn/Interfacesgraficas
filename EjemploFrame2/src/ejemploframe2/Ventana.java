/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploframe2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Dario
 */
public class Ventana extends JFrame {

    public Ventana() {
        super("Mi Ventana");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(true);
        //setLayout(new FlowLayout());
        setLayout(null);
        
        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");
        
        btnAceptar.setBounds(250, 150, 65, 100);
        
        getContentPane().add(btnAceptar);
        getContentPane().add(btnCancelar);
        
        setVisible(true);
    }
    
}
