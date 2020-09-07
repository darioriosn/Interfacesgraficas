
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;


public class MiAplicacion extends JFrame implements AdjustmentListener {
    JLabel etiqueta, titulo;
    JScrollBar barra;
    
    public MiAplicacion(){
    barra=new JScrollBar(JScrollBar.HORIZONTAL);
    barra.setPreferredSize(new Dimension (350, 30));
    titulo=new JLabel("Uso de Scroll");
    etiqueta=new JLabel("Valor: 0");
    etiqueta.setHorizontalAlignment(JLabel.CENTER);
    getContentPane().setLayout(new FlowLayout());
getContentPane().add(titulo);
getContentPane().add(barra);
getContentPane().add(etiqueta);
getContentPane().setBackground(Color.red);
barra.addAdjustmentListener(this);
this.setSize (400,200);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setVisible(true);
    
    }
    

public void adjustmentValueChanged(AdjustmentEvent e) {
etiqueta.setText("Valor: "+e.getValue());
}
    public static void main(String[] args) {
        MiAplicacion a=new MiAplicacion();
    }
    
}
