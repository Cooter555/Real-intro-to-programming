//Author: Cooter Gale
// 09/18/18

import java.util.Scanner;

class Months {
	public static void main(String[] args) {
		int Jan = 31;
		
		int Feb = 28;
		
		int Mar = 31;
		
		int Apr = 30;
		
		int May = 31;
		
		int Jun = 30;
		
		int Jul = 31;
		
		int Aug = 31;
		
		int Sep = 30;
		
		int Oct = 31;
		
		int Nov = 30;
		
		int Dec = 31;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a month: ");
		
		String s = input.nextLine();
		
		System.out.println("Enter a year: ");
		
		int year = input.nextInt();
				
		if ((year % 4) == 0){
			Feb = 31;
		}
		
		if (s.contentEquals("Jan")){
			System.out.println("Jan " + year +" has " + Jan +" days");
		}
		if (s.contentEquals("Feb")){
			System.out.println("Feb " + year +" has " + Feb +" days");
		}
		if (s.contentEquals("Mar")){
			System.out.println("Mar " + year +" has " + Mar +"days");
		}
		if (s.contentEquals("Apr")){
			System.out.println("Apr " + year +" has " + Apr +" days");
		}
		if (s.contentEquals("May")){
			System.out.println("May " + year +" has " + May +" days");
		}
		if (s.contentEquals("Jun")){
			System.out.println("Jun " + year +" has " + Jun +" days");
		}
		if (s.contentEquals("Jul")){
			System.out.println("Jul " + year +" has " + Jul +" days");
		}
		if (s.contentEquals("Aug")){
			System.out.println("Aug " + year +" has " + Aug +" days");
		}
		if (s.contentEquals("Sep")){
			System.out.println("Sep " + year +" has " + Sep +" days");
		}
		if (s.contentEquals("Oct")){
			System.out.println("Oct " + year +" has " + Oct +" days");
		}
		if (s.contentEquals("Nov")){
			System.out.println("Nov " + year +" has " + Nov +" days");
		}
		if (s.contentEquals("Dec")){
			System.out.println("Dec " + year +" has " + Dec +" days");
		}
	}
}