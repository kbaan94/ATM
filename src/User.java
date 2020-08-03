import java.util.ArrayList;

public class User {
	
	//First name of user
	private String name;
	
	//Last name of user
	private String lastName;
	
	//ID of user
	private String uuid;
	
	//The MD5 hash of the user
	private byte pinHash[];
	
	//The list of accounts the user holds
	private ArrayList<Account> accounts;

}
