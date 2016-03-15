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
		boolean tajmeristekao=false;
		List<Ponudjac> ponudjaciubazi= new ArrayList<Ponudjac>();
		Ponudjac mita=new Ponudjac("zika","zikinnmejl", true, 10000000);
		ponudjaciubazi.add(mita);
		execute.setVariable("ponudjaciubazi", ponudjaciubazi);
		execute.setVariable("tajmeristekao", tajmeristekao);
		execute.setVariable("ponudjaci", ponudjaci);
		execute.setVariable("oglasOtvoreniVidljiv", true);
	}

}
