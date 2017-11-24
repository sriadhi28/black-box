package com.bank;

public class CurrentAccount extends BankAccount {
	private static double minimumAmountCanTransfer = 500000;
	private static int minimumNumberOfTransactions = 7;
	private double amountTransfered;
	private int numberOfTransactionsHeld;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(long accountNumber, String accountHolder, String address, long phoneNumber, String emailId,
			double balance, double amountTransfered, int numberOfTransactionsHeld) {
		super(accountNumber, accountHolder, address, phoneNumber, emailId, balance);
		this.amountTransfered = amountTransfered;
		this.numberOfTransactionsHeld = numberOfTransactionsHeld;
	}

	public static double getMinimumAmountCanTransfer() {
		return minimumAmountCanTransfer;
	}

	public static void setMinimumAmountCanTransfer(double minimumAmountCanTransfer) {
		CurrentAccount.minimumAmountCanTransfer = minimumAmountCanTransfer;
	}

	public static int getMinimumNumberOfTransactions() {
		return minimumNumberOfTransactions;
	}

	public static void setMinimumNumberOfTransactions(int minimumNumberOfTransactions) {
		CurrentAccount.minimumNumberOfTransactions = minimumNumberOfTransactions;
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
