import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class MyAplicacion extends JFrame implements ActionListener {
    protected JButton b1, b2, b3;

    public MyAplicacion() {

       JPanel  mypanel= new JPanel();
        b1 = new JButton("DESABILITAR BOTON DEL MEDIO");
        b1.setActionCommand("disable");
        b2 = new JButton("BOTON");

        b3 = new JButton("HABILITAR BOTON DEL MEDIO");
        b3.setActionCommand("enable");
        b1.addActionListener(this);
        b3.addActionListener(this);

        mypanel.add(b1);
       mypanel.add(b2);
        mypanel.add(b3);
        add(mypanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if ("disable".equals(e.getActionCommand())) {
            b2.setEnabled(false);
        } else { 
            b2.setEnabled(true);
        }
    }

    public static void main(String[] args) {
                MyAplicacion ma= new   MyAplicacion ();
    }
}