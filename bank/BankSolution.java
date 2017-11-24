package com.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankSolution {
	public static void main(String args[]) throws IOException {
		int ch, ch1;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1.Withdraw   2.Deposit");
		System.out.print("\nEnter your choice:");
		ch = Integer.valueOf(bf.readLine());
		switch (ch) {
		case 1:
			System.out.println("1.Current Account    2.Savings Account");
			System.out.print("\nSelect account type:");
			ch1 = Integer.valueOf(bf.readLine());
			switch (ch1) {
			case 1:
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
				System.out.print("\nEnter amountTransfered:");
				double amountTransfered = Double.valueOf(bf.readLine());
				System.out.print("\nEnter numberOfTransactionsHeld:");
				int numberOfTransactionsHeld = Integer.valueOf(bf.readLine());
				CurrentAccount ca = new CurrentAccount(accountNumber, accountHolder, address, phoneNumber, emailId,
						balance, amountTransfered, numberOfTransactionsHeld);
				ca.withdraw(amountTransfered);
			}
		}
	}
}
