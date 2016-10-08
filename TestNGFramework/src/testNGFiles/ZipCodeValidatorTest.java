package testNGFiles;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZipCodeValidatorTest {

  private ZipCodeValidator zipCodeValidator;

  @BeforeTest
  public void setUp() throws Exception {
    zipCodeValidator = new ZipCodeValidator();
  }

  @AfterTest
  public void tearDown() throws Exception {
  }
  @Test
  public void ValidZipCodeTest1() {
    System.out.println("Zip Code 12345-6789 "+ zipCodeValidator.validate("12345-6789"));
    Assert.assertTrue(zipCodeValidator.validate("12345-6789"));

  }
  @Test
  public void ValidZipCodeTest2() {
    System.out.println("Zip Code 12345-4567 "+ zipCodeValidator.validate("12345-4567"));
    Assert.assertTrue(zipCodeValidator.validate("12345-4567"));

  }
  
  @Test
  public void InvalidZipCodeTest1() {
    System.out.println("Zip Code 12345-67890 "+ zipCodeValidator.validate("12345-67890"));
   Assert. assertTrue(zipCodeValidator.validate("12345-67890"));
  }
  @Test
  public void InvalidZipCodeTest2() {
    System.out.println("Zip Code 12345-abcd "+ zipCodeValidator.validate("12345-abcd"));
   Assert.assertTrue(zipCodeValidator.validate("12345-abcd"));
  }
}