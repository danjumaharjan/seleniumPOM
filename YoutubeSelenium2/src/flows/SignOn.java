package flows;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.*;


public class SignOn {
	
	public void signin (WebDriver driver) throws InterruptedException {
		
		driver.findElement(By.xpath(SignIn.link_signOn)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(SignIn.textbox_userName)).sendKeys("rabinamaharjan");
		driver.findElement(By.xpath(SignIn.textbox_password)).sendKeys("siddhipur@city");
		driver.findElement(By.xpath(SignIn.button_submit)).click();
		Thread.sleep(5000);
	}
}
