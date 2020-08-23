/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploventanalayouts;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author una
 */
public class VentanaAplicacion extends JFrame{
    
    //Paso 1. Configuración de la ventana en el
    //constructor
    public VentanaAplicacion(){
        this.setSize(500,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        
        //Debe estar acá para que sean visibles los componentes
        //agregados
        this.ajustarComponentes(this.getContentPane());
    }
    
    //Paso 2. Mostrar visible la ventana
    public void iniciar(){
        this.setVisible(true);
        
    }
    
    
    //Paso 3. Crear y colocar los componentes
    public void ajustarComponentes(Container c){
        //Configurar un layout manager diferente
        c.setLayout(new BorderLayout());
        JPanel panelSuperior = new JPanel();
        //panelSuperior.setLayout(new FlowLayout());        
        JPanel panelCentral = new JPanel();
        panelCentral.setLayout(new GridLayout(2,2));
        
        
        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new BorderLayout());
        
        
        //Primero: Crear componentes
        JLabel lbNombre = new JLabel("Digite su nombre: ");
        JTextField txtNombre = new JTextField(10);
        
        JLabel lbApellido = new JLabel("Digite su apellido: ");
        JTextField txtApellido = new JTextField(10);
        
        JButton btnBoton1 = new JButton("Boton 1");
        JButton btnBoton2 = new JButton("Boton 2");
        JButton btnBoton3 = new JButton("Boton 3");
        JButton btnBoton4 = new JButton("Boton 4");
        
        JTextField txtSuperior = new JTextField(10);
        JTextField txtInferior = new JTextField(10);
        JButton btnBotonIzquierda = new JButton("Izquierda");
        JButton btnBotonDerecha = new JButton("Izquierda");
        JLabel lbCentro = new JLabel("CENTRO");
       
        
        
        
        //Segundo: agregar al panel como el contenedor de esos
        //componentes
        panelSuperior.add(lbNombre);
        panelSuperior.add(txtNombre);
        panelSuperior.add(lbApellido);
        panelSuperior.add(txtApellido);
        
        panelCentral.add(btnBoton1);
        panelCentral.add(btnBoton2);
        panelCentral.add(btnBoton3);
        panelCentral.add(btnBoton4);
        
        panelInferior.add(txtSuperior, BorderLayout.PAGE_START);
        panelInferior.add(txtInferior, BorderLayout.PAGE_END);
        panelInferior.add(lbCentro, BorderLayout.CENTER);
        panelInferior.add(btnBotonIzquierda, BorderLayout.LINE_START);
        panelInferior.add(btnBotonDerecha, BorderLayout.LINE_END);       
                
                
        
        //Tercero: agregar el panel a la ventana
        c.add(panelSuperior, BorderLayout.PAGE_START);
        c.add(panelCentral, BorderLayout.CENTER);
        c.add(panelInferior, BorderLayout.PAGE_END);
                
        
        
        
    }
    
}
