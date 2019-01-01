package pageObjects;

public class FlightFinder {
	
	public static final String flight_button = "//a[contains(@href,'mercuryreservation.php')]";
	public static final String radiobutton_roundTrip ="//input[contains(@name,'tripType') and contains(@value,'roundtrip')]";
	public static final String radiobutton_oneWay = "//input[contains(@name,'tripType') and contains(@value,'oneway')]";
	public static final String dropdown_Passangers = "//select[contains(@name,'passCount')]";
	public static final String dropdown_departFrom = "//select[contains(@name,'fromPort')]";
	public static final String dropdown_departMonth ="//select[contains(@name,'fromMonth')]";
	public static final String dropdown_departDate = "//select[contains(@name,'fromDay')]";
	public static final String dropdown_arrivingIn = "//select[contains(@name,'toPort')]";
	public static final String dropdown_returnMonth = "//select[contains(@name,'toMonth')]";
	public static final String dropdown_returnDate = "//select[contains(@name,'toDay')]";
	public static final String radiobutton_economyC = "//input[contains(@value,'Coach')]";
	public static final String radiobutton_businessC = "//input[contains(@value,'Business')]";
	public static final String radiobutton_firstC = "//input[contains(@value,'First')]";
	public static final String dropdown_airlinePref = "//select[contains(@name,'airline')]";
	public static final String button_continue = "//input[contains(@name,'findFlights')]";
}
