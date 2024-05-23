package org.xyz.automation.fb;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CreateScreenShot {
	
	public void takeSnapShot(WebDriver driver, String fname) throws Exception{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("/Users/gmanjusha/eclipse-workspace-1/May2024-Java/TestResults/" + fname + ".png");
		FileUtils.copyFile(f, fd);
	}

}
