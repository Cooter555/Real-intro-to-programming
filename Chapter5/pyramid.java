// Author Cooter Gale 09/28/18

import java.util.Scanner;

class Pyramid {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer between 1 and 15: ");
		
		int x = input.nextInt();
		
		int i;
		
		
			
			for (i = 1; i <= x; i++) {
				
				for (int k = 1; k <= (x - i); k++) {
					System.out.print("   ");
				}
				
				for	(int k = i; k >= 1; k--){
					System.out.print((k > 9) ? k + " " : k + "  ");
				}
				
				for (int k = 2; k <= i; k++){
					System.out.print((k > 10) ? k + " " : k + "  ");
				}
				System.out.println();		 
			}
		
		
	}
}