package testngActitime;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;

public class TestCaseModule1 extends BaseClassForActitime {
	@Test
	public void createTest()
	{
		Reporter.log("createTest1",true);
	}
	/*@Test
	public void modifyTest()
	{
		Reporter.log("modifyTest1",true);
	}
	@Test
	public void deleteTest()
	{
		Reporter.log("deleteTest1",true);
	}*/
}
