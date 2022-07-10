package parallelExecutionCompatibility;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClass_parallelExecution;

public class Main_customerModule extends BaseClassForActitime{
	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
	}
	/*@Test
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer",true);
	}*/
}
