/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3lab;

import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
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
    
    
    
    JRadioButton una = new JRadioButton("UNA");
    JRadioButton tec = new JRadioButton("TEC");
    JRadioButton ucr = new JRadioButton("UCR");
    JRadioButton uned = new JRadioButton("UNED");
    
    ButtonGroup universidad = new ButtonGroup();
    
    JCheckBox informatica = new JCheckBox("Informatica");
    JCheckBox adm = new JCheckBox("Administracion");
    JCheckBox educacion = new JCheckBox("Educacion");
    
    ButtonGroup carrera = new ButtonGroup();
    
    JLabel universi = new JLabel("Universidad:");
    JLabel carre = new JLabel("Carrera:");
    
    JLabel nom = new JLabel("Nombre:");
    JLabel carn = new JLabel("Carne:");
    JLabel telef = new JLabel("Telefono:");
    
    JLabel prov = new JLabel("Provincia:");
    
    JTextField nombre = new JTextField(10);
    JTextField carne = new JTextField(10);
    JTextField telefono = new JTextField(10);
    
    JButton enviar = new JButton("Enviar");
    
    ImageIcon icon;
    Image image;
    
    String a, b, c, d, e1,f;
    
    JComboBox<Provincia> provinciasCombo = new JComboBox<>();

    public Ventana() {
        super("Mi ventana");
        Container con = getContentPane();
        con.setLayout(null);
        
        setSize(500, 500);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        universidad.add(una);
        universidad.add(tec);
        universidad.add(ucr);
        universidad.add(uned);
        
        
        //labels
        nom.setBounds(5, -20, 60, 100);
        carn.setBounds(5, 30, 60, 100);
        telef.setBounds(5, 80, 60, 100);
        universi.setBounds(320,-10,80,100);
        carre.setBounds(315,295,80,100);
        
        //radiobuttons
        una.setBounds(320,50,80,20);
        tec.setBounds(320,70,80,20);
        ucr.setBounds(320,90,80,20);
        uned.setBounds(320,110,80,20);
        
        //Jtextfields
        nombre.setBounds(60,20,120,20);
        carne.setBounds(60,70,120,20);
        telefono.setBounds(60,120,120,20);
        
        //Jcheckbox
        informatica.setBounds(320, 360, 100, 20);
        adm.setBounds(320, 380, 120, 20);
        educacion.setBounds(320, 400, 100, 20);
        
        //Jlabel Combo
        prov.setBounds(315,110,80,100);
        
        
        //JButton
        enviar.setBounds(320,423,85,23);
        
        //Jcombo
        ArrayList<Provincia> provincias = new ArrayList();
        Provincia provincia1 = new Provincia(1, "San Jose");
        Provincia provincia2 = new Provincia(2, "Alajuela");
        Provincia provincia3 = new Provincia(3, "Cartago");
        Provincia provincia4 = new Provincia(4, "Heredia");
        Provincia provincia5 = new Provincia(5, "Limon");
        Provincia provincia6 = new Provincia(6, "Puntarenas");
        Provincia provincia7 = new Provincia(7, "Guanacaste");
        provincias.add(provincia1);
        provincias.add(provincia2);
        provincias.add(provincia3);
        provincias.add(provincia4);
        provincias.add(provincia5);
        provincias.add(provincia6);
        provincias.add(provincia7);
        //For each Java 7 o menor
       /* for(Provincia p : provincias){
            provinciasCombo.addItem(p);
        }*/
        //Java 8
        provincias.forEach(p -> provinciasCombo.addItem(p) );
        provinciasCombo.setBounds(315, 180, 100, 20);
        
        //Image
        JLabel imagen = new JLabel();
        imagen.setBounds(3,70,450,400);
        icon = new ImageIcon(getClass().getResource("Imagen.png"));
        image = icon.getImage();
        image.getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT);
        imagen.setIcon(icon);
        
        //listeners
        una.addItemListener(this);
        tec.addItemListener(this);
        ucr.addItemListener(this);
        uned.addItemListener(this);
        informatica.addItemListener(this);
        adm.addItemListener(this);
        educacion.addItemListener(this);
        enviar.addActionListener(this);
        
        con.add(una);
        con.add(tec);
        con.add(ucr);
        con.add(uned);
        con.add(nom);
        con.add(carn);
        con.add(telef);
        con.add(nombre);
        con.add(carne);
        con.add(telefono);
        con.add(universi);
        con.add(carre);
        con.add(informatica);
        con.add(adm);
        con.add(educacion);
        con.add(provinciasCombo);
        con.add(imagen);
        con.add(enviar);
        con.add(prov);
        
        
        setVisible(true);
        
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       if(e.getItemSelectable() == una){
           a = una.getText();
       }else if(e.getItemSelectable() == tec){
           a = tec.getText();
       }else if(e.getItemSelectable() == ucr){
           a = ucr.getText();
       }
       else if(e.getItemSelectable() == uned){
           a = uned.getText();
       }
        System.out.println("Universidad elegida:" + a);
        
      /* if(e.getItemSelectable() == informatica){
           c = informatica.getText();
           System.out.println("Carrera elegida:" + c);
           return;
       }
       
       if(e.getItemSelectable() == adm){
           c = adm.getText();
            System.out.println("Carrera elegida:" + c);
           return;
       }
       
       if(e.getItemSelectable() == educacion){
           c = educacion.getText();
            System.out.println("Carrera elegida:" + c);
           return;
       }*/
       
       if(informatica.isSelected()){
            c = informatica.getText();
           System.out.println("Carrera elegida 1:" + c);
       }
       
       if(adm.isSelected()){
            c = adm.getText();
           System.out.println("Carrera elegida 2:" + c);
       }
       
       if(educacion.isSelected()){
            c = educacion.getText();
           System.out.println("Carrera elegida 3:" + c);
       }
       
      // informatica.setSelected(false);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand() + ":" + provinciasCombo.getSelectedItem().toString());
        if(nombre.getText().isEmpty()){
            //mensaje de error
            JOptionPane.showMessageDialog(null, "Falta el nombre", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (carne.getText().isEmpty()){
             //mensaje de error
            JOptionPane.showMessageDialog(null, "Falta el carne", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (telefono.getText().isEmpty()){
             //mensaje de error
            JOptionPane.showMessageDialog(null, "Falta el telefono", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (!una.isSelected() && !tec.isSelected() && !ucr.isSelected() && !uned.isSelected()){
             //mensaje de error
            JOptionPane.showMessageDialog(null, "Error debe seleccionar universidad", "Error", JOptionPane.ERROR_MESSAGE);
        }else if (!informatica.isSelected() && !adm.isSelected() && !educacion.isSelected()){
             //mensaje de error
            JOptionPane.showMessageDialog(null, "Error debe seleccionar carrera", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (provinciasCombo.getSelectedIndex() == -1){
             //mensaje de error
            JOptionPane.showMessageDialog(null, "Error debe seleccionar Provincia", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            d = nombre.getText();
            e1 = carne.getText();
            f = telefono.getText();
            b = provinciasCombo.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Nombre: " + d + "\nCarné: " + e1 + "\nTeléfono:" 
                    + f + "\nUniversidad: " + a + "\nCarrera: " + c + "\nProvincia: " + b, "Informacion General", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    

    
}
