package testNGFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTestNG {
	
	//@Test , @before Test @ After Test , Beforemethod, aftermethod
	
	@Test
	public void getLoginDetails(){
		System.out.println("LOGIN name n Password");
		
	}
		
	@Test
	public void deleteUsers(){
		System.out.println("deleted users");
	}
		
	@Test
	public void getNoOfCookies(){
		System.out.println("No of Cookies");
	}
	
	@BeforeMethod
	public void getNoOFUsers(){
		System.out.println("before Everymethos");
		System.out.println("**************************************************");

	}
	@AfterMethod
	public void getNewUsers(){
		System.out.println("After Everymethod");
		System.out.println("########################################################");

	}
	@BeforeTest
	public void DeleteCookies(){
		System.out.println("---------------------Deleting cooikies before all test executoin-----------------------------");
	}
	
	@AfterTest
	public void afterDeleteCookies(){
		System.out.println("@@@@@@@@@@@@@@@@@@@@ AFterDeleting cooikies after all test executoin@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}
}
