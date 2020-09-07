
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MiAplicacion extends JFrame implements ActionListener {

   private JButton botones[];
   private final String nombres[] = { "Ocultar norte", "Ocultar sur","Ocultar este", "Ocultar oeste", "Ocultar centro" };
   private BorderLayout esquema;
    
    
   public MiAplicacion(){
    super( "Demostración de BorderLayout" );
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      esquema = new BorderLayout( 5, 5 ); // espacios libres de 5 píxeles

      // obtener panel de contenido y establecer su esquema
      Container contenedor = getContentPane();
      contenedor.setLayout( esquema );
      // instanciar objetos botón
      botones = new JButton[ nombres.length ];

      for ( int cuenta = 0; cuenta < nombres.length; cuenta++ ) {
         botones[ cuenta ] = new JButton( nombres[ cuenta ] );
         botones[ cuenta ].addActionListener( this );
         botones[ cuenta ].setToolTipText("Borra del contenedor al boton "+nombres[cuenta]);
      }

      // colocar botones en BorderLayout; 
      contenedor.add( botones[ 0 ], BorderLayout.NORTH ); 
      contenedor.add( botones[ 1 ], BorderLayout.SOUTH ); 
      contenedor.add( botones[ 2 ], BorderLayout.EAST );  
      contenedor.add( botones[ 3 ], BorderLayout.WEST );  
      contenedor.add( botones[ 4 ], BorderLayout.CENTER ); 

      setSize( 350, 200 );
      setVisible( true );
   
   }
   // manejar eventos de botón
   public void actionPerformed( ActionEvent evento )
   {
      for ( int cuenta = 0; cuenta < botones.length; cuenta++ )

         if ( evento.getSource() == botones[ cuenta ] )
            botones[ cuenta ].setVisible( false );
         else
            botones[ cuenta ].setVisible( true );

      // re-esquematizar el panel de contenido
      esquema.layoutContainer( getContentPane() );
   }
  
    public static void main(String[] args) {
      MiAplicacion a=new MiAplicacion();
    }
    
}
