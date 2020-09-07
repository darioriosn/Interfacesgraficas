
package menurestaurante;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Jaime
 */
public class Ventana extends JFrame implements ActionListener{
    JButton cobrar, cerrar;
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JRadioButton r5;
    JRadioButton r6;
    JRadioButton r9;
    JRadioButton r7;
    JRadioButton r8;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9, imagen;
    String texto1;
    
    public Ventana(){
        super("Restaurante");
        Container con = getContentPane();
        con.setLayout(new FlowLayout());
        JPanel panel1 = new JPanel();
        setSize(700,300);
        setLocationRelativeTo(null);
        setResizable(false);
        
        Icon ico1 = new ImageIcon("bienvenido.gif");
        imagen = new JLabel(ico1);
        panel1.add(imagen);
        r1 = new JRadioButton("Camarones");
        r2 = new JRadioButton("Pescado");
        r3 = new JRadioButton("Ceviche");
        r4 = new JRadioButton("Arroz de la casa");
        r5 = new JRadioButton("Arroz con camarones");
        r6 = new JRadioButton("Sopa de mariscos");
        r7 = new JRadioButton("Arroz con mariscos");
        r8 = new JRadioButton("Gaseosa");
        r9 = new JRadioButton("Naturales");
        l1 = new JLabel("3500");
        l2 = new JLabel("5000");
        l3 = new JLabel("2500");
        l4 = new JLabel("3200");
        l5 = new JLabel("3000");
        l6 = new JLabel("3500");
        l7 = new JLabel("3500");
        l8 = new JLabel("1000");
        l9 = new JLabel("1500");
        cobrar = new JButton("Cobrar");
        cerrar = new JButton("Cerrar");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        JPanel panel2 = new JPanel();
        panel2.add(panel1);
        panel2.add(r1);
        panel2.add(l1);
        panel2.add(r2);
        panel2.add(l2);
        panel2.add(r3);
        panel2.add(l3);
        panel2.add(r4);
        panel2.add(l4);
        panel2.add(r5);
        panel2.add(l5);
        panel2.add(r6);
        panel2.add(l6);
        panel2.add(r7);
        panel2.add(l7);
        panel2.add(r8);
        panel2.add(l8);
        panel2.add(r9);
        panel2.add(l9);
        JPanel panel3 = new JPanel();
        panel3.add(cobrar);
        panel3.add(cerrar);
        JPanel panelTodo = new JPanel();
        panel2.setLayout(new GridLayout(9,2,0,0));
       con.add(panel1);
       con.add(panel2);       
       con.add(panel3);
       cobrar.addActionListener(this);
       cerrar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               System.exit(0);
            }
       });
              
      
        
    }


    
public double calculaPrecio(){
    double res = 0;
    if(r1.isSelected())
        res += 3500;
    if(r2.isSelected())
        res += 5000;
    if(r3.isSelected())
        res += 2500;
    if(r4.isSelected())
        res += 3200;
    if(r5.isSelected())
        res += 3000;
    if(r6.isSelected())
        res += 3500;
    if(r7.isSelected())
        res += 3500;
    if(r8.isSelected())
        res += 1000;
    if(r9.isSelected())
        res += 1500;
    return res;
}

public double precioFinal(){
    double res = this.calculaPrecio()+(this.calculaPrecio()*0.10)+(this.calculaPrecio()*0.13);
    return res;
}

 public String menu(){
        String pasa = "";
        if(r1.isSelected()){
            if(pasa.length()!=0)
               pasa += ", "+"Camarones";
            else               
                pasa = "Camarones";
        }
        if(r2.isSelected()){
            if(pasa.length()!=0)
                pasa += ", "+"Pescado";
            else
                pasa = "Pescado";
        }
        if(r3.isSelected()){
            if(pasa.length()!=0)
                pasa += ", "+"Ceviche";
            else 
                pasa = "Ceviche";
        }
        if(r4.isSelected()){
            if(pasa.length()!=0)
                pasa += ", "+"Arroz de la casa";
            else
                pasa = "Arroz de la casa";
        }
        if(r5.isSelected()){
            if(pasa.length()!=0)
                pasa += ", "+"Arroz con camarones";
            else 
                pasa = "Arroz con camarones";
        }
        if(r6.isSelected()){
            if(pasa.length()!=0)
                pasa += ", "+"Sopa de mariscos";
            else
                pasa = "Sopa de mariscos";
        }
        if(r7.isSelected()){
            if(pasa.length()!=0)
                pasa += ", "+"Arroz con mariscos";
            else
                pasa = "Arroz con mariscos";
        }
         if(r8.isSelected()){
            if(pasa.length()!=0)
                pasa += ", "+"Gaseosas";
            else
                pasa = "Gaseosas";
        }
        if(r9.isSelected()){
            if(pasa.length()!=0)
                pasa += ", "+"Naturales";
            else
                pasa = "Naturales";
        }
        return pasa;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        texto1 = "Los Platos seleccionados son: "+ this.menu()+ "\n"+
                "Por un precio total de: "+ this.calculaPrecio() + "\n"+
                "Monto total con impuetos incluidos: "+ this.precioFinal();
        JOptionPane.showMessageDialog(null,texto1,"Información", JOptionPane.INFORMATION_MESSAGE);
    }


    
}
