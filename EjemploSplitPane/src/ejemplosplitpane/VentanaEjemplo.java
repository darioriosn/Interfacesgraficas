/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosplitpane;

import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

/**
 *
 * @author Dario
 */
public class VentanaEjemplo extends JFrame {

    public VentanaEjemplo() {
        super("Ventana Ejemplo SplitPane");
        
        JTextArea textArea = new JTextArea();
        
        JPanel jpanel1 = new JPanel();
        
        JPanel jpanel2 = new JPanel();
        
        JButton c = new JButton("Configuracion");
        
        JButton a = new JButton("Aerolineas");
        
        
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
        
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,false, new JScrollPane(jpanel1), jpanel2);
        splitPane.setDividerSize(10);
        splitPane.setOneTouchExpandable(Boolean.TRUE);
        
        Container container = getContentPane();
        
        container.add(splitPane);
        
        setSize(400, 275);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);
        
    }
    
    
    
    
}
