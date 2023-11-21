
public class EjemploHilos 
{
public static void main (String [] args)
{
	Thread hiloNoDemonio = new Thread(new Tarea("Hilo No Demonio"));
	Thread hiloDemonio = new Thread(new Tarea("Hilo Demonio"));
	hiloDemonio.setDaemon(true);
	hiloNoDemonio.setPriority(Thread.MAX_PRIORITY);
	hiloDemonio.setPriority(Thread.MIN_PRIORITY);
	hiloNoDemonio.start();
	hiloDemonio.start();
	try
	{
		hiloNoDemonio.join();
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	
	System.out.println("Hilo principal: el hilo no demonio ha terminado, el programa se cerrara");
	
	if(hiloNoDemonio.isAlive())
	{
		System.out.println("Hilo principal: El hilo demonio sigue en ejecución! Deteniendo el programa ");
		System.exit(0);
	}
}	
}
class Tarea implements Runnable
{
	private String nombre;
	public Tarea(String nombre)
	{
		this.nombre=nombre;
	}
	
	public void run()
	{
		for (int i = 1 ; i<=10; i++)
		{
			System.out.println(nombre + ": Mensaje " + i);
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
		System.out.println(nombre + "Ha terminado");
	}
}
