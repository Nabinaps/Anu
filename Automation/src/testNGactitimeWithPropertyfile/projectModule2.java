package testNGactitimeWithPropertyfile;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClassForActitimeGeneric;

public class projectModule2 extends BaseClassForActitimeGeneric {
	@Test
	public void createProject()
	{
		Reporter.log("createProject2",true);
	}
	/*@Test
	public void modifyProject()
	{
		Reporter.log("modifyProject2",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteProject2",true);
	}*/
}
