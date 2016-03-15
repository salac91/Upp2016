package activity.spring.tender.serviceTasks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;
import org.activiti.engine.identity.User;
import org.apache.commons.lang3.time.DateUtils;

import activiti.spring.tender.entity.Ponudjac;

public class PostavljanjeKomisije implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		List<User> clanoviKomisije=new ArrayList<User>();
		execution.setVariable("clanoviKomisije", clanoviKomisije);
	}

}
