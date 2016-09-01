import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStreamReader;
public class CHATmultihilo_Cliente
{
	private PrintStream ps;
	private String host;
	private int port;
	//Donde y por donde
	public void setHost(String host)
	{
		this.host = host;
	}
	public void setPort(int port)
	{
		this.port = port;
	}
	//Conexion con sockets
	public void conectar() throws IOException
	{
		Socket s = new Socket(host,port);
		ps = new PrintStream(s.getOutputStream());
	}
	//Enviar mensaje
	public void enviar(String mensaje) throws IOException
	{
		ps.println(mensaje);
	}
	//Cerrar conexion
	public void cerrar()throws IOException
	{
		ps.close();
	}
	public static void main(String[] args)
	{
		BufferedReader tec = new BufferedReader (new InputStreamReader(System.in));
		try
		{
			CHATmultihilo_Cliente c = new CHATmultihilo_Cliente();
			System.out.println("Ingrese el host: ");
			c.setHost(tec.readLine());
			System.out.println("Ingrese el puerto: ");
			c.setPort(Integer.parseInt(tec.readLine()));

			c.conectar();
			String str = "";
			while(!str.equals("salir"))
			{
				System.out.println("Mensaje: ");
				str = tec.readLine();
				c.enviar(str);
			}
			c.cerrar();
		}
		catch(Exception e){}
	}
}