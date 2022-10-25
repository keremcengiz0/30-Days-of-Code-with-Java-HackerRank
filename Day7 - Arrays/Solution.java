package Day7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);

		int N = input.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = input.nextInt();
		}

		for (int i = N - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}

	}

}
