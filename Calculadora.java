import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculadora{
	public static int suma (int s1,int s2){
		int res = s1 + s2;
		return res;
	}
	public static int resta (int m,int s){
		int res = m - s;
		return res;
	}
	public static int multiplicacion (int m1,int m2){
		int res = m1 * m2;
		return res;
	}
	public static int division (int d1,int d2){
		int res = d1 / d2;
		return res;
	}
	public static void main(String[] args) {
		System.out.println("CALCULADORA\nElige una opcion\n1)Suma\n2)Resta\n3)Multiplicacion\n4)Division\n5)Salir");
		Scanner teclado = new Scanner(System.in);
		boolean ciclo = true;
		int opcion = 0;
		while (ciclo==true)
		{
			try
			{
				opcion = teclado.nextInt();
				if (opcion==1) {
					System.out.println("Ingesa el primer sumando");
					int s1 = teclado.nextInt();
					System.out.println("Ingesa el segundo sumando");
					int s2 = teclado.nextInt();
					int res = suma(s1,s2);
					System.out.println(res);
				}
				if (opcion==2){
					System.out.println("Ingesa el minuendo");
					int m = teclado.nextInt();
					System.out.println("Ingesa el sustraendo");
					int s = teclado.nextInt();
					int res = resta(m,s);
					System.out.println(res);
				}
				if (opcion==3){
					System.out.println("Ingesa el primer multiplicando");
					int m1 = teclado.nextInt();
					System.out.println("Ingesa el segundo multiplicando");
					int m2 = teclado.nextInt();
					int res = multiplicacion(m1,m2);
					System.out.println(res);
				}
				if (opcion==4){
					System.out.println("Ingesa el dividendo");
					int d1 = teclado.nextInt();
					System.out.println("Ingesa el divisor");
					int d2 = teclado.nextInt();
					int res = division(d1,d2);
					System.out.println(res);
				}
				if (opcion==5){
					ciclo = false;
				}
				else
				{
					System.out.println("Ingresa una opcion del menu");
					ciclo = false;
				}
			}
			catch (InputMismatchException a){
				System.out.println("Ingesa un caracter valido");
				ciclo = false;
			}
			catch(ArithmeticException b)
			{
				System.out.println("No es posible realizar esa operacion");
				ciclo = false;
			}
		}	
	}
}
