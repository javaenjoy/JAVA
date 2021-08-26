package homework;

import java.util.Arrays;
import java.util.Scanner;

class Lotto {

	private int[] lottonums = new int[6];
	private int[] userLotto = new int[6];

	public Lotto() {

	}

	public int[] getLottonums() {
		return lottonums;
	}

	public void createLottoNumbers() {

		for (int i = 0; i < lottonums.length; i++) {
			lottonums[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				if (lottonums[i] == lottonums[j]) {
					i--;
					break;
				}
			}
		}
	}

	public void sortLottoNumbers() {

		for (int i = 0; i < lottonums.length - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < lottonums.length; j++) {
				if (lottonums[min_idx] > lottonums[j]) {
					min_idx = j;
				}
			}
			if (i != min_idx) {
				int temp = lottonums[min_idx];
				lottonums[min_idx] = lottonums[i];
				lottonums[i] = temp;
			}
		}

		System.out.printf("�ζǹ�ȣ : %s%n%n", Arrays.toString(lottonums));

	}

	public void userInput() {

		Scanner scan = new Scanner(System.in);
		boolean isExit = false;
		outer: do {
			System.out.print("6���� �ζǹ�ȣ�� �Է��ϼ��� [1 ~ 45] ");

			for (int i = 0; i < userLotto.length; i++) {
				userLotto[i] = scan.nextInt();
			}

			for (int i = 0; i < userLotto.length; i++) {
				if (userLotto[i] <= 0 || userLotto[i] > 45) {
					System.out.println("1 ~ 45 ������ ���ڸ� �Է��ϼ���\n");
					continue outer;
				}
			}

			for (int i = 0; i < userLotto.length; i++) {
				for (int j = 0; j < i; j++) {
					if (userLotto[i] == userLotto[j]) {
						System.out.println("�ζǹ�ȣ�� �ߺ��˴ϴ�. �ٽ� �Է����ּ���.\n");
						continue outer;
					}
				}
			}

			System.out.println();
			isExit = true;

		} while (!isExit);

	}

	public void print() {

		int count = 0;
		for (int i = 0; i < lottonums.length; i++) {
			for (int j = 0; j < lottonums.length; j++) {
				if (lottonums[i] == userLotto[j]) {
					count++;
				}
			}
		}

		switch (count) {
		case 6:
			System.out.println("����!! 1�� ��÷�Դϴ�.");
			break;
		case 5:
			System.out.println("2�� ��÷�Դϴ�.");
			break;
		case 4:
			System.out.println("3�� ��÷�Դϴ�.");
			break;
		default:
			System.out.println("���� ��ȸ�� ~~");

		}

	}

}

public class LottoManager {

	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.createLottoNumbers();
		lotto.sortLottoNumbers();
		lotto.userInput();
		lotto.print();
	}

}
