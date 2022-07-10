package testngActitime;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.BaseClassForActitime;

public class projectModule1 extends BaseClassForActitime {
	@Test
	public void createProject()
	{
		Reporter.log("createProject1",true);
	}
	/*@Test
	public void modifyProject()
	{
		Reporter.log("modifyProject1",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteProject1",true);
	}*/
}
