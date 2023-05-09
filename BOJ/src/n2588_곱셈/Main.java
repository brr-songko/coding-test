package BOJ.src.n2588_°ö¼À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int n = 1;
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			int b = B % 10;
			sum += A * b * n;
			sb.append(A * b).append("\n");
			B = B / 10;
			n *= 10;
		}
		sb.append(sum);
		System.out.println(sb.toString());
	}

}
