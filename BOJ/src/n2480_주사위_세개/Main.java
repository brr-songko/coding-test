package BOJ.src.n2480_주사위_세개;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int max = A;

		if (A == B && B == C && C == A) {
			sb.append(10000 + A * 1000);
		} else if (A != B && B != C && C != A) {
			if (B > max) {
				max = B;
			}
			if (C > max) {
				max = C;
			}
			sb.append(max * 100);
		} else if (A == B && A != C && B != C) {
			sb.append(1000 + A * 100);
		} else if (B == C && A != B && A != C) {
			sb.append(1000 + B * 100);
		} else if (C == A && C != B && A != B) {
			sb.append(1000 + C * 100);
		}
		System.out.println(sb.toString());
	}

}
