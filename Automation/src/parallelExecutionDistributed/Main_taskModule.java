package parallelExecutionDistributed;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClass_parallelExecution;

public class Main_taskModule extends BaseClass_parallelExecution {
	@Test
	public void createTask()
	{
		Reporter.log("createTask",true);
	}
	/*@Test
	public void modifyTask()
	{
		Reporter.log("modifyTask",true);
	}
	@Test
	public void deleteTask()
	{
		Reporter.log("deleteTask",true);
	}*/
}
