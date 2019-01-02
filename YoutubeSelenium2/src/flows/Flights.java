package flows;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pageObjects.*;

public class Flights {

	public void flightFinderMethod(WebDriver driver) {
		
		//click on flights link
		driver.findElement(By.xpath(FlightFinder.flight_button)).click();
		
		//flight details
		driver.findElement(By.xpath(FlightFinder.radiobutton_oneWay)).click();
		
		WebElement passCount = driver.findElement(By.xpath(FlightFinder.dropdown_Passangers));
		Select select1 = new Select(passCount);
		select1.selectByIndex(1);
		
		WebElement dptFrm = driver.findElement(By.xpath(FlightFinder.dropdown_departFrom));
		Select select2 = new Select(dptFrm);
		select2.selectByIndex(3);
		
		WebElement dptMth = driver.findElement(By.xpath(FlightFinder.dropdown_departMonth));
		Select select3 = new Select(dptMth);
		select3.selectByIndex(10);
		
		WebElement dptDt = driver.findElement(By.xpath(FlightFinder.dropdown_departDate));
		Select select4 = new Select(dptDt);
		select4.selectByIndex(4);
		
		WebElement arrvIn =  driver.findElement(By.xpath(FlightFinder.dropdown_arrivingIn));
		Select select5 = new Select(arrvIn);
		select5.selectByIndex(4);
		
		WebElement arrvMth = driver.findElement(By.xpath(FlightFinder.dropdown_returnMonth));
		Select select6 = new Select(arrvMth);
		select6.selectByIndex(11);
		
		WebElement arrDt = driver.findElement(By.xpath(FlightFinder.dropdown_returnDate));
		Select select7 = new Select(arrDt);
		select7.selectByIndex(3);
		
		//preferences
		driver.findElement(By.xpath(FlightFinder.radiobutton_firstC)).click();
		Select select8 = new Select(driver.findElement(By.xpath(FlightFinder.dropdown_airlinePref)));
		select8.selectByIndex(2);
		
		//submit
		driver.findElement(By.xpath(FlightFinder.button_continue)).click();
	}
}
