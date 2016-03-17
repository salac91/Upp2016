package activiti.spring.loanRequest.springweb.controllers;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/application")
public class ProcesiController {

	@Autowired
	private RepositoryService repositoryService;
	@Autowired
	private RuntimeService runtimeService;
	@Autowired
	private TaskService taskService;
	@Autowired
	private HistoryService hystoryService;
	
	@SuppressWarnings("unused")
	@RequestMapping(value="/procesi", method=RequestMethod.GET)
	public String oglasiRestriktivni(ModelMap model){
			
		List<HistoricProcessInstance> historicProcessInstancesUnfinished = hystoryService.createHistoricProcessInstanceQuery().unfinished().list();		
		List<HistoricProcessInstance> historicProcessInstancesFinished = hystoryService.createHistoricProcessInstanceQuery().finished().list();
		List<HistoricProcessInstance> allProcesses = new ArrayList<HistoricProcessInstance>();
		allProcesses.addAll(historicProcessInstancesUnfinished);
		allProcesses.addAll(historicProcessInstancesFinished);
		List<HistoricTaskInstance> historicTasksUnfinished = hystoryService.createHistoricTaskInstanceQuery().unfinished().list();
		List<String> zadaciNezavrseni = new ArrayList<String>();
		for(HistoricProcessInstance proces : historicProcessInstancesUnfinished) {
			String svi = ""; boolean prvi = true;
			for(HistoricTaskInstance task : historicTasksUnfinished) {
				if(task.getProcessInstanceId().equals(proces.getId())) {
					if(prvi) svi = svi + task.getName();
					else svi = svi + " | " + task.getName();
					prvi = false;
				}
			}
			zadaciNezavrseni.add(svi);
		}
		
		//popuni samo
		for(HistoricProcessInstance proces : historicProcessInstancesFinished)
			zadaciNezavrseni.add("");
		
		model.addAttribute("historicProcessInstances", allProcesses);
		model.addAttribute("zadaciNezavrseni", zadaciNezavrseni);
		
		return "application/procesi";
		
		
	}
}
