/*
Hilo Demonio (Daemon Thread): Estos son los hilos que se 
ejecutan en un segundo plano y estan destinados a 
proporcionar servicio o realizar tareas de apoyo
La diferencia CLAVE es que, si todos los hilos NO demonio han terminado se detendra inmediatamente.
Independientemente de si termino o no. 
Los hilos demonio se utilizan para tareas que NO deben matener al programa en ejecución
Son los hilos mas comunes en Java.
*/
public class EjemploHiloDemonio {
	
	public static void main (String [] args) {
		Thread hiloDemonio = new Thread(new Tarea("Hilo demonio"));
		hiloDemonio.setDaemon(true);
		hiloDemonio.start();
		System.out.println("Los hilos se estan ejecutando");
	}
	
	/*
The Runnable interface should be implemented by 
anyclass whose instances are intended to be 
executed by a thread. 
Theclass must define a method of no arguments called run. 
This interface is designed to provide a 
common protocol for objects thatwish 
to execute code while they are active. 
For example, Runnable is implemented by class Thread.
Being active simply means that a thread has been 
started and has notyet been stopped. 
In addition, Runnable provides the means for a class 
to beactive while not subclassing Thread. 
A class that implements Runnable can run without 
subclassing Threadby instantiating a Thread instance 
and passing itself inas the target. 
In most cases, the Runnable interface 
shouldbe used if you are only planning to 
override the run()method and no other Thread methods.
This is important because classes should not be 
subclassedunless the programmer intends on 
modifying or enhancing the fundamentalbehavior 
of the class.

	
	*/
	static class Tarea implements Runnable
	{
		private String nombre;
		public Tarea(String nombre)
		{
			this.nombre= nombre;
		}
	public void run()
	{
		for (int i = 1; i<=5; i++)
		{
			System.out.println(nombre + ": Mensaje" + i);
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	}
}
