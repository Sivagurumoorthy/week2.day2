package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Html {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
       driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]")).click();
       driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).click();
       driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
       driver.findElement(By.xpath("(//a[@class='wp-categories-link maxheight'])[3]")).click();
       driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();
       
	}

}
