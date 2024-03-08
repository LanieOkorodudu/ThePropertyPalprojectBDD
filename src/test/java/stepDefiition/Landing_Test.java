package stepDefiition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import library.Constants;
import pages.Landing_Page;
import utility.BaseUtil;

public class Landing_Test extends BaseUtil{
	
	Landing_Page landing;
	
	private BaseUtil base;
	public Landing_Test(BaseUtil base) {
		this.base = base;
	}

	@Given("user open url and handles cookies")
	public void user_opens_url_and_handles_cookies() {
		landing = new Landing_Page(base);
		base.driver.get(Constants.URL);
		landing.handCookiePopup();
		
	}
	
	 @When("user types in data")
	 public void user_types_in_data() {
		 landing = new Landing_Page(base);
		 landing.enterDataIntoSearchField(Constants.NUMBERS_DATA);
	 }
	 
	 @Then("user should be able to see data in field")
	 public void user_should_be_able_to_see_data_in_field() {
		 landing = new Landing_Page(base);
		 landing.validateSearchFieldData(Constants.NUMBERS_DATA);
	 }
	 
	 @And("user to validate data")
	 public void user_to_validate_data() {
		 landing = new Landing_Page(base);
		 landing.validateSearchFieldData(Constants.NUMBERS_DATA);
	 }
}
