package testNGFiles;

import org.testng.annotations.Test;

public class CreidtApplication {
	
	@Test(groups={"priority1"})
	public void checkcredtAccount(){
		System.out.println("Account exists");
		

	}
	
	@Test
	public void checkCreditBalance(){
		System.out.println("Credit Account balance checked");
	}
	@Test(dependsOnMethods={"checkcredtAccount"},alwaysRun=true)
	public void issueCreditCard(){
		System.out.println("Crdit Card issued");
		

	}

	@Test(alwaysRun=true)
	public void noIssueCreditCard(){
		System.out.println("noCredit Card issued");
	}
		
}
