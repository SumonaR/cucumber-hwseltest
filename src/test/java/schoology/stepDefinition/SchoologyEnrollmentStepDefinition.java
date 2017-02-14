package schoology.stepDefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import schoology.PageObject.LoginPage;

public class SchoologyEnrollmentStepDefinition {
	
	WebDriver driver = TestBase.driver;
	schoology.PageObject.SchoologyHomePage schoologyHomePage;
	schoology.PageObject.LoginPage loginPage;
	schoology.PageObject.SchoologyHomePageDashboard schoologyHomePageDashboard;

	@Given("^User is on home page of schoology")
	public void userOnHomepage() {
		
		schoologyHomePage = new schoology.PageObject.SchoologyHomePage(driver);
		Assert.assertTrue(schoologyHomePage.verifyTitle());
	 }
	
	@When("^User clicks logins in link")
	public void clickLoginLink(){
		
		loginPage = schoologyHomePage.loadLoginPage();	
	}
	
	@And("^User enters Login Information")
	 public void loginInformation (DataTable table){
		 List<List<String>> data = table.raw();
				 loginPage.enterUserName(data.get(0).get(1));
				 loginPage.enterPassWord(data.get(1).get(1));
	}
	@And ("^User clicks log in button")
	public void clickLoginButton(){
	
		schoologyHomePageDashboard= loginPage.clickLoginButton();
	}




	@And ("^User clicks Courses tab")
	public void clickCourseTab(){
		
		schoologyHomePageDashboard.clickCourseTab();
	}
	@And("^User clicks join button in dropdown")
	public void clickJoinDropDownButton(){
		
		schoologyHomePageDashboard.clickJoinFromDropDownButton();
	}
	@And ("^User Enters code in SchoologyDashboardPage")
	public void enterAccessCodeInSchoologyHomePageDashboard(DataTable table){
		
		List<List<String>> data = table.raw();
		schoologyHomePageDashboard.enterAccessCode(data.get(0).get(1));
	}			
}
	