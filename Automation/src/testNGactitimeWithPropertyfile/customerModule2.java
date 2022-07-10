package testNGactitimeWithPropertyfile;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClassForActitimeGeneric;

public class customerModule2 extends BaseClassForActitimeGeneric {

	
	@Test
	public void createCustomer()
	{
		Reporter.log("createCustomer2",true);
	}
	/*@Test
	public void modifyCustomer()
	{
		Reporter.log("modifyCustomer2",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteCustomer2",true);
	}*/
	
}
