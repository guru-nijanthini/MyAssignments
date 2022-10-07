package week1.day2.assignments;

public class printDuplicatesInArray {
public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int l = arr.length;
		int i=0,j=0;
		
		for (i=0;i<l;i++)
		{
		
			int count=0;
			for (j=0;j<l;j++)
			{
				if (arr[i]==arr[j])
				{
					count = count+1;
				}
				
			}
			if (count>1) { System.out.println("The Duplicate array value is :" +arr[i] );}
		}
}
		

}
