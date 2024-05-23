package org.avs.auto.fb.pagesPkg;

import org.avs.auto.fb.utilsPkg.readProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	
	WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void create_newaccountbttn() throws Exception {
		driver.findElement(By.xpath(readProperties.readElement("fb_signup_createnewacc_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception {
		driver.findElement(By.name(readProperties.readElement("fb_signup_firstname_name"))).sendKeys(fname);
	}

	public void enter_lastname(String lname) throws Exception {
		driver.findElement(By.name(readProperties.readElement("fb_signup_lastname_name"))).sendKeys(lname);
	}

	public void select_birthmonth(String month) throws Exception {
		Select dob_month = new Select(driver.findElement(By.name(readProperties.readElement("fb_signup_birthmonth_name"))));
		dob_month.selectByVisibleText(month);
	}
	
	public void select_birthday(String day) throws Exception {
		Select dob_day = new Select(driver.findElement(By.name(readProperties.readElement("fb_signup_birthday_name"))));
		dob_day.selectByVisibleText(day);
	}
	
	public void select_birthyear(String year) throws Exception {
		Select dob_year = new Select(driver.findElement(By.name(readProperties.readElement("fb_signup_birthyear_name"))));
		dob_year.selectByVisibleText(year);
	}
	
	//Select Sex
	public void select_sex(String sex) {
		WebElement radio;
		if(sex == "Female") {
			radio = driver.findElement(By.xpath("//label[text()='Female']"));
			radio.click();
		}
		else if(sex == "Male") {
			radio = driver.findElement(By.xpath("//label[text()='Male']"));
			radio.click();
		}
		else if(sex == "Custom") {
			radio = driver.findElement(By.xpath("//label[text()='Custom']"));
			radio.click();
			Select pronoun = new Select(driver.findElement(By.name("preferred_pronoun")));
			pronoun.selectByValue("6");
		}
		else {
			radio = driver.findElement(By.xpath("//label[text()='Female']"));
			radio.click();
		}
	}
	
	public void click_submitbtn() throws Exception {
		driver.findElement(By.name(readProperties.readElement("fb_signup_submit_name"))).click();
	}
}
