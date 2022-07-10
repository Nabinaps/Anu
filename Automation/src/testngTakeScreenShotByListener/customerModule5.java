package testngTakeScreenShotByListener;

import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;





@Listeners(com.actitime.generic.ListenerImplementation.class)
public class customerModule5 extends BaseClassForActitime {

	
	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer",true);
		Assert.fail();
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
