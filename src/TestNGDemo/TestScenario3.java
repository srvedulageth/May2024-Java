package TestNGDemo;

import org.testng.annotations.Test;

public class TestScenario3 {
	@Test
	public void scenario1() {
		System.out.println("test scenario 1");
	}
	
	@Test(dependsOnMethods="scenario3")
	public void scenario2() {
		System.out.println("test scenario 2");
	}
	
	@Test
	public void scenario3() {
		System.out.println("test scenario 3");
	}
}