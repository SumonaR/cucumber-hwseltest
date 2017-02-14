package schoology.PageObject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchoologyHomePageDashboard {
	
	WebDriver driver;
	WebDriverWait wait;
	
	 public SchoologyHomePageDashboard (WebDriver driver){
		 this.driver= driver;
		 pageLoadSchoologyHomePageDashboard();
	 } 
	public void pageLoadSchoologyHomePageDashboard(){
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	 public SchoologyHomePageDashboard clickCourseTab(){
		 driver.findElement(By.xpath("//a[contains(.,'Courses')]")).click();;
		return this;
	 }
	 public SchoologyHomePageDashboard clickJoinFromDropDownButton(){
		 wait = new WebDriverWait(driver,45);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(.,'Join')]")));
		 driver.findElement(By.xpath("//a[contains(.,'Join')]")).click();
		 return new SchoologyHomePageDashboard(driver);
	 }
	// public SchoologyHomePageDashboard enterAccessCode(String accessCode){
		 //wait = new WebDriverWait(driver,45);
		 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='edit-invite-code']'")));
		 //driver.switchTo().frame("//gateway.answerscloud.com/schoology/production/trigger/frameWorker.html?v=dklwu68");
		// wait = new WebDriverWait(driver,45);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'edit-invite-code']")));
		// driver.findElement(By.xpath("//input[contains(@id,'edit-invite-code')]")).sendKeys(accessCode);
		 // driver.findElement(By.id("edit-invite-code")).sendKeys(accessCode);
		// return this;
	// }
	 
//}
	
	public SchoologyHomePageDashboard enterAccessCode(String accessCode){
		wait = new WebDriverWait(driver,45);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='edit-invite-code']'")));
		// driver.switchTo().frame("//gateway.answerscloud.com/schoology/production/trigger/frameWorker.html?v=dklwu68");
		 //wait = new WebDriverWait(driver,45);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'edit-invite-code']")));
		 driver.findElement(By.xpath("//input[contains(@id,'edit-invite-code')]")).sendKeys(accessCode);
		 
		 return new SchoologyHomePageDashboard(driver);
	 }
	 public SchoologyHomePageDashboard clickBlueJoinButton(){
		 driver.findElement(By.xpath("//input[@value='Join']"));
		 return this;
	 }
}
