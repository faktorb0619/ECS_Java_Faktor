import java.util.Random;
import java.util.Random;

import java.util.Scanner;

public class KeepGuessing 
{	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int actual = 1 + r.nextInt(10);;
		int entry;
			
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		entry = keyboard.nextInt();
		
		System.out.println("Your guess: " + entry);
		
		while(entry != actual)
		{
			System.out.println("\nThat is incorrect. Guess again.");
			entry = keyboard.nextInt();
			System.out.println("Your guess: " + entry);
		}
		
		System.out.println("\nThat's right! You're a good guesser.");	
	}
}