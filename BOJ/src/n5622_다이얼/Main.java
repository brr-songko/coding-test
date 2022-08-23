package n5622_´ÙÀÌ¾ó;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] A = br.readLine().toCharArray();
		char[] alphabet = { 'W', 'T', 'P', 'M', 'J', 'G', 'D', 'A' };
		int[] times = { 8, 7, 6, 5, 4, 3, 2, 1 };
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			char c = A[i];
			int time = 2;
			for (int j = 0; j < 8; j++) {
				if (c >= alphabet[j]) {
					time += times[j];
					break;
				}
			}
			result += time;
		}
		System.out.println(result);
	}
}
