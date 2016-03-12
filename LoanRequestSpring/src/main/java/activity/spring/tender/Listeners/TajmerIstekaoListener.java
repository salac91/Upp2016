package activity.spring.tender.Listeners;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.ExecutionListener;
import org.activiti.engine.delegate.TaskListener;

public class TajmerIstekaoListener implements ExecutionListener {



	@Override
	public void notify(DelegateExecution execute) throws Exception {
		execute.setVariable("tajmeristekao", true);
		
	}

}
