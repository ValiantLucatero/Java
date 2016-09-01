public class Nombres
{
	public static void main(String[] args)
	{
		//Creamos un objeto que implemente la interfaz Runnable
		NombresHilo nr = new NombresHilo();

		Thread uno = new Thread(nr);
		Thread dos = new Thread(nr);
		Thread tres = new Thread(nr);

		uno.setName("Jonathan");
		dos.setName("Nicky");
		tres.setName("Lucario");

		uno.start();
		dos.start();
		tres.start();
	}
}
