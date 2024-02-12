package TestNGPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	@Test
	public void add()
	{
		int a=2,b=3,sum=0;
		sum=a+b;
		int result=5;
		Assert.assertEquals(sum, result);
	}
	@Test
	public void add1()
	{
		int a=2,b=3,sum=0;
		sum=a+b;
		int result=6;
		Assert.assertEquals(sum, result);
		System.out.println("Assert Failed");
	}
	@Test 
	public void add2()
	{
		int a=2,b=3,sum=0;
		sum=a+b;
		int result=6;
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(sum, result);
	}
	@Test
	public void add3()
	{
		int a=2,b=3,sum=0;
		sum=a+b;
		int result=6;
		Assert.assertEquals(sum, result);
	}


}
