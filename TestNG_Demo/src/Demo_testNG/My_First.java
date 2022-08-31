package Demo_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class My_First {
	
	@BeforeClass
	public void openbrowser(){
		
		System.out.println("openbrowser");
	}
	
	
	
	
	
	@BeforeMethod
	
	public void login() {
		System.out.println("login");
	}
	
	
	
	@Test
	public void createAccout(){
		
		System.out.println("createAccout");
		
	}
	
	@Test
	public void edithAccount() {
		System.out.println("edithAccount");
	}

    @Test
    public void Deleteaccount() {
    	System.out.println("Deleteaccount");
    }

   @AfterMethod
   public void logout(){
	   
	   System.out.println("logout");
   }

   
   @AfterClass
   public void close(){
	   System.out.println("close browser");
   }
   
}
