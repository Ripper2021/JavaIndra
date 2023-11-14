package JLabel;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo3 {
	public static void main (String[] args)
	{
	JFrame ventana = new JFrame ("esta es mi ventana");
	JLabel etiqueta = new JLabel ("Esta es mi etiqueta");
	etiqueta.setOpaque(true);
	etiqueta.setForeground(Color.WHITE);
	etiqueta.setBackground(Color.BLACK);
	ventana.add(etiqueta);
	ventana.setVisible(true);
	ventana.setSize(300,300);
	}

}
