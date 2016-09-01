public class HiloThread extends Thread
{
	private boolean stop = false;

	public HiloThread(String nombre)
	{
		super(nombre);
	}

	@Override
	public void run()
	{
		int i = 0;
		System.out.println("Hilo "+getName()+" vivo "+isAlive());

		while (!stop)
		{
			System.out.println("Hilo "+getName()+" ejecutandose... "+ i++);
		}
		System.out.println("El hilo "+getName()+" ha terminado.");

	}
	public void detener()
	{
		stop = true;
	}
}
