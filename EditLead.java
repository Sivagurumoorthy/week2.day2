package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
	  driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("SIVA GURUMOORTHY");
	   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	   
       Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
    
    System.out.println(driver.getTitle()); 
    driver.findElement(By.xpath("//a[text()='Edit']")).click();
    WebElement Companyname = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName'][@name='companyName']"));
    Companyname.clear();
    Companyname.sendKeys("SIEMENS");
    driver.findElement(By.className("smallSubmit")).click();
    driver.close();
    
    
        

	}

}
