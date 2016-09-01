import java.io.BufferedReader;
import java.io.PrintStream;
import java.net.Socket;
import java.io.IOException;
import java.io.InputStreamReader;
public class ClienteTCP
{
	public static void main(String[] args)
	{
		//Buffer recibir respuesta servidor
		BufferedReader entradaServidor = null;
		//Flujo para mandar nuestros datos:
			//PrintStream -> nivel bytes
			//PrintWrite -> nivel mas alto
		PrintStream salidaCliente = null;
		//Buffered para el teclado:
		BufferedReader tec = null;
		Socket sock = null;
		try
		{
			//Inicializar socket:
			sock = new Socket("127.0.0.1",9000);
			//Terminamos de declarar los buffers
			entradaServidor = new BufferedReader(new InputStreamReader(sock.getInputStream()));
			salidaCliente = new PrintStream(sock.getOutputStream());
			tec = new BufferedReader(new InputStreamReader(System.in));
			while (true)
			{
				String cadena = tec.readLine();
				if ((cadena==null)||cadena.equals("adios"))
				{
					System.out.println("Conexion terminada");
					break;
				}
				salidaCliente.println(cadena);
				System.out.println(entradaServidor.readLine());
			}
		}
		catch(Exception e){}
		//Cerrar todo:
		try
		{
			entradaServidor.close();
			salidaCliente.close();
			tec.close();
			sock.close();
		}
		catch(IOException e){}
	}
}