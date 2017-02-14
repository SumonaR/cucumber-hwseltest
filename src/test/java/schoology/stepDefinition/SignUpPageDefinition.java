package schoology.stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SignUpPageDefinition {
	 WebDriver driver = TestBase.driver;
	 schoology.PageObject.SchoologyHomePage schoologyHomePage;
	 schoology.PageObject.SignUpPage signUpPage;
	 
	 @Given("^User is on schoologyhome page$")
	 public void userOnHomepage() {
	  schoologyHomePage = new schoology.PageObject.SchoologyHomePage(driver);
	  Assert.assertTrue(schoologyHomePage.verifyTitle());
	 }
	 
	 @And("^User clicks on signup link$")
	 public void clickSignUpLink(){
	  signUpPage = schoologyHomePage.loadSignUpPage();
	  
	 }
	 @And("^User clicks on Student link$")
	 public void clickStudentLink(){
		  signUpPage.clickStudentLinkPage();
		  
	 }
	 @And("^User Enters code$")
	 public void enterCode (DataTable table){
		 List<List<String>> data = table.raw();
				 signUpPage.enterAccessCode(data.get(0).get(1));
	}
	 @And("^User clicks on continue button$")
	 public void clickButton(){
		  signUpPage.clickContinueButton();
	 }
	 @And("^User completes form in following order$")
	 public void completeForm (DataTable table){
		 List<List<String>> data = table.raw();
				 signUpPage.enterFirstName(data.get(0).get(1))
				 .enterLastName(data.get(1).get(1))
				 .enterEmailAddress(data.get(2).get(1))
				 .enterPassword(data.get(3).get(1))
				 .enterConfirmPassword(data.get(4).get(1));
	 }
     @And("^User selects Date of birth in following order$")
	  public void selectDateOfBirth (DataTable table){
	  List<List<String>> data = table.raw();
	            signUpPage.selectMonth(data.get(0).get(1))
	            .selectDay(data.get(1).get(1))
	            .selectYear(data.get(2).get(1));
	

   	}
     @Then ("^User confirms that periodic schoology updates option is checked")
     public void checkBoxIsSelected(){
    	 boolean isSelected= signUpPage.checkBoxIsSelected();
    	 System.out.println(isSelected);
     }
     
     @Then("^User made sure that Registeration button is Enabled")
     public void registrationButtonIsEnabled(){
     boolean isEnabled = signUpPage.registrationButtonIsEnabled();
     System.out.println(isEnabled);
     }
	 
}
