public class DistanceFormula
{

	public static void main(String[] args)
	{
		
		double d1 = distance(-2,1 , 1,5);
		System.out.println( "(-2, 1) to (1, 5) is " + d1 );
		
		double d2 = distance(-2,1 , 1,5);
		System.out.println( "(-2, 1) to (1, 5) is " + d2 );
		
		System.out.println( "(2, -3) to (-1, -2) is " + distance(2,-3 , -1,-2) );
		
		System.out.println( "(4, 5) to (4, 5) is " + distance(4,5 , 4,5) );
		
	}
	
	public static double distance( long x1, long y1 , long x2, long y2)
	{
		
		double distance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
				
		return distance;
		
	}
	
}
