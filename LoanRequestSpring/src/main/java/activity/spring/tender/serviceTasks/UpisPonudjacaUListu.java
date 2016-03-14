package activity.spring.tender.serviceTasks;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import activiti.spring.tender.entity.Ponudjac;

public class UpisPonudjacaUListu implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execute) throws Exception {
		
		//boolean var1 = (Boolean) execute.getVariable("dokumentacija");
		String var2 = (String)execute.getVariable("potvrdaKomisije");
		boolean var3=false;
		try{
			var3 = (Boolean)execute.getVariable("ubazi");
		}catch(Exception e){
		}
		boolean upisi;
		if(var2=="da" || var3)
			upisi=true;
		else 
			upisi=false;
		
		
		
		//if(upisi){
			List<Ponudjac>ponudjaci=(List<Ponudjac>) execute.getVariable("ponudjaci");
			Ponudjac ponudjac = new Ponudjac();
			ponudjac.setNaziv((String)execute.getVariable("nazivPonudjaca"));
			ponudjac.setEmail((String)execute.getVariable("emailPonudjaca"));
			ponudjac.setPonuda((Long)execute.getVariable("ponuda"));
			ponudjac.setDokumentacija(true);
			
			ponudjaci.add(ponudjac);
			execute.setVariable("ponudjaci", ponudjaci);
			
		//}
	}
	
	

}
