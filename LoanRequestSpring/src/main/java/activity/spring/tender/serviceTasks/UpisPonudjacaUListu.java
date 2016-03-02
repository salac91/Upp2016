package activity.spring.tender.serviceTasks;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class UpisPonudjacaUListu implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execute) throws Exception {
		// TODO Auto-generated method stub
		boolean var1 = (Boolean) execute.getVariable("dokumentacija");
		boolean var2 = (Boolean)execute.getVariable("potvrdaKomisije");
		boolean var3 = (Boolean)execute.getVariable("ubazi");
		boolean upisi;
		if((var1 && var2) || var3)
			upisi=true;
		else 
			upisi=false;
		
		
		
		if(upisi){
			
			//TODO kod za upis u bazu
		}
	}
	
	

}
