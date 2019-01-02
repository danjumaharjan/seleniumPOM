package flows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.SelectFlight;

public class SelectFlightDepRet {

	public void departFlight(WebDriver driver) {
		driver.findElement(By.xpath(SelectFlight.radiob_departUnified363)).click();
	}

	public void returnFlight(WebDriver driver) {
		driver.findElement(By.xpath(SelectFlight.radiob_returnPangae632)).click();
	}
	
	public void continuButton(WebDriver driver) {
		driver.findElement(By.xpath(SelectFlight.button_continue)).click();
	}
}
