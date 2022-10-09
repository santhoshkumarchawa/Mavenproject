package StepDefinitions;

import io.cucumber.java.en.*;

public class LoginSteps {

		@Given("User is on Login page")
		public void user_is_on_login_page() 
		{
			System.out.println("User is on Login page");
		}

		@When("I Enter UserName and Password")
		public void i_enter_user_name_and_password() {
			System.out.println("I Enter UserName and Password-valid Credentials");
		}

		@And("Click on Login")
		public void click_on_login() {
			System.out.println("Click on Login");
		}

		@Then("User Login Successful")
		public void user_login_successful() {
			System.out.println("User Login Successful");
		}



}
