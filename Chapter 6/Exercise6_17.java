//Author Cooter Gale
//Exercise 6-17

import java.util.Scanner;

class Exercise6_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter pass key: ");
		
		int n = input.nextInt();
		
		printMatrix(n);
		// code for calling a method to print matrix you dumb boi
	}
	public static void printMatrix(int n) {
		for (int i = 1; i <= n; i++) {// rows
			for (int j = 1; j <= n; j++) {// columns
				System.out.print((int)(Math.random() * 2) + " ");
			}
			System.out.println();
		}
	}
}