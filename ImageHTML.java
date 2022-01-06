package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageHTML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
        driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
       driver.findElement(By.xpath("//img[@alt='Images']")).click();
       driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
}
}
