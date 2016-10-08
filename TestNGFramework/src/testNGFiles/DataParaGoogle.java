package testNGFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParaGoogle {
	
	public WebDriver driver ;
	public String baseUrl= "http://google.com";
	
	@BeforeSuite
	public void browserLaunch(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	
  @Test(priority=1)
  @Parameters("searchkey")
  public void searchKey(String searchkey) throws InterruptedException {
	  driver.findElement(By.xpath("//input[@id='lst-ib']")).click();
	  System.out.println("after first click");
	  driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(searchkey);
 	  driver.findElement(By.xpath("//button[@value='Search']")).click();
 	 Thread.sleep(3000L);
	// String Text= driver.findElement(By.xpath("//button[@value='Search']")).getText();

	 String ActualText= driver.findElement(By.xpath("//input[@title='Search']")).getAttribute("value");
	 System.out.println( "TESXT IS" +ActualText);
	 String Text1= driver.findElement(By.xpath(" .//*[@id='gb_70']")).getText();
	 System.out.println( "TESXT" +Text1);	  
  
  
	  		
	 Assert.assertEquals(ActualText, searchkey);

	  
 }
  
}
