package BOJ.src.n2525_¿Àºì½Ã°è;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(br.readLine());
		if (B + C >= 60) {
			int b = (B + C) / 60;
			if (A + b > 23) {
				A = A + b - 24;
			} else if (A + b <= 23) {
				A = A + b;
			}
			B = B + C - 60 * b;
		} else if (B + C < 60) {
			B = B + C;
		}
		System.out.printf("%d %d", A, B);
	}
}
