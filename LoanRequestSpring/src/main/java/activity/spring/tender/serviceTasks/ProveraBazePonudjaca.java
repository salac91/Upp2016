package activity.spring.tender.serviceTasks;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class ProveraBazePonudjaca implements JavaDelegate {

	@Override
	public void execute(DelegateExecution exection) throws Exception {
		boolean ubazi = false;
		//TODO kod za proveru baze
		
		
		exection.setVariable("ubazi", ubazi);
	}

}
