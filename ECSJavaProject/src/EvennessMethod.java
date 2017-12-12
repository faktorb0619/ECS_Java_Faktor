public class EvennessMethod
{
	public static void main(String[] args)
	{
		int n = 0;
		
		while(n <= 100)
		{
			n++;
			if(n % 2 == 0  && n % 3 !=0)
			{
				System.out.println(n + " <");
			}
			
			else if(n % 2 != 0 && n % 3 == 0)
			{
				System.out.println(n + " =");
			}
			
			else if(n % 2 == 0 && n % 3 == 0)
			{
				System.out.println(n + " <=");
			}
			
			else
			{
				System.out.println(n);
			}
		}
	}
}