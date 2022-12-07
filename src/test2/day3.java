package test2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class day3 {
   
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before execting any method in the class");
	}
	
@Parameters({"URL","APIKey/usrname"})
@Test

	public void WebLoginHomeLoan(String urlname, String key)
	
	{
		//selenium
		System.out.println("WebLoginHomeLoan");
		System.out.println("urlname");
		System.out.println("key");
	}
	
	@BeforeMethod
	public void BeforeEvery()
	{
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("I will execute aftere every test method in day 3 class");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
	System.out.println("After executin all methods in the class");	
		}
	
	@Test
	public void MobileLogincarLoan()
	{
		System.out.println("MobileLogincarLoan");
	}
		
	@BeforeSuite
	public void BFsuite()
	{
	System.out.println("I am no 1");	
	}
	
	
	
	@Test(dependsOnMethods= {"MobileLogincarLoan","LoginAPIHomeLoan"})
	public void MobileSingincarLoan()
		{
			System.out.println("Mobile SIGNIN");
		}
	
	@Test(dataProvider="getData")
	public void MobileSignoutcarLoan(String username, String password)
			{
				System.out.println("MobileS SIGNOUT");
				System.out.println(username);
				System.out.println(password);
			}
	
	@DataProvider
	public Object[][] getData()
	{
	//1st combination user name password - good credit history
	//2nd -user name password - no credit history
	//3rd - fraudelent credit history
		
		Object[][] data = new Object[3][2];    //3 combinations  //2 values (username & password)
		                                        // we are defining array with 3 rows and 2 columns
		                                       //multidimenzional object array
		//1st set
		data[0][0]="fistsetusername";      //0 stands for 1st row user name
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination (row)
		
		//2nd set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		
		return data;   
		
			}


			
		

	@Test
	public void LoginAPIHomeLoan()
	{
		//rest API automation
		System.out.println("APILoginHome");
	}
	}


