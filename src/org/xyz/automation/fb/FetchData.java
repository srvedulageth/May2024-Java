package org.xyz.automation.fb;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FetchData {
	
	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception {
		//WebDriverManager.chromiumdriver().setup();

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String ExpURL = "https://www.facebook.com/";
		driver.navigate().to(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		Assert.assertEquals(ActURL, ExpURL);
		
		String ExpTitle = "Facebook - log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		Assert.assertEquals(ExpTitle, ActTitle);
		
		//Are the login id, password boxes there?
		String ExpUserNameTxt = "Email or phone number";
		String ActUserNameTxt = driver.findElement(By.name("email")).getAttribute("placeholder");
		System.out.println(ActUserNameTxt);
		Assert.assertEquals(ExpUserNameTxt, ActUserNameTxt);
		
		driver.quit();
	}

}
