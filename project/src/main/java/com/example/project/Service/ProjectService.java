package com.example.project.Service;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.project.Modal.ProjectModal;
import com.example.project.Repository.ProjectRepository;

@Service

public class ProjectService {
	@Autowired
	private ProjectRepository ProjectRepo;
	
	public String savepro(ProjectModal pro) {
		if(ProjectRepo.findByAccountNumber(pro.getAccountNumber())!=null) {
			return "Account number already exists!";
		}
		 ProjectRepo.save(pro);
		 return "Account created successfully";
	}
	

	public List<ProjectModal> getAccountBalancesByAccountNumber(String accountNumber){
		if(accountNumber==null||accountNumber.isEmpty()) {
			
		return Collections.emptyList();
				
		}
		return ProjectRepo.findAccountBalancesByAccountNumber(accountNumber);
		
	}
	

    public String deposit(String accountNumber, BigDecimal amount) {
        ProjectModal account = ProjectRepo.findByAccountNumber(accountNumber);
        if (account != null) {
            BigDecimal currentBalance = account.getBalance();
            BigDecimal newBalance = currentBalance.add(amount);
            account.setBalance(newBalance);
            ProjectRepo.save(account);
            return "Deposit successful for account number: " + accountNumber;
        } else {
            return "Account not found";
        }
    }
    
    
    
    public String withdra(String accountNumber, BigDecimal amount) {
        ProjectModal account1 = ProjectRepo.findByAccountNumber(accountNumber);
        if (account1 != null) {
            BigDecimal currentBalance = account1.getBalance();
           if(currentBalance.compareTo(amount)>=0) {
            BigDecimal newBalance = currentBalance.subtract(amount);
            account1.setBalance(newBalance);
            ProjectRepo.save(account1);
            return "Withdrawal successful for account number: " + accountNumber;
        } else {
          return ("not balance for withdrawal");
        } 
        }else {
        	return ("Account not found");
        }
    }
	
    
 


	public List<ProjectModal> view(String accountNumber){
		if(accountNumber==null||accountNumber.isEmpty()) {			
		return Collections.emptyList();				
		}
		return ProjectRepo.findAccountBalancesByAccountNumber(accountNumber);
		
	}
	
    
    
    
    
    
    
    }
  
   
