package schoology.PageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
		public SignUpPage(WebDriver driver) {
			
			this.driver= driver;
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		}
		public SignUpPage clickStudentLinkPage(){
		driver.findElement(By.xpath("//a[@href='http://app.schoology.com/register.php?type=student']")).click();
			  
		return this;
		}
		public SignUpPage enterAccessCode(String accessCode){
			  driver.findElement(By.xpath("//input[@id='edit-code']")).sendKeys(accessCode);
			  return this;
	    }
		public SignUpPage clickContinueButton(){
			 driver.findElement(By.xpath("//input[@id='edit-submit']")).click();
			 return new SignUpPage (driver);
		}
		public SignUpPage enterFirstName(String firstName){
			  wait = new WebDriverWait(driver,30);
			  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-name-first")));
			  driver.findElement(By.id("edit-name-first")).sendKeys(firstName);
			  return this;
		}
		 public SignUpPage enterLastName(String lastName){
			  driver.findElement(By.xpath("//input[@id='edit-name-last']")).sendKeys(lastName);
			  return this;
		}
		 public SignUpPage enterEmailAddress(String email){
			  driver.findElement(By.xpath("//input[@id='edit-login']")).sendKeys(email);
			  return this;
		}
		 public SignUpPage enterPassword(String password){
			  driver.findElement(By.xpath("//input[@id='edit-pass-1']")).sendKeys(password);
			  return this;
	     }
		 public SignUpPage enterConfirmPassword(String confirmPassword){
			  driver.findElement(By.xpath("//input[@id='edit-pass-2']")).sendKeys(confirmPassword);
			  return this;
		 }
		 public SignUpPage selectMonth(String month){
		 Select monthDropDown= new Select(driver.findElement(By.id("edit-birthday-month")));
		 monthDropDown.selectByVisibleText(month);
		 return this;
		 }
		 
		 public SignUpPage selectDay(String day){
		 Select dayDropDown= new Select(driver.findElement(By.id("edit-birthday-day")));
		 dayDropDown.selectByVisibleText(day);
		 return this;
					  
		}
		 public SignUpPage selectYear(String year){
		 Select yearDropDown= new Select(driver.findElement(By.id("edit-birthday-year")));
		 yearDropDown.selectByVisibleText(year);
		 return this;
				  
	    }
		 public boolean checkBoxIsSelected(){
			 return driver.findElement(By.xpath("//input[@checked='checked']")).isSelected();
		
		 }
		 public boolean registrationButtonIsEnabled(){
				 return driver.findElement(By.xpath("//input[contains(@id,'edit-submit')]")).isEnabled()
				 ;
	    }
}

