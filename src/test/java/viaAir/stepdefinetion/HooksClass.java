package viaAir.stepdefinetion;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import functionBase.basefunction;

public class HooksClass extends basefunction {
	@Before
	public void launchbrowser() {
	driverInit("Chrome");

	}
	@After
	public void closebrowser() {
		closeBrowser();

	}

}
