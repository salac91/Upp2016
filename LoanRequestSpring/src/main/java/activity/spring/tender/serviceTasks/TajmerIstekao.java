package activity.spring.tender.serviceTasks;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class TajmerIstekao implements JavaDelegate{

	@Override
	public void execute(DelegateExecution arg0) throws Exception {
		arg0.setVariable("tajmeristekao", true);
		arg0.setVariable("oglasOtvoreniVidljiv", false);
		
		
	}

}
