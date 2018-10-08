
import java.util.Scanner;
class stringCounter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s = input.nextLine();
		
		int vowels = 0;
		int consonants = 0;
		for (int i = 0; i < s.length(); i++) {
			char temp = Character.toUpperCase(s.charAt(i));
			if (temp == 'A' || temp == 'E' || temp == 'I' || temp == 'O' || temp == 'U') {
				vowels++;
			}
			else if (Character.isLetter(temp)) {
				consonants++;
			
			}
		}
		System.out.println("Vowels: " + vowels);
		
		System.out.println("Consonants: " + consonants);
		
	}
}