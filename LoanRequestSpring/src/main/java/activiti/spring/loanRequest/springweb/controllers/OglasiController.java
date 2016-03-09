package activiti.spring.loanRequest.springweb.controllers;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.ProcessDefinition;
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
	
	
	@RequestMapping(value="/oglasi")
	private String Oglasi(ModelMap model){
		return "application/oglasi";
	}
	
	@RequestMapping(value="/oglasi/prijavaOtvoreni", method=RequestMethod.GET)
	public String OglasiRestriktivni(ModelMap model){
		ProcessDefinition procDef = repositoryService.createProcessDefinitionQuery().processDefinitionKey("loanRequest").latestVersion().singleResult();
		User user;
		try {
			user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception ex) {
			return "redirect:/login";
		}
		
		String id = user.getUsername();
		runtimeService.messageEventReceived("porukaOtvoreni", procDef.getId());
		
		runtimeService.setVariable(procDef.getId(), "ponudjac", id);
		
		return "application/oglasi";
		
		
	}

}
