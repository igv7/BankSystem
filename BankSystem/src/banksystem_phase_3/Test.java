package banksystem_phase_3;

public class Test {

	public static void main(String[] args) {
		
		//Kobi
				GoldClient ClientKobi = new GoldClient(123, "kobi", 10);
				PlatinumClient ClientKim = new PlatinumClient(789, "Kim", 0);
				//Kim
				
				Account a1=new Account(1,100);
				Account a2=new Account(2,100);
				Account a3=new Account(3,100);
				Account a4=new Account(4,100);
				
				ClientKobi.addAccount(a1);
				ClientKobi.addAccount(a2);
				ClientKim.addAccount(a3);
				ClientKim.addAccount(a4);
				
				System.out.println(ClientKobi.getFortune());
				ClientKobi.removeAccount(a2);
				
				System.out.println(ClientKobi.getFortune());
				ClientKobi.withdraw(50);
				
				System.out.println(ClientKobi.getFortune());
				ClientKobi.deposit(100);
				
				System.out.println(ClientKim.getFortune());
				ClientKim.deposit(3000);
				System.out.println(ClientKim.getFortune());
				
			
			}

	
}
