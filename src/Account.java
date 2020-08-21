import java.util.ArrayList;

public class Account {
	
	//Account name
	private String name;
	
	//Every account has a ID different from the User ID
	private String uuid;
	
	//Some user owns this account, links to that User. 
	//...The User Object that owns this account
	private User holder;
	
	//List of transactions for this account
	private ArrayList<Transaction> transactions;
	
	public Account(String name, User holder, Bank theBank) {
		//set up name and the older
		this.name = name;
		this.holder = holder;
		
		this.uuid = theBank.getNewAccountUUID();
		
		//init transactions array
		this.transactions = new ArrayList<Transaction>();
		
		//add this account to the holder and the bank list
		holder.addAccount(this);
		theBank.addAccount(this);
	}

	public String getUUID() {
		return this.uuid;
	}
	
	
	

}
