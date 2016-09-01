import java.util.Scanner;
public class Multiplicaciones extends Thread
{
	int numero;
	public Multiplicaciones(int numero)
	{
		this.numero=numero;
	}

	@Override
	public void run()
	{

		for (int e = 1; e < 11; e++)
		{
			System.out.println(numero+"x"+e+"="+this.numero*e);
		}
	}
	public static void main(String[] args)
	{
		for (int i = 1; i < 11; i++)
		{
			Multiplicaciones hilo =new Multiplicaciones (i);
			hilo.start();
		}

	}
}
