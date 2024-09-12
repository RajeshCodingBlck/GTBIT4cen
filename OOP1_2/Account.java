package OOP1_2;

public class Account {

	public String AccountHolder;
	public int AccountNumber;
	private int Balance;
	private int pinNumber;
	
	

	Account(String AccountHolder, int AccountNumber,
			int pinNumber){
		
		this.AccountHolder=AccountHolder;
		this.AccountNumber=AccountNumber;
		this.pinNumber=pinNumber;
	}



	public Integer getBalance(int pinNumber) {
		if(this.pinNumber==pinNumber) {
			return Balance;
		}else {
			return null;
		}
	}


	public void setBalance(int amount, int pinNumber) {
		if(this.pinNumber==pinNumber && (Balance-amount)>=0) {
			Balance-=amount;
		}else {
			System.out.println("Aukat ke Bahar he");
		}
	}
	
	public int getPinNumber() {
		return pinNumber;
	}



	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	
	
}
