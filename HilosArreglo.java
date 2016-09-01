import java.util.Stack;
public class HilosArreglo
{
	public static void main(String[] args)
	{
		Stack<String> arreglo = new Stack<String>();
		HiloPila h1 = new HiloPila(arreglo);
		HiloPila h2 = new HiloPila(arreglo);
		HiloPila h3 = new HiloPila(arreglo);

		arreglo.add("Hola");
		arreglo.add("grupo");
		arreglo.add("java AM");
		arreglo.add("espero");
		arreglo.add("esten");
		arreglo.add("aprendiendo");
		arreglo.add("bien");
		arreglo.add("el");
		arreglo.add("tema");
		arreglo.add("2");
		arreglo.add("3");
		arreglo.add("4");
		arreglo.add("5");
		arreglo.add("6");

		h1.start();
		h2.start();
		h3.start();
	}
}
