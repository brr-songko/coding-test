package n10870_피보나치수5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
	}

	private static int fibonacci(int num) {
		if (num == 0)
			return 0;
		else if (num == 1)
			return 1;
		return fibonacci(num - 2) + fibonacci(num - 1);
	}
}