import java.io.IOException;
public class TestHilo
{
	public static void main(String[] args) throws IOException
	{
		HiloThread miHilo = new HiloThread("Jonathan");
		System.out.println("Hilo "+ miHilo.getName()+" vivo "+miHilo.isAlive());

		//Proceso que se ejecuta en segundo plano
		miHilo.setDaemon(true);

		miHilo.start();

		System.in.read();

		miHilo.detener();
	}
}
