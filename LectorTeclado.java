import java.io.*;
public class LectorTeclado{
	public String leerCadena() throws IOException{
		String s= "";
		//InputStreamReader isr = new InputStreamReader(System.in);
		//BufferedReader br = new BufferedReader(isr);
		BufferedReader nf = new BufferedReader(new InputStreamReader(System.in));
			s = nf.readLine();
			return s;
	}

	public int leerEntero() throws IOException,NumberFormatException{
		int v = 0;
		BufferedReader nf = new BufferedReader(new InputStreamReader(System.in));
			v = Integer.parseInt(nf.readLine());
			return v;
	}

	public float leerFlotante() throws IOException,NumberFormatException{
		float n = 0;
		BufferedReader nf = new BufferedReader(new InputStreamReader(System.in));
			n = Float.parseFloat(nf.readLine());
			return n;
	}

	public double leerDoble() throws IOException,NumberFormatException{
		double n = 0;
		BufferedReader nf = new BufferedReader(new InputStreamReader(System.in));
			n = Double.parseDouble(nf.readLine());
			return n;
	}
}
