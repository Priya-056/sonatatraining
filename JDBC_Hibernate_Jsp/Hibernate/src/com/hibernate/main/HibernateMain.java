package com.hibernate.main;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.hibernate.StudentDetails;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			StudentDetails std1=new StudentDetails(20550,"Raj",85);
			StudentDetails std2=new StudentDetails(20551,"Sohan",91);
			StudentDetails std3=new StudentDetails(20552,"Ganesh",76);
			StudentDetails std4=new StudentDetails(20553,"Rohith",90);
			StudentDetails std5=new StudentDetails(20554,"Bala",79);	
			
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		s.beginTransaction();
		s.save(std1);
		s.save(std2);
		s.save(std3);
		s.save(std4);
		s.save(std5);
		
		
		//Query maxmark=s.createQuery("select max(stdmark) from StudentDetails");
		//Query equalmarks=s.createQuery("select stdname from StudentDetails where stdmark=94");
		//Query between=s.createQuery("select stdname from StudentDetails  where stdmark between 80 and 90");
		Query like=s.createQuery("select stdname from StudentDetails where stdname like 'S%'");
		
		//Query query = s.createQuery("FROM StudentDetails");
		//List list = query.list();
		//System.out.println(list);
		s.getTransaction().commit();
		s.close();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}

}
}
