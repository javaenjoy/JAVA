package javatest;

public class Homework6 {

	public static void main(String[] args) {
		System.out.println("-------------- for�� -----------------------------");
		for (int i = 1; i < 100; i+=2) {
			System.out.println(i);
		}
		
		
		System.out.println("-------------- while�� -----------------------------");
		int i = 1;
		while (i < 100) {
			System.out.println(i);
			i += 2;
		}
		
		System.out.println("-------------- while�� -----------------------------");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j < 100);
		
	}
}
