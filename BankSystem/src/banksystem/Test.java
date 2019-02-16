package banksystem;

//import banksystem_phase_2.Account;
//import banksystem_phase_2.Client;
//import banksystem_phase_3.GoldClient;
//import banksystem_phase_3.PlatinumClient;

public class Test {

	public static void main(String[] args) throws WithdrawException {
		
		/*Log l=new Log(11111,1,"sdfasdfds",455);
		Log dfsd=new Log(34534,4,"gfhfdhdgfhfg",-786);
		Logger logger=new Logger("mario");
		logger.log(l);
		logger.log(dfsd);

		System.out.println("_____________________________");
		Account a=new Account(1,34.67f);
		System.out.println(a.getId());
		System.out.println(a.getBalance());
		a.setBalance(67.34f);
		System.out.println(a.getBalance());
		*/
		
		/*Account a1=new Account(1,2000);
		Account a2=new Account(2,3000);
		Client c=new Client(1,"Moshe",10000);
		c.addAccount(a1);
		c.addAccount(a2);
		System.out.println(c.getFortune());
		c.removeAccount(2);
		System.out.println(c.getFortune());
		c.withdraw(3000);
		System.out.println(c.getFortune());
		c.deposit(3000);
		System.out.println(c.getFortune());*/
		
		//c.withdraw(ammount)
		
		
		
		
		
//		//Kobi
//		GoldClient ClientKobi = new GoldClient(123, "kobi", 10);
//		//Kim
//		PlatinumClient ClientKim = new PlatinumClient(789, "Kim", 0);
//		
//		
//		Account a1=new Account(1,100);
//		Account a2=new Account(2,100);
//		Account a3=new Account(3,100);
//		Account a4=new Account(4,100);
//	
//		
//		ClientKobi.addAccount(a1);
//		ClientKobi.addAccount(a2);
//		ClientKim.addAccount(a3);
//		ClientKim.addAccount(a4);
//		
//		
//		System.out.println(ClientKobi.getFortune());
//		ClientKobi.removeAccount(a2);
//		
//		System.out.println(ClientKobi.getFortune());
//		ClientKobi.withdraw(50);
//		
//		System.out.println(ClientKobi.getFortune());
//		ClientKobi.deposit(100);
//		
//		System.out.println(ClientKim.getFortune());
//		ClientKim.deposit(3000);
//		System.out.println(ClientKim.getFortune());
		
		
		
		
		
		
		//Igor
	    RegularClient ClientIgor = new RegularClient(456, "Igor", 1000);
	    Account a5 = new Account(5, 2000);
		Account a6 = new Account(6, 3000);
	    ClientIgor.addAccount(a5);
		ClientIgor.addAccount(a6);
		
		
		System.out.println(ClientIgor.getFortune());
		ClientIgor.withdraw(100);
		System.out.println(ClientIgor.getFortune());
		ClientIgor.deposit(200);
		System.out.println(ClientIgor.getFortune());
		ClientIgor.removeAccount(a5);
		System.out.println(ClientIgor.getFortune());
	}

	
}
