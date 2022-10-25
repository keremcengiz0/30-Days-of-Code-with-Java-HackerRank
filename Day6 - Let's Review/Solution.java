package Day6;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		input.nextLine();

		if (T >= 1 && T <= 10) {
			for (int i = 1; i <= T; i++) {
				String S = input.nextLine();

				for (int j = 0; j < S.length(); j++) {
					if (j % 2 == 0) {
						System.out.print(S.charAt(j));
					}
				}
				System.out.print(" ");

				for (int j = 0; j < S.length(); j++) {
					if (j % 2 != 0) {
						System.out.print(S.charAt(j));
					}
				}
				System.out.println();
			}

		}
	}
}