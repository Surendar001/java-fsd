package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Demotest {

	public static void main(String[] args) {
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tran=session.getTransaction();
		System.out.println("Table created");
		
//		Trainer tr=new Trainer();
//		tr.setTid(102);
//		tr.setTname("Ajay");
//		tran.begin();
//		session.save(tr);
//		tran.commit();
//		System.out.println("Trainer record saved successfully");
		
//		Students s1=new Students();
//		s1.setSid(14);
//		s1.setSname("Geeta");
//		s1.setAge(24);
//		tran.begin();
//		session.save(s1);
//		tran.commit();
//		System.out.println("Student record saved successfully");
		
//		Course c1=new Course();
//		c1.setCname("Python");
//		c1.setFees(28000);
//		tran.begin();
//		session.save(c1);
//		tran.commit();
//		System.out.println("Course details saved successfully");
		
		//Assign Student with Trainer;
//		Students s1=session.get(Students.class, 14);
//		if(s1==null) {
//			System.out.println("Student not present");
//		}else {
//			tran.begin();
//			s1.setTsid(102);
//			session.update(s1);
//			tran.commit();
//			System.out.println("Student assigned to trainer successfully");
//		}
	}

}
