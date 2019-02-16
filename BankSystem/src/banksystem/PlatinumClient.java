package banksystem;

public class PlatinumClient extends Client {

	public PlatinumClient(int id, String name, float balance) {
		super(id, name, balance);
		commissionRate = 1;
		interestRate = 0.5f;
	}

	public String toString() {
		return "ID: " + getId() + " Type: Platinum Client";
	}

}
