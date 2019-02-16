package banksystem;

import java.util.ArrayList;

//import java.util.Iterator;

public abstract class Client {

	private int id;
	private String name;
	private float balance;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	protected float commissionRate = 0;
	protected float interestRate = 0;
	// private Logger logger;

	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void addAccount(Account a) {
		accounts.add(a);
	}

	public Account getAccount(int index) {
		return (Account) accounts.get(index);
	}

	public void removeAccount(Account a) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i) != null && accounts.get(i).equals(a)) {
				accounts.remove(a);
				this.balance += ((Account) accounts.get(i)).getBalance();
				Log l = new Log(System.currentTimeMillis(), a.getId(),
						"Account " + ((Account) accounts.get(i)).getId() + " was closed by client",
						((Account) accounts.get(i)).getBalance());
				// Logger logger = new Logger("aaa");
				Logger.log(l);
				return;
			}
		}
	}

	public void deposit(float amount) {
		balance += amount;
	}

	public void withdraw(float amount) throws WithdrawException {
		float com = commissionRate * amount / 100;
		if (balance - (amount + com) > 0) {
			balance -= amount + com;
			Bank.addCommission(com);
		}
		throw new WithdrawException("Error! ", id, balance, amount);
	}

	public void autoUpdateAccounts() {
		for (Object a : accounts) {
			if (a != null) {
				((Account) a).setBalance(((Account) a).getBalance() + 0);
			}
		}
	}

	public float getFortune() {
		float total = balance;
		for (Object a : accounts) {
			if (a != null) {
				total += ((Account) a).getBalance();
			}
		}
		return total;
	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Client && ((Client) obj).getId() == this.id) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return this.id;
	}

}
