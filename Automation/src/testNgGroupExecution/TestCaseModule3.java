package testNgGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClassForGroupExecution;

public class TestCaseModule3 extends BaseClassForGroupExecution {
	@Test(groups= {"smokeTest","regressionTest"})
	public void createTest()
	{
		Reporter.log("createTest3",true);
	}
	@Test(groups= "regressionTest")
	public void modifyTest()
	{
		Reporter.log("modifyTest3",true);
	}
	@Test(groups= "regressionTest")
	public void deleteTest()
	{
		Reporter.log("deleteTest3",true);
	}
}
