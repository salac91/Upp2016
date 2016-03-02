package activity.spring.tender.serviceTasks;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import activity.spring.tender.services.PonudjacService;

public class ProveraBazePonudjaca implements JavaDelegate {

	private PonudjacService service;
	
	@Override
	public void execute(DelegateExecution exection) throws Exception {
		boolean ubazi = false;
		//TODO kod za proveru baze
		
		exection.setVariable("ubazi", ubazi);
	}

}
