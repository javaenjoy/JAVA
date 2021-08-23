package javatest;

public class Homework8 {
	
	public static void main(String[] args) {
		
		int n = 5;
		System.out.printf("%d * ", n);
		
		for(int i = n-1; i >= 1; i--) {			
			if(i == 1) {
				System.out.printf("%d = ", i);
			} else {
			    System.out.printf("%d * ", i);
			}
			
			n *= i;			
		}
		
		System.out.println(n);
	}

}
