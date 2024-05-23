package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario5 {
	@Test
	public void scenario1() {
		System.out.println("test scenario 1");
	}
	
	@Test
	public void scenario2() {
		System.out.println("test scenario 2");
		Assert.assertEquals("Hello", "Hi");
	}
	
	@Test
	public void scenario3() {
		System.out.println("test scenario 3");
	}
}