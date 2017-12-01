package com.book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookSol {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int ch, ch1;
		while (true) {
			System.out.println("1.New Entry 2.Find 3.Delete 4.Update 5.Exit");
			System.out.print("\nEnter your choice:");
			ch = Integer.valueOf(bf.readLine());
			switch (ch) {
			case 1:
				System.out.print("\n1.eBook 2.PaperBook");
				System.out.print("\nEnter your choice:");
				ch1 = Integer.valueOf(bf.readLine());
				switch (ch1) {
				case 1:
					System.out.print("\nEnter title:");
					String title = bf.readLine();
					System.out.print("\nEnter author:");
					String author = bf.readLine();
					System.out.print("\nEnter price:");
					double price = Double.valueOf(bf.readLine());
					System.out.print("\nEnter isbn:");
					long isbn = Long.valueOf(bf.readLine());
					System.out.print("\nEnter download url:");
					String downloadUrl = bf.readLine();
					System.out.print("\nEnter Size (in mb):");
					int sizeInMb = Integer.valueOf(bf.readLine());
					EBook eb = new EBook(title, author, price, isbn, downloadUrl, sizeInMb);
					session.beginTransaction();
					session.save(eb);
					break;
				case 2:
					System.out.print("\nEnter title:");
					title = bf.readLine();
					System.out.print("\nEnter author:");
					author = bf.readLine();
					System.out.print("\nEnter price:");
					price = Double.valueOf(bf.readLine());
					System.out.print("\nEnter isbn:");
					isbn = Long.valueOf(bf.readLine());
					System.out.print("\nEnter weight:");
					float weight = Float.valueOf(bf.readLine());
					System.out.print("\nEnter in stock:");
					int inStock = Integer.valueOf(bf.readLine());
					PaperBook pb = new PaperBook(title, author, price, isbn, weight, inStock);
					session.beginTransaction();
					session.save(pb);
					break;
				}
				session.getTransaction().commit();
				break;
			case 2:
				System.out.print("\n1.eBook 2.PaperBook");
				System.out.print("\nEnter your choice:");
				ch1 = Integer.valueOf(bf.readLine());
				switch (ch1) {
				case 1:
					System.out.print("\nEnter id:");
					int id = Integer.valueOf(bf.readLine());
					EBook eb = session.get(EBook.class, id);
					if (eb != null) {
						System.out.println("id:" + eb.getId());
						System.out.println("Isbn:" + eb.getIsbn());
						System.out.println("Author:" + eb.getAuthor());
						System.out.println("Title:" + eb.getTitle());
						System.out.println("Price:" + eb.getPrice());
						System.out.println("DownloadUrl:" + eb.getDownloadUrl());
						System.out.println("SizeInMb:" + eb.getSizeInMb());
					} else if (eb == null) {
						System.out.println("record not found");
					}
					break;
				case 2:
					System.out.print("\nEnter id:");
					id = Integer.valueOf(bf.readLine());
					PaperBook pb = session.get(PaperBook.class, id);
					if (pb != null) {
						System.out.println("id:" + pb.getId());
						System.out.println("Isbn:" + pb.getIsbn());
						System.out.println("Author:" + pb.getAuthor());
						System.out.println("Title:" + pb.getTitle());
						System.out.println("Price:" + pb.getPrice());
						System.out.println("Weight:" + pb.getWeight());
						System.out.println("InStock:" + pb.getInStock());
					} else if (pb == null) {
						System.out.println("Record not found");
					}
					break;
				}
				break;
			case 3:
				System.out.print("\n1.eBook 2.PaperBook");
				System.out.print("\nEnter your choice:");
				ch1 = Integer.valueOf(bf.readLine());
				switch (ch1) {
				case 1:
					System.out.print("\nEnter id:");
					int id = Integer.valueOf(bf.readLine());
					EBook eb = session.get(EBook.class, id);
					if (eb != null) {
						session.beginTransaction();
						session.delete(eb);
						System.out.println("Record deleted");
						session.getTransaction().commit();
					} else if (eb == null) {
						System.out.println("Record not found");
					}
					break;
				case 2:
					System.out.print("\nEnter id:");
					id = Integer.valueOf(bf.readLine());
					PaperBook pb = session.get(PaperBook.class, id);
					if (pb != null) {
						session.beginTransaction();
						session.delete(pb);
						System.out.println("Record deleted");
						session.getTransaction().commit();
					} else if (pb == null) {
						System.out.println("Record not found");
					}
					break;
				}
				break;
			case 4:
				System.out.print("\n1.eBook 2.PaperBook");
				System.out.print("\nEnter your choice:");
				ch1 = Integer.valueOf(bf.readLine());
				int inStock;
				switch (ch1) {
				case 1:
					int id = Integer.valueOf(bf.readLine());
					EBook eb = session.get(EBook.class, id);
					System.out.print("\nEnter title:");
					String title = bf.readLine();
					System.out.print("\nEnter author:");
					String author = bf.readLine();
					System.out.print("\nEnter price:");
					double price = Double.valueOf(bf.readLine());
					System.out.print("\nEnter isbn:");
					long isbn = Long.valueOf(bf.readLine());
					System.out.print("\nEnter download url:");
					String downloadUrl = bf.readLine();
					System.out.print("\nEnter Size (in mb):");
					int sizeInMb = Integer.valueOf(bf.readLine());
					session.beginTransaction();
					eb.setTitle(title);
					eb.setAuthor(author);
					eb.setIsbn(isbn);
					eb.setPrice(price);
					eb.setDownloadUrl(downloadUrl);
					eb.setSizeInMb(sizeInMb);
					session.getTransaction().commit();
					break;
				case 2:
					id = Integer.valueOf(bf.readLine());
					PaperBook pb = session.get(PaperBook.class, id);
					System.out.print("\nEnter title:");
					title = bf.readLine();
					System.out.print("\nEnter author:");
					author = bf.readLine();
					System.out.print("\nEnter price:");
					price = Double.valueOf(bf.readLine());
					System.out.print("\nEnter isbn:");
					isbn = Long.valueOf(bf.readLine());
					System.out.print("\nEnter weight:");
					float weight = Float.valueOf(bf.readLine());
					System.out.print("\nEnter in stock:");
					inStock = Integer.valueOf(bf.readLine());
					session.beginTransaction();
					pb.setTitle(title);
					pb.setAuthor(author);
					pb.setIsbn(isbn);
					pb.setPrice(price);
					pb.setWeight(weight);
					pb.setInStock(inStock);
					session.getTransaction().commit();
					break;
				}
				break;
			case 5:
				System.out.println("Thank you!");
				session.close();
				sf.close();
				System.exit(0);
			}
		}
	}
}
