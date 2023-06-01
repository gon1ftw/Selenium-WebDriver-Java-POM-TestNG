package Pages;

public class SignUpPage extends BasePage {
	
	private String checkBoxMr = "//input[@id='id_gender1']";
	private String passWord = "//input[@id='password']";
	private String dayOfBirth = "//select[@id='days']";
	private String monthOfBirth = "//select[@id='months']";
	private String yearOfBirth = "//select[@id='years']";
	private String checkBox1 = "//input[@id='newsletter']";
	private String checkBox2 = "//input[@id='optin']";
	private String firstName = "//input[@id='first_name']";
	private String lastName = "//input[@id='last_name']";
	private String compaNy = "//input[@id='company']";
	private String addRess = "//input[@id='address1']";
	private String countrySelect = "//select[@id='country']";
	private String stateYep = "//input[@id='state']";
	private String cityYep = "//input[@id='city']";
	private String zipCode = "//input[@id='zipcode']";
	private String mobileNumber = "//input[@id='mobile_number']";
	private String createAccBtn = "//button[contains(text(),'Create Account')]";
	

	public SignUpPage(){
		super(driver);
	}
	
	public void clickCheckboxMr(){
		clickElement(checkBoxMr);
	}
	
	public void escribirPassword(String pass){
		escribirCredenciales(passWord, pass);
	}
	
	public void selectDayOfBirth(String day){
		selectFromDropdownByValue(dayOfBirth, day);
	}
	
	public void selectMonthOfBirth(String month){
		selectFromDropdownByText(monthOfBirth, month);
	}
	
	public void selectYearOfBirth(String year){
		selectFromDropdownByValue(yearOfBirth, year);
	}
	
	public void clickCheck1(){
		clickElement(checkBox1);
	}
	
	public void clickCheck2(){
		clickElement(checkBox2);
	}
	
	public void escribirFirstName(String name){
		escribirCredenciales(firstName, name);
	}
	
	public void escribirLastName(String lastname){
		escribirCredenciales(lastName, lastname);
	}
	
	public void escribirCompany(String company){
		escribirCredenciales(compaNy, company);
	}
	
	public void escribirAddress(String adress){
		escribirCredenciales(addRess, adress);
	}
	
	public void selectCountry(String country){
		selectFromDropdownByText(countrySelect, country);
	}
	
	public void escribirState(String state){
		escribirCredenciales(stateYep, state);
	}
	
	public void escribirCity(String city){
		escribirCredenciales(cityYep, city);
	}
	
	public void escribirzipCode(String zipcode){
		escribirCredenciales(zipCode, zipcode);
	}
	
	public void escribirMobileNumber(String number){
		escribirCredenciales(mobileNumber, number);
	}
	
	public void clickCreateAcc(){
		clickElement(createAccBtn);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
