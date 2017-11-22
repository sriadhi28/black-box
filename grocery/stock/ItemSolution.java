package org.grocery.stock;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ItemSolution {
	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		Item item = session.get(Item.class, 1);
		System.out.println(item.getId());
		System.out.println(item.getName());
		System.out.println(item.getPrice());
		System.out.println(item.getQuantity());
		
		session.beginTransaction();
		item.setName("Lux soap");
		item.setPrice(230);
		session.update(item);
		session.getTransaction().commit();
		
		Item item1 = session.get(Item.class, 3);
		System.out.println(item1.getId());
		System.out.println(item1.getName());
		System.out.println(item1.getPrice());
		System.out.println(item1.getQuantity());
		
		item1.setId(3);
		session.delete(item1);	
		System.out.println("Deleted");
		session.close();
		
		/*int ch, total;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("1.New Entry 2.Total");
			System.out.println("Enter choice:");
			ch = Integer.valueOf(bf.readLine());
			switch (ch) {
			case 1:
				session.beginTransaction();
				System.out.println("Enter item name:");
				String name = bf.readLine();
				System.out.println("Enter item price");
				double price = Double.valueOf(bf.readLine());
				System.out.println("Enter item quantity");
				int quantity = Integer.valueOf(bf.readLine());
				Item item = new Item(name, quantity, price);
				session.save(item);
				session.getTransaction().commit();
				break;
			case 2:
				total = Item.getTotalNumberOfProducts();
				System.out.println("Total:" + total);
				break;
			}
		}*/
	}
}
