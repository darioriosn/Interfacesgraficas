/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package navegarventanas;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Cristopher
 */
public  class Jframe1 extends JFrame implements WindowListener, ActionListener{

    private JButton botonatras;
    public Jframe1(){
        super("JFrame1");
        setSize(350,250);
        botonatras= new JButton("<- Atras");
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS) );
        add(Box.createRigidArea(new Dimension(100,50)));
        add(botonatras);
        
        getContentPane().setBackground(Color.white);
        addWindowListener(this);
        botonatras.addActionListener(this);
        
        
    }
    
//Estos son los metodos propios del WindowsListener:
    
    /**
     * Se invoca la primera vez que se hace una ventana visible.
     * @param e 
     **/
   @Override
    public void windowOpened(WindowEvent e) {

    }
    /**
     * Se invoca cuando el usuario intenta cerrar la ventana de menú del sistema de la ventana.
     * @param e 
     **/
    @Override
    public void windowClosing(WindowEvent e) {
        NavegarVentanas n = new NavegarVentanas();
        n.setVisible(true);


    }
    /**
     * Se invoca cuando una ventana se ha cerrado como el resultado de llamar a disponer en la ventana.
     * @param e 
     **/
    @Override
    public void windowClosed(WindowEvent e) {

    }
    /**Se invoca cuando una ventana se cambia de un estado normal a un estado minimizado.
     * @param e 
     **/
    @Override
    public void windowIconified(WindowEvent e) {

    }
    /**
     * Se invoca cuando una ventana se cambia de un estado minimizado a un estado normal.
     * @param e 
     */
    @Override
    public void windowDeiconified(WindowEvent e) {

    }
    
    /**
     * Se invoca cuando la ventana está llamada a ser la ventana activa. 
     * @param e 
     */

    @Override
    public void windowActivated(WindowEvent e) {

    }
/**
 * Se invoca cuando una ventana ya no es la ventana activa.
 * @param e 
 */
    
    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    
/**
 * ActionPerformed
 * @see NavegarVentanas
 **/
    @Override
    public void actionPerformed(ActionEvent e) {
        NavegarVentanas n = new NavegarVentanas();
        n.setVisible(true);
        setVisible(false);//true para varias ventanas
    }

}

