package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContacts {

	public static void main(String[] args) {
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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("SIVA");
		driver.findElement(By.id("lastNameField")).sendKeys("GURU");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("AUTOMATION");
		driver.findElement(By.xpath("//textarea[@name='description'][@id='createContactForm_description']")).sendKeys("LEARNING SELENIUM");
		driver.findElement(By.xpath("//input[@name='primaryEmail'][@id='createContactForm_primaryEmail']")).sendKeys("siv@gmail.com");
		WebElement country = driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select dropdowncountry = new Select(country);
		dropdowncountry.selectByVisibleText("India");
		WebElement State = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropdownstate = new Select(State);
		dropdownstate.selectByVisibleText("TAMILNADU");
		driver.findElement(By.xpath("//input[@name='submitButton'][@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[text()='LEARNING SELENIUM']")).clear();
		driver.findElement(By.xpath("//input[@class='smallSubmit'][@value='Update']")).click();
		  String title = driver.getTitle();
		  System.out.println(title);
		
		
		

	}

}
