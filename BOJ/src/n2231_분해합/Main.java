package BOJ.src.n2231_분해합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		int N = Integer.parseInt(A);
		int a = 0; //boolean으로 바꿔라

		int NLength = A.length();

		for (int i = N - NLength * 9; i <= N; i++) {
			int temp = i;
			int sum = temp;

			while (temp > 0) {
				sum += temp % 10;
				temp = temp / 10;
			}

			if (sum == N) {
				System.out.println(i);
				a = 1;
				break;
			}

		}

		if (a == 0) {
			System.out.println(0);
		}
	}
}
