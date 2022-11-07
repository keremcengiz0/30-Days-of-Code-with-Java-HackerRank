package Day17;

import java.util.Scanner;

public class Solution {

	public static int power(int n, int p) throws Exception {

		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		return (int) Math.pow(n, p);
	}

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		int n, p;
		
		for (int i = 0; i < T; i++) {
			n = input.nextInt();
			p = input.nextInt();
			
			try {
				System.out.println(power(n, p)); 

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
