package Day1;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {

		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

		int i2;
		double d2;
		String s2;

		Scanner input = new Scanner(System.in);
		i2 = input.nextInt();
		d2 = input.nextDouble();
		input.nextLine();
		s2 = input.nextLine();

		System.out.println(i + i2);
		System.out.println(d + d2);
		System.out.println(s.concat(s2));

	}
}
