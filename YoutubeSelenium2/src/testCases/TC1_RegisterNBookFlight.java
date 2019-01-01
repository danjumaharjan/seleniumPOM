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
			Register registerObj = new Register();
			registerObj.contactInformation(driver);
			
			//signIn
			driver = setupObj.launchBrowser(url); //open the browser again because this is dummy website
			SignOn signOnObj = new SignOn();
			signOnObj.signin(driver);
			
			//get flight
			//Flights flightObj = new Flights();
			//flightObj.flightFinderMethod(driver);
			
			Thread.sleep(10000);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			driver.close();
		}

	}

}
