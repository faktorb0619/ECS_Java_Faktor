
public class MoreVariablesAndPrinting {

	public static void main(String[] args)
	{
		
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;
		
		myName = "Benjamin S. Faktor";
		myAge = 13;         // not a lie
		myHeight = 59;      // inches
		myWeight = 109;     // pounds
	    myEyes = "Blue";
		myTeeth = "White";
		myHair = "Dead grass";
				
		System.out.println("Let's talk about" + myName + ".");
		System.out.println("He's" + myHeight + "inches tall");
		System.out.println("He's" + myWeight + "pounds heavy.");
		System.out.println("He's pretty fat.");
		System.out.println("He's got" + myEyes + "eyes and" + myHair + "hair.");
		System.out.println("His teeth are usually" + myTeeth + "depending on the coffee.");
		
		System.out.println("If I add" + myAge + "," + myHeight + ", and" +myWeight + "I get" + (myAge + myHeight + myWeight) + ".");
	}
}
