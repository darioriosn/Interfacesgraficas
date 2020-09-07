/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipocambio;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Dario
 */
public class Ventana extends JFrame implements ItemListener, ActionListener{

    private JLabel tipo;
    private JTextField cantidad;
    private JRadioButton r1;
    private JRadioButton r2;
    private ButtonGroup grupo1 = new ButtonGroup();
    private JButton convertir = new JButton("Convertir");
    private static double colones = 586;
    private static double dolares = 0.84;
    private double suma;
    private int sumaEntera;
    private String moneda;
    DecimalFormat euro = new DecimalFormat("'€'#,###,###.##");
    DecimalFormat colon = new DecimalFormat("'¢'#,###,###.##");

    public Ventana() {
        this.setTitle("TipoCambio");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        r1 = new JRadioButton("colones");
        r2 = new JRadioButton("euros");
        tipo = new JLabel("Dolares");
        cantidad = new JTextField(20);
        grupo1.add(r1);
        grupo1.add(r2);
        c.add(cantidad);
        c.add(tipo);
        c.add(r1);
        c.add(r2);
        c.add(convertir);
        setSize(350, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        r1.addItemListener(this);
        r2.addItemListener(this);
        convertir.addActionListener(this);
        
        setVisible(true);
        
    }
    
    public void itemStateChanged(ItemEvent e){
        if(e.getItemSelectable() == r1){
            suma = Double.parseDouble(cantidad.getText()) * colones;
            moneda = colon.format(suma);
        }else{
            if(e.getItemSelectable() == r2){
                suma=Double.parseDouble(cantidad.getText())*dolares; 
                moneda = euro.format(suma);
            }
        }
        //System.out.println("moneda:" + moneda);
    }
    
     public void actionPerformed(ActionEvent e){
         JOptionPane.showMessageDialog(null, "La conversión es:" + moneda, "Mensaje", JOptionPane.INFORMATION_MESSAGE);
     }

}


//CTRL + SHIFT + I

//SHIFT + ALT + F
