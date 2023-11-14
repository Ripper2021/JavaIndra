package JLabel;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo1 
{

	public static void main (String [] args)
	{
		JFrame ventana = new JFrame("Este es mi ejemplo de HolaMundo");
		JLabel etiqueta = new JLabel("Hola Mundo!");
		ventana.add(etiqueta);
		ventana.setSize(800,600);
		//ventana.pack(); //Ajustar el tamañan de la ventana segun el contenido del programa. 
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
