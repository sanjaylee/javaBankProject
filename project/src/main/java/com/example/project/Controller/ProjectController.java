package com.example.project.Controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.Modal.ProjectModal;
import com.example.project.Service.ProjectService;

@RestController
@RequestMapping("/Project")
@CrossOrigin(origins="*")
public class ProjectController {
 
	
	@Autowired
	private ProjectService ProjectSer;
	
	@PostMapping("/create")
	public String saveProj(@RequestBody ProjectModal pro) {
		return ProjectSer.savepro(pro);
	}
	
	@GetMapping("/balance")
	public List<ProjectModal> getBalances(@RequestParam String accountNumber){
		return ProjectSer.getAccountBalancesByAccountNumber(accountNumber);
	}
	

	@PutMapping("/deposit")
   public String deposit(@RequestParam String accountNumber, @RequestParam BigDecimal amount){
       return ProjectSer.deposit(accountNumber, amount);
   }
	@PostMapping("/Withdrawal")
	   public String withdar(@RequestParam String accountNumber, @RequestParam BigDecimal amount){
	       return ProjectSer.withdra(accountNumber, amount);
	       
	   }
	@GetMapping("/view")
	public List<ProjectModal> viewdetails(@RequestParam String accountNumber){
		return ProjectSer.getAccountBalancesByAccountNumber(accountNumber);
	}
	
	
	
}
