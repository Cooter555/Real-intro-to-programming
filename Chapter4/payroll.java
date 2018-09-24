//Author: Cooter Gale
//Date: 9/13/18

import java.util.Scanner;

class payroll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		
		String name = input.nextLine();
		
		System.out.print("Enter number of houts worked: ");
		
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		
		double fedTax = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		
		double stateTax = input.nextDouble();
		
		double beforeTax = hours * payRate;
		
		double netPay = (beforeTax - ((stateTax * beforeTax) + (fedTax * beforeTax)));
		
		System.out.println(" ");
		
		System.out.println("Employee Name: " + name);
		
		System.out.println("Hours Worked: " + hours);
		
		System.out.println("Pay Rate: " + payRate);
		
		System.out.println("Gross Pay: " + beforeTax);
		
		System.out.println("Deductions: ");
		
		System.out.println("	Federal Withholding (" + (fedTax * 100) + "%): $" + fedTax * beforeTax);
		
		System.out.println("	State Withholding (" + (stateTax * 100) + "%): $" + stateTax * beforeTax);
		
		System.out.println("	Total Deduction: $" + ((stateTax * beforeTax) + (fedTax * beforeTax)));
		
		System.out.println("Net Pay: " + netPay);
		
		
	}
}