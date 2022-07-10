package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TestCaseModule extends BaseClass {
	@Test
	public void createTest()
	{
		Reporter.log("createTest",true);
	}
	@Test
	public void modifyTest()
	{
		Reporter.log("modifyTest",true);
	}
	@Test
	public void deleteTest()
	{
		Reporter.log("deleteTest",true);
	}
}
