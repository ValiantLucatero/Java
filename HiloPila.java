import java.util.Stack;
import java.util.Random;
public class HiloPila extends Thread
{
	Stack<String> myStack;

	public HiloPila(Stack<String> myStack)
	{
		this.myStack = myStack;
	}

	public void run()
	{
		while (!myStack.isEmpty())
		{
			System.out.println(getName()+" saco el elemento "+eliminarElemento());
		}
	}

	public synchronized String eliminarElemento()
	{
		Random rand = new Random();
		try
		{
			Thread.sleep((long)(rand.nextDouble()*5000));
		}
		catch (InterruptedException ex)
		{

		}
		if (myStack.size() >0)
		{
			return myStack.pop();
		}
		return "No se puede retirar el elemento";
	}
}
