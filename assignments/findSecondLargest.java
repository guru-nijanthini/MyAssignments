package week1.day2.assignments;

import java.util.Arrays;

public class findSecondLargest {
	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int i= data.length;
		System.out.println("The second largest number in array is : "+ data[i-2]);
		
	}

}
