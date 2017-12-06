import java.util.Scanner;

public class CountingMachineRevisited
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number, by;
		int n;
		
		System.out.println("Count to: ");
		number = keyboard.nextInt();
		
		System.out.println("Count by: ");
		by = keyboard.nextInt();
		
		System.out.println("Starting from: ");
		n = keyboard.nextInt();
		
		
		while(n <= number)
		{
			System.out.println(n );
			n += by;
		}
	}
}