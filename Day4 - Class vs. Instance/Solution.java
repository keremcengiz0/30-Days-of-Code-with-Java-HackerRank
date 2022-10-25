package Day4;

import java.util.Scanner;

public class Solution {

	static class Person {
		private int age;

		public Person(int initialAge) {
			if (initialAge > 0) {
				age = initialAge;
			} else {
				System.out.println("Age is not valid, setting age to 0.");
				age = 0;
			}
		}

		public void yearPasses() {
			age++;
		}

		public void amIOld() {
			if (age < 13) {
				System.out.println("You are young.");
			} else if (age >= 13 && age < 18) {
				System.out.println("You are a teenager.");
			} else {
				System.out.println("You are old.");
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int T = input.nextInt();

		for (int i = 0; i < T; i++) {
			int age = input.nextInt();
			Person p = new Person(age);
			p.amIOld();

			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		input.close();
	}

}
