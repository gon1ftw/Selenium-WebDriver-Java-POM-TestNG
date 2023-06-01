package Pages;	

public class ProductsPage extends BasePage {
	
	private String searchFld = "//input[@id='search_product']";
	private String searchBtn = "//body/section[@id='advertisement']/div[1]/button[1]/i[1]";
	private String womenBtn = "//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]";
	private String topsBtn = "//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]";
	
	public ProductsPage(){
		super(driver);
	}
	
	public void searchField(String product){
		escribirCredenciales(searchFld, product);
	}
	
	public void searchButton(){
		clickElement(searchBtn);
	}
	
	public void womenButton(){
		clickElement(womenBtn);
	}
	
	public void topsButton(){
		clickElement(topsBtn);
	}
}

