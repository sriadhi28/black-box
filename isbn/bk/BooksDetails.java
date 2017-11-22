package org.isbn.bk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BooksDetails {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i = 0;
		while (i < 3) {
			i++;
			session.beginTransaction();
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Book Name:");
			String name=bf.readLine();
			System.out.print("Enter Book Price:");
			double price=Double.valueOf(bf.readLine());
			System.out.print("Enter Published Date:");
			Date published = new Date(bf.readLine());
			System.out.print("Enter Publisher Name:");
			String publisher=bf.readLine();
			System.out.print("Enter Author Name:");
			String author=bf.readLine();
			System.out.print("Enter ISBN Number:");
			String isbnNumber = bf.readLine();
			Book bk = new Book(name,publisher,author,price,published,isbnNumber);
			session.save(bk);
			session.getTransaction().commit();
		}
		session.close();
	}
}
