import java.util.Scanner;

public class HowOldSpecifically 
{
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println( "Hello. What is your name? ");
		name = keyboard.next();
		
		System.out.println( "Ok " + name + ", how old are you?");
		age = keyboard.nextInt();
		
		if (age < 16)
		{
			System.out.println( "You can not drive.");
		}
		
		else if (age > 16 && age < 17)
		{
			System.out.println( "You can drive but not vote.");
		}
		
		else if (age > 17 && age < 25)
		{
			System.out.println( "You can vote but not rent a car.");
		}
		
		else
		{
			System.out.println( "You can pretty much do whatever you want.");
		}
	}
}