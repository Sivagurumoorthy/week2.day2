package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// launch the Browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("http://leaftaps.com/opentaps");
		// Maximize the browser
		driver.manage().window().maximize();
		//get the title
		String Title = driver.getTitle();
		System.out.println(Title);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		// Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click on login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		// click on create leads
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("SCUMBERNET");
		driver.findElement(By.xpath("//input[@class = 'inputBox' and @name = 'firstName']")).sendKeys("SIVAGURU");
	driver.findElement(By.xpath("//input[@class = 'inputBox' and @name = 'lastName']" )).sendKeys("G");
	
	
	
	
	}

}
