/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosetbounds;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author una
 */
public class EjemploSetBounds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame ventana = new JFrame("Ejemplo SetBounds");
              
       
       ventana.setLayout(null);
       ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       ventana.setSize(500,300);
       ventana.setLocationRelativeTo(null);       
       ventana.setResizable(true); 
       
       
       //Etiquetas
       JLabel lbTitulo = new JLabel("Login", JLabel.CENTER);
       JLabel lbUsuario = new JLabel("Usuario: ");
       JLabel lbPassword = new JLabel("Contraseña: ");
       
       lbTitulo.setBounds(150,10,220,20);
       lbUsuario.setBounds(150,50,100,50);
       lbPassword.setBounds(150,90, 100,50);
       
       //Campos de texto
       JTextField txtUsuario = new JTextField();
       JTextField txtPassword = new JTextField();
      
       txtUsuario.setBounds(250, 65, 80,20);
       txtPassword.setBounds(250,105,80,20);
       
       //Botones
       JButton btnEnviar = new JButton("Enviar");
       btnEnviar.setBounds(200,150,100,20);
       
       ventana.getContentPane().add(lbUsuario);
       ventana.getContentPane().add(lbTitulo);
       ventana.getContentPane().add(lbPassword);
       ventana.getContentPane().add(txtUsuario);
       ventana.getContentPane().add(txtPassword);
       ventana.getContentPane().add(btnEnviar);
       
             
       ventana.setVisible(true);
    } 
    
}
