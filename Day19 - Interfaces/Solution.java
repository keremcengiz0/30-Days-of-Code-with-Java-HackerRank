package Day19;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int total = 0;

		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				total += i;
			}
		}

		return total;
	}

}

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		input.close();

		AdvancedArithmetic calculator = new Calculator();
		int result = calculator.divisorSum(n);
		System.out.println("I implemented: " + calculator.getClass().getInterfaces()[0].getName());
		System.out.println(result);

	}

}
