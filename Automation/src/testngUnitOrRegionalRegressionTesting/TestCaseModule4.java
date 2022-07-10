package testngUnitOrRegionalRegressionTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TestCaseModule4 extends BaseClass {
	@Test
	public void createTest4()
	{
		Reporter.log("createTest4",true);
	}
	@Test
	public void modifyTest4()
	{
		Reporter.log("modifyTest4",true);
	}
	@Test
	public void deleteTest4()
	{
		Reporter.log("deleteTest4",true);
	}
}
