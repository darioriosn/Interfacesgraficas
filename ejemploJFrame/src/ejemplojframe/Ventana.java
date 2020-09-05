/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dario
 */
public class Ventana extends JFrame {
    
    private JButton btnPrueba;
    private BarraEstado estado;
    
    public Ventana(){
        setTitle("Mi primera Ventana");
        
        setSize(600, 400);
        setResizable(true);
        setLocationByPlatform(true);
        ajustarComponentes(getContentPane());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    private void ajustarComponentes(Container c){
        c.setLayout(new BorderLayout());
        JPanel d = new JPanel();
        d.setLayout(new FlowLayout());
        btnPrueba = new JButton("Prueba");
        d.add(btnPrueba);
        c.add(BorderLayout.PAGE_END, d);
        c.add(BorderLayout.CENTER, estado = new BarraEstado());
        
    }
}
