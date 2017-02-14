package schoology.stepDefinition;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TestBase {


public static WebDriver driver;

@Before
public void openBrowser() {
System.out.println("-----BEFORE METHOD--");
String osDriver = getOsDriver();
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+File.separator+"drivers"+File.separator+osDriver);
driver = new ChromeDriver();
driver.get("https://www.schoology.com/");
}

private String getOsDriver() {

String osName = System.getProperty("os.name").toLowerCase();  //Windows 7
if(osName.indexOf("win") >= 0) {
return "chromedriver.exe";
} else {
return "chromedriver";
}
}
}