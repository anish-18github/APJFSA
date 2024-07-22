package com.hibertut;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("project start......");

//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
		// Alternative of the above line ^
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

//        Open a new session 
		Session session = factory.openSession();

//        Begin Transition 
		Transaction tx = session.beginTransaction();

//        Insert 10 employee records into the Employee_Details table 

		for (int i = 0; i < 10; i++) {
			Employee emp = new Employee();
			emp.setEmpNo(i + 1);
			emp.setEmpName("Employee" + (i + 1));
			emp.setEmpAddress("Address" + (i + 1));
			emp.setEmpDesignation("Designation" + (i + 1));
			emp.setEmp_Salary("50000");
			emp.setEmp_Grade('A');
			emp.setEmp_Department("Department" + (i + 1));

//			Save employee object to the database
			session.save(emp);
		}
//		commit the transition 
		tx.commit();

//		close the session
		session.close();

//		Open session to retrieve and display employee data
		session = factory.openSession();

//		Retrieve all employee record from Employee table 
		List<Employee> employees = session.createQuery("FROM Employee", Employee.class).list();

		System.out.println("\n**********************Employee Details*************************\n");
		
		for (Employee e : employees) {
			System.out.println(
					e.getEmpNo() + ", " + e.getEmpName() + ", " + e.getEmpAddress() + ", " + e.getEmpDesignation()
							+ ", " + e.getEmp_Salary() + ", " + e.getEmp_Grade() + ", " + e.getEmp_Department());
		}
//close the session after retrieving data
		session.close();
	}
}
