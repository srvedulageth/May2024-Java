package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DifferentControls {
	
	WebDriver driver;
	
	@Test
	public void launchBrowser() throws Exception {
		WebDriverManager.chromiumdriver().setup();

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://thetestingworld.com/testings/");
		Thread.sleep(2000);
		
		WebElement x = driver.findElement(By.name("fld_username"));
		
		driver.findElement(By.name("fld_username")).sendKeys("LALA");
		driver.findElement(By.cssSelector("[value='office']")).click();

		driver.findElement(By.name("terms")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("displayPopup")).click(); //Opens a pop-up
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[class='close']")).click(); //To close pop-up
		Thread.sleep(2000);
		
		Select gender = new Select(driver.findElement(By.name("sex"))); //For Drop Down 
		gender.selectByValue("1"); //Select by value, index or visual text
		Thread.sleep(2000);

		
		/*
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.close();*/
		driver.quit();
	}

}
