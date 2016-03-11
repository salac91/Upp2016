package activity.spring.tender.serviceTasks;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import activiti.spring.tender.entity.Ponudjac;

public class PozivZaPodnosenjePonuda implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execute) throws Exception {
		List<Ponudjac> ponudjaci=new ArrayList<Ponudjac>();
		Boolean tajmeristekao=false;
		execute.setVariable("tajmeristekao", tajmeristekao);
		execute.setVariable("ponudjaci", ponudjaci);
	}

}
