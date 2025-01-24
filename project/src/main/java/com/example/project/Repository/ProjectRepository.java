package com.example.project.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.example.project.Modal.ProjectModal;

@Repository
public interface ProjectRepository extends JpaRepository <ProjectModal,Long> {
	ProjectModal findByAccountNumber(String accountNumber);
	
	@Query(value="SELECT * FROM project WHERE Account_number =:accountNumber",nativeQuery =true)
	List<ProjectModal> findAccountBalancesByAccountNumber(@Param(value="accountNumber") String acc_number);
	
//	@Query(value="SELECT*FROM project WHERE Account_number=:acc_number",nativeQuery=true)
//	ProjectModal findByAccountNumber(String acc_number);

	
}
