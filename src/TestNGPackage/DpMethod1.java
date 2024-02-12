package TestNGPackage;


import org.testng.annotations.Test;

public class DpMethod1 {
	@Test(dataProvider = "data-provider",dataProviderClass = DpMethod.class)
	public void test(String value)
	{
		System.out.println("Data Provider is in different class");
		System.out.println("value passed: "+value);
	}

}
