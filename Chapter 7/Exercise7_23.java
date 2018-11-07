//Author Cooter Gale
//Nov 2, 2018

class Exercise7_23 {
	public static void main(String[] args) {
		boolean[] lockers =  new boolean[100];
		
		for (int i = 0; i < 100; i++) {
			lockers[i] = false;
		}
			
		
		for (int s = 1; s < 100; s++) {
			
			for (int l = s - 1; l < 100; l += s) {
				lockers[l] = !lockers[l];
			}
		}
		System.out.println("The Lockers that are open are: ");
		for (int i = 0; i < 100; i++) {
			if (lockers[i]) {
				System.out.print((i + 1) + ", ");
			}
		}
	}
}