package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Drivers;

public class Success {

private WebDriver driver;
	
	public Success(){
		this.driver=Drivers.getInstance();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[.='Thank you for your registration']")
	public WebElement message;
	
}
