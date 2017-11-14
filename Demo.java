package org.sample.emp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		/*session.beginTransaction();

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Id:");
		int id = Integer.valueOf(bf.readLine());
		System.out.print("Enter Name:");
		String name = bf.readLine();
		System.out.print("Enter Email-Id:");
		String emailId = bf.readLine();
		System.out.print("Enter Phone Number:");
		long phoneNumber = Long.valueOf(bf.readLine());
		Employee employee = new Employee(id, name, emailId, phoneNumber);
		System.out.println("Id:" + employee.getId());
		System.out.println("Name:" + employee.getName());
		System.out.println("Email-Id:" + employee.getEmailId());
		System.out.println("Phone Number:" + employee.getPhoneNumber());

		session.save(employee);
		session.getTransaction().commit();*/
		
		session.close();
	}
}
