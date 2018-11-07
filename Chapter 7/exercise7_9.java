//Cooter Gale
//10-31-18

import java.util.Scanner;

class exercise7_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] numbers = new double[10];
		
		System.out.print("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
		}
		System.out.println("The minimun number is: " + min(numbers));
	}
	public static double min(double[] list) {
		double minDouble = list[0];
		
		for (int i = 1; i < list.length; i++) {
			if (minDouble > list[i]) {
				minDouble = list[i];
			}
		}
		return minDouble;
	}
}