package banksystem;

import java.util.ArrayList;

public class Bank {

	private static Bank instance = new Bank();
	private ArrayList<Client> clients;
	private Logger logService;
	private float balance;
	private static float commissionRate;

	public static Bank getBank() {
		return instance;
	}

	public Bank() {
		clients = new ArrayList<Client>();
		logService = new Logger("aaaa");
	}

	public void setBalance() {
		balance = 0;
		for (Object c : clients) {
			if (c != null) {
				balance += ((Client) c).getFortune();
			}
		}
		balance += commissionRate;
	}

	public float getBalance() {
		return balance;
	}

	public void addClient(Client c) {
		clients.add(c);
		Log l = new Log(System.currentTimeMillis(), c.getId(), "Client was added", c.getFortune());
		Logger.log(l);
		balance += c.getFortune();
	}

	public void removeClient(Client c) {
		for (int i = 0; i < clients.size(); i++) {
			if (clients.get(i) != null && clients.get(i).equals(c)) {
				clients.remove(c);
				balance -= ((Client) clients.get(i)).getFortune();
				Log l = new Log(System.currentTimeMillis(), c.getId(),
						"Client " + ((Client) clients.get(i)).getId() + "was deleted",
						((Client) clients.get(i)).getFortune());
				Logger.log(l);
			}
		}
	}

	public static void addCommission(float com) {
		commissionRate += com;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void viewLogs() {

	}

	public void startAccountUpdater() {

	}

	public void printClientList() {
		for (Object c : clients) {
			System.out.println(c);
		}
	}

}
