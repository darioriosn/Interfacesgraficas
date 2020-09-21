/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosplitpane;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

/**
 *
 * @author Dario
 */
public class VentanaEjemplo extends JFrame {

    private JPanel jpanel2;
    
    public VentanaEjemplo() {
        
        super("Ventana Ejemplo SplitPane");
          try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        
        JTextArea textArea = new JTextArea();
        
        JPanel jpanel1 = new JPanel();
        
        JLabel jlabel1 = new JLabel();
        jlabel1.setText("Bienvenido a Aerolineas El avion feliz");
        
        jpanel2 = new JPanel();
        jpanel2.add(jlabel1);
        
        JButton c = new JButton("Configuracion");
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnConfiguracion(e);
            }
        });
        
        JButton a = new JButton("Aerolineas");
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnAerolineas(e);
            }
        });
        
        
        GroupLayout groupLayout = new GroupLayout(jpanel1);
        
        groupLayout.setAutoCreateGaps(true);
        
       
        
        groupLayout.setHorizontalGroup(
        
                groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(
                        groupLayout.createParallelGroup(
                                        GroupLayout.Alignment.LEADING
                        
                        ).addGroup(
                            groupLayout.createSequentialGroup()
                                    .addContainerGap()
                                .addGroup(groupLayout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(c)
                                        .addGap(20)
                                        .addComponent(a))
                        
                        ) 
                )              
                      
              
        );
        
        
        groupLayout.setVerticalGroup(
                groupLayout.createSequentialGroup()
                       .addGroup(
                               
                               groupLayout.createSequentialGroup()
                               .addGap(60)
                               .addComponent(c)
                               .addGap(40)
                               .addComponent(a)
                       
                       )
        
        );
        
        jpanel1.setLayout(groupLayout);
        
        jpanel2.setLayout(new CardLayout());
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,false, new JScrollPane(jpanel1), jpanel2);
       // splitPane.setDividerSize(10);
        splitPane.setDividerSize(1);
        splitPane.setOneTouchExpandable(Boolean.TRUE);
        
        Container container = getContentPane();
        
        container.add(splitPane);
        
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
        
    }
    
    private void btnConfiguracion(ActionEvent e){
    
    }
    
    private void btnAerolineas(ActionEvent e){
        AerolineaForm aerolineaForm = new AerolineaForm(jpanel2);
        jpanel2.add("aerolineaForm", aerolineaForm);
        CardLayout card = (CardLayout) jpanel2.getLayout();
        card.next(jpanel2);
    }

    
    
    
    
    
}
