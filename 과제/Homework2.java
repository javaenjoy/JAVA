package javatest;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("");

		System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ��� (13�ڸ�) : ");

		int[] ssn = new int[13];
		for (int i = 0; i < ssn.length; i++) {
			ssn[i] = scan.nextInt();
		}

		int[] check = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };

		int total = 0;
		for (int i = 0; i < check.length; i++) {
			total += ssn[i] * check[i];
		}

		int result = 11 - (total % 11);

		if (result == ssn[ssn.length - 1]) {
			System.out.println("��ȿ��  �ֹε�Ϲ�ȣ�Դϴ�.");
			if (ssn[6] == 1 || ssn[6] == 3) {
				System.out.println("������ �����Դϴ�.");
			} else {
				System.out.println("������ �����Դϴ�.");
			}

		} else {
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}

	}

}
