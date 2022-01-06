package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoToHomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
       driver.findElement(By.xpath("//a[@class='wp-categories-link maxheight']")).click();
       driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gurusmart123@gmail.com");
       Thread.sleep(5000);
       
       WebElement app = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
       
       app.sendKeys(" AND MAKE NEW");
       
       WebElement Sapp = driver.findElement(By.xpath("//input[@value='Clear me!!']"));
       Sapp.clear();
       
       
     

	}

}
