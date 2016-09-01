public class PruebaProceso
{
	public static void main(String[] args)
	{
		Proceso hilo1 = new Proceso ("Hilo 1");
		Proceso hilo2 = new Proceso ("Hilo 2");
		Proceso hilo3 = new Proceso ("Hilo 3");
		Proceso hilo4 = new Proceso ("Hilo 4");

		hilo1.setMensaje("Mensaje generado por hilo 1");
		hilo2.setMensaje("Mensaje por hilo 2");
		hilo3.setMensaje("Mensaje por hilo 3");
		hilo4.setMensaje("Mensaje por hilo 4");

		hilo1.start();
		try
		{
			hilo1.join();
		}
		catch (Exception e)
		{

		}

		hilo2.start();
		hilo3.start();
		hilo4.start();
		System.out.println("El hilo 1 esta vivo?" + hilo1.isAlive());
	}
}
