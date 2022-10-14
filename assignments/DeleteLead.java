package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
		 driver.findElement(By.linkText("Phone")).click();
		 driver.findElement(By.id("ext-gen262")).clear();
		 driver.findElement(By.id("ext-gen262")).sendKeys("96");
		 driver.findElement(By.xpath("//input[@id='ext-gen266']")).sendKeys("29");
		 driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("37");
		 ////button[text()='Find Leads']
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
		 driver.findElement(By.linkText("Delete")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.linkText("Phone")).click();
		 driver.findElement(By.id("ext-gen262")).clear();
		 driver.findElement(By.id("ext-gen262")).sendKeys("96");
		 driver.findElement(By.xpath("//input[@id='ext-gen266']")).sendKeys("29");
		 driver.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("37");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 String b = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		 //No records to display
		 if (b.equals("No records to display")) { System.out.println("Pass");
		 
		 }else {System.out.println("Fail");}
		 driver.close();


	}
		 
	

}
