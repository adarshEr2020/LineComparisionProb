public class lineComparisionProb
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Line Comparision Computation");
		int x1, x2, y1, y2;
		x1=2; x2=5; y1=6; y2=9;
		// Simple way to calculate
		double length = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		// OR using Pow method
		//double length = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		System.out.println("Length of line :" + length);
	}
}
