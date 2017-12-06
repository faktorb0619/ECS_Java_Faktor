import java.util.Random;

public class DoubleDice
{
	public static void main (String[] args)
	{
		Random r = new Random();
		
		int rollone = 1 + r.nextInt(6);
		int rolltwo = 1 + r.nextInt(6);
		
		System.out.println("HERE COMES THE DICE! ");
		
		do
		{
			System.out.println("Roll #1: " + rollone);
			System.out.println("Roll #2: " + rolltwo);
			System.out.println("The total is " + (rollone + rolltwo) + "!");
			rollone = 1 + r.nextInt(6);
			rolltwo = 1 + r.nextInt(6);
		}   while(rollone != rolltwo);
		
		System.out.println("Roll #1: " + rollone);
		System.out.println("Roll #2: " + rolltwo);
		System.out.println("That's a pair!");	
	}
}