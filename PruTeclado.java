import java.io.*;
public class PruTeclado{
	public static void main(String[] args) {
		LectorTeclado obj = new LectorTeclado();
		System.out.println("Ingrese una cadena: ");
				try{
					System.out.println(obj.leerCadena());
				}catch (IOException e) {

				}
	}
}
