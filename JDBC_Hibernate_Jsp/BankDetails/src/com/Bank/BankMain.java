package com.Bank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankDetails bd=new BankDetails(784512369,"Priya S","IOB Bank","IFSC14521");
		CurrentSavingAccount csa=new CurrentSavingAccount(784512369,"Priya S","IOB Bank","IFSC14521","Savings","Katpadi");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session s = factory.openSession();
        s.beginTransaction();
        s.save(bd);
        s.save(csa);
        s.getTransaction().commit();
        s.close();
	}

}
