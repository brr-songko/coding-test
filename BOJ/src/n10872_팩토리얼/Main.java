package BOJ.src.n10872_���丮��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(factorial(N));
	}

	private static int factorial(int num) {
		if (num <= 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}
}
