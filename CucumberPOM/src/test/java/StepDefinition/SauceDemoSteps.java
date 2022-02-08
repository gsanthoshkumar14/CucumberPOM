package StepDefinition;

import com.Pages.HomePage;
import com.Pages.SauceDemoPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoSteps {
	
	private SauceDemoPage sauceDemoPage = new SauceDemoPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}

	@When("user enters the username {string} and password {string}")
	public void user_enters_the_username_and_password(String username, String password) {
		sauceDemoPage.enterUsername(username);
		sauceDemoPage.eterPassword(password);
	}

	@Then("user click login button")
	public void user_click_login_button() {
	
		sauceDemoPage.clickLoginBtn();
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
		sauceDemoPage.getPageTitle();
	}

	@Then("user adds the highest pice product to the cart")
	public void user_adds_the_highest_pice_product_to_the_cart() {
		System.out.println(sauceDemoPage.getPriceTagCount());
		sauceDemoPage.selectHighestPrizeProduct();
	}

	@Then("user checks in the cart page")
	public void user_checks_in_the_cart_page() {
		sauceDemoPage.clickShoppingCart();
	}
}
