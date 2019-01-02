package pageObjects;

public class BookFlight {
	
	// flight info such as price, tax and date in dynamic table
	public static final String text_departDate = "//table/tbody/tr[1]/td[2]/b";
	public static final String text_departFlightPrice = "//table/tbody/tr[3]/td[3]";
	public static final String text_returnDate = "//table/tbody/tr[4]/td[2]/b";
	public static final String text_returnFlightPrice = "//table/tbody/tr[6]/td[3]";
	public static final String text_numOfPassengers = "//table/tbody/tr[7]/td[2]/font";
	public static final String text_taxAmt = "//table/tbody/tr[8]/td[2]/font";
	public static final String text_totalPrice = "//table/tbody/tr[9]/td[2]//b";

	// customer info
	public static final String text_firstName1 = "//input[contains(@name,'passFirst0')]";
	public static final String text_lastName1 = "//input[contains(@name,'passLast0')]";
	public static final String text_firstName2 = "//input[contains(@name,'passFirst1')]";
	public static final String text_lastName2 = "//input[contains(@name,'passLast1')]";
	public static final String select_meal1 = "//select[contains(@name,'pass.0.meal')]";
	public static final String select_meal2 = "//select[contains(@name,'pass.1.meal')]";

	// credit card info
	public static final String select_creditType = "//select[contains(@name,'creditCard')]";
	public static final String text_creditNumber = "//input[contains(@name,'creditnumber')]";
	public static final String select_cardExpMonth = "//select[contains(@name,'cc_exp_dt_mn')]";
	public static final String select_cardExpYear = "//select[contains(@name,'cc_exp_dt_yr')]";
	public static final String text_cardFirstName = "//input[contains(@name,'cc_frst_name')]";
	public static final String text_cardMidName = "//input[contains(@name,'cc_mid_name')]";
	public static final String text_cardLastName = "//input[contains(@name,'cc_last_name')]";

	// billing address info
	public static final String checkbox_ticketlessTravel = "(//input[contains(@name,'ticketLess')])[1]";
	public static final String text_billAddress1 = "//input[contains(@name,'billAddress1')]";
	public static final String text_billAddress2 = "//input[contains(@name,'billAddress2')]";
	public static final String text_billCity = "//input[contains(@name,'billCity')]";
	public static final String text_billState = "//input[contains(@name,'billState')]";
	public static final String text_billZip = "//input[contains(@name,'billZip')]";
	public static final String select_billCountry = "//select[contains(@name,'billCountry')]";

	// delivery address info
	public static final String checkbox_sameAsBilling = "(//input[contains(@name,'ticketLess')])[2]";
	public static final String text_deliAddress1 = "//input[contains(@name,'delAddress1')]";
	public static final String text_deliAddress2 = "//input[contains(@name,'delAddress2')]";
	public static final String text_deliCity = "//input[contains(@name,'delCity')]";
	public static final String text_deliState = "//input[contains(@name,'delState')]";
	public static final String text_deliZip = "//input[contains(@name,'delZip')]";
	public static final String select_deliCountry = "//select[contains(@name,'delCountry')]";
	
	//secure payment continue button
	public static final String button_securePayment = "//input[contains(@name,'buyFlights')]";
	
	
	
}
