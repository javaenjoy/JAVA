package homework;



public class Account {
	//�ν��Ͻ� ����
	private String accountNumber;
	private String name;
	private String password;
	private long balance;
	
	
	//����Ʈ ������ �޼ҵ�
	public Account() {
		super();
	}


	//�Ű����� ������ �޼ҵ�
	public Account(String accountNumber, String name, String password, long balance) throws Exception {		
;		if (balance < 0) {
			throw new Exception("�ݾ��� ��Ȯ�� �Է��ϼ���");
		} 

		this.accountNumber = accountNumber;
		this.name = name;
		this.password = password;
		this.balance = balance;
	}

	//�Ա��ϴ�
	public void deposit(int amount) throws Exception {
		if (amount <= 0) {
			throw new Exception("�ݾ��� ��Ȯ�� �Է��ϼ���");
		}
		
		if (amount > balance) {
			throw new Exception("�ܰ� �����մϴ�.");
		}
		this.balance += amount;
	}
	
	
	//����ϴ�
	public void withdraw(int amount) throws Exception {
		if (amount <= 0) {
			throw new Exception("�ݾ��� ��Ȯ�� �Է��ϼ���");
		}
		
		if (amount > balance) {
			throw new Exception("�ܰ� �����մϴ�.");
		}
		this.balance -= amount;
	}
	
	//������ü�ϴ�
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

	//�ܾ���ȸ�ϴ�
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
