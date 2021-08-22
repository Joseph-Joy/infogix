package example.example.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.context.Constants;
import example.example.factory.PageinstancesFactory;
import example.example.pages.ContactPage;


@Test(testName = "Facebook login test", description = "Facebook login test")
public class ContactPageTest extends BaseTest {
	
	@Test
	public void contactFormTest() {
		driver.get("https://www.infogix.com/");
		ContactPage ContactDetailsPage = PageinstancesFactory.getInstance(ContactPage.class);
		ContactDetailsPage.ContactClick();
		ContactDetailsPage.consentclick();
		ContactDetailsPage.enterFirstName(Constants.FirstName).lastName(Constants.LastName).companyName(Constants.Companyname).email(Constants.MailId).phoneNum(Constants.PhoneNumber);
		ContactDetailsPage.country(Constants.HQLocationCountry).industry(Constants.Insustry).comments(Constants.Comments).checkboxclick();
		ContactDetailsPage.Submitclick();
		String Thanksvalidation = ContactDetailsPage.SubmitValidation();
		Assert.assertEquals(Thanksvalidation, "Thank You!");
		
	}
	
	
}
