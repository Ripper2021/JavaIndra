package JLabel;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/* JFrame es una clase de Java que se encarga de generar
Una interfaz visual para el usuario, que contiene distintos
metodos y clases que nos permiten darle un nivel de sutileza mayor a nuestros desarrollos
¿Como se implementa? extends JFrame 
ActionListener: Se encarga de capturar los eventos que ocurren en la interfaz grafica.
JFrame : Ventana
setVisible = true
JFrame -> JLabel (Etiquetas, las etiquetas son textos.)
JFrame -> JButtons (Botones)
JPanel -> contiene a los JButons
JFrame -> JPanel -> Jbutton / JLabel 
*/



public class Calculadora extends JFrame implements ActionListener
{
	private JLabel pantalla;
	private double resultado = 0;
	private String operacion = "";
	private boolean nuevaOperacion = true;
	
	
	public Calculadora() //Declaro el constructor encargado de inicializar todo. 
	{
		setTitle("Calculadora"); //Titulo del programa
		setSize(300,200); //Alto y ancho de la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Operacion por default.
		pantalla = new JLabel("0"); //Le pongo una etiqueta de "0" para que se vea siempre que abro el programa.
		//estetica y distribución
		pantalla.setHorizontalAlignment(JLabel.RIGHT); //Establezco como se va a alinear el programa al momento de abrirse.
		pantalla.setPreferredSize(new Dimension (300,30)); //Establezco cual es el tamaño preferido. 
		add(pantalla, BorderLayout.NORTH); //estetica y distribución
		//Array de botones, que son los que va a tener el programa. 
		String [] nombreBotones = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "*", "/", "="};
		JPanel panelBotones = new JPanel();
		//Como se ve visualmente. 
		panelBotones.setLayout(new GridLayout(4,4)); //Armar una matriz de 4x4 por ejemplo
		
		for(int i = 0; i<nombreBotones.length; i++)
		{
			JButton boton = new JButton(nombreBotones[i]); // Declaro un JButton
			boton.addActionListener(this);  //Establezco el comportamiento de los botones
			panelBotones.add(boton); //Aca le agrego al panel los botones.
		}
		add(panelBotones, BorderLayout.CENTER); //Agrego el panel de Botones. 
		setVisible(true); //Hago visible la ventana del programa. 
	}
	
//ActionListener > Actionevent > getActionCommand()
	
	public void actionPerformed(ActionEvent e)
	{
		String textoBoton = e.getActionCommand(); //getActionCommand es el encargado de obtener la acción especifica.
		if(textoBoton.equals("0") || textoBoton.equals("1") || textoBoton.equals("2") ||
		   textoBoton.equals("3")|| textoBoton.equals("4") || textoBoton.equals("5") || textoBoton.equals("6") ||
		   textoBoton.equals("7") || textoBoton.equals("8") || textoBoton.equals("9") ||
		   textoBoton.equals("."))
		{
			if (nuevaOperacion)
			{
				pantalla.setText(textoBoton);
				nuevaOperacion = false;
			}
			else
				{
					pantalla.setText(pantalla.getText() + textoBoton);
				}
		}
			else if (textoBoton.equals("/") || textoBoton.equals("*")
					|| textoBoton.equals("-") || textoBoton.equals("+"))
				    	
			{
						if (!operacion.equals("")) 
						{
							calcular();
						}
						 operacion = textoBoton;
						 resultado = Double.parseDouble(pantalla.getText()); //Parseo el String a Double para hacer la operacion
						 nuevaOperacion = true;
			}
			else if (textoBoton.equals("="))
			{
				calcular();
				operacion = "";
				nuevaOperacion = true;
			}
	}
	public void calcular()
	{
		if (operacion.equals("+"))
		{
			resultado +=Double.parseDouble(pantalla.getText());
		}
		else if (operacion.equals("-"))
		{
			resultado -= Double.parseDouble(pantalla.getText());
		}
		else if (operacion.equals("*"))
		{
			resultado *= Double.parseDouble(pantalla.getText());
		}
		else if(operacion.equals("/"))
		{
			resultado /= Double.parseDouble(pantalla.getText());
		}
		pantalla.setText("" + resultado);
	}
	public static void main (String [] args)
	{
		Calculadora calc = new Calculadora();
	}
}