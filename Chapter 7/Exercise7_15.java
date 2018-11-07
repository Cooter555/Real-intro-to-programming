//Author: Cooter Gale
//Nov 1, 2018
//7-15

import java.util.Scanner;
class Exercise7_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers separated by a space: ");
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}

		int[] result = eliminateDuplicates(numbers);
		
		System.out.print("list without duplicates: ");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
	}
	public static int[] eliminateDuplicates(int[] list){
		int[] temp = new int[list.length];
		int size = 0;
		for (int i = 0; i < list.length; i++) {
			boolean isInArray = false;
			for (int j = 0; j < i && !isInArray; j++) {
				if (list[j] == list[i]) {
					isInArray = true;
				}
			}
			if (!isInArray) {
				temp[size] = list[i];
				size++;
			}
		}
		int [] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = temp[i];
		}
		return result;
	}
}