package homework;



public class Account {
	//인스턴스 변수
	private String accountNumber;
	private String name;
	private String password;
	private long balance;
	
	
	//디폴트 생성자 메소드
	public Account() {
		super();
	}


	//매개변수 생성자 메소드
	public Account(String accountNumber, String name, String password, long balance) throws Exception {		
;		if (balance < 0) {
			throw new Exception("금액을 정확히 입력하세요");
		} 

		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}

	//입금하다
	public void deposit(int amount) throws Exception {
		if (amount <= 0) {
			throw new Exception("금액을 정확히 입력하세요");
		}
		
		if (amount > balance) {
			throw new Exception("잔고가 부족합니다.");
		}
		this.balance += amount;
	}
	
	
	//출금하다
	public void withdraw(int amount) throws Exception {
		if (amount <= 0) {
			throw new Exception("금액을 정확히 입력하세요");
		}
		
		if (amount > balance) {
			throw new Exception("잔고가 부족합니다.");
		}
		this.balance -= amount;
	}
	
	//계좌이체하다
	public void transferAccount(Account account, int amount) throws Exception {
		this.withdraw(amount);
		account.deposit(amount);
	}
	
	
	
	//Getter and Setter method
	public String getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	//잔액조회하다
	public long getBalance() {
		return balance;
	}


	public void setBalance(long balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", password=" + password + ", balance="
				+ balance + "]";
	}
	

}
