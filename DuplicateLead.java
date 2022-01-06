package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress'][@type='text']")).sendKeys("gurusmart123@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();	
		Thread.sleep(5000);
		
		String CaptureFirstElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']")).getText();
		System.out.println(CaptureFirstElement);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@class='smallSubmit'][@value='Create Lead']")).click();
		String DuplicateTitle = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		System.out.println(DuplicateTitle);
		if(DuplicateTitle.equalsIgnoreCase(CaptureFirstElement))
		{
			System.out.println("duplicated lead name is same as captured name");
		}
		else {
			System.out.println("duplicated lead name is not same as captured name");
		}
	
		Thread.sleep(5000);
		driver.close();
		
		
		
	}

}
