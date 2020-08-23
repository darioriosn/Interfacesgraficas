/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojframe;

import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author una
 */
public class BarraEstado extends JPanel {

    public BarraEstado() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        add(infoEstado = new JLabel("(No hay información disponible)"));
    }

    public void mostrarMensaje(String mensaje) {
        infoEstado.setText(mensaje);
    }

    private final JLabel infoEstado;
}

