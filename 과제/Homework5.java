package javatest;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		do {
			try {
				System.out.print("정수형 데이터를 입력하세요 : ");
				int num = scan.nextInt();

				if (num % 2 == 0) {
					System.out.println("짝수입니다.");
				} else {
					System.out.println("홀수입니다.");
				}
			} catch (Exception e) {
				System.out.println("정수형 데이터를 입력해주세요~~");
				scan = new Scanner(System.in);
			}

		} while (true);

	}

}
