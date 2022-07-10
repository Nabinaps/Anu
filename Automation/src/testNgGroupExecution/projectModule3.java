package testNgGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClassForGroupExecution;

public class projectModule3 extends BaseClassForGroupExecution {
	@Test(groups= {"smokeTest","regressionTest"})
	public void createProject()
	{
		Reporter.log("createProject3",true);
	}
	@Test(groups= "regressionTest")
	public void modifyProject()
	{
		Reporter.log("modifyProject3",true);
	}
	@Test(groups= "regressionTest")
	public void deleteCustomer()
	{
		Reporter.log("deleteProject3",true);
	}
}
