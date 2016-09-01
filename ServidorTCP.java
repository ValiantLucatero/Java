import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class ServidorTCP
{
	public static void main(String[] args)
	{
		ServerSocket sock = null;
		try
		{
			//Primer paso definir nuestro socket:
			sock = new ServerSocket(9000);
			while(true)
			{
				Socket cliente = sock.accept();//Aceptar las peticiones y se guardaran en la variable cliente
				System.out.println("Se acepto conexion de: "+cliente.getInetAddress());
				//Logica
				servicioConexion(cliente);
			}
		}
		catch(IOException ex){}
		try
		{
			sock.close();
		}
		catch(Exception e){}

	}
	public static void servicioConexion(Socket cliente) throws IOException
	{
		//Buffered para recibir mensaje.
		BufferedReader entradaCliente = new BufferedReader (new InputStreamReader (cliente.getInputStream()));
		//Mandar el mensaje:
			//PrintStream -> bytes
			//OutputStreamWriter -> strings
		PrintStream salidaServidor = new PrintStream(cliente.getOutputStream());
		while(true)
		{
			//Almacenamos lo que mande el usuario
			String line = entradaCliente.readLine();
			System.out.println(cliente.getInetAddress()+" dice: "+line);
			if((line==null)||line.equals("adios"))
			{
				break;
			}
			salidaServidor.println("ServidorResponde: ["+line+"]");
			salidaServidor.flush();
		}
		//Cerrar todo.
		entradaCliente.close();
		salidaServidor.close();
		cliente.close();
	}
}