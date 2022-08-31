package YoutubestudyTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion {

	
	
	
	@Test
	public void demotest() {
  Assert.assertTrue(true);
  Assert.assertEquals("java","java");
  Assert.assertEquals("my program", "my program");
  System.out.println("test 1 passed");

  
	}
	
	@Test
	public void demo2() {
		
		 Assert.assertTrue(true);
		  Assert.assertEquals("java","Java");
		  Assert.assertEquals("My program", "my program");
		  System.out.println("test 2 passed");

		
		
	}
	
	
	}


