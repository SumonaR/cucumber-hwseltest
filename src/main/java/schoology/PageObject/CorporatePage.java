package schoology.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CorporatePage {
 
 WebDriver driver;
 
 public CorporatePage(WebDriver driver){
  this.driver = driver;
 }
    
 public CorporatePage enterFirstName(String firstName){
	  driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstName);
	  return this;
 }
 public CorporatePage enterLastName(String lastName){
	  driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastName);
	  return this;
	 }
 public CorporatePage enterJobFunction(String jobFunction){
	 Select jobFunctionDropDown= new Select(driver.findElement(By.id("Job_Function__c")));
	 jobFunctionDropDown.selectByVisibleText(jobFunction);
	  return this;
}
 public CorporatePage enterPhoneNumber(String phoneNumber){
	  driver.findElement(By.xpath("//input[@id='Phone']")).sendKeys(phoneNumber);
	  return this;
	 }
	 public CorporatePage enterEmailAddress(String email){
		  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		  return this;
		 }
	 public CorporatePage enterCompany(String company){
		  driver.findElement(By.xpath("//input[@id='Company']")).sendKeys(company);
		  return this;
		 }
	 public CorporatePage selectNumberOfEmployees(String numberOfEmployees){
		 Select numberOfEmployeesDropDown= new Select(driver.findElement(By.id("NumberOfEmployees")));
		 numberOfEmployeesDropDown.selectByVisibleText(numberOfEmployees);
		  return this;
	}
	 public CorporatePage selectCountry(String country){
		 Select countryDropDown= new Select(driver.findElement(By.id("Country")));
		 countryDropDown.selectByVisibleText(country);
		  return this;
		  
	}
	 public CorporatePage selectState(String state){
		 Select stateDropDown= new Select(driver.findElement(By.id("State")));
		 stateDropDown.selectByVisibleText(state);
		  return this;
	 }
	 public CorporatePage enterComment(String comment){
		  driver.findElement(By.xpath("//textarea[@id='Comment__c']")).sendKeys(comment);
		  return this;
	 }
	  public boolean buttonEnabled(){
		 return driver.findElement(By.xpath("//span[contains(.,'Submit')]")).isEnabled()
		 ;
	  }
}