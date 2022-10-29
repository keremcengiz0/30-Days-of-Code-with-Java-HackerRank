package Day12;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	public Person(String firstName, String lastName, int idNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}
}

class Student extends Person {

	private int[] testScores;

	public Student(String firstName, String lastName, int idNumber, int[] testScores) {
		super(firstName, lastName, idNumber);
		this.testScores = testScores;
	}

	char calculate() {
		int total = 0;
		for (int testScore : testScores) {
			total += testScore;
		}

		int avg = (total / testScores.length);

		if (avg >= 90 && avg <= 100) {
			return 'O';
		} else if (avg >= 80 && avg < 90) {
			return 'E';
		} else if (avg >= 70 && avg < 80) {
			return 'A';
		} else if (avg >= 55 && avg < 70) {
			return 'P';
		} else if (avg >= 40 && avg < 55) {
			return 'D';
		} else {
			return 'T';
		}
	}

	public void printInfoPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
	}

}

public class Solution {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String firstName = input.next();
		String lastName = input.next();
		int id = input.nextInt();
		int numberScores = input.nextInt();
		int[] testScores = new int[numberScores];

		for (int i = 0; i < numberScores; i++) {
			testScores[i] = input.nextInt();
		}
		input.close();

		Student student = new Student(firstName, lastName, id, testScores);
		student.printInfoPerson();
		System.out.println("Grade: " + student.calculate());
	}

}
