package org.avs.auto.fb.basePkg;

import java.time.Duration;

import org.avs.auto.fb.utilsPkg.readProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InitiateBrowser {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception {
		//Select Browser
		if(readProperties.readConfig("BrowserName").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(readProperties.readConfig("BrowserName").equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if(readProperties.readConfig("BrowserName").equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			driver = new ChromeDriver();
		}
		
		//Launch Browser
		driver.get(readProperties.readConfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	
	//@AfterMethod
	//public void closeBrowser() {
	//	driver.quit();
	//}

}
