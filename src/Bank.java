import java.util.ArrayList;
import java.util.Random;

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
		
		//inits
		String uuid;
		Random rng = new Random();
		int len = 10;
		boolean notUnique;
		
		
		do {
			
			//Create the ID during the first iteration
			uuid = "";
			for(int i = 0; i < len; i++) {
				uuid += ((Integer)rng.nextInt(10)).toString();
			}
			
			//Check if the ID is unique
			notUnique = false;
			for(User u : this.users) {
				if(uuid.compareTo(u.getUUID()) == 0){
					notUnique = true;
					break;
				}
			}
			
		} while (notUnique);
		
		return uuid;
		
	}
	
	public String getNewAccountUUID() {
		
	}
	public void addAccount(Account anAcct) {
		this.accounts.add(anAcct);
	}

}
