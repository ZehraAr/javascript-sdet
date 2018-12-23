
public class BankAccount {
	
	private String accountNumber;
	private double accountBalance;
	private String name;
	private String email;
	private String phoneNumber;
	
	public void deposit(double depositAmount) {
		this.accountBalance+=depositAmount;
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(this.accountBalance-withdrawalAmount<0) {
			System.out.println("Only "+this.accountBalance+" available.Withdrawal no processed");
		}else {
			this.accountBalance-=withdrawalAmount;
			System.out.println("withdrawal of "+withdrawalAmount+" processed. Remaining balance= "+this.accountBalance);
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	

}
