package flows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pageObjects.BookFlight;

public class ValidateFlightPrice {
	
	//validating the information such as price, tax and dates
	public static void validatePrice(WebDriver driver) {
		String departDate = driver.findElement(By.xpath(BookFlight.text_departDate)).getText();
		String departPrice = driver.findElement(By.xpath(BookFlight.text_departFlightPrice)).getText();
		String returnDate = driver.findElement(By.xpath(BookFlight.text_returnDate)).getText();
		String returnPrice = driver.findElement(By.xpath(BookFlight.text_returnFlightPrice)).getText();
		String numOfPass = driver.findElement(By.xpath(BookFlight.text_numOfPassengers)).getText();
		String taxAmt = driver.findElement(By.xpath(BookFlight.text_taxAmt)).getText();
		String totalAmt = driver.findElement(By.xpath(BookFlight.text_totalPrice)).getText();
		
		System.out.println("Depart Date: " + departDate);
		System.out.println("Return Date: " + returnDate);
		
		//this could be achieved in one line as well. Shown below
		//but most probably you'll need the converted value to do some math
		//so hold it into the integer
		int finaldepartPrice = Integer.parseInt(departPrice);
		System.out.println("Departure Ticket Price: " + finaldepartPrice);
		
		int finalReturnPrice = Integer.parseInt(returnPrice);
		System.out.println("Return Ticket Price: " + finalReturnPrice);
		
		int finalNumOfPass = Integer.parseInt(numOfPass);
		System.out.println("Number of passangers: " + finalNumOfPass);
		
		//total tax amount is: $89
		//because there is special sign$, the amount cannot be converted to int, first convert to string
		String convertedTax = taxAmt.substring(1);
		//special sign "$" in eliminated by using substring
		//converting string into Integer, because string cannot be added
		int finalTax = Integer.parseInt(convertedTax);
		
		System.out.println("First Tax amount: " + taxAmt);
		System.out.println("Converted to string using substring tax amount: " + convertedTax);
		System.out.println("Converted string to int so that we can use that number: " + finalTax);
		
		String convertedTotalAmt = totalAmt.substring(1);
		int finalTotalAmt = Integer.parseInt(convertedTotalAmt);
		
		System.out.println("First total amount: " + totalAmt);
		System.out.println("Converted to string using substring total amount: " + convertedTotalAmt);
		System.out.println("Converted string to int so that we can use that number: " + finalTotalAmt);
		
		int withoutTax = (finaldepartPrice + finalReturnPrice) * 2;
		int expectedTotal = withoutTax + finalTax;
		
		if (expectedTotal == finalTotalAmt) {
			System.out.println("Pass");
			System.out.println("Expected Total: " + expectedTotal);
			System.out.println("Actual Total: " + finalTotalAmt);
			
		} else {
			System.out.println("Fail");
			System.out.println("Expected Total: " + expectedTotal);
			System.out.println("Actual Total: " + finalTotalAmt);

		}
		
	}
	
	public static void passengerInfo(WebDriver driver) {

		// first passenger info
		driver.findElement(By.xpath(BookFlight.text_firstName1)).sendKeys("Rabina");
		driver.findElement(By.xpath(BookFlight.text_lastName1)).sendKeys("Maharjan");
		
		Select mealObj1 = new Select(driver.findElement(By.xpath(BookFlight.select_meal1)));
		mealObj1.selectByIndex(2);

		// second passenger info
		driver.findElement(By.xpath(BookFlight.text_firstName2)).sendKeys("Anju");
		driver.findElement(By.xpath(BookFlight.text_lastName2)).sendKeys("Maharjan");
		Select mealObj2 = new Select(driver.findElement(By.xpath(BookFlight.select_meal2)));
		mealObj2.selectByIndex(3);
	}

	// credit card info
	public static void creditCardInfo(WebDriver driver) {

		Select cardTypeObj = new Select(driver.findElement(By.xpath(BookFlight.select_creditType)));
		cardTypeObj.selectByIndex(1);

		driver.findElement(By.xpath(BookFlight.text_creditNumber)).sendKeys("1234567812345678");

		Select cardTypeObj1 = new Select(driver.findElement(By.xpath(BookFlight.select_cardExpMonth)));
		cardTypeObj1.selectByIndex(11);

		Select cardTypeObj2 = new Select(driver.findElement(By.xpath(BookFlight.select_cardExpYear)));
		cardTypeObj2.selectByIndex(9);

		driver.findElement(By.xpath(BookFlight.text_cardFirstName)).sendKeys("Clementine");
		driver.findElement(By.xpath(BookFlight.text_cardMidName)).sendKeys("M");
		driver.findElement(By.xpath(BookFlight.text_cardLastName)).sendKeys("Maharjan");

	}

	// billing address info
	public static void billingAddressInfo(WebDriver driver) throws InterruptedException {
		driver.findElement(By.xpath(BookFlight.checkbox_ticketlessTravel)).click();
		driver.findElement(By.xpath(BookFlight.text_billAddress1)).clear();
		driver.findElement(By.xpath(BookFlight.text_billAddress1)).sendKeys("7100 San Ramod Rd");
		driver.findElement(By.xpath(BookFlight.text_billAddress2)).sendKeys("Apt 137");
		driver.findElement(By.xpath(BookFlight.text_billCity)).clear();
		driver.findElement(By.xpath(BookFlight.text_billCity)).sendKeys("Dublin");
		driver.findElement(By.xpath(BookFlight.text_billState)).clear();
		driver.findElement(By.xpath(BookFlight.text_billState)).sendKeys("CA");
		driver.findElement(By.xpath(BookFlight.text_billZip)).clear();
		driver.findElement(By.xpath(BookFlight.text_billZip)).sendKeys("94568");
		Thread.sleep(5000);
		Select billObj = new Select(driver.findElement(By.xpath(BookFlight.select_billCountry)));
		billObj.selectByVisibleText("NEPAL");
	}

	// delivery address info
	public static void deliveryAddressInfo(WebDriver driver) {
		driver.findElement(By.xpath(BookFlight.checkbox_sameAsBilling)).click();
		driver.findElement(By.xpath(BookFlight.text_deliAddress1)).clear();
		driver.findElement(By.xpath(BookFlight.text_deliAddress1)).sendKeys("7100 San Ramod Rd");
		driver.findElement(By.xpath(BookFlight.text_deliAddress2)).sendKeys("Apt 137");
		driver.findElement(By.xpath(BookFlight.text_deliCity)).clear();
		driver.findElement(By.xpath(BookFlight.text_deliCity)).sendKeys("Dublin");
		driver.findElement(By.xpath(BookFlight.text_deliState)).clear();
		driver.findElement(By.xpath(BookFlight.text_deliState)).sendKeys("CA");
		driver.findElement(By.xpath(BookFlight.text_deliZip)).clear();
		driver.findElement(By.xpath(BookFlight.text_deliZip)).sendKeys("94568");
		Select delivObj = new Select(driver.findElement(By.xpath(BookFlight.select_deliCountry)));
		delivObj.selectByVisibleText("NEPAL");
		
		driver.switchTo().alert().accept();

		// click secure purchase button to go to next page
		driver.findElement(By.xpath(BookFlight.button_securePayment)).click();

	}
}
