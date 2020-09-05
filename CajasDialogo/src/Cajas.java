import javax.swing.JOptionPane;
public class Cajas {

    public static void main(String[] args) {
     String primerNumero;
     String segundoNumero;
     int n1;
     int n2;
     int suma;
     
     primerNumero= JOptionPane.showInputDialog("Escriba un numero");
     segundoNumero= JOptionPane.showInputDialog("Escriba otro numero");    
     n1= Integer.parseInt(primerNumero);
     n2= Integer.parseInt(segundoNumero);
     suma= n1+n2;
     JOptionPane.showMessageDialog(null, "La suma es" + suma, "titulo", JOptionPane.ERROR_MESSAGE);
     JOptionPane.showMessageDialog(null, "La suma es" + suma, "titulo", JOptionPane.INFORMATION_MESSAGE);
     JOptionPane.showMessageDialog(null, "La suma es" + suma, "titulo", JOptionPane.WARNING_MESSAGE);
     JOptionPane.showMessageDialog(null, "La suma es" + suma, "titulo", JOptionPane.QUESTION_MESSAGE);
     JOptionPane.showMessageDialog(null, "La suma es" + suma, "titulo", JOptionPane.PLAIN_MESSAGE); //SIN ICONO
     JOptionPane.showMessageDialog(null, "La suma es" + suma);
     System.exit(0);
    }
}
