package javatest;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		scan.useDelimiter("");

		System.out.print("주민등록번호를 입력하세요 (13자리) : ");

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
			System.out.println("유효한  주민등록번호입니다.");
			if (ssn[6] == 1 || ssn[6] == 3) {
				System.out.println("성별은 남자입니다.");
			} else {
				System.out.println("성별은 여자입니다.");
			}

		} else {
			System.out.println("유효하지 않은 주민등록번호입니다.");
		}

	}

}
