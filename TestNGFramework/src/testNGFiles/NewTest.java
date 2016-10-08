package testNGFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver= new FirefoxDriver();;
	  public String baseUrl = "http://gmail.com";
  @Test
  public void login() {
	  driver.get(baseUrl);
	  String LoginpageTitle=driver.getTitle();
	  System.out.println("Name=" + LoginpageTitle);
	  String expectedTitle="Gmail";
	  Assert.assertEquals(LoginpageTitle, expectedTitle);
	  
	  
  }
}
