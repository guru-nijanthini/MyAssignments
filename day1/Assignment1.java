package assignment.Week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Merge Contacts")).click();
		 //from contact
		 driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		 Set<String> wSet1=driver.getWindowHandles();
		 ArrayList<String> wList1=new ArrayList<String>(wSet1);
		 driver.switchTo().window(wList1.get(1));
		 driver.manage().window().maximize();
		 ////div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		 driver.switchTo().window(wList1.get(0));
		 //to contact
		 //(//img[@src='/images/fieldlookup.gif'])[2]
		 driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		 Set<String> wSet2=driver.getWindowHandles();
		 ArrayList<String> wList2=new ArrayList<String>(wSet2);
		 driver.switchTo().window(wList2.get(1));
		 driver.manage().window().maximize();
		 //(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/following::table/tbody[1]/tr[1]/td[1]/div[1]/a[1]")).click();
		driver.switchTo().window(wList2.get(0));
		driver.findElement(By.linkText("Merge")).click();
		driver.switchTo().alert().accept();
		driver.switchTo().window(wList2.get(0));
		String tPage= driver.getTitle();
		System.out.println("Title of Home page is :  "+ tPage);
	}

}
