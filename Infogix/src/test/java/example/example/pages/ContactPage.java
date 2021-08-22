package example.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class ContactPage extends BasePage {

	

	/** The FistName. */
	@FindBy(name = "FirstName")
	private WebElement firstNameVal;
	
	/** The LastName. */
	@FindBy(name = "LastName")
	private WebElement lastNameVal;
	
	/** The Company */
	@FindBy(name = "Company")
	private WebElement CompanyNameVal;
	
	/** The WorkEmail */
	@FindBy(name = "Email")
	private WebElement emailVal;
	
	/** The PhoneNumber */
	@FindBy(name = "Phone")
	private WebElement phoneVal;
	
	/** The Contry Location */
	@FindBy(name = "HQ_Location_Country__c")
	private WebElement hqLocationVal;
	
	@FindBy(name = "Industry__c")
	private WebElement industryVal;
	
	@FindBy(id = "LblConsent_to_Processing__c")
	private WebElement checkBox;
	
	@FindBy(name = "Next_Step_Comments__c")
	private WebElement commentsSection;
	
	
	
	@FindBy(xpath = "//*[@class='mktoButton']")
	private WebElement submitButton;
	
	@FindBy(xpath = "//*[contains(text(),'Thank You!')]")
	private WebElement ThanksValidation;

	/**
	 * Instantiates a new home page.
	 *
	 * @param driver the driver
	 */
	public ContactPage(WebDriver driver) {
		super(driver);
	}



	/**
	 * Enter password.
	 *
	 * @param password the password
	 * 
	 */
	public ContactPage enterFirstName(String firstName) {
		firstNameVal.sendKeys(firstName);
		return this;
	}
	
	/**
	 * Enter lastname.
	 *
	 * @param lastname
	 * @return the facebook login page
	 */
	public ContactPage lastName(String lastName) {
		lastNameVal.sendKeys(lastName);
		return this;
	}
	
	public ContactPage companyName(String companyName) {
		CompanyNameVal.sendKeys(companyName);
		return this;
	}
	
	public ContactPage email(String emailID) {
		emailVal.sendKeys(emailID);
		return this;
	}
	
	public ContactPage phoneNum(String phoneNumber) {
		phoneVal.sendKeys(phoneNumber);
		return this;
	}
	
	public ContactPage country(String countryLocation) {
		WebElement dropDowncountry = hqLocationVal;
		Select CountryList = new Select(dropDowncountry);
		CountryList.selectByVisibleText(countryLocation);
		hqLocationVal.sendKeys(countryLocation);
		return this;
	}
	
	public ContactPage industry(String industry) {
		WebElement dropDownIndustry = industryVal;
		Select CountryList = new Select(dropDownIndustry);
		CountryList.selectByVisibleText(industry);
		industryVal.sendKeys(industry);
		return this;
	}
	
	public ContactPage comments(String commentsValue) {
		commentsSection.sendKeys(commentsValue);
		return this;
	}
	
	public void checkboxclick() {
		checkBox.click();
		
	}
	
	
	
	public void Submitclick() {
		submitButton.click();
		
	}
	
	public String SubmitValidation() {
		String Validation = ThanksValidation.getText();
		return Validation;
		
	}

	
}
