package TestNGPackage;

import org.testng.annotations.Test;

public class DependentOnGroup {
	@Test(dependsOnGroups = {"SignIn"})
	public void Method1()
	{
		System.out.println("1St Method");
	}
	@Test(groups = "SignIn")
	public void Method2()
	{
		System.out.println("2nd Method");
	}
	@Test(groups = "SignIn")
	public void Method3()
	{
		System.out.println("3nd Method");
	}

}
