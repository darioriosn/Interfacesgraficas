/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarchivos;

import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Dario
 */
public class Ventana extends JFrame implements ActionListener {

    private Container contenedor;

    private JLabel titulo;
    private JLabel labelImg;

    private JTextArea areaDeTexto;
    private JButton botonAbrir;
    private JButton botonGuardar;

    private JScrollPane scrollPaneArea;

    private JFileChooser fileChooser;

    private String texto;

    private ArrayList<ImageIcon> imgs = new ArrayList<>();

    public Ventana() {
        contenedor = getContentPane();

        contenedor.setLayout(null);

        //crear el objeto e fileChooser
        fileChooser = new JFileChooser();
        String[] extensiones = new String[4];
        extensiones[0] = "*.png";

        String[] extensiones2 = new String[]{"*.png", "png", "*.jpg"};

        fileChooser.setFileFilter(new FileNameExtensionFilter("*.png", "png"));

        titulo = new JLabel();
        titulo.setText("COMPONENTE JFILECHOOSER");
        titulo.setBounds(110, 20, 180, 23);

        areaDeTexto = new JTextArea();
        //para que el texto se ajuste al area
        areaDeTexto.setLineWrap(true);
        // permite que no queden las palabras incompletas en el salto de linea
        areaDeTexto.setWrapStyleWord(true);

        scrollPaneArea = new JScrollPane();
        scrollPaneArea.setBounds(20, 50, 350, 270);
        scrollPaneArea.setViewportView(areaDeTexto);

        botonAbrir = new JButton();
        botonAbrir.setText("Abrir");
        botonAbrir.setBounds(100, 330, 80, 23);
        botonAbrir.addActionListener(this);

        botonGuardar = new JButton();
        botonGuardar.setText("Guardar");
        botonGuardar.setBounds(220, 330, 80, 23);
        botonGuardar.addActionListener(this);

        labelImg = new JLabel();
        labelImg.setText("Image");
        labelImg.setBounds(500, 20, 800, 600);

        contenedor.add(titulo);
        contenedor.add(scrollPaneArea);
        contenedor.add(botonAbrir);
        contenedor.add(botonGuardar);
        contenedor.add(labelImg);

        setTitle("Archivos");
        this.setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonAbrir){
            String archivo = abrirArchivo();
            areaDeTexto.setText(archivo);
        }else if(e.getSource() == botonGuardar){
            guardarArchivo();
        }
        
    }
    
    private String abrirArchivo(){
        String aux = "", texto="";
        File abre, mostrar;
        fileChooser.showOpenDialog(this);
        abre = fileChooser.getSelectedFile();
        
        mostrar = fileChooser.getSelectedFile();
        
        try{
            if(abre != null){
                FileReader archivoLectura = new FileReader(abre);
                BufferedReader leer = new BufferedReader(archivoLectura);
                while((aux = leer.readLine() ) != null){
                    texto += aux + "\n";
                }
                
                leer.close();
                archivoLectura.close();
            }
            
            URL url = null;
            url = mostrar.toURI().toURL();
            ImageIcon newImg = new ImageIcon(url);
            labelImg.setIcon(newImg);
            labelImg.repaint();
            labelImg.revalidate();
            imgs.add(newImg);
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex + " " + "\nNo se ha encontrado el archivo", "ADVERTENCIA!!", JOptionPane.WARNING_MESSAGE);
        }
        
        
        return texto;
    }
    
    private void guardarArchivo(){
        
        String nombre = "";
        
        try{
            JFileChooser chooserGuardar = new JFileChooser();
            chooserGuardar.showSaveDialog(this);
            File guardar = chooserGuardar.getSelectedFile();
            
            if(guardar != null){
                nombre = chooserGuardar.getSelectedFile().getName();
                
                FileWriter archivoEscritura = new FileWriter(guardar + ".xml");
                archivoEscritura.write(areaDeTexto.getText());
                
                archivoEscritura.close();
                
                //guardar imagen completa
                Image image = ImageIO.read(fileChooser.getSelectedFile());
                ImageIO.write((BufferedImage)image, "png", new File(guardar.getAbsolutePath() + ".png"));
                
                JOptionPane.showMessageDialog(null, "El archivo se ha guardado correctamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex + " " + "\n Su archivo no se guardo correctamente", "Error", JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e){
             JOptionPane.showMessageDialog(null, e + " " + "\n Ocurrio un error inesperado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void iniciar() {
        this.setVisible(true);
    }

}
