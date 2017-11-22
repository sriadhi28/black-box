package org.sample.emp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Books {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		int i = 0;
		while (i < 3) {
			i++;
			session.beginTransaction();
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Book Name:");
			String bookName = bf.readLine();
			System.out.print("Enter Book Price:");
			double bookPrice = Double.valueOf(bf.readLine());
			System.out.print("Enter Publisher Id:");
			String publisherId = bf.readLine();
			System.out.print("Enter ISBN Number:");
			long isbnNumber = Long.valueOf(bf.readLine());
			BookDetails book = new BookDetails(bookName, bookPrice, publisherId, isbnNumber); 
			System.out.println("Book Name:" + book.getBookName());
			System.out.println("Book Price:" + book.getBookPrice());
			System.out.println("Publisher Id:" + book.getPublisherId());
			System.out.println("ISBN Number:" + book.getIsbnNumber());
			session.save(book);
			session.getTransaction().commit();
		}

		session.close();

	}

}
