import java.util.ArrayList;

import javax.sound.midi.SysexMessage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

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

	//Creating the constructor when initializing object
	public User(String fn, String ln, String pin, Bank theBank) {
		this.name = fn;
		this.lastName = ln;
		
		//Hash our pin, which will be stored as a String.
		//Store the pin's MD5 hash, rather than the original value,
		//for security reasons.
		try {
			//Java doesn't know what the string is before you pass it.
			//That is why you must use a try-catch to make sure you pass
			//the correct algorithm 
			MessageDigest md = MessageDigest.getInstance("MD5");
			
			//Get the memory (bytes of our pin object), take those bytes and digest them
			//through our MD5 algorithm and that returns a different array of bytes that
			//we will store in pinHash.
			this.pinHash = md.digest(pin.getBytes());
			
			//handle catch IF it occurs, this is just to impede java
		} catch (NoSuchAlgorithmException e) {
			System.err.println("error, caught NoSuchAlgorithmException");
			e.printStackTrace();
			System.exit(1);
		}
		
		//Generate our own UUID, a unique/new one for the user
		this.uuid = theBank.getNewUserUUID();
		
		//Create an empty list of accounts
		this.accounts = new ArrayList<Account>();
		
		//Print a log message to know what our UUID is when logging into the ATM
		System.out.printf("New user %s,%s with ID", this.lastName, this.name, this.uuid);
		
	}
	
	//add account method
	public void addAccount(Account anAcct) {
		this.accounts.add(anAcct);  
	}
	
	public String getUUID() {
		return this.uuid;
	}
	
	
	
	
}
