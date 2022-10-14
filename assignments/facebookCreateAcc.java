package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookCreateAcc {

	public static void main (String[] arg)
	{
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();	
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]")).click();
		 driver.findElement(By.xpath("(//div[@class='_8esk']/following::input)[3]")).sendKeys("test45");
		 driver.findElement(By.xpath("(//input[@data-type='text'])[2]")).sendKeys("test46");
		 //(//input[contains(@class,'inputtext _58mg')])[3]
		 driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("9988776655");
		 ////input[@data-type='password']
		 driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("9988776655");
		 ////select[@title='Day']
		 Select day = new Select(driver.findElement(By.xpath("//select[@title='Day']")));
		 day.selectByValue("11");
		 Select month= new Select(driver.findElement(By.xpath("//select[@title='Month']")));
		 month.selectByVisibleText("Jun");
		 Select year = new Select(driver.findElement(By.xpath("//select[@title='Year']")));
		 year.selectByVisibleText("1996");
		 ////label[@for='u_s_4_Su']
		 driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		}
	

}
