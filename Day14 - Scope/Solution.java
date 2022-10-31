package Day14;

import java.util.*;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void calculateDifference() {
		Arrays.sort(elements);
		maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
	}

}

public class Solution {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();
		int[] values = new int[N];

		for (int i = 0; i < N; i++) {
			values[i] = input.nextInt();
		}

		input.close();

		Difference difference = new Difference(values);

		difference.calculateDifference();
		System.out.println(difference.maximumDifference);

	}

}
