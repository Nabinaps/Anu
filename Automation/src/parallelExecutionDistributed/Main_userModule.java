package parallelExecutionDistributed;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClass_parallelExecution;

public class Main_userModule extends BaseClass_parallelExecution {
	@Test
	public void createUser()
	{
		Reporter.log("createUser",true);
	}
	/*@Test
	public void modifyUser()
	{
		Reporter.log("modifyUser",true);
	}
	@Test
	public void deleteUser()
	{
		Reporter.log("deleteUser",true);
	}*/
}
