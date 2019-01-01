package flows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.*;

public class Register {
	
	String expectedNote, actualNote;
	String expectedUserName = "rabinamaharjan";
	public void contactInformation(WebDriver driver) {
		
		//click register link
		driver.findElement(By.xpath(Registration.link_registerButton)).click();
		
		//contact information
		driver.findElement(By.xpath(Registration.textbox_firstName)).sendKeys("Rabina");
		driver.findElement(By.xpath(Registration.textbox_lastName)).sendKeys("Maharjan");
		driver.findElement(By.xpath(Registration.textbox_phoneNumber)).sendKeys("1234567890");
		driver.findElement(By.xpath(Registration.textbox_emailAddress)).sendKeys("rabinamaharjan@gmail.com");
	
		//mailing information
		driver.findElement(By.xpath(Registration.textbox_addressOne)).sendKeys("7100 San Ramon Road");
		driver.findElement(By.xpath(Registration.textbox_addressTwo)).sendKeys("Apt 137");
		driver.findElement(By.xpath(Registration.textbox_city)).sendKeys("Dublin");
		driver.findElement(By.xpath(Registration.textbox_state)).sendKeys("CA");
		driver.findElement(By.xpath(Registration.textbox_postalCode)).sendKeys("95468");
		//selectingn dropdown country
		WebElement selectCountry = driver.findElement(By.xpath(Registration.select_country));
		Select selectObj = new Select(selectCountry);
		selectObj.selectByIndex(143);
		
		//User Information
		driver.findElement(By.xpath(Registration.textbox_userName)).sendKeys("rabinamaharjan");
		driver.findElement(By.xpath(Registration.textbox_passWord)).sendKeys("siddhipur@city");
		driver.findElement(By.xpath(Registration.textbox_confirmPassword)).sendKeys("siddhipur@city");
		
		//click submit
		driver.findElement(By.xpath(Registration.button_submitButton)).click();
		
		//validation or confirmation
		String expectedNote = "Note: Your user name is rabinamaharjan.";
		
		String actualNote = driver.findElement(By.xpath(Registration.confirmation_text)).getText();
		String actualUserName = actualNote.substring(24, 38);
		
		System.out.println("Expected note: " + expectedNote);
		System.out.println("Actual note: " + actualNote);
		System.out.println("Expected username: " + expectedUserName);
		System.out.println("Actual username: " + actualUserName);
		System.out.println("--------------------------");
		
		if (expectedNote.equals(actualNote)) {
			System.out.println("PASS. Expected & Actual value has matched");
			System.out.println("Expected note: " + expectedNote);
			System.out.println("Actual note: " + actualNote);
			
		} else {
			System.out.println("FAIL. Expected & Actual value does not match");
			System.out.println("Expected note: " + expectedNote);
			System.out.println("Actual note: " + actualNote);
		}
		
		if (expectedUserName.equals(actualUserName)) {
			System.out.println("PASS. Expected & Actual username has matched");
			System.out.println("Expected username: " + expectedUserName);
			System.out.println("Actual username: " + actualUserName);
		} else {
			System.out.println("FAIL. Expected & Actual username does not match");
			System.out.println("Expected username: " + expectedUserName);
			System.out.println("Actual username: " + actualUserName);
		}
		
		driver.close();
		
	}
}