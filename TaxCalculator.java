package exercises;

import java.util.Scanner;
// ADDED TO GITHUB!!

public class TaxCalculator {
	static double payableTax = 0;
	
	void Calculate(String gender, int incomeNum) {
		if (gender.equalsIgnoreCase("male")) {
			if (incomeNum > 0 && incomeNum <= 180000) {
				payableTax = incomeNum * 0;
			} else if (incomeNum > 180000 && incomeNum <= 500000) {
				payableTax = incomeNum * 0.10;
			} else if (incomeNum > 500000 && incomeNum <= 800000) {
				payableTax = incomeNum * 0.20;
			} else {
				payableTax = incomeNum * 0.30;
			}

		} else if (gender.equalsIgnoreCase("female")) {
			if (incomeNum > 0 && incomeNum <= 190000) {
				payableTax = incomeNum * 0;
			} else if (incomeNum > 190000 && incomeNum <= 500000) {
				payableTax = incomeNum * 0.10;
			} else if (incomeNum > 500000 && incomeNum <= 800000) {
				payableTax = incomeNum * 0.20;
			} else {
				payableTax = incomeNum * 0.30;
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your gender : ");
		String gender;
		do {
			gender = scanner.nextLine();
		}while(!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female"));
		
		System.out.println("Enter your income : ");
		int incomeNum;
		do {
			String income = scanner.nextLine();
			incomeNum = Integer.parseInt(income);
		}while(incomeNum < 0);
		
		

		TaxCalculator t = new TaxCalculator();
		t.Calculate(gender, incomeNum);

		if (payableTax == 0) {
			System.out.println("No tax payable.");
		} else {
			System.out.printf("Your payable tax is : %.2f\n", payableTax);
		}
		scanner.close();

	}

}
