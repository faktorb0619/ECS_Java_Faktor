import java.util.Scanner;

public class SpaceBoxing 
{
	Scanner keyboard = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		double weight;
		int visiting;
		
	    double Venus = 0.78;
		double Mars = 0.39;
		double Jupiter = 2.65;
		double Saturn = 1.17;
		double Uranus = 51.05;
		double Neptune = 1.23;
		
		System.out.println("Please enter your current earth weight:  ");
		weight = keyboard.nextDouble();
		
		System.out.println("I have information for Venus (1), Mars (2), Jupiter (3), Saturn (4), Uranus (5), and Neptune (6)");
		
		System.out.println("Which planet are you visiting? ");
		visiting = keyboard.nextInt();
		
		if (visiting == 1)
		{
			System.out.println("Your weight on Venus would be " + (weight * Venus) + ".");
		}
		
		else if (visiting == 2)
		{
			System.out.println("Your weight on Mars would be " + (weight * Mars) + ".");
		}
		
		else if (visiting == 3)
		{
			System.out.println("Your weight on Jupiter would be " + (weight * Jupiter) + ".");
		}
		
		else if (visiting == 4)
		{
			System.out.println("Your weight on Saturn would be " + (weight * Saturn) + ".");
		}
		
		else if (visiting == 5)
		{
			System.out.println("Your weight on Uranus would be " + (weight * Uranus) + ".");
		}
		
		else
		{
			System.out.println("Your weight on Neptune would be " + (weight * Neptune) + ".");
		}
	}
}
