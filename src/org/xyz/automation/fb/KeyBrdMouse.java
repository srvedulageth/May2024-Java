package org.xyz.automation.fb;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBrdMouse {
	
	WebDriver driver;
	
	@Test(enabled=false)
	public void riamoneyxfer() throws Exception {
		//WebDriverManager.chromiumdriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.riamoneytransfer.com/en-us/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/section/div/div/form/div[1]/div[1]/div[1]")).click();
		
		CreateScreenShot cs = new CreateScreenShot();
		cs.takeSnapShot(driver, "test1");
	}
	
	@Test(enabled=true)
	public void handleFrames() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(), 'Sample Iframe page')]")).getText());
		
		driver.switchTo().frame("frame1");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(), 'This is a sample page')]")).getText());
		
		CreateScreenShot cs = new CreateScreenShot();
		cs.takeSnapShot(driver, "test1");
	}
	
	@Test(enabled=false)
	public void handleAlerts() throws Exception {
		//WebDriverManager.chromiumdriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();//This pops up an alert as login and passwd are not given.
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
	}
	
	@Test(enabled=false)
	public void handleMouse() throws Exception { //Multiple windows also handled here...
		//WebDriverManager.chromiumdriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.mphasis.com/home.html");
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//*[text()='Our Approach']"))).perform(); //left click
		//act.doubleClick(driver.findElement(By.xpath("//*[text()='Our Approach']"))).perform();
		//act.contextClick(driver.findElement(By.xpath("//*[text()='Our Approach']"))).perform(); //right click
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform(); //Move to desired element.
		//This opens 'Hospitality' page in the same window.
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		
		//To open in another tab
		act.keyDown(Keys.COMMAND).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.COMMAND).perform();
		
		Set<String> winid = driver.getWindowHandles(); //Get windows handles to a string.
		System.out.println(winid);
		Iterator<String> iter = winid.iterator(); //By default iter is not pointing to any window!!!
		String win1 = iter.next();
		String win2 = iter.next();
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		Thread.sleep(5000);
		driver.switchTo().window(win2);
	}
	
	@Test(enabled=false)
	public void handleKeyboard() throws Exception {
		//WebDriverManager.chromiumdriver().setup();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		act.sendKeys("user1").perform();
		Thread.sleep(2000);
		
		//Hold(KeyDown) Command+a to capture text. This captures text.
		//Then release Command(KeyUP)
		//Then press DELETE.
		act.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).sendKeys(Keys.DELETE).perform();
		//Thread.sleep(2000);

		driver.quit();
	}

}
