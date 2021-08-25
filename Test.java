package javaApp;


import java.math.BigDecimal;

/*
 *  프로그램 설명 : 추상 클래스 - 다형성
 */

//사원 클래스 : 추상 클래스
abstract class Employee {
	//인스턴스 변수
	String name;
	String dept;
	
	//생성자 메소드
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	//추상 메소드
	public abstract double payCheck(); //구현을 할수 없으니 {}가 없음
} //end of Employee class

//정규직 사원 클래스  : 구상(concrete) 클래스
class Regular extends Employee {
	//인스턴스 변수
	private String empNo;
	private int yearSalary;
	private double bonusRate;
	
	//생성자 메소드
	public Regular(String name, String dept, String empNo, int yearSalary, double bonusRate) {
		super(name, dept);
		this.empNo = empNo;
		this.yearSalary = yearSalary;
		this.bonusRate = bonusRate;
	}

	//메소드 오버라이딩 (payCheck)
	@Override
	public double payCheck() {
		double pay = yearSalary + ((yearSalary / 12) * (bonusRate / 100));
		return pay;		
	}
	
}//end of Regular Class

public class Test {

	public static void printEmployee(Employee emp)  { //Regular (Employee는 못옴(추상클래스라 인스턴스 생성 못해서))
		BigDecimal obj = new BigDecimal(emp.payCheck());
		System.out.printf("%,.2f",  Double.parseDouble(obj.toString()));
	}
	
	public static void main(String[] args) {		
		//참조 변수의 다형성
		Employee emp = new Regular("김두부", " 인사부", "1000", 80000000, 200);
		printEmployee(emp);
	}

}
