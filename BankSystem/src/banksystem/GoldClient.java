package banksystem;

public class GoldClient extends Client {

	public GoldClient(int id, String name, float balance) {
		super(id, name, balance);
		commissionRate = 2;
		interestRate = 0.3f;
	}

	public String toString() {
		return "ID: " + getId() + " Type: Gold Client";
	}

}
