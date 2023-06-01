package Pages;

public class ContactUsPage extends BasePage {

	private String nameCntct = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[1]/input[1]";
	private String emailCntct = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[2]/input[1]";
	private String subjectCntct = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[3]/input[1]";
	private String textCntct = "//textarea[@id='message']";
	private String fileBtn = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[5]/input[1]";
	private String submitBtn = "//body/div[@id='contact-page']/div[2]/div[1]/div[1]/div[3]/form[1]/div[6]/input[1]";
	
	
	public ContactUsPage(){
		super(driver);
	}

	public void nameContact(String name){
		escribirCredenciales(nameCntct, name);	
	}
	
	public void emailContact(String email){
		escribirCredenciales(emailCntct, email);	
	}
	
	public void subjectContact(String subject){
		escribirCredenciales(subjectCntct, subject);	
	}
	
	public void textContact(String text){
		escribirCredenciales(textCntct, text);	
	}
	
	public void fileButton(String file){
		escribirCredenciales(fileBtn, file);	
	}
	
	public void submitContactButton(){
		clickElement(submitBtn);
	}
	
}
