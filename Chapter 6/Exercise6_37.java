//Author Cooter Gale
//Exercise 6-37

import java.util.Scanner;

class Exercise6_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an int: ");
		int number = input.nextInt();
		System.out.print("Enter a width: ");
		int width = input.nextInt();
		
		System.out.println("The formatted number is " + format(number, width));
		
	}
	public static String format(int number, int width){
		String result = number + "";
		
		for (int i = 0; i < width - len(number); i++){
			result = "0" + result;
		}
		return result;
		//shall give a number possibly with additional 0's
	}
	public static int len(int number){
		int length = 0;
		while (number > 0) {
			length += 1;
			number = number / 10;
		}
		
		return length;
		//retrun the number of digits
	}
}