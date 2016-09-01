public class Proceso extends Thread
{
	String mensaje;

	public Proceso (String mensaje)
	{
		super(mensaje);
	}

	public void run()
	{
		for (int i = 0 ; i < 15 ; i++)
		{
			System.out.println(mensaje+"-->"+i);
			System.out.println("Este proceso ha terminado "+this.getName());
		}
	}

	public void setMensaje (String mensaje)
	{
		this.mensaje = mensaje;
	}
}
