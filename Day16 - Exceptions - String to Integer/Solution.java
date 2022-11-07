package Day16;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String S = input.next();
		input.close();
		
		try {
			Integer integer = Integer.parseInt(S);
			System.out.println(integer);
			
		} catch (Exception e) {
			System.out.println("Bad String");
		}
	}

}
