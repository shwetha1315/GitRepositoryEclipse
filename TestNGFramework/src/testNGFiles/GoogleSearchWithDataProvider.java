package testNGFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchWithDataProvider {
	
	public WebDriver driver ;
	public String baseUrl= "http://google.com";
  @BeforeSuite
  public void Setup() {
	  driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(baseUrl);
	  
  }
  @Test(dataProvider="Searchprovider")
  public void Searchgoogle(String searchkey) throws InterruptedException{
	  driver.findElement(By.xpath("//input[@id='lst-ib']")).click();
	  System.out.println("after first click");
	WebElement searchText =  driver.findElement(By.xpath("//input[@id='lst-ib']"));
	driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys(searchkey);
 	  driver.findElement(By.xpath("//button[@value='Search']")).click();
 	 Thread.sleep(3000L);
	 
	 String ActualText= driver.findElement(By.xpath("//input[@title='Search']")).getAttribute("value");
	 searchText.clear();
	 System.out.println( "TESXT IS" +ActualText);
	 String Text1= driver.findElement(By.xpath(" .//*[@id='gb_70']")).getText();
	 System.out.println( "TESXT" +Text1);	  
  
  
	  		
	 Assert.assertEquals(ActualText, searchkey);

	  
  }
  
  @DataProvider(name ="Searchprovider")
  public Object[][] getinputsearchvalues(){
	  Object[][] data =new Object[4][1];
	  data[0][0]="usa"
			  ;
	  data[1][0]="indiaa";
	  
	  data[2][0]="brazil";
	  
	  data[3][0]="king";
	  return data;
  }
}
