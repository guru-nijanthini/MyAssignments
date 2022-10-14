package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement elementUser = driver.findElement(By.id("username"));
		 elementUser.sendKeys("Demosalesmanager");
		 WebElement elementPassword = driver.findElement(By.id("password"));
		 elementPassword.sendKeys("crmsfa");
		 WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		 elementLogin.click();
		 WebElement elementCrmLink = driver.findElement(By.linkText("CRM/SFA"));
		 elementCrmLink.click();
		 WebElement elementLeadsLink = driver.findElement(By.linkText("Leads"));
		 elementLeadsLink.click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 //(//input[@name='firstName'])[3]
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("FN1");
		 ////div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		 //Verify title 
		 String A = driver.getTitle();
		if (A.equals("View Lead | opentaps CRM")) {
			System.out.println("The expected title is displaying");
		}else {System.out.println("Wrong title is displaying");}
		
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		////input[@class='inputBox']

		driver.findElement(By.xpath("//input[@class='inputBox']")).clear();
		driver.findElement(By.xpath("//input[@class='inputBox']")).sendKeys("new Cmp name");
		////input[@class='smallSubmit']
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Verify Company name
		String newCompany = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]")).getText();
		
		System.out.println("The current company name is : " + newCompany);
		if (newCompany.contains("new Cmp name")) {System.out.println("The updated company name is dispaying : Pass");}
		else { System.out.println("Updated company name is not displaying: Fail"); }
		driver.close();
			
			 
	}

}
