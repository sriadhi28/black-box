package com.bank;

public class SavingsAccount extends BankAccount {
	private static double maximumAmountCanTransfer = 100000;
	private static int maximumNumberOfTransactions = 5;
	private double amountTransfered;
	private int numberOfTransactionsHeld;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(long accountNumber, String accountHolder, String address, long phoneNumber, String emailId,
			double balance, double amountTransfered, int numberOdTransactionsHeld, int numberOfTransactionsHeld) {
		super(accountNumber, accountHolder, address, phoneNumber, emailId, balance);
		this.amountTransfered = amountTransfered;
		this.numberOfTransactionsHeld = numberOfTransactionsHeld;
	}

	public static double getMaximumAmountCanTransfer() {
		return maximumAmountCanTransfer;
	}

	public static void setMaximumAmountCanTransfer(double maximumAmountCanTransfer) {
		SavingsAccount.maximumAmountCanTransfer = maximumAmountCanTransfer;
	}

	public static int getMaximumNumberOfTransactions() {
		return maximumNumberOfTransactions;
	}

	public static void setMaximumNumberOfTransactions(int maximumNumberOfTransactions) {
		SavingsAccount.maximumNumberOfTransactions = maximumNumberOfTransactions;
	}

	public double getAmountTransfered() {
		return amountTransfered;
	}

	public void setAmountTransfered(double amountTransfered) {
		this.amountTransfered = amountTransfered;
	}

	public int getNumberOfTransactionsHeld() {
		return numberOfTransactionsHeld;
	}

	public void setNumberOfTransactionsHeld(int numberOfTransactionsHeld) {
		this.numberOfTransactionsHeld = numberOfTransactionsHeld;
	}

	@Override
	public boolean withdraw(double amount) {
		return super.withdraw(amount);
	}

	@Override
	public boolean deposit(double amount) {
		return super.deposit(amount);
	}

}
