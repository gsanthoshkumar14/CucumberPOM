package StepDefinition;

import com.Pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePageSteps {
	
	public String title;
	
	private HomePage homePage = new HomePage(DriverFactory.getDriver());

	@Given("user is on home page")
	public void user_is_on_home_page() {
		DriverFactory.getDriver().get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = homePage.getHomePageTitle();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
	   Assert.assertEquals(expectedTitle, title);
	}

	@Then("free access link should be displayed")
	public void free_access_link_should_be_displayed() {
	   Assert.assertTrue(homePage.isFreeAccess());
	}

}
