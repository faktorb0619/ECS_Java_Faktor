import java.util.Random;

public class Magic8Ball
{
	public static void main (String[] args)
	{
		Random r = new Random();
		int choice = 1 + r.nextInt(15);
		String response = "";
		
		if (choice ==1)
			response = "It is certain";
		
		else if(choice ==2)
			response = "It is decidedly so";
		
		else if(choice ==3)
			response = "Without a doubt";
		
		else if(choice ==4)
			response = "Yes - definitely";
		
		else if(choice ==5)
			response = "You may rely on it";
		
		else if(choice ==6)
			response = "As I see it, yes";
		
		else if(choice ==7)
			response = "Most likely";
		
		else if(choice ==8)
			response = "Outlook is good";
		
		else if(choice ==9)
			response = "Signs point to yes";
		
		else if(choice ==10)
			response = "Yes";
		
		else if(choice ==11)
			response = "Reaply hazy, try again";
		
		else if(choice ==12)
			response = "Ask again later";
		
		else if(choice ==13)
			response = "Better not tell you now";
		
		else if(choice ==14)
			response = "Cannot predict now";
		
		else if(choice ==14)
			response = "Concentrate and ask again";
		
		else
			response = "8-BALL ERROR! RE-ENTER!";
		
		System.out.println("Magic 8-Ball Says: " + response);
			
	}
}
