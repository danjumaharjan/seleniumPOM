package infrastructure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {

	public WebDriver launchBrowser(String url) {
		// create static WebDriver
		WebDriver driver = null;

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\danju\\\\Downloads\\\\chromedriver.exe");	
			driver = new ChromeDriver();// Create a instance for Chrome Driver
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;
	}
}
