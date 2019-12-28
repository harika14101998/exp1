package bank.entity;

import bank.ui.Account1;

public class AccountMain {

	public static void main(String[] args) {
		Account1 acc[] = new Account1[4];
		acc[0] = new Account1(01, "chris", 2000);
		acc[1] = new Account1(02, "pari", 1500);
		acc[2] = new Account1(03, "cole", 1200);
		acc[3] = new Account1(04, "jain", 1800);

		acc[1].addBalance(50);
		acc[2].transferAmount(acc[0], 500);

		for (int i = 0; i < 4; i++) {
			System.out.println("id: " + acc[i].getId() + "name: " + acc[i].getName() + "balance: " + acc[i].getBalance());
		}

	}

}
