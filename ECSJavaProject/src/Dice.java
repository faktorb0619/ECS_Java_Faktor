import java.util.Random;

public class Dice
{
	public static void main (String[] args)
	{
		Random r = new Random();
		int rollone = 1 + r.nextInt(6);
		int rolltwo = 1 + r.nextInt(6);
		
		System.out.println("HERE COMES THE DICE! ");
		
		System.out.println("Roll #1: " + rollone);
		System.out.println("Roll #2: " + rolltwo);
		
		System.out.println("The total is " + (rollone + rolltwo) + "!");
		
		
		
		
	}
}