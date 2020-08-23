/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author una
 */
public class VentanaAplicacion extends JFrame {

    public VentanaAplicacion(String titulo) {
        super(titulo);

        ajustarComponentes(getContentPane());
        setSize(new Dimension(600, 400));
        setResizable(true);
        setLocationByPlatform(true);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void ajustarComponentes(Container c) {
        c.setLayout(new BorderLayout());

        JPanel d = new JPanel();
        d.setLayout(new FlowLayout());
        d.add(btnPrueba = new JButton("Prueba"));
        c.add(BorderLayout.CENTER, d);

        c.add(BorderLayout.PAGE_END, estado = new BarraEstado());

        btnPrueba.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Solamente se llama al método de la ventana
                // que maneja el evento.
                prueba();
            }

        });
    }

    public void iniciar() {
        setVisible(true);
    }

    public void prueba() {
        String mensaje = "Ejecutando el método de prueba (vista)..";

        System.out.println(mensaje);
        estado.mostrarMensaje(mensaje);

        JOptionPane.showMessageDialog(this, mensaje);
    }

    private BarraEstado estado;
    private JButton btnPrueba;
}

