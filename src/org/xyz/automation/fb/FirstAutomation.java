package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FirstAutomation {
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		//WebDriverManager.chromiumdriver().setup();

		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBrowser( ) {
		driver.close();
	}
	
	@Test(enabled=false)
	public void loginFunction() {
		driver.findElement(By.id("email")).sendKeys("srvedula@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("Man1Sita$");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	@Test(enabled=true)
	public void signupFunction() throws InterruptedException {
		driver.findElement(By.linkText("Create new account")).click();
		//Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("LALA");
		driver.findElement(By.name("lastname")).sendKeys("LALA");
		driver.findElement(By.name("reg_email__")).sendKeys("4086215125");
		driver.findElement(By.id("password_step_input")).sendKeys("kakakk");
		driver.findElement(By.name("websubmit")).click();
		
		//Thread.sleep(2000);
	}

}
