package testNgGroupExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClassForGroupExecution;

public class customerModule3 extends BaseClassForGroupExecution {

	
	@Test(groups= {"smokeTest","regressionTest"})
	public void createCustomer()
	{
		Reporter.log("createCustomer3",true);
	}
	@Test(groups= "regressionTest")
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer3",true);
	}
	@Test(groups="regressionTest")
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer3",true);
	}
	
}
