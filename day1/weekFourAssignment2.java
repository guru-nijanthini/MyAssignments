package assignment.Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class weekFourAssignment2 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://leafground.com/window.xhtml");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		 Set<String> wSet1=driver.getWindowHandles();
		 ArrayList<String> wList1=new ArrayList<String>(wSet1);
		 driver.switchTo().window(wList1.get(1));
		 String tPage= driver.getTitle();
		 if (tPage.contains("Dashboard")) { System.out.println("new window is opened"); }
		 else {System.out.println("new open window is not open");}

		 driver.close();
		 System.out.println("new window is Closed"); 
		 driver.switchTo().window(wList1.get(0));

		 //open multiple validation

		 driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		 Set<String> wSet2=driver.getWindowHandles();
		 ArrayList<String> wList2=new ArrayList<String>(wSet2);
		System.out.println(" No of window opened :" +wList2.size());
		int i;
		for (i=wList2.size(); i<1 ; i--)
		{
			 driver.switchTo().window(wList2.get(i));
			 driver.close();
		}
		
		
		 driver.switchTo().window(wList1.get(0));
		 
		 //Close windows
		 driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		 Set<String> wSet3=driver.getWindowHandles();
		 ArrayList<String> wList3=new ArrayList<String>(wSet3);
		int j;
		for (j=wList3.size(); j<1 ; j--)
		{
			 driver.switchTo().window(wList3.get(j));
			 driver.close();
		}
		
		
		 driver.switchTo().window(wList1.get(0));
		 
		 //open with delay
		 
		//button[@id='j_idt88:j_idt95']//span[1]
		 
		 System.out.println("inside of open with delay");
			
		 driver.findElement(By.xpath("//button[@name='j_idt88:j_idt95']//span[1]")).click();
		 
		 System.out.println("button click");

		 Thread.sleep(1000);
		 Set<String> wSet4=driver.getWindowHandles();
		 ArrayList<String> wList4=new ArrayList<String>(wSet4);
		System.out.println(" No of window opened :" +wList4.size());
		

	}

}