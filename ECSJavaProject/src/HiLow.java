import java.util.Random;

import java.util.Scanner;

public class HiLow
{
	Scanner keyboard = new Scanner(System.in);
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Random r = new Random();
		int random = 1 + r.nextInt(100);
		double actual;
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it. ");
		actual = keyboard.nextDouble();
		
		if(random < actual)
		{
			System.out.println("Sorry, that's too low. ");
		}
		
		if(random > actual)
		{
			System.out.println("Sorry, that's too high. ");
		}
		
		if(random == actual)
		{
			System.out.println("Wow! That's right! What are the chances? ");
		}
	}
}
