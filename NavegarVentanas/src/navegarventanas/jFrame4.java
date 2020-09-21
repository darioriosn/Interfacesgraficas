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
public class jFrame4 extends JFrame implements ActionListener, WindowListener{

    private JButton botonatras;
    
    public jFrame4() {
        super("JFrame 4");
        setSize(350,250);
        botonatras=new JButton("<- atras");
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS) );
        add(Box.createRigidArea(new Dimension(100,50)));
        add(botonatras);
        
        getContentPane().setBackground(Color.white);
        addWindowListener(this);
        botonatras.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Jframe3 n = new Jframe3();
        n.setLocationRelativeTo(null);
        n.setVisible(true);
        setVisible(false);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        Jframe3 n = new Jframe3();
        n.setLocationRelativeTo(null);
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
