import java.util.Date;

public class Transaction {
	
	//Amount of the transaction
	private double amount;
	
	//When the transaction occurred
	private Date timeStamp;
	
	//Can have a "memo" --> statement such as deposits from
	//other accounts or withdraws for anything
	private String memo;
	
	//The account in which the transaction was performed

	private Account inAccount;
	
	public Transaction(double amount, Account inAcc) {
		this.amount = amount;
		this.inAccount = inAcc;
		this.memo = "";		
		this.timeStamp = new Date();
	}
	
	public Transaction(double amount, String memo, Account inAcc) {
		
		//call 2 arg constructor first
		this(amount, inAcc);
		
		//set the memo
		this.memo = memo;
	
	}
	
	
	
	

}
