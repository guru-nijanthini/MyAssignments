package assignment.Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("https://login.salesforce.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		 driver.findElement(By.id("password")).sendKeys("Password#123");
		 driver.findElement(By.id("Login")).click();
		 //(//span[@class=' label bBody'])[2]
		 driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
		 Set<String> wSet1=driver.getWindowHandles();
		 ArrayList<String> wList1=new ArrayList<String>(wSet1);
		 driver.switchTo().window(wList1.get(1));
		 ////button[text()='Confirm']
		 driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		 String tPage= driver.getTitle();
		 System.out.println("Title of Home page is :  "+ tPage);
		 driver.switchTo().window(wList1.get(0));
		 driver.quit();


	}

}
