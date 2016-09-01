import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
public class ClienteUDP
{
	public static void main(String[] args)
	{
		try
		{
			//Clase de UDP: DatagramSocket
			/*Creacion, empaquetamiento, envio y espera de respuesta*/

			/*Mensaje*/
			DatagramSocket socketUDP = new DatagramSocket();

			byte[] mensaje = new String("hola desde el cliente").getBytes();

			/*Nombre del host*/
			InetAddress hostServidor = InetAddress.getByName("localhost");

			/*Puerto*/
			int puertoServidor = 9999;

			//Construimos el datagrama a enviar
			DatagramPacket peticion = new DatagramPacket(mensaje, mensaje.length, hostServidor, puertoServidor);

			//Enviamos el datagrama
			socketUDP.send(peticion);

			byte [] mensajeServidor = new byte[1024];

			//Experar la respuesta...
			DatagramPacket respuesta = new DatagramPacket(mensajeServidor, mensajeServidor.length);

			//Recibimos la respuesta :)
			socketUDP.receive(respuesta);

			System.out.println("Servidor: "+ new String(respuesta.getData()));

			//Cerramos el socket
			socketUDP.close();
		}
		catch(Exception ex)
		{
			System.out.println("Excepcion :(");
		}
	}
}