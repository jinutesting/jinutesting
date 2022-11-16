package YoutubestudyTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	
	
	

		
		SoftAssert softAssert= new SoftAssert();
		
		
		@Test
		 void soft() {
			
			softAssert.assertTrue(true);
			
			
			softAssert.assertEquals("welcome", "welcome"); //true
			softAssert.assertEquals("Welocme", "welcome"); //false
			
			System.out.println("succesfully passed");
			softAssert.assertAll();
			
			
			
			
		}
				
		
		
		
	}

