package exercises;

import java.util.Scanner;

public class EggCounter {
	
	static int eggCountNum = 0;
	static int gross = 0;
	static int dozen = 0;
	static int leftover = 0;
	
	void Calculate() {
		while(eggCountNum >= 144) {
			gross++;
			eggCountNum -= 144;
		}
		
		while(eggCountNum >= 12) {
			dozen++;
			eggCountNum -= 12;
		}
		
		while(eggCountNum >= 1) {
			leftover++;
			eggCountNum--;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number of eggs : ");
		
		do {
			String eggCount = scanner.nextLine();
			eggCountNum = Integer.parseInt(eggCount);
		}while(eggCountNum < 0);
		
		EggCounter e = new EggCounter();
		e.Calculate();
		
		
		System.out.println("Your number of eggs is "+gross+" gross, "+dozen+" dozen, and "+leftover);

	}

}
