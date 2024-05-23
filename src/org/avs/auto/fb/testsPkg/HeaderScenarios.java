package org.avs.auto.fb.testsPkg;

import org.avs.auto.fb.basePkg.InitiateBrowser;
import org.avs.auto.fb.pagesPkg.HeaderPage;
import org.testng.annotations.Test;

public class HeaderScenarios extends InitiateBrowser {
	
	@Test
	public void tc001_clickInvestors() throws Exception {
		HeaderPage links = new HeaderPage(driver);
		
		Thread.sleep(2000);
		links.click_hdrInvestors();
	}

}
