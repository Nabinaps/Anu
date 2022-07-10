package parallelExecutionCompatibility;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClassForActitime;
import com.actitime.generic.BaseClass_parallelExecution;

public class Main_projectModule extends BaseClassForActitime {
	@Test
	public void createProject()
	{
		Reporter.log("createProject",true);
	}
	/*@Test
	public void modifyProject()
	{
		Reporter.log("modifyProject",true);
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("deleteProject",true);
	}*/
}
