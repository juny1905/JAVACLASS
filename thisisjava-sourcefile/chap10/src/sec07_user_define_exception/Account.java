package sec07_user_define_exception;

public class Account {
	private long balance;

	public Account() { }	

	public long getBalance() {
		return balance;
	}	
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException {
		// 사용자 지정 예외 발생.
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+" 모자람");
		}
		balance -= money;
	}
}

