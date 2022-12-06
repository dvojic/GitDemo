package qaclickacademy.Mavenjava;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	
	//testng xml file from Maven
	//how to execute all test cases from Test folder - mvn test
	//
	
	@Test
	public void BrowserAutomation()
	{
		// here we can write our code to call drivers browser etc. . .
		System.out.println("BrowserAutomation");
		
	}
	
	@Test
	public void elementsUi()
	{
		System.out.println("elementsUi");
	}
	

}
