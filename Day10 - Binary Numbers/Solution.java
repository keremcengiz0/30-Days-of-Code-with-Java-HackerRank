package Day10;

import java.util.Scanner;

public class Solution {

	public static int convertBinary(int n) {

		String binary = Integer.toBinaryString(n);
		int sayac = 0;
		int temp = 0;
		for (int i = 0; i < binary.length() - 1; i++) {
			if (binary.charAt(i) == binary.charAt(i + 1)) {
				++sayac;
				if (sayac > temp) {
					temp = sayac;
				}
			} else {
				sayac = 0;
				continue;
			}
		}
		return temp + 1;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int result = convertBinary(n);
		System.out.println(result);
	}

}
