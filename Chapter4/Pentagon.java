// Author: Cooter Gale
// Date: 9/12/2018


import java.util.Scanner;

class Pentagon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the length from the center to the vertex: ");
		
		double radius = input.nextDouble();
		
		double side = (2 * radius) * (Math.sin(3.14159265359/5));
		
		double area = (5 * side * side) / (4 * Math.tan(3.14159265359/5));
		
		System.out.println("The side length is: " + side);
		
		System.out.println("The area is: " + area);
	}
}