package javatest;

public class Test1 {
	
	public static void main(String[] args) {
		
		double[] nums = {4.5, 2.3, 5.2, 6.7, 8.9, 1.2};
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%.1f\t", nums[i]);
		}
		
		System.out.println("\n---------------------------------------------");

		for (double temp : nums) {
			System.out.printf("%.1f\t", temp);
		}
	}

}
