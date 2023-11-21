
public class Hilo extends Thread 
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			try
			{
			Thread.sleep(1000); //Simulamos que se duerme. 
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		System.out.println("Tarea en segundo plano: " + i);	
		}
	}
	public static void main (String [] args)
	{
		Hilo miHilo = new Hilo();
		miHilo.start();
		for (int i = 0;i<5; i++)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println("Tarea en primer plano: "  + i);
		}		
	}
}