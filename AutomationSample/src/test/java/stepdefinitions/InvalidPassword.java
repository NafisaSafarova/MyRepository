package stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.RegistrationPage;
import utils.Configuration;
import utils.Drivers;

public class InvalidPassword {

	WebDriver driver = Drivers.getInstance();
	RegistrationPage page = new RegistrationPage();
	
	@Given("^page is loaded$")
	public void registration_page_is_loaded() throws Throwable {
	    driver.get(Configuration.getProperty("url"));
	    driver.manage().window().maximize();
	}
	
	@When("^the user fills out the form$")
    public void the_user_fills_out_the_form_with_valid_inputs() throws Throwable {
    	page.fName.sendKeys(Configuration.getProperty("firstname"));
  	    page.lName.sendKeys(Configuration.getProperty("lastname"));
  	    page.single.click();
  	    page.dance.click();
  	    
  	    Select selectCountry = new Select(driver.findElement(By.id("dropdown_7")));
  	    selectCountry.selectByVisibleText("Brazil");
  	    
  	    Select selectMonth = new Select(driver.findElement(By.id("mm_date_8")));
  	    selectMonth.selectByIndex(2);
  	    
  	    Select selectDay = new Select(driver.findElement(By.id("dd_date_8")));
  	    selectDay.selectByIndex(4);
  	    
  	    Select selectYear = new Select(driver.findElement(By.id("yy_date_8")));
  	    selectYear.selectByValue("2000");
  	    
  	    page.phoneNumber.sendKeys(Configuration.getProperty("phonenumber"));
  	    page.userName.sendKeys(Configuration.getProperty("username"));
  	    page.email.sendKeys(Configuration.getProperty("email"));
  	    page.profPic.click();
  	    
		String jpgFile = "C:\\Users\\safar\\Downloads\\file.jpg";
		page.profPic.sendKeys(jpgFile);
		page.submit.click();
    }
	
	@When("^leaves password field empty$")
	public void leaves_password_field_empty() throws Throwable {
	   Assert.assertTrue(page.passwordInput.isDisplayed());
	}

	@Then("^this field is required message should appear$")
	public void this_field_is_required_message_should_appear() throws Throwable {
	   Assert.assertTrue(page.erMessage.isDisplayed());
	}
}
