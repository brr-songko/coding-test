package BOJ.src.n1157_단어공부;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine().toUpperCase();
		int[] arr = new int['Z' - 'A' + 1];
		char answer = 0;
		int max = 0;
		for (int i = 0; i < A.length(); i++) {
			arr[A.charAt(i) - 'A']++;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				answer = (char) (i + 'A');
			} else if (arr[i] == max) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}
}
