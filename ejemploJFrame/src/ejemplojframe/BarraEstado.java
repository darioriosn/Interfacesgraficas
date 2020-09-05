/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojframe;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author Dario
 */
public class BarraEstado extends JPanel {

    private JLabel infoEstado;
    
    public BarraEstado() {
        setLayout(new FlowLayout());
        setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        add(infoEstado = new JLabel("No hay información disponible"));
        
    }
    
}
