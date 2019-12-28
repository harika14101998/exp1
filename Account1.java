package bank.ui;

public class Account1 {
	private int id;
	private String name;
	private double balance;

	public Account1(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void addBalance(double newbalance) {
		this.balance = this.balance + newbalance;
	}

	public void transferAmount(Account1 a, double amount) {
		this.balance = this.balance - amount;
		a.balance = a.balance + amount;
	}

}
