/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2lab;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dario
 */
public class Ventana extends JFrame{
    
    private JButton avanzar, retroceder;
    private JLabel texto;
    private Font fuente;
    private Rectangulo rectangulo;

    public Ventana() {
        super("Ejercicio 2");
        setSize(320, 350);
        setResizable(false);
        avanzar = new JButton("Avanzar");
        retroceder = new JButton("Retroceder");
        texto = new JLabel("texto");
        //Manejo de fuentes
        fuente = new Font("Arial", Font.PLAIN, 10);
        texto.setFont(fuente);
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.setBackground(Color.LIGHT_GRAY);
        JPanel centro = new JPanel();
        centro.setBackground(Color.white);
        centro.add(avanzar);
        centro.add(retroceder);
        centro.add(texto);
        
        rectangulo = new Rectangulo(0,0,50,40);
        OyenteBoton listener = new OyenteBoton(texto, rectangulo);
        avanzar.addActionListener(listener);
        retroceder.addActionListener(listener);
        
        //Instancia de la clase Panel Rectangulo
        
        PanelRectangulo p1 = new PanelRectangulo(rectangulo);
        
        //agrego al contenedor
        c.add(centro, BorderLayout.CENTER);
        c.add(p1, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
}
