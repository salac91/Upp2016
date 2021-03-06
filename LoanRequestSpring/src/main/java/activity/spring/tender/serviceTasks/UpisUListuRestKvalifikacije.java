package activity.spring.tender.serviceTasks;

import java.util.List;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import activiti.spring.tender.entity.Ponudjac;

public class UpisUListuRestKvalifikacije implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execute) throws Exception {
			
			List<Ponudjac> kandidati=(List<Ponudjac>) execute.getVariable("kandidati");
			Ponudjac ponudjac = new Ponudjac();
			ponudjac.setNaziv((String)execute.getVariable("nazivPonudjaca"));
			ponudjac.setEmail((String)execute.getVariable("emailPonudjaca"));
			ponudjac.setPonuda((Long)execute.getVariable("ponuda"));
			
			kandidati.add(ponudjac);
			
			long brojKandidata = kandidati.size();
			
			execute.setVariable("kandidati", kandidati);
			execute.setVariable("brojKandidata", brojKandidata);
			
			
			
		
		
	}

}
