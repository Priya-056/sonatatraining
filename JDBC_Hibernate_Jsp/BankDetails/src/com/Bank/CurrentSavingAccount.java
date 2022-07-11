package com.Bank;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="accnt_no")
public class CurrentSavingAccount extends BankDetails {
	
	private String accnt_type;
	private String branch_name;
	public String getAccnt_type() {
		return accnt_type;
	}
	public void setAccnt_type(String accnt_type) {
		this.accnt_type = accnt_type;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public CurrentSavingAccount(int accnt_no, String accnt_holder_name, String bank_name, String ifsc_code,
			String accnt_type, String branch_name) {
		super(accnt_no, accnt_holder_name, bank_name, ifsc_code);
		this.accnt_type = accnt_type;
		this.branch_name = branch_name;
	}
	
	

}
