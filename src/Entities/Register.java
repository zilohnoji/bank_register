package Entities;

public class Register {
	private double depositInitial;
	private String nameAccount;
	private final int codeAccount;
	private double balance;

	public Register(int code, double deposit) {
		this.codeAccount = code;
		this.depositInitial += deposit;
	}

	// Nome conta
	public String getName() {
		return nameAccount;
	}

	public void setName(String name) {
		this.nameAccount = name;
	}

	// Código da conta
	public int getCode() {
		return codeAccount;
	}

	// Depósito inicial
	public double getDepositInitial() {
		return depositInitial;
	}

	public void setDepositInitial(double value) {
		this.balance += value;
	}

	// Valor em conta
	public double getBalance() {
		return balance;
	}

	public void setBalance(double withdraw) {
		this.balance -= (withdraw + 5);
	}

	public void setDepositBefore(double value) {
		this.balance += value;
	}
}
