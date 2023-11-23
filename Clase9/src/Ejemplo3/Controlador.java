package Ejemplo3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {
	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista vista, Modelo modelo)
	{
		this.vista = vista;
		this.modelo= modelo;
		this.vista.agregarListener(new BotonListener());
	}
	
	class BotonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) {
			String nombreIngresado = vista.obtenerNombre();
			modelo.setNombre(nombreIngresado);
			vista.actualizarEtiqueta(modelo.getNombre());
		}
	}
}
