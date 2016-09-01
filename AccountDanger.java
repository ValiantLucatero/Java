import java.util.Random;
public class AccountDanger implements Runnable
{
	private Account acc = new Account();
	Random rnd = new Random();

	@Override
	public void run()
	{
		try
		{
			for (int x = 0; x < 50; x++)
			{
				makeWithdrawal ( (int) (Math.random() * 100) );
				if (acc.getBalance() < 0)
				{
					throw new InterruptedException();
				}
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("Account is overdrawn");
		}
	}
	private void makeWithdrawal(int amount)
	{
		if (acc.getBalance() >= amount)
		{
			System.out.println(Thread.currentThread().getName()+" is going to withdraw");
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{

			}
			acc.withdraw(amount);
			System.out.println(Thread.currentThread().getName()+" got $"+amount);
		}
		else
		{
			System.out.println("Not enough $$$");
		}

	}
	public static void main(String[] args)
	{
		AccountDanger r = new AccountDanger();
		Thread one = new Thread(r);
		Thread two = new Thread(r);

		one.setName("Pietro");
		two.setName("Wanda");

		one.start();
		two.start();
	}
}
