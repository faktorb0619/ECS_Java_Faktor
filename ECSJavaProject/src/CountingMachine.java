import java.util.Scanner;

public class CountingMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number, n;
		n = 1;
		
		System.out.println("Count to: ");
		number = keyboard.nextInt();
		while(n <= number)
		{
			System.out.println(n );
			n++;
		}
	}
}