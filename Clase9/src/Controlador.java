public class Controlador 
{
	private Vista vista;
	public Controlador(Vista vista)
	{
		this.vista=vista;
		
	}
	public void generarIndex()
	{
		Usuario usuario = new Usuario();
		usuario.setNombre("Gustavo Vargas");
		usuario.setCorreo("gavargas@itformacion.com");
		vista.mostrarIndex(usuario);
	}
}
