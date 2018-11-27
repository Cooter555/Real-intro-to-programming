/*Cooter Gale
11-20-18
*/
import java.util.Scanner;

class Exercise8_37 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int counter = 0;

		String[][] stateCapital = {
			{"Alabama", "Montgomery"},
			{"Alaska", "Juneau"},
			{"Arizona", "Phoenix"},
			{"Oregon", "Salem"},
			{"California", "Sacramento"},
			{"Virginia", "Richmond"},
			{"Colorado", "Denver"},
			{"Connecticut", "Hartford"},
			{"Tennesee", "Nashville"},
			{"Flordia", "Tallahassee"},
			
		};
		
		for(int i = 0; i < 10; i++) {
			System.out.println("What is the capital of " + stateCapital[i][0] + "?");
			
			String var = input.next();
			
			if (var.equalsIgnoreCase(stateCapital[i][1])) {
				System.out.println("Correct");
				counter = counter + 1;
			}
			else {
				System.out.println("Wrong");
			}
			
		}
		System.out.println("The ammount of points you have is: " + counter);
	}
	
}