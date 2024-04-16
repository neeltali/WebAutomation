package Test_003Outside;

import org.testng.annotations.Test;
//import org.junit.Test;
import org.testng.asserts.SoftAssert;

public class Test_SoftAssert {
	@Test

	public void test_3() {
		SoftAssert soft= new SoftAssert();
		System.out.println("Email");
		System.out.println("Password");
		System.out.println("LoginButton");
		
		String expected="Bug";
		String actual="bug";
		soft.assertEquals(actual, expected);
		
		System.out.println("Test Done");
		soft.assertAll();
	}
	
	
	
	
	
}
