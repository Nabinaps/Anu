package testngActitime;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;

public class customerModule1 extends BaseClassForActitime {

	
	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer1",true);
	}
	/*@Test
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer1",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer1",true);
	}*/
	
}
