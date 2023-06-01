package Pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected static WebDriver driver;
	private static WebDriverWait wait;
	
	static {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public BasePage(WebDriver driver){
		BasePage.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	public void capturarPantalla(String screenName) throws IOException{
		String evidenciasPath = "..\\volviendomarzo26\\Evidencias\\";
		File pantalla;
		pantalla = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(pantalla, new File(evidenciasPath + screenName));
	}

	public static void navigateTo(String url){
		driver.get(url);
	}
	
	public void closeDriver(){
		driver.quit();
	}

	private WebElement Find(String locator){
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	public void clickElement(String locator){
		Find(locator).click();
	}
	
	public void escribirCredenciales(String locator, String textToWrite){
		Find(locator).clear();
		Find(locator).sendKeys(textToWrite);
	}
	
	public void acceptAlert(){
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void selectFromDropdownByValue(String locator, String valueToSelect){
		Select dropdown = new Select (Find(locator));
		dropdown.selectByValue(valueToSelect);
	}
	
	public void selectFromDropdownByText(String locator, String valueToSelect){
		Select dropdown = new Select (Find(locator));
		dropdown.selectByVisibleText(valueToSelect);
	}
	
	public void selectFromDropdownByIndex(String locator, int valueToSelect){
		Select dropdown = new Select (Find(locator));
		dropdown.selectByIndex(valueToSelect);
	}






















}

