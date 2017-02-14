package schoology.stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class RequestCorpTourDefinition {

 WebDriver driver = TestBase.driver;
 schoology.PageObject.SchoologyHomePage schoologyHomePage;
 schoology.PageObject.CorporatePage corporatePage;
 
 @Given("^User is on home page$")
 public void userOnHomepage() {
  schoologyHomePage = new schoology.PageObject.SchoologyHomePage(driver);
  Assert.assertTrue(schoologyHomePage.verifyTitle());
 }
 
 @And("^User clicks corporate link$")
 public void clickCorporateLink(){
  corporatePage = schoologyHomePage.loadCorporatePage();
  
 }
 
 @And("^User enters following information$")
 public void fillOutForm(DataTable table) {
  
  List<List<String>> data = table.raw();
  corporatePage.enterFirstName(data.get(0).get(1))
               .enterLastName(data.get(1).get(1))
               .enterJobFunction(data.get(2).get(1))
               .enterPhoneNumber(data.get(3).get(1))
               .enterEmailAddress(data.get(4).get(1))
               .enterCompany(data.get(5).get(1))
               .selectNumberOfEmployees(data.get(6).get(1))
               .selectCountry(data.get(7).get(1))
               .selectState(data.get(8).get(1))
               .enterComment(data.get(9).get(1));
 }
  @Then("^User confirms that submit button is enabled$")
  public void buttonEnabled(){
	boolean isEnabled = corporatePage.buttonEnabled();  
	Assert.assertTrue(isEnabled);

	}
  
 }
 
 
 
 
