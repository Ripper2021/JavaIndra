package Ejemplo3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Vista extends JFrame
{	
	private Modelo modelo;
	private JLabel etiqueta;
	private JTextField campoNombre;
	private JButton boton;
	public Vista()
	{
		setTitle("Mi otra ventana");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		JLabel etiqueta = new JLabel("Ingresa tu nombre: ");
		etiqueta.setText("gustavo");
		campoNombre = new JTextField(20);
		boton = new JButton("Aceptar");
		getContentPane().add(etiqueta);
		getContentPane().add(campoNombre);
		getContentPane().add(boton);
		boton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						String nombreIngresado = obtenerNombre();
						actualizarEtiqueta(nombreIngresado);
					}
				});
	}
	public void agregarListener(ActionListener listener)
	{
		boton.addActionListener(listener);
	}
	
	public String obtenerNombre()
	{
		return campoNombre.getText();
	}
	
	public void actualizarEtiqueta(String nuevoNombre)
	{
		etiqueta.setText("Hola, " + nuevoNombre + "!");
	}
	
	public void mostrarEtiqueta(JLabel etiqueta)
	{
		etiqueta.setText("gustavo");
		getContentPane().add(etiqueta);
	}
}