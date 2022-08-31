package Demo_testNG;

import org.testng.annotations.Test;

public class DependecyMethod {
	
	
	
	@Test
	public void createAccount() {
		System.out.println(" account is created");
		
		
	}

	@Test
	public void editaccount() {
		
		System.out.println("account is edited");
	}
	@Test
	public void modifyaccount() {
		System.out.println("account is modified");
	}
	
	@Test(dependsOnMethods= {"editaccount","modifyaccount"})
	public void deleteaccount() {
		
		System.out.println("delete the account");
		
	}
	

}
