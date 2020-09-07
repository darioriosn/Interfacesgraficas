/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2lab;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

/**
 *
 * @author Dario
 */
public class OyenteBoton implements ActionListener {

    private int x;
    private JLabel texto;
    private Rectangulo rectangulo;

    public OyenteBoton(JLabel txt, Rectangulo r) {
        this.texto = txt;
        this.rectangulo = r;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int tmp = texto.getFont().getSize();
        x = texto.getX();
        if (e.getActionCommand().equals("Avanzar")) {

            //que ya llegue al final de la pantalla en X
            if (texto.getX() > 285) {
                tmp = 0;
                x = 5;
            }
            tmp += 10;
            x += 10;
            //texto avanza y crece tamano
            texto.setFont(new Font(texto.getFont().getFontName(), texto.getFont().getStyle(), tmp));
            texto.setLocation(x, texto.getY());
            rectangulo.setX(rectangulo.getX() + 10);
            rectangulo.setWidth(rectangulo.getWidth() + 2);
            rectangulo.setHeight(rectangulo.getHeight() + 2);

        } else {
            if (e.getActionCommand().equals("Retroceder")) {
                //que ya llegue al final de la pantalla en X
                if (texto.getX() <= 15) {
                    tmp = 300;
                    x = 305;
                }
                tmp -= 10;
                x -= 10;
                //texto retrocede y disminuye tamano
                texto.setFont(new Font(texto.getFont().getFontName(), texto.getFont().getStyle(), tmp));
                texto.setLocation(x, texto.getY());
                rectangulo.setX(rectangulo.getX() - 10);
                rectangulo.setWidth(rectangulo.getWidth() - 2);
                rectangulo.setHeight(rectangulo.getHeight() - 2);
            }
        }
    }

}
