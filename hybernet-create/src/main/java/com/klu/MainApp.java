package com.klu;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		//Load configurations and create session factory
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		//Open session
		Session session = factory.openSession();
		
		//begin transaction 
		Transaction tx = session.beginTransaction();
		
		//create object
		Student s = new Student("Ravi");
		
		//save object
		session.save(s);
		
		//commit transaction
		tx.commit();
		
		//close the resources
		session.close();
		factory.close();
		
		System.out.println("Data has been successfully inserted");
	}

}
