/* Author: Cooter Gale
Date 09/27/18*/


class divisible {
	public static void main(String[] args) {
		int n = 100;
		
		int c = 0;
		
		while (n <= 200){
			
			if (n % 5 == 0 && n % 6 > 0){
				System.out.print(n + " ");
				c = c + 1;
			}
			
			if (n % 5 > 0 && n % 6 == 0){
				System.out.print(n + " ");
				c = c + 1;
		
			}
			
			n = n + 1;
			
			if (c % 10 == 0){
				System.out.println(" ");
			}
		}
	}
}