package example.example.pages;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;


public class BasePage {

	/** The driver. */
	protected WebDriver driver;

	/** The waiter. */
	protected FluentWait<WebDriver> waiter;

	
	@FindBy(xpath = "//*[contains(text(),'Contact')]")
	private WebElement contact;
	
	@FindBy(xpath = "//div[contains(text(),'Allow All')]")
	private WebElement consentButton;
	
	@FindBy(xpath = "//a[@class='search-site']")
	private WebElement searchButton;
	
	/**
	 * Instantiates a new base page.
	 *
	 * @param driver the driver
	 */
	public BasePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waiter = new FluentWait<WebDriver>(driver).ignoring(NoSuchElementException.class, WebDriverException.class)
				.withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2));
	}
	/**
	 * Click sign in.
	 */
	public void ContactClick() {
		contact.click();;
	}
	
	public void consentclick() {
		consentButton.click();
		
	}
	
	public void SearchClick() {
		searchButton.click();
	}

}
