package com.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BankSolution {
	public static void main(String args[]) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		int ch, ch1;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.New Enrty   2.Withdraw   3.Deposit");
		System.out.print("\nEnter your choice:");
		ch = Integer.valueOf(bf.readLine());
		switch (ch) {
		case 1:
			System.out.println("1.Current Account    2.Savings Account");
			System.out.print("\nSelect account type:");
			ch1 = Integer.valueOf(bf.readLine());
			System.out.print("\nEnter account number:");
			long accountNumber = Long.valueOf(bf.readLine());
			System.out.print("\nEnter accountHolder:");
			String accountHolder = bf.readLine();
			System.out.print("\nEnter address:");
			String address = bf.readLine();
			System.out.print("\nEnter phoneNumber:");
			long phoneNumber = Long.valueOf(bf.readLine());
			System.out.print("\nEnter emailId:");
			String emailId = bf.readLine();
			System.out.print("\nEnter balance:");
			double balance = Double.valueOf(bf.readLine());
			double amountTransfered=0;
			System.out.print("\nEnter numberOfTransactionsHeld:");
			int numberOfTransactionsHeld = Integer.valueOf(bf.readLine());
			if(ch1==1){
				CurrentAccount ca = new CurrentAccount(accountNumber, accountHolder, address, phoneNumber, emailId, balance, amountTransfered, numberOfTransactionsHeld);
				session.save(ca);
				session.getTransaction().commit();	
			}
			else if(ch1==2){
				SavingsAccount sa = new SavingsAccount(accountNumber, accountHolder, address, phoneNumber, emailId, balance, amountTransfered, numberOfTransactionsHeld);
				session.save(sa);
				session.getTransaction().commit();
			}
			break;
		case 2:
			System.out.println("1.Current Account    2.Savings Account");
			System.out.print("\nSelect account type:");
			ch1 = Integer.valueOf(bf.readLine());
			switch (ch1) {
			case 1:
				System.out.print("\nEnter account number:");
				accountNumber = Long.valueOf(bf.readLine());
				System.out.print("\nEnter amountTransfered:");
				amountTransfered = Double.valueOf(bf.readLine());
				CurrentAccount ca = new CurrentAccount();
				ca = session.get(CurrentAccount.class, accountNumber);
				balance = ca.getBalance();
				numberOfTransactionsHeld = ca.getNumberOfTransactionsHeld();
				ca.withdraw(amountTransfered);
				numberOfTransactionsHeld++;
				ca.setNumberOfTransactionsHeld(numberOfTransactionsHeld);
				session.save(ca);
				session.getTransaction().commit();
				break;
			case 2:
				System.out.print("\nEnter account number:");
				accountNumber = Long.valueOf(bf.readLine());
				System.out.print("\nEnter amountTransfered:");
				amountTransfered = Double.valueOf(bf.readLine());
				System.out.print("\nEnter numberOfTransactionsHeld:");
				numberOfTransactionsHeld = Integer.valueOf(bf.readLine());
				SavingsAccount sa = new SavingsAccount();
				sa = session.get(SavingsAccount.class, accountNumber);
				balance = sa.getBalance();
				numberOfTransactionsHeld = sa.getNumberOfTransactionsHeld();
				sa.withdraw(amountTransfered);
				numberOfTransactionsHeld++;
				sa.setNumberOfTransactionsHeld(numberOfTransactionsHeld);
				session.save(sa);
				session.getTransaction().commit();
				break;
			default:
				break;
			}
			break;
		case 3:
			System.out.println("1.Current Account    2.Savings Account");
			System.out.print("\nSelect account type:");
			ch1 = Integer.valueOf(bf.readLine());
			switch (ch1) {
			case 1:
				System.out.print("\nEnter account number:");
				accountNumber = Long.valueOf(bf.readLine());
				System.out.print("\nEnter amountTransfered:");
				amountTransfered = Double.valueOf(bf.readLine());
				CurrentAccount ca = new CurrentAccount();
				ca = session.get(CurrentAccount.class, accountNumber);
				balance = ca.getBalance();
				numberOfTransactionsHeld = ca.getNumberOfTransactionsHeld();
				ca.deposit(amountTransfered);
				numberOfTransactionsHeld++;
				ca.setNumberOfTransactionsHeld(numberOfTransactionsHeld);
				session.save(ca);
				session.getTransaction().commit();
				break;
			case 2:
				System.out.print("\nEnter account number:");
				accountNumber = Long.valueOf(bf.readLine());
				System.out.print("\nEnter amountTransfered:");
				amountTransfered = Double.valueOf(bf.readLine());
				System.out.print("\nEnter numberOfTransactionsHeld:");
				numberOfTransactionsHeld = Integer.valueOf(bf.readLine());
				SavingsAccount sa = new SavingsAccount();
				sa = session.get(SavingsAccount.class, accountNumber);
				balance = sa.getBalance();
				numberOfTransactionsHeld = sa.getNumberOfTransactionsHeld();
				sa.deposit(amountTransfered);
				numberOfTransactionsHeld++;
				sa.setNumberOfTransactionsHeld(numberOfTransactionsHeld);
				session.save(sa);
				session.getTransaction().commit();
				break;
			default:
				break;
			}
			break;
		}
		session.close();
		sf.close();
	}
}
