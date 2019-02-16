package banksystem;

public class RegularClient extends Client {

	public RegularClient(int id, String name, float balance) {
		super(id, name, balance);
		commissionRate = 3;
		interestRate = 0.1f;
	}

	public String toString() {
		return "ID: " + getId() + " Type: Regular Client";
	}

}
