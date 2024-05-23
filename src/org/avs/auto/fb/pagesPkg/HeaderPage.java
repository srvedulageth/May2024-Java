package org.avs.auto.fb.pagesPkg;

import org.avs.auto.fb.utilsPkg.readProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {
	
	WebDriver driver;
	
	public HeaderPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void click_hdrInvestors() throws Exception {
		driver.findElement(By.xpath(readProperties.readElement("mph_hdr_investors_xpath"))).click();
	}

}
