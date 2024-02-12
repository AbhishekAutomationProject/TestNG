package TestNGPackage;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	@Parameters("browser")
	@BeforeMethod
	public void login(String browser)
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Fire Fox Browser");
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Chrome Browser");
		}
		
	}
	@Test 
	public void login() throws InterruptedException {
                System.out.println("Login Method");
		}  

	  @AfterClass 
	  public void afterTest() {

		System.out.println("After Test method");

		}

}
