import java.util.ArrayList;

public class Account {
	
	//Account name
	private String name;
	
	//Every account has a ID different from the User ID
	private String uuid;
	
	//Current balance of the account
	private double balance;
	
	//Some user owns this account, links to that User. 
	//...The User Object that owns this account
	private User holder;
	
	//List of transactions for this account
	private ArrayList<Transaction> transactions;

}
