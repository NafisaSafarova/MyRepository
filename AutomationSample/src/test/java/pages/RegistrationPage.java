package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Drivers;

public class RegistrationPage {

	private WebDriver driver;
	
	public RegistrationPage(){
		this.driver=Drivers.getInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="name_3_firstname")
	public WebElement fName;

	@FindBy(id="name_3_lastname")
	public WebElement lName;
	
	@FindBy(css="input[value='single']")
	public WebElement single;
	
	@FindBy(css="input[value='dance']")
	public WebElement dance;
	
	@FindBy(id="dropdown_7")
	public WebElement country;
	
	@FindBy(id="phone_9")
	public WebElement phoneNumber;
	
	@FindBy(id="username")
	public WebElement userName;
	
	@FindBy(id="email_1")
	public WebElement email;
	
	@FindBy(id="profile_pic_10")
	public WebElement profPic;
	
	@FindBy(id="description")
	public WebElement aboutYourself;
	
	@FindBy(id="password_2")
	public WebElement passwordInput;
	
	@FindBy(id="confirm_password_password_2")
	public WebElement passwordConfirm;
	
	@FindBy(xpath=".//*[@id='pie_register']/li[11]/div/div/span")
	public WebElement erMessage;
	
	@FindBy(xpath="//span[contains(text(),'* Fields do not match')]")
	public WebElement notMatch;
	
	@FindBy(css="div[class='piereg_pass_week']")
	public WebElement weakPassword;
	
	@FindBy(css="div[class='piereg_pass_strong']")
	public WebElement strongPassword;
			
	@FindBy(css="input[name='pie_submit']")
	public WebElement submit;
	
}
