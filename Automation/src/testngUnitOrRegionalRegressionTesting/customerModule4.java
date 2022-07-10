package testngUnitOrRegionalRegressionTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class customerModule4 extends BaseClass {

	
	@Test
	public void createCustomer4()
	{
		Reporter.log("createCustomer4",true);
	}
	@Test
	public void modifyCustomer4()
	{
		Reporter.log("modifyCustomer4",true);
	}
	@Test
	public void deleteCustomer4()
	{
		Reporter.log("deleteCustomer4",true);
	}
	
}
