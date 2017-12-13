import java.util.Scanner;

public class FindingPrimes2 
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		long lower, upper;
		
		lower = keyboard.nextLong();
		upper = keyboard.nextLong();
		
		for (long i = lower; i <= upper; i++) 
		{
			if(checkPrimality(i))
			{
				System.out.println(i + " <");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean checkPrimality(long a)
	{
		for (long i = 2; i<=Math.sqrt(a); i++) 
		{
			if(a % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
