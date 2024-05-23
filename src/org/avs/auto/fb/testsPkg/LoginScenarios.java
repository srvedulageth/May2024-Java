package org.avs.auto.fb.testsPkg;

import org.avs.auto.fb.basePkg.InitiateBrowser;
import org.avs.auto.fb.datageneratorPkg.TestDataGenerator;
import org.avs.auto.fb.pagesPkg.LoginPage;
import org.testng.annotations.Test;

public class LoginScenarios extends InitiateBrowser {
	
	@Test(dataProvider="staticdata", dataProviderClass=TestDataGenerator.class)
	public void tc001_validcreadentials(String username, String password) throws Exception {
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.clikc_loginbtn();
	}

}
