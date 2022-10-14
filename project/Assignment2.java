package week2.day1.project;




	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Assignment2 {
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
			 //Create Lead
			 driver.findElement(By.linkText("Create Lead")).click();
			 //createLeadForm_companyName
			 WebElement elementCmpName = driver.findElement(By.id("createLeadForm_companyName"));
			 elementCmpName.sendKeys("test2");
			 //createLeadForm_firstName
			 WebElement elementFName = driver.findElement(By.id("createLeadForm_firstName"));
			 elementFName.sendKeys("test2 F name");
			 //createLeadForm_lastName
			 WebElement elementLName = driver.findElement(By.id("createLeadForm_lastName"));
			 elementLName.sendKeys("test2 L name");
			 //createLeadForm_firstNameLocal
			 WebElement elementFLName = driver.findElement(By.id("createLeadForm_lastName"));
			 elementFLName.sendKeys("test2");
			 //id="createLeadForm_departmentName"
			 WebElement elementDeptName = driver.findElement(By.id("createLeadForm_departmentName"));
			 elementDeptName.sendKeys("test2 Dept");
			 //createLeadForm_description
			 WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
			 elementDescription.sendKeys("test2 Description kjewkjer rewh");
			 //id="createLeadForm_primaryEmail", name="primaryEmail
			 WebElement elementEmail = driver.findElement(By.id("createLeadForm_primaryEmail"));
			 elementEmail.sendKeys("test2@gamil.com");
			 //ext-gen702
			 //driver.findElement(By.id("ext-gen702")).click();
			 WebElement elementCreateLead=driver.findElement(By.className("smallSubmit"));
				elementCreateLead.click();
			 System.out.println("Title of the page is : "+ driver.getTitle());
			 //class="subMenuButton", id="ext-gen594", link text=Edit
			 
			 WebElement elementEdit=driver.findElement(By.linkText("Edit"));
			 elementEdit.click();
			 //updateLeadForm_description
		  

			 WebElement elementEditDes=driver.findElement(By.id("updateLeadForm_description"));
			 System.out.println("Value entered: " + elementEditDes.getAttribute("value"));
			 elementEditDes.clear();
			 System.out.println("Value After clear " + elementEditDes.getAttribute("value"));

			 //updateLeadForm_importantNote
			 WebElement elementIN = driver.findElement(By.id("updateLeadForm_importantNote"));
			 elementIN.sendKeys("wuefuwe hriwreuh validate new message");
			 //Click on edit : smallSubmit
			 WebElement elementULead=driver.findElement(By.className("smallSubmit"));
			 elementULead.click();
			 System.out.println("Title of the page is : "+ driver.getTitle());
		}

}
