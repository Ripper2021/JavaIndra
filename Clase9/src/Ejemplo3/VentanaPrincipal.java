package Ejemplo3;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class VentanaPrincipal extends JFrame {
	private Modelo modelo;
	private Vista vista;
	private Controlador controlador;
	public VentanaPrincipal()
	{
		setTitle("Mi ventana de banca online");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel etiqueta = new JLabel();
		etiqueta.setText("Gustavo");
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel etiquetaPrincipal = new JLabel("Bienvenido! ");
		String textoConcatenado = etiquetaPrincipal.getText() + etiqueta.getText();
		JLabel etiqueta_final = new JLabel();
		etiqueta_final.setText(textoConcatenado);
		JButton abrirBoton = new JButton("Abrir nueva ventana");
		abrirBoton.addActionListener(e -> {
			if (vista == null)
			{
			vista = new Vista();
			modelo = new Modelo();
			controlador = new Controlador(vista, modelo);
			vista.mostrarEtiqueta(etiquetaPrincipal);
			vista.setVisible(true);
			}
		});
		panel.add(etiqueta_final, BorderLayout.NORTH);
		panel.add(abrirBoton, BorderLayout.CENTER);
		add(panel);
	}
	public static void main (String [] args)
	{
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}
}
