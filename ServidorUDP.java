import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.DatagramPacket;
public class ServidorUDP
{
	public static void main(String[] args)
	{
		try
		{
			//Solo nos interesa el puerto de escucha
			DatagramSocket socketUDP = new DatagramSocket(9999);

			byte[] mensaje = new byte [1024];

			//Aceptacion y procesamiento
			DatagramPacket peticion = new DatagramPacket(mensaje,mensaje.length);

			socketUDP.receive(peticion);

			System.out.println("Datagrama recibido: "+peticion.getData());
			System.out.println("Del host: "+peticion.getAddress());
			System.out.println("Desde el puerto: "+peticion.getPort());

			DatagramPacket respuesta = new DatagramPacket(peticion.getData(),peticion.getLength(),peticion.getAddress(),peticion.getPort());

			socketUDP.send(respuesta);

		}
		catch(SocketException se)
		{
			System.out.println("Excepcion del Socket :(");
		}
		catch(IOException io)
		{
			System.out.println("Excepcion de entrada :(");
		}
	}
}