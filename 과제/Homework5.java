package javatest;

import java.util.Scanner;

public class Homework5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		do {
			try {
				System.out.print("������ �����͸� �Է��ϼ��� : ");
				int num = scan.nextInt();

				if (num % 2 == 0) {
					System.out.println("¦���Դϴ�.");
				} else {
					System.out.println("Ȧ���Դϴ�.");
				}
			} catch (Exception e) {
				System.out.println("������ �����͸� �Է����ּ���~~");
				scan = new Scanner(System.in);
			}

		} while (true);

	}

}
