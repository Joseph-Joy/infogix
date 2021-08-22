package example.example.tests;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import example.example.context.Constants;
import example.example.factory.PageinstancesFactory;
import example.example.pages.SerachPage;

@Test(testName = "URL Validate", description = "Validating URL")
public class SearchTest extends BaseTest {

	
	@Test
	public void searchValTest() {
		driver.get("https://www.infogix.com/");
		SerachPage searchPage = PageinstancesFactory.getInstance(SerachPage.class);
        searchPage.SearchClick();
        searchPage.searchText("govern");
        searchPage.consentclick();
        searchPage.searchLink("Building Data Trust with Strategic Data Governance");
        Assert.assertEquals(searchPage.validateUrl(), Constants.URLValidate);
        
	}
	
}
