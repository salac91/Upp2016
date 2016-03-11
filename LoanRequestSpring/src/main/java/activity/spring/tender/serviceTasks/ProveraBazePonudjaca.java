package activity.spring.tender.serviceTasks;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import activiti.spring.tender.entity.Ponudjac;
import activity.spring.tender.services.PonudjacService;

public class ProveraBazePonudjaca implements JavaDelegate {

	private PonudjacService service;
	
	@Autowired
	public ProveraBazePonudjaca(PonudjacService service) {
		this.service = service;
	}
	
	@Override
	public void execute(DelegateExecution exection) throws Exception {
		boolean ubazi = false;
	
		String nazivPonudjaca = (String) exection.getVariable("nazivPonudjaca");
		Ponudjac ponudjac = service.findPonudjac(nazivPonudjaca);
		
		if(ponudjac != null) ubazi = true;
		
		exection.setVariable("ubazi", ubazi);
	}

}
