package schoology.PageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SchoologyHomePage {
 

WebDriver driver;
 
 public SchoologyHomePage(WebDriver driver) {
  this.driver = driver;
 }
 
 public boolean verifyTitle() {
  
  String expectedPageTitle = "Learning Management System | LMS | Schoology";
  
  if (driver.getTitle().contains(expectedPageTitle)) {
   return true;
  } else {
   return false;
  }
  
 }
 
 public CorporatePage loadCorporatePage(){
  driver.findElement(By.id("corporate-body-home")).click();
  WebDriverWait wait = new WebDriverWait(driver, 30);
  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(.,'Submit')]")));
  return new CorporatePage(driver);
 }
 public SignUpPage loadSignUpPage(){
	  driver.findElement(By.id("signup-header")).click();
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.elementToBeClickable(By.id("sign-up-selector")));
	  return new SignUpPage(driver);
	 }
 public LoginPage loadLoginPage(){
	  driver.findElement(By.id("login-header")).click();
	 WebDriverWait wait = new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("sign-in-header")));
	  return new LoginPage(driver);
     }
}