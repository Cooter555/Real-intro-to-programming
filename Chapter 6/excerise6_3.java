//Author Cooter Gale
//Date 10/10/18

import java.util.Scanner;

class excercise6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a positive int: ");
		
		int n = input.nextInt();
		
		if (isPalindrome(n)) {
			
			System.out.println(n + " do be a palindrome");
		}
		else {
			System.out.println(n + " aint no palindrome");
		}
		//HA! GRAMMER AND VOCABULARY
	}
	public static boolean isPalindrome(int n) {
		return n == reverse(n);
	}
	public static int reverse(int n) {
		int result = 0;
		while(n != 0) {
			int remainder = n % 10;
			result = result * 10 + remainder;
			
			n = n / 10;
		}
		return result;
	}
}