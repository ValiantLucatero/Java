import java.util.Scanner;
public class EjercicioArray{
	public static void main(String[] args) {
		int x[] = {1,2,3};
		Scanner teclado = new Scanner(System.in);
		int local = 0;
		boolean continuar = true;
		do{
			try{
				System.out.println("Ingresa un numero");
				x[local] = teclado.nextInt();
				local++;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Te pasaste del limite del arreglo");
				continuar= false;
			}
		}while(continuar);
	}
}