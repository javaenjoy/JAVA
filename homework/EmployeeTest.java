package homework;

import java.math.BigDecimal;

//��� Ŭ���� : �߻�  Ŭ����
abstract class Employee{
	//�ν��Ͻ� ����
	String name;
	String dept;

	//������ �޼ҵ�
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	//�߻�(abstract) �޼ҵ� 
	public abstract double payCheck();
	
	public String getName() {
		return name;
	}
	
	//����(concrete) �޼ҵ�
	public void printEmployee() {
		System.out.printf("name : %s%n", name);
		System.out.printf("dept : %s%n", dept);
	}
}


//������ ��� Ŭ���� : ���� Ŭ����
class Regular extends Employee{
	//�ν��Ͻ� ����
	private String empNo;
	private int yearSalary;
	private double bonusRate;
	
	public Regular(String name, String dept, String empNo, int yearSalary, double bonusRate) {
		super(name, dept);
		this.empNo = empNo;
		this.yearSalary = yearSalary;
		this.bonusRate = bonusRate;
	}

	@Override
	public double payCheck() {
		double pay =  yearSalary + ((yearSalary/12)*(bonusRate/100));
		BigDecimal obj = new BigDecimal(pay);
		return Double.parseDouble(obj.toString());
	}
		
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("empNo : %s%n", empNo);
		System.out.printf("yearSalary : %d%n", yearSalary);
		System.out.printf("bonusRate : %.1f%n", bonusRate);
	}
}



//����������� Ŭ���� : �߻�  Ŭ����
abstract class NonRegular extends Employee{
	String expireDate;
	int basicPay;
	
	public NonRegular(String name, String dept, String expireDate, int basicPay) {
		super(name, dept);
		this.expireDate = expireDate;
		this.basicPay = basicPay;
	}
	
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("expireDate : %s%n", expireDate);
		System.out.printf("basicPay : %d%n", basicPay);
	}

}


//�ӽ������ Ŭ���� : ����  Ŭ����
class Temporary extends NonRegular{
	private double payRate;
	private int workHours;
	
	public Temporary(String name, String dept, String expireDate, int basicPay, double payRate, int workHours) {
		super(name, dept, expireDate, basicPay);
		this.payRate = payRate;
		this.workHours = workHours;
	}

	@Override
	public double payCheck() {
		double pay = basicPay + (payRate * workHours);
		BigDecimal result = new BigDecimal(pay);
		return Double.parseDouble(result.toString());
	} 
	
	
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("payRate : %.1f%n", payRate);
		System.out.printf("workHours : %d%n", workHours);
	}
}


//���ϻ�� Ŭ���� : ����  Ŭ����
class Internship extends NonRegular{
	private double payPercent;

	public Internship(String name, String dept, String expireDate, int basicPay, double payPercent) {
		super(name, dept, expireDate, basicPay);
		this.payPercent = payPercent;
	}

	@Override
	public double payCheck() {
		double pay = basicPay + (basicPay * (payPercent / 100));
		BigDecimal result = new BigDecimal(pay);
		return Double.parseDouble(result.toString());
	}	
	
	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf("payPercent : %.1f%n", payPercent);
	}
	
}



public class EmployeeTest {
	
	public static void printEmployeePay(Employee temp) {
		double pay = temp.payCheck();
		BigDecimal result = new BigDecimal(pay);
		System.out.printf("%s ����� �޿���  %,.1f�� �Դϴ�.%n", temp.getName(), Double.parseDouble(result.toString()));
	}
	
	
	public static void main(String[] args) {
		Regular reg = new Regular("�ϱ浿", "�λ�", "1111", 80000000, 200);
		reg.printEmployee();
		printEmployeePay(reg);
		
		
		Temporary temp = new Temporary("�̱浿", "����", "21-10-31", 50000000, 10, 8);
		temp.printEmployee();
		printEmployeePay(temp);
		
		Internship intern = new Internship("��浿", "����", "21-12-31", 30000000, 50);
		intern.printEmployee();
		printEmployeePay(intern);
	}

}
