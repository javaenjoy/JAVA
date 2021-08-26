package homework;

public class AccountManager {

	public static void main(String[] args) {

		try {
			
			Account ac1 = new Account("1111", "�ϱ浿", "1111", 1000);
			Account ac2 = new Account("2222", "�̱浿", "2222", 2000);

			System.out.println(ac1);
			System.out.println(ac1);

			System.out.println("--------- �Ա� ------------");

			// 1. "1111" �� ���·� 5000���� �Ա��ϴ�.
			ac1.deposit(5000);

			// 2. "1111" �� ������ �ܰ� ��ȸ�ϴ�.
			System.out.printf("111 �� ������ �ܰ� : %,d��%n", ac1.getBalance());

			System.out.println("--------- ��� ------------");

			// 3. "3333" �� ���¿��� 1000���� ����ϴ�.
			ac2.withdraw(1000);

			// 4. "3333" �� ������ �ܰ� ��ȸ�ϴ�.
			System.out.printf("3333 �� ������ �ܰ� : %,d��%n", ac2.getBalance());

			System.out.println("--------- ������ü ------------");

			// 5. "1111" �����¿��� "3333" �� ���·� 2000���� ������ü�ϴ�.
			ac1.transferAccount(ac2, 2000);

			// 2. "1111" �� ������ �ܰ� ��ȸ�ϴ�.
			System.out.printf("111 �� ������ �ܰ� : %,d��%n", ac1.getBalance());

			// 4. "3333" �� ������ �ܰ� ��ȸ�ϴ�.
			System.out.printf("3333 �� ������ �ܰ� : %,d��%n", ac2.getBalance());
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
