package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
     driver.get("https://en-gb.facebook.com/");
     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     String Title = driver.getTitle();
		System.out.println(Title);
	     driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		 driver.findElement(By.xpath("//div[@class='_5dbb']/input[@name='firstname']")).sendKeys("Sel");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Class");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("secondid65@gmail.com");
		 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("99887766554433221");
		  WebElement dropdown = driver.findElement(By.id("day"));
			 Select day = new Select(dropdown);
			 day.selectByVisibleText("19");
			 WebElement dropdownmonth=driver.findElement(By.id("month"));
				Select month = new Select(dropdownmonth);
				month.selectByVisibleText("Sep");
				WebElement dropdownyear=driver.findElement(By.id("year"));
				Select year = new Select(dropdownyear);
				year.selectByVisibleText("1909");
		 driver.findElement(By.xpath("//label[text()='Female']")).click();
		 driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("secondid65@gmail.com");
		  
     

	}

}
