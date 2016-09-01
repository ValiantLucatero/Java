import java.io.*; //No sabemos que importar
public class Flujos {
	public static void main(String[] args) {
		//Flujo de entrada que se va a estar leyendo
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br =  new BufferedReader(isr);

			System.out.println("Escribe algo y presiona enter");
				String b = br.readLine();
				System.out.printf("Del Flujo de entrada se leyo el caracter: %s\n");
		}catch (IOException e) {

		}
	}
}
