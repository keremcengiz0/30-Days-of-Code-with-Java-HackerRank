package Day15;

import java.util.LinkedList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		for (int i = 0; i < n; i++) {
			int number = input.nextInt();
			linkedList.add(number);
		}

		for (Integer num : linkedList) {
			System.out.print(num + " ");
		}
	}

}
