package TestNGPackage;

import java.lang.reflect.Method;
import java.security.PublicKey;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.base.CaseFormat;

public class DpMethod3 {
	@DataProvider(name="data-Provider")
	public Object[][] dpMethod(Method d)
	{
	switch (d.getName()){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		case "add": {
			
			return new Object[][] {{2,3,5}};
		}
		case "diff":{
			
			return new Object[][] {{2,3,-1}};
		}
	  }
	return null;
	}
	@Test(dataProvider ="data-Provider")
	public void add(int a,int b,int result)
	{
		int res=a+b;
		Assert.assertEquals(res, result);
	}
	@Test(dataProvider ="data-Provider")
	public void diff(int a,int b,int result)
	{
		int res=a-b;
		Assert.assertEquals(res, result);
	}
}
