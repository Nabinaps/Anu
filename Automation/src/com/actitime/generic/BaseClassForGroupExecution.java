package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClassForGroupExecution {
	@BeforeTest(groups= {"smokeTest","regressionTest"})
	public void openBrowser()
	{
		Reporter.log("openBrowser",true);
	}
	@AfterTest(groups= {"smokeTest","regressionTest"})
	public void closeBrowser()
	{
		Reporter.log("closeBrowser",true);
	}
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void login()
	{
		Reporter.log("login",true);
	}
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void logout()
	{
		Reporter.log("logout",true);
	}
}
