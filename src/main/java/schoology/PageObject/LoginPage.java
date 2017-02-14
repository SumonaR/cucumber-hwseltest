package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	// This is a constructor to pass in driver to create page object of this class
	 public LoginPage (WebDriver driver){
		 this.driver= driver;
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	

	 public LoginPage enterUserName(String userName){
		  driver.findElement(By.xpath("//input[@id='edit-mail']")).sendKeys(userName);
		  return this;
	 }
	 public LoginPage enterPassWord(String passWord){
		  driver.findElement(By.xpath("//input[@id='edit-pass']")).sendKeys(passWord);
		  return this;
	 }
	 public SchoologyHomePageDashboard clickLoginButton(){
		 driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
		 return new SchoologyHomePageDashboard(driver);
	 }
}
