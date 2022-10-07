package week1.day2.assignments;

public class PrimeNumber {
	
	public static void main(String args[]){ 
		
		  int i,n=13, m=0;
		  boolean flag = false;      
		  m=n/2;      
		  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){            
		     flag = true;      
		     break;      
		    }   
		   }
		      
		   if(flag=true)  { System.out.println(n+" is prime number"); }  
		   else if (flag=false) {System.out.println(n+" is not prime number");
		  }
		}    
		
	
	
}
