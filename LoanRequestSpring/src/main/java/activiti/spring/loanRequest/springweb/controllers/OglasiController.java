package activiti.spring.loanRequest.springweb.controllers;

import org.activiti.engine.FormService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.impl.pvm.delegate.ActivityExecution;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/application")
public class OglasiController {
	
	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private FormService formService;
	
	
	@RequestMapping(value="/oglasi")
	private String Oglasi(ModelMap model){
		return "application/oglasi";
	}
	
	@RequestMapping(value="/oglasi/prijavaOtvoreni", method=RequestMethod.GET)
	public String OglasiRestriktivni(ModelMap model){
		//ProcessDefinition procDef = repositoryService.createProcessDefinitionQuery().processDefinitionKey("loanRequest").latestVersion().singleResult();
		//Execution execute = runtimeService.createExecutionQuery().processInstanceId("loanRequest").singleResult();
		 //Execution execute =  runtimeService.createExecutionQuery().executionId("loanRequest").singleResult();
		User user;
		String pid = ApplicationController.pid;
		System.out.println(pid);
		
		try {
			user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception ex) {
			return "redirect:/login";
		}
		
		String id = user.getUsername();
		Execution execution= runtimeService.createExecutionQuery().processInstanceId(pid).messageEventSubscriptionName("porukaOtvoreni").singleResult();
		runtimeService.messageEventReceived("porukaOtvoreni", execution.getId(), null);
		
		runtimeService.setVariable(pid, "ponudjac", id);
		
		return "application/oglasi";
		
		
	}

}
