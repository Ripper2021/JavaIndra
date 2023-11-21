
public class EjemploMultiplesHilos 
{
	public static void main (String [] args)
	{
	Thread hilo1 = new Thread(new Tarea("Hilo 1"));
	Thread hilo2 = new Thread(new Tarea("Hilo 2"));
	Thread hilo3 = new Thread(new Tarea("Hilo 3"));
	hilo1.start();
	hilo2.start();
	hilo3.start();
	System.out.println("Se estan inicializando los hilos");
	}

	static class Tarea implements Runnable
	{
		private String nombre;
		public Tarea(String nombre)
		{
			this.nombre= nombre;
		}
		public void run()
		{
			for(int i= 1;i<=5; i++)
			{
				System.out.println(nombre + "mensaje: " + i);
			}
		}
	}
	
	
}


