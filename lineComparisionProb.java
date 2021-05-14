public class lineComparisionProb
{
	public static void main(String args[])
	{
		System.out.println("Welcome to Line Comparision Computation");
		// line 1 computation
		int x1, x2, y1, y2;
		x1=2; x2=5; y1=6; y2=9;
		// Simple way to calculate
		double length1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		// OR using Pow method
		//double length = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		System.out.println("Length1 of line :" + length1);
		// line 2 computation
		int p1=3, p2=4, q1=6, q2=4;
		double length2 = Math.sqrt((p2-p1)*(p2-p1) + (q2-q1)*(q2-q1));
		System.out.println("Length2 of line :" + length2);
		if (length1 == length2)
			System.out.println("line is Equal");
		else if(length1 > length2)
			System.out.println("Greater then");
		else if(length1 < length2)
                        System.out.println("Less then");
		else
			System.out.println("line is Not Equal");
	}
}
