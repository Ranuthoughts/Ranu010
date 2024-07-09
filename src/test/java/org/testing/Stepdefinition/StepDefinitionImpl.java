package org.testing.Stepdefinition;

import java.io.IOException;

import org.testing.Base.Baseclass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImpl extends Baseclass  {

	@Given("Driver opened already")	
	public void Driver_opened_already() throws IOException, InterruptedException {
		launchapplication();
	}
	
	@Given("username (.+) and  password (.+)")
	public void username_password(String name , String password) throws IOException, InterruptedException {
		initializedriver();
		
       }
	
	@When("Enter (.+) and password (.+)")
	public void enter_and_password(String name , String password) throws IOException, InterruptedException {
		launchapplication();
	}
	
     @And("Click on (.+)")
      public void click_on_submit() throws IOException, InterruptedException {
	   initializedriver();
	   launchapplication();
	    }
     
     @Then("Message will display")
     public void message_display() throws IOException, InterruptedException {
    	 initializedriver();
  	   launchapplication();
    	  }
        )

      @When("Message need to update the transaction")
         public void 
     
}
