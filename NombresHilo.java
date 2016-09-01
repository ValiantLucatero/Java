public class NombresHilo implements Runnable
{
	public void run()
	{
		for (int x = 1; x <= 3000 ; x++)
		{
			System.out.println("Hilo "+Thread.currentThread().getName()+" lanzado!");
		}
	}
}
