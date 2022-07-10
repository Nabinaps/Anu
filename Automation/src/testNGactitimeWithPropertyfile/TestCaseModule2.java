package testNGactitimeWithPropertyfile;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClassForActitimeGeneric;

public class TestCaseModule2 extends BaseClassForActitimeGeneric {
	@Test
	public void createTest()
	{
		Reporter.log("createTest2",true);
	}
	/*@Test
	public void modifyTest()
	{
		Reporter.log("modifyTest2",true);
	}
	@Test
	public void deleteTest()
	{
		Reporter.log("deleteTest2",true);
	}*/
}
