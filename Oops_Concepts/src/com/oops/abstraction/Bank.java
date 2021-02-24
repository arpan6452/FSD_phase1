package com.oops.abstraction;

import java.util.Date;

public class Bank {

	protected String IFSCCode;
	protected String bankName;
	protected String branchName;
	
	//hiding this irrelevant information from outer worl and Customer Class 
	private Date registrationDate;
	
	public Bank(String iFSCCode, String bankName, String branchName, Date registrationDate) {
		super();
		IFSCCode = iFSCCode;
		this.bankName = bankName;
		this.branchName = branchName;
		this.registrationDate = registrationDate;
	}
	
	@Override
	public String toString() {
		return "Bank [IFSCCode=" + IFSCCode + ", bankName=" + bankName + ", branchName=" + branchName + "]";
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	public String getIFSCCode() {
		return IFSCCode;
	}
	public void setIFSCCode(String iFSCCode) {
		IFSCCode = iFSCCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	
	
}
