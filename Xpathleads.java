package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpathleads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		System.getProperty("webdriver.chrome.driver");
		// launch the Browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leaftaps.com/opentaps");
		// Maximize the browser
		driver.manage().window().maximize();
		//get the title
		String Title = driver.getTitle();
		System.out.println(Title);
		// Enter the Username
	WebElement userName = driver.findElement(By.id("username"));
userName.sendKeys("DemoSalesManager");
//Enter the Password
driver.findElement(By.id("password")).sendKeys("crmsfa");
//click on login button
driver.findElement(By.className("decorativeSubmit")).click();

//click on CRM/SFA Link
driver.findElement(By.linkText("CRM/SFA")).click();
//click on contacts tab
driver.findElement(By.linkText("Contacts")).click();

//click on Create Contact
driver.findElement(By.linkText("Create Contact")).click();
//Enter the First Name
driver.findElement(By.xpath("//input[@name='firstName' and @id='firstNameField']")).sendKeys("SIVA GURUMOORTHY");
//
//// Enter the last name
driver.findElement(By.xpath("(//input[@class='inputBox'])[2]")).sendKeys("G");
//// CLICK THE CREATE BUTTON
driver.findElement(By.className("smallSubmit")).click();


	}

}
