/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2lab;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Dario
 */
public class PanelRectangulo extends JPanel {
    
    private Rectangulo rectangulo;

    public PanelRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
        setBackground(Color.red);
        setLayout(new FlowLayout(FlowLayout.LEFT, 80, 80));
        setVisible(true);
        int timerDelay = 200;
        new Timer(timerDelay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paint(getGraphics());
            }
        }).start();
    }
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillRect(rectangulo.getX(), rectangulo.getY(), rectangulo.getWidth(), rectangulo.getHeight());
    }
    
    
}
