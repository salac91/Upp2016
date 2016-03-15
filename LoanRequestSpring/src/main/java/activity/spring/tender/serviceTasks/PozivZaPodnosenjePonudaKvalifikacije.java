package activity.spring.tender.serviceTasks;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class PozivZaPodnosenjePonudaKvalifikacije implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execute) throws Exception {
		// TODO Auto-generated method stub
		Boolean tajmeristekao=false;
		execute.setVariable("tajmeristekao", tajmeristekao);
	}

}
