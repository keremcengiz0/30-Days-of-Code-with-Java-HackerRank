package Day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		input.nextLine();

		Map<String, Integer> personInfo = new HashMap<String, Integer>();

		for (int i = 1; i <= N; i++) {
			String name = input.next();
			Integer phoneNumber = input.nextInt();
			input.nextLine();
			personInfo.put(name, phoneNumber);
		}

		while (input.hasNext()) {

			String queries = input.next();

			if (personInfo.get(queries) != null) {
				System.out.println(queries + "=" + personInfo.get(queries));
			} else {
				System.out.println("Not found");
			}

		}

	}
}
