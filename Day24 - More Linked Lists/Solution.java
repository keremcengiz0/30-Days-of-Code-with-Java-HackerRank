package Day24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

	public static <T> void print(List<Integer> distinctNumbers) {
		distinctNumbers.forEach(s -> System.out.print(s + " "));
		System.out.println();
	}

	public static void main(String[] args) {
		int N, number;

		List<Integer> numbers = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		N = input.nextInt();

		for (int i = 1; i <= N; i++) {
			number = input.nextInt();
			numbers.add(number);
		}

		Stream<Integer> stream = numbers.stream();

		List<Integer> distinctNumbers = stream.distinct().collect(Collectors.toList());

		print(distinctNumbers);

	}

}
