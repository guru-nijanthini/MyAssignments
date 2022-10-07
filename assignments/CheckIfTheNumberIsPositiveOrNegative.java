package week1.day2.assignments;

public class CheckIfTheNumberIsPositiveOrNegative {
	public static void main(String[] arg) {
		int n[]= {1,0,-9};
		int nSize=n.length;
		for (int i=0;i<nSize;i++)
		{
			if (n[i]>0) {System.out.println("The number is positive: "   +   n[i]);}
			else if (n[i]<0) { System.out.println("The number is Negative: "   + n[i]); }
			else if (n[i]==0) {System.out.println("The number is neither positive nor negative: "  + n[i]);}
			}
		
	}

}
