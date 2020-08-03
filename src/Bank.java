import java.util.ArrayList;

public class Bank {
	
	//Name of the bank
	private String name;
	
	//List of customers
	private ArrayList<User> users;
	
	//Keep a parallel list of all the accounts the bank has.
	//Every User as an array of accounts, we can simply access
	//the accounts via the users objects. However, for convenience sake
	//it is easier to have a separate array that contains
	//every account where the bank can access without the
	//help of a user object. Also, the accounts array contains
	//a user object which describes what user holds this account.
	private ArrayList<Account> accounts;
	
	public String getNewUserUUID() {
		//
	}

}
