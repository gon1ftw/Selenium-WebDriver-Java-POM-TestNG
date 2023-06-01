package Test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.AutomationPage;
import Pages.ContactUsPage;
import Pages.ProductsPage;
import Pages.SignUpPage;

public class Pruebas {
	
	AutomationPage atm = new AutomationPage();
	SignUpPage sgn = new SignUpPage();
	ProductsPage pdp = new ProductsPage();
	ContactUsPage cup = new ContactUsPage();
	
		@BeforeSuite
		public void abrirPagina(){
			atm.navigateToPage();
	}
		
	@Test(priority=1,description="TC01 - registrar usuario")
	public void registrarUsuario() throws IOException{
		atm.signUpLoginButton();
		atm.escribirName("Username123");
		atm.escribirEmailAdress("mailrandom123@mail.com");
		atm.clickSignUpButton();
		sgn.clickCheckboxMr();
		sgn.escribirPassword("passfalsa123");
		sgn.selectDayOfBirth("20");
		sgn.selectMonthOfBirth("August");
		sgn.selectYearOfBirth("1992");
		sgn.clickCheck1();
		sgn.clickCheck2();
		sgn.escribirFirstName("Jorge");
		sgn.escribirLastName("Gutierrez");
		sgn.escribirCompany("Company Falsa");
		sgn.escribirAddress("Calle falsa 123");
		sgn.selectCountry("Canada");
		sgn.escribirState("Munro");
		sgn.escribirCity("Vicente Lopez");
		sgn.escribirzipCode("232323");
		sgn.escribirMobileNumber("0303456");
		sgn.clickCreateAcc();
		atm.capturarPantalla("registrarusuario.jpg");
		atm.validateResults("Automation Exercise - Account Created");
	}
	
	@Test(priority=2,description="TC02 - Deslogear usuario")
	public void logOut() throws IOException{
		atm.continueButton();
		atm.logOutButton();
		atm.capturarPantalla("deslog.jpg");
		atm.validateResults("Automation Exercise - Signup / Login");
	}
	
	@Test(priority=3,description="TC03 - Login Erroneo",dataProvider="Obtener Datos Excel")
	public void loginErroneo(String email, String password){
		atm.emailAdressLogin(email);
		atm.passwordLogin(password);
		atm.loginButton();
	}
	
	@DataProvider(name="Obtener Datos Excel")
	public Object[][] obtenerDatosExcel() throws Exception {
		return Utility.DatosExcel.leerExcel("..\\volviendomarzo26\\Entrada\\exceldatos.xlsx", "Hoja1");
	}
	
	@Test(priority=4,description="TC04 - login credenciales validas")
	public void loginValido() throws IOException{
		atm.signUpLoginButton();
		atm.emailAdressLogin("mailrandom123@mail.com");
		atm.passwordLogin("passfalsa123");
		atm.loginButton();
		atm.capturarPantalla("loginexitoso.jpg");
	}
	
	@Test(priority=5,description="TC05 - Buscar un producto por nombre")
	public void buscarPorNombre() throws IOException{
		atm.productsButton();
		pdp.searchField("Men Tshirt");
		pdp.searchButton();
		atm.capturarPantalla("buscarproductopornombre.jpg");
	}
	
	@Test(priority=6,description="TC06 - Buscar un producto por tipo")
	public void buscarPorTipo() throws IOException{
		pdp.womenButton();
		pdp.topsButton();
		atm.capturarPantalla("buscarproductoportipo.jpg");
	}
	
	@Test(priority=7,description="TC07 - Probar el apartado Contact us")
	public void contactUs() throws IOException{
		atm.contactUsButton();
		cup.nameContact("Gonzalo");
		cup.emailContact("mailrandom@gmail.com");
		cup.subjectContact("asdasd123");
		cup.textContact("dasdasdasdadsa123123123123");
		cup.fileButton("C:\\Users\\Gonzalo\\Desktop\\gonza\\asd.txt");
		cup.submitContactButton();
		atm.acceptAlert();
		atm.capturarPantalla("contactUs.jpg");
	}
	
	@Test(priority=8,description="TC08 - Borrar cuenta")
	public void borrarCuenta() throws IOException{
		atm.deleteAccount();
		atm.capturarPantalla("cuentaborrada.jpg");
		atm.validateResultsByUrl("https://automationexercise.com/delete_account");
	}

			@AfterSuite
			public void cerrarChrome(){
			atm.closeDriver();
	}	
}
		