/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package navegarventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Esta clase hereda de JFrame para darle las caracteristicas de una ventana.
 * Ademas implementa la interfaz ActionListener que corresponde a un evento al
 * accionar un componente. En este caso a los botones.
 * 
 */


public class NavegarVentanas extends JFrame implements ActionListener{
    
    private JButton boton1, boton2, boton3;

    /**
     * Constructo del Jframe NavejarVentanas, aqui vamos a agregarle los componentes
     * internos de la ventana
     */
    public NavegarVentanas() {
        
        
        super("Navegar entre forms");// Este llama a constructor de la super clase Jframe para darle un titulo a la ventana
        
       
        boton1=new JButton("Ir a otra ventana");
        
        boton2=new JButton("Ir a otra ventana 2");  //Inicializamos los Jbutton mandandole por parametro su texto
        
        boton3=new JButton("Ir a otra ventana 3");
        
        setSize(350,250); //Definimos un tamaño preterminado al Jframe
        
        //Establecemos un BoxLayout donde agregaremos componentes en forma vertical (BoxLayout.Y_AXIS)
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS) );
        add(Box.createRigidArea(new Dimension(100,50))); //Con esta definicion podemos colocar los componentes de acuerdo
                                                         //a las dimensiones dadas. (Dimension (width, height)
        add(boton1);
        add(Box.createRigidArea(new Dimension(100,10)));
        add(boton2);
        add(Box.createRigidArea(new Dimension(100,10)));
        add(boton3);

        boton1.setActionCommand("frame1");
        boton2.setActionCommand("frame2");  //Creamos un comando de accion donde podemos diferenciar en el ActionListener
                                            //cual es el boton que estamos accionando
        
        boton3.setActionCommand("frame3");
        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        //contenedor.add(boton1);
        getContentPane().setBackground(Color.white);  // Definimos el color del fondo de nuestro Jframe
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Definimos la operacion de cerrar por defecto ("X de la esquina")
        setLocationRelativeTo(null); // Esta definicion al colocale null es su parámetro nos centrará nuestro jFrame en el
                                     // centro de la pantalla
        setVisible(true); // Mostramos nuestro JFrame.
    }

    /**
     * Este es el metodo actionPerformed donde recibe por parametro un ActionEvent que contiene todas las caracteristicas
     * del propias del evento. Aqui por medio de los action commands pondremos las instrucciones porpias para cada botón
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("frame1")){
            Jframe1 frame = new Jframe1();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            setVisible(false);
            frame= null;
        }
        if(e.getActionCommand().equals("frame2")){
            Jframe2 frame = new Jframe2();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            setVisible(false);
             frame= null;
        }
        if(e.getActionCommand().equals("frame3")){
            Jframe3 frame = new Jframe3();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            setVisible(false);
              frame= null;
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NavegarVentanas n = new NavegarVentanas();
    }


}
