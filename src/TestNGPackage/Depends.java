package TestNGPackage;

import org.testng.annotations.Test;

public class Depends {
	@Test(dependsOnMethods = {"OpenBrowser"})
	public void signIn()
	{
		System.out.println("Sign On Method");
	}
	@Test
	public void OpenBrowser()
	{
		System.out.println("Open Browser method");
	}

}
