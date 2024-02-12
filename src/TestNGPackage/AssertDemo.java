package TestNGPackage;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class AssertDemo {
	@DataProvider(name="add-number")
	public Object[][] dpmethod(){
		return new Object[][] {{2,3,5},{2,2,5}};
	}
	
	@Test(dataProvider = "add-number")
	public void add(int a,int b,int result)
	{
		Reporter.log("Hard Assert");
		int sum=a+b;
		Assert.assertEquals(sum, result);
	}
	

}
