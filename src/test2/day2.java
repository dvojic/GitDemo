package test2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	
	@Test(groups= {"Smoke"})
	public void ploan()
	{
		System.out.println("good");
	}
	
	@BeforeTest   //this has high priority
	public void prerequiste()
	{
		System.out.println("I will execute first");
	}

}
