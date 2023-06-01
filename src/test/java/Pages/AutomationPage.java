package Pages;

import org.testng.Assert;

public class AutomationPage extends BasePage {
	
	private String casilleroName = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]";
	private String casilleroEmailAdress = "//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]";
	private String signUpButton = "//button[contains(text(),'Signup')]";
	private String signupLoginBtn = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
	private String logOutBtn = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]";
	private String emailAdress ="//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]";
	private String passWord = "//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]";
	private String loginBtn = "//button[contains(text(),'Login')]";
	private String productBtn = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]";
	private String continueBtn = "//a[contains(text(),'Continue')]";
	private String deleteAcc = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[5]/a[1]";
	private String contactUsBtn = "//a[contains(text(),'Contact us')]";
	private String addClose = "//a[contains(text(),'Close')]";
	
	public AutomationPage(){
		super(driver);
	}
	
	public void navigateToPage(){
		navigateTo("https://automationexercise.com/");
	}
	
	public void emailAdressLogin(String email){
		escribirCredenciales(emailAdress, email);
	}
	
	public void passwordLogin(String pass){
		escribirCredenciales(passWord, pass);
	}
	
	public void loginButton(){
		clickElement(loginBtn);
	}
	
	public void logOutButton(){
		clickElement(logOutBtn);
	}
	
	public void signUpLoginButton(){
		clickElement(signupLoginBtn);
	}
	
	public void escribirName(String name){
		escribirCredenciales(casilleroName, name);
	}	
	
	public void escribirEmailAdress(String name){
		escribirCredenciales(casilleroEmailAdress, name);
	}
	
	public void clickSignUpButton(){
		clickElement(signUpButton);
	}
	
	public void continueButton(){
		clickElement(continueBtn);
	}
	
	public void productsButton(){
		clickElement(productBtn);
	}
	
	public void deleteAccount(){
		clickElement(deleteAcc);
	}
	
	public void contactUsButton(){
		clickElement(contactUsBtn);
	}
	
	public void cerrarAnuncio(){
		clickElement(addClose);
	}

	public void validateResults(String resultadoesperado){
		String resultadoActual = driver.getTitle();
		String resultadoEsperado = resultadoesperado;
		 Assert.assertEquals(resultadoActual, resultadoEsperado, "Error de validación");
	}
	
	public void validateResultsByUrl(String resultadoesperado){
		String resultadoActual = driver.getCurrentUrl();
		String resultadoEsperado = resultadoesperado;
		 Assert.assertEquals(resultadoActual, resultadoEsperado, "Error de validación");
	}

}
