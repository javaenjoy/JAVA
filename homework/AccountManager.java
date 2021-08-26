package homework;

public class AccountManager {

	public static void main(String[] args) {

		try {
			
			Account ac1 = new Account("1111", "일길동", "1111", 1000);
			Account ac2 = new Account("2222", "이길동", "2222", 2000);

			System.out.println(ac1);
			System.out.println(ac1);

			System.out.println("--------- 입금 ------------");

			// 1. "1111" 고객 계좌로 5000원을 입금하다.
			ac1.deposit(5000);

			// 2. "1111" 고객 계좌의 잔고를 조회하다.
			System.out.printf("111 고객 계좌의 잔고 : %,d원%n", ac1.getBalance());

			System.out.println("--------- 출금 ------------");

			// 3. "3333" 고객 계좌에서 1000원을 출금하다.
			ac2.withdraw(1000);

			// 4. "3333" 고객 계좌의 잔고를 조회하다.
			System.out.printf("3333 고객 계좌의 잔고 : %,d원%n", ac2.getBalance());

			System.out.println("--------- 계좌이체 ------------");

			// 5. "1111" 고객계좌에서 "3333" 고객 계좌로 2000원을 계좌이체하다.
			ac1.transferAccount(ac2, 2000);

			// 2. "1111" 고객 계좌의 잔고를 조회하다.
			System.out.printf("111 고객 계좌의 잔고 : %,d원%n", ac1.getBalance());

			// 4. "3333" 고객 계좌의 잔고를 조회하다.
			System.out.printf("3333 고객 계좌의 잔고 : %,d원%n", ac2.getBalance());
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
