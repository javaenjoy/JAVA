package javatest;

public class Homework1 {

	public static void main(String[] args) {
		
		char[] ssn = {'1', '9', '1', '2', '1', '7', '-', '1', '2', '3', '4', '5', '6', '7'};
		int[] check = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		
		int total = 0;
		for (int i = 0; i < check.length; i++) {
			total += (ssn[i] - 48) * check[i];			
		}
		
		int result = 11 - (total % 11);
		
		if (result == ssn[ssn.length - 1]) {			
			
			if(ssn[7] == '1' || ssn[7] == '3') {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
			
		} else {
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}		

	}

}
