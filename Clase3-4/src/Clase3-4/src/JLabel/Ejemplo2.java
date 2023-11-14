package JLabel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo2 
{
	public static void main (String [] args)
	{
	JFrame ventana = new JFrame ("Otro ejemplo");
	ImageIcon icono = new ImageIcon("C:\\Users\\Gusta\\OneDrive\\Documentos\\icono.png");
	JLabel etiqueta = new JLabel ("Este es mi programa!", icono, JLabel.CENTER);
	ventana.add(etiqueta);
	ventana.pack();
	ventana.setVisible(true);
}
}