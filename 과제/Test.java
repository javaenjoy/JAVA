package javatest;

public class Test {

	public static void main(String[] args) {

		int[][] score = {{100,90,90}, 
						 {85,90,80},
			             {50,50,60},
			             {75,90,80},
				         {100,90,60}};
		
	
		int total;
		double average;
		for(int[] temp1 : score) {
			total = 0;
			for(int temp2 : temp1) {
				total += temp2;
			}
			average = (double)total / temp1.length;
			System.out.printf("ÃÑÁ¡ = %d, Æò±Õ = %.2f%n", total, average);
			
		}

	}

}
