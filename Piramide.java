public class Piramide
{
	public static void main(String[] args)
	{	
		//Piramide normal
		//String a="M";
		//int i=1;
		//while (i<10)
		//{
			//System.out.println(a);
			//a+"M";
			//i++;
		//}
		
		//Piramide invertida
		int i=1,j=10;
		String a="MMMMMMMMMMMMMMMMM";
		while (i<j)
		{
			System.out.println(a);
			a=a.substring(0,j-i);
			i++;
		}
		
	}		
}
