package com.example.project.Modal;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="project")

public class ProjectModal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="Account_name")
	private String Acc_name;
	
	@Column(name="Father_name")
	private String Fa_name;
	
	@Column(name="Aadhar_number")
	private String Aa_number;
	
	@Column(name="Moblie_no")
	private String Mob_no;
	
	@Column(name="Account_number")
	private String accountNumber;
	
	@Column(name="Account_balance")
	private BigDecimal balance;
	
	@Column(name="Date_birth")
	private String Date_b;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAcc_name() {
		return Acc_name;
	}

	public void setAcc_name(String acc_name) {
		Acc_name = acc_name;
	}

	public String getFa_name() {
		return Fa_name;
	}

	public void setFa_name(String fa_name) {
		Fa_name = fa_name;
	}

	public String getAa_number() {
		return Aa_number;
	}

	public void setAa_number(String aa_number) {
		Aa_number = aa_number;
	}

	public String getMob_no() {
		return Mob_no;
	}

	public void setMob_no(String mob_no) {
		Mob_no = mob_no;
	}

	

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public String getDate_b() {
		return Date_b;
	}

	public void setDate_b(String date_b) {
		Date_b = date_b;
	}

	@Override
	public String toString() {
		return "ProjectModal [id=" + id + ", Acc_name=" + Acc_name + ", Fa_name=" + Fa_name + ", Aa_number=" + Aa_number
				+ ", Mob_no=" + Mob_no + ", accountNumber=" + accountNumber + ", balance=" + balance + ", Date_b="
				+ Date_b + "]";
	}

	

	
	
}