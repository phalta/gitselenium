package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logindemo {
	
		@Given("User is on login page")
		public void user_is_on_login_page() {
			System.out.println("user is on login page");
		    
		}

		@When("user enter username and password")
		public void user_enter_username_and_password() {
			System.out.println("user enter username and password");
		    
		}

		@And ("click on submit button")
		public void click_on_submit_button() {
          System.out.println("click on submit button");		    
		}

		@Then("user navigte to login page")
		public void user_navigte_to_login_page() {
		    System.out.println("user enter login page");
		}



}
