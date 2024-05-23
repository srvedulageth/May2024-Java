package org.avs.auto.fb.pagesPkg;

import org.avs.auto.fb.utilsPkg.readProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enter_username(String uname) throws Exception {
		driver.findElement(By.id(readProperties.readElement("fb_login_username_id"))).sendKeys(uname);
	}

	public void enter_password(String password) throws Exception {
		driver.findElement(By.name(readProperties.readElement("fb_login_passwd_name"))).sendKeys(password);
	}
	
	public void clikc_loginbtn() throws Exception {
		driver.findElement(By.cssSelector(readProperties.readElement("fb_login_btn_css"))).click();
	}
}
