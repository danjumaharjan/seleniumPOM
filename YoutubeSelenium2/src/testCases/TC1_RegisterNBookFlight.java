package testCases;

import org.openqa.selenium.WebDriver;

import flows.*;
import infrastructure.SetUp;

public class TC1_RegisterNBookFlight {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		try {
			SetUp setupObj = new SetUp();	//creating an object because launchbrowser() is not static method
			String url="http://www.newtours.demoaut.com/";
			driver = setupObj.launchBrowser(url); //setup the WebDriver
			
			//registration
			//Register registerObj = new Register();
			//registerObj.contactInformation(driver);
			
			//signIn
			//driver = setupObj.launchBrowser(url); //open the browser again because this is dummy website. 
			//If registration Code is not commented, then above line of code is needed, or else not needed
			SignOn signOnObj = new SignOn();
			signOnObj.signin(driver);
			
			//get flight
			Flights flightObj = new Flights();
			flightObj.flightFinderMethod(driver);
			
			//select flights
			
			/*SelectFlightDepRet selObj = new SelectFlightDepRet(); //can be done in one line as shown below
			selObj.departFlight(driver);*/
			
			//select flight object can be initiated this way as well
			new SelectFlightDepRet().departFlight(driver);
			new SelectFlightDepRet().returnFlight(driver);
			new SelectFlightDepRet().continuButton(driver);
			
			
			//making the method from ValidateFlightPrice from package flows has been made static
			ValidateFlightPrice.validatePrice(driver); //no instance of object is created
			ValidateFlightPrice.passengerInfo(driver);
			ValidateFlightPrice.creditCardInfo(driver);
			ValidateFlightPrice.billingAddressInfo(driver);
			ValidateFlightPrice.deliveryAddressInfo(driver);
			
			
			
			Thread.sleep(5000);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			driver.close();
		}

	}

}
