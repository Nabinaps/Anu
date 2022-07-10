package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class projectModule extends BaseClass {
	@Test
	public void createProject()
	{
		Reporter.log("createProject",true);
	}
	@Test
	public void modifyProject()
	{
		Reporter.log("modifyProject",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("deleteProject",true);
	}
}
