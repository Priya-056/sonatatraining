package com.Bank;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class BankDetails {

@Id
private int accnt_no;
private String accnt_holder_name;
private String bank_name;
private String ifsc_code;

public int getAccnt_no() {
	return accnt_no;
}
public void setAccnt_no(int accnt_no) {
	this.accnt_no = accnt_no;
}
public String getAccnt_holder_name() {
	return accnt_holder_name;
}
public void setAccnt_holder_name(String accnt_holder_name) {
	this.accnt_holder_name = accnt_holder_name;
}
public String getBank_name() {
	return bank_name;
}
public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}
public String getIfsc_code() {
	return ifsc_code;
}
public void setIfsc_code(String ifsc_code) {
	this.ifsc_code = ifsc_code;
}
public BankDetails(int accnt_no, String accnt_holder_name, String bank_name, String ifsc_code) {
	super();
	this.accnt_no = accnt_no;
	this.accnt_holder_name = accnt_holder_name;
	this.bank_name = bank_name;
	this.ifsc_code = ifsc_code;
}


}
