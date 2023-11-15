import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
	JFrame (ventana) -> JLabel (etiquetas) || JPanel -> JButtons
*/
public class EjemploJFrame 
{
	public static void main (String[] args)
	{
		JFrame ventana = new JFrame ("Este es mi programa");
		JLabel etiqueta = new JLabel();
		try
		{
			URL url = new URL("https://tripin.travel/wp-content/uploads/2016/12/parque-nacional-los-glaciares-perito-moreno-1-lonelyplanet-fcbk-1024x538.jpg");
			Image imagen = ImageIO.read(url); //Leer la imagen que esta en la URL y almacenarla en la variable Imagen
			etiqueta.setIcon(new ImageIcon(imagen));
		}
		catch(MalformedURLException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JPanel panel = new JPanel();
		JButton boton = new JButton ("Saludar");
		boton.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
				System.out.println("Bienvenid@ a mi ciudad");
			}
		});
		panel.add(etiqueta);
		panel.add(boton);
		ventana.add(panel);
		ventana.pack(); //Establecer un tamaño de la ventana en base a los elementos que estan dentro de la misma.
		ventana.setVisible(true);
	}	
}
