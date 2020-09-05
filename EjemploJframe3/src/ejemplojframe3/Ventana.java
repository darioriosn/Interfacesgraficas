/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojframe3;

import com.sun.prism.j2d.J2DPipeline;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author Dario
 */
public class Ventana extends JFrame {

    public Ventana() {
         this.setSize(500, 300);
         this.setLocationRelativeTo(null);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setResizable(Boolean.FALSE);
         
         crearComponentes(this.getContentPane());
         
    }
    
    public void iniciar(){
        this.setVisible(true);
    }
    
    private void crearComponentes(Container c){
        c.setLayout(new BorderLayout());
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout()); 
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(2,2));
        
        JPanel panelInferior = new JPanel();
        
        panelInferior.setLayout(new BorderLayout());
        
        //crear etiquetas
        JLabel lbNombre = new JLabel("Digite su nombre:");
        JLabel lbApellido = new JLabel("Digite su apellido:");
        //Crear campos de texto
        JTextField txtNombre = new JTextField(25);
        JTextField txtApellido = new JTextField(25);
        
        //crear botones
        JButton btnButton1 = new JButton("Boton 1");
        JButton btnButton2 = new JButton("Boton 2");
        JButton btnButton3 = new JButton("Boton 3");
        JButton btnButton4 = new JButton("Boton 4");
        
        //mas campos de texto
        JTextField txtSuperior = new JTextField(25);
        JTextField txtInferior = new JTextField(25);
        JButton btnBotonIzq = new JButton("Izquierda");
        JButton btnBotonDer = new JButton("Derecha");
        JLabel lbCentro = new JLabel("Centro");
        
        panelSuperior.add(lbNombre);
        panelSuperior.add(txtNombre);
        panelSuperior.add(lbApellido);
        panelSuperior.add(txtApellido);
        
        panelCentral.add(btnButton1);
        panelCentral.add(btnButton2);
        panelCentral.add(btnButton3);
        panelCentral.add(btnButton4);
        
        panelInferior.add(txtSuperior, BorderLayout.PAGE_START);
        panelInferior.add(txtInferior, BorderLayout.PAGE_END);
        panelInferior.add(lbCentro, BorderLayout.CENTER);
        panelInferior.add(btnBotonIzq, BorderLayout.LINE_START);
        panelInferior.add(btnBotonDer, BorderLayout.LINE_END);
        
        c.add(panelSuperior, BorderLayout.PAGE_START);
        c.add(panelCentral, BorderLayout.CENTER);
        c.add(panelInferior, BorderLayout.PAGE_END);
        
        
    }
    
    
    
    
    
   
}
