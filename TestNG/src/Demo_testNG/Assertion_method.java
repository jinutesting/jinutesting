package Demo_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_method {

	@Test
	public void createAccount() {
		System.out.println(" account is created");
		
		
	}

	
	SoftAssert softassert=new SoftAssert();
	@Test(enabled=false)
	public void editaccount() {
		String actual="ABCD";
		String expected="ABCD123";
		
		softassert.assertEquals(actual, expected);
		softassert.assertAll();
	
		System.out.println("account is edited");
	}
	@Test
	public void modifyaccount() {
		System.out.println("account is modified");
	}
	
	@Test
	public void deleteaccount() {
		
		System.out.println("delete the account");
		
	}

}
