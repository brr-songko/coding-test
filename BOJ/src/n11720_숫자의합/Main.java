package n11720_숫자의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String A = br.readLine();

		char[] arr = new char[N];
		arr = A.toCharArray();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i] - '0';
		}
		System.out.println(sum);
	}
}
