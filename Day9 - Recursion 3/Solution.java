package Day9;

import java.util.Scanner;

class Result {

	public static int factorial(int n) {

		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}

	}

}

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();

		int result = Result.factorial(n);
		System.out.println(result);

	}
}
