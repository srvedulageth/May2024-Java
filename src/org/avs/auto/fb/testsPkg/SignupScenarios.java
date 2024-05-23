package org.avs.auto.fb.testsPkg;

import org.avs.auto.fb.basePkg.InitiateBrowser;
import org.avs.auto.fb.pagesPkg.SignupPage;
import org.testng.annotations.Test;

public class SignupScenarios extends InitiateBrowser {
	
	@Test
	public void tc001_createnewaccount() throws Exception {
		SignupPage signup = new SignupPage(driver);
		
		signup.create_newaccountbttn();
		
		signup.enter_firstname("user1");
		signup.enter_lastname("pass1");
		
		signup.select_birthmonth("Feb");
		signup.select_birthday("12");
		signup.select_birthyear("1971");
		
		//signup.select_sex("Female");
		//Thread.sleep(5000);
		//signup.select_sex("Male");
		signup.select_sex("Custom");
		
		signup.click_submitbtn();
	}
}
