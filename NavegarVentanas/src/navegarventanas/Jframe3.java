/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package navegarventanas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

/**
 *
 * @author Cristopher
 */
public class Jframe3 extends JFrame implements ActionListener, WindowListener{
        private JButton botonatras;
        private JButton boton4;
    public Jframe3(){
        super("JFrame3");
        setSize(350,250);
        botonatras= new JButton("<- Atras");
        boton4=new JButton("Ir al JFrame4");
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS) );
        add(Box.createRigidArea(new Dimension(100,50)));
        add(botonatras);
        add(Box.createRigidArea(new Dimension(100,10)));
        add(boton4);
        
        getContentPane().setBackground(Color.white);
        addWindowListener(this);
        boton4.setActionCommand("jFrame4");
        botonatras.setActionCommand("atras");
        botonatras.addActionListener(this);
        boton4.addActionListener(this);
        
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("jFrame4")){
            jFrame4 n = new jFrame4();
            n.setLocationRelativeTo(null);
            n.setVisible(true);
            setVisible(false);
             n= null;
            
        }
        if(e.getActionCommand().equals("atras")){
            NavegarVentanas n = new NavegarVentanas();
            n.setLocationRelativeTo(null);
            n.setVisible(true);
            setVisible(false);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        NavegarVentanas n = new NavegarVentanas();
        //n.setLocationRelativeTo(null);
        n.setVisible(true);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}
