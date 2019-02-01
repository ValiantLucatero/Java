import java.util.Scanner;
public class Multiplos
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa un valor a sacar multiplos");
		x = teclado.nextInt();
		System.out.println("Ingresa el multiplo limite");
		y = teclado.nextInt();
		System.out.println("Los multiplos de "+x+" hasta "+y+" son: ");
		for(int i=1; x*i<=y; i++)
		{
			System.out.println(x*i);
		}
	}
}
