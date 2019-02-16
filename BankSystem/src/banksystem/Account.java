package banksystem;

public class Account {

	private int id;
	private float balance;

	public Account(int id, float balance) {
		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
		Log l = new Log(System.currentTimeMillis(), id, "This account balance was updated", balance);
		// Logger logger = new Logger("aaa");
		Logger.log(l);
	}

	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Account && ((Account) obj).getId() == this.id) {
			return true;
		}
		return false;
	}

	public int hashCode() {
		return this.id;
	}

}
