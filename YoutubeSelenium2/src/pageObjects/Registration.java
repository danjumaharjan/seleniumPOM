package pageObjects;

public class Registration{
	
	public static final String link_registerButton = "//a[contains(text(),'REGISTER')]";
	public static final String textbox_firstName = "//input[contains(@name,'firstName')]";
	public static final String textbox_lastName = "//input[contains(@name,'lastName')]";
	public static final String textbox_phoneNumber = "//input[contains(@name,'phone')]";
	public static final String textbox_emailAddress = "//input[contains(@name,'userName')]";
	public static final String textbox_addressOne = "//input[contains(@name,'address1')]";
	public static final String textbox_addressTwo = "//input[contains(@name,'address2')]";
	public static final String textbox_city = "//input[contains(@name,'city')]";
	public static final String textbox_state = "//input[contains(@name,'state')]";
	public static final String textbox_postalCode = "//input[contains(@name,'postalCode')]";
	public static final String textbox_userName = "//input[contains(@name,'email')]";
	public static final String textbox_passWord = "//input[contains(@name,'password')]";
	public static final String textbox_confirmPassword = "//input[contains(@name,'confirmPassword')]";
	public static final String button_submitButton = "//input[contains(@name,'register')]";
	public static final String select_country = "//select[contains(@name,'country')]";
	
	//confirmation line
	public static final String confirmation_text = "//b[contains(text(),'Note:')]";
	
}
