package workshop.account.entity;

public class Account {
	private Srting custId;
	private String accId;
	private int balance;
	
	public Account() {
		
	}
	
	public Account(String custId, String accId, int balance) {
			this.custId=custId;
			this.accId=accId;
			this.balance= balance;
	}
	//Method 선언
	public Srting getCustId() {
		return custId;
	}
	public void setCustId(Srting custId) {
		this.custId = custId;
	}
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public int getBalance() {
		return balance;
	}
	
	pubilc void deposit(int amount) {
		this.balance += amount;
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	
}
