package week1.day2.assignments;

public class SumOfDigits {
	
	public static void main(String[] arg)
	{
		int num=758;
		int sum=0, digit=0;
		while(num > 0)  
		{      
		digit = num % 10;  
		sum = sum + digit;  
		num = num / 10;  
		}  
		System.out.println("The sum of digit is : " +sum);
	}

}
