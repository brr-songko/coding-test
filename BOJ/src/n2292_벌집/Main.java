package n2292_¹úÁý;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 1;
		int x = 1;

		for (;;) {
			sum += 6 * x;
			if (N == 1) {
				System.out.println(1);
				break;
			} else if (N <= sum) {
				System.out.println(x + 1);
				break;
			}
			x++;
		}
	}
}
