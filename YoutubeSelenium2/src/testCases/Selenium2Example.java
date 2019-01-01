package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium2Example {
	
	public static void main(String[] args) {
		
		//configure chrome driver
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\danju\\\\Downloads\\\\chromedriver.exe");
		
		// Create a instance for Chrome Driver
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

	}

}
