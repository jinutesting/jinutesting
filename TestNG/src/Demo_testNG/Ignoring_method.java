package Demo_testNG;

import org.testng.annotations.Test;

public class Ignoring_method {
	
	@Test(priority=0)
	public void createAccount() {
		System.out.println(" account is created");
		
		
	}

	@Test(enabled=false)
	public void editaccount() {
		
		System.out.println("account is edited");
	}
	@Test(priority=1)
	public void modifyaccount() {
		System.out.println("account is modified");
	}
	
	@Test(priority=7)
	public void deleteaccount() {
		
		System.out.println("delete the account");
		
	}
	

}
