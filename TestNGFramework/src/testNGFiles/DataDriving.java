package testNGFiles;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDriving {
	//<?xml version="1.0" encoding="iso-8859-1"?>
	
	@Test(dataProvider="getUserDetails")
	public void userIDCreation(String username , String userId){
		System.out.println("Credit Account balance checked");
		System.out.println(username);
		System.out.println(userId);
	}
	@Test 
//	@Parameters({"username", "userid"})
	@Parameters({"username"})
	public void loanCreation(String name){
		System.out.println("Crdit Card issued");
		System.out.println(name);
		//System.out.println(id);

	}

	 @DataProvider
	 public Object[][] getUserDetails(){
		 Object[][] data =new Object[2][2];
		 data[0][0]="shwe";
		 data[0][1]="001";
		 data[1][0]="nare";
		 data[1][1]="002";
		 return data;
	 }
}
