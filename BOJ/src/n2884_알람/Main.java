package BOJ.src.n2884_�˶�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		if (M >= 45 && M < 60) {
			sb.append(H).append(" ").append(M - 45);
		} else if (M < 45) {
			int h = H - 1;
			if (h < 0) {
				h = 23;
			}
			sb.append(h).append(" ").append(60 - (45 - M));
		}
		System.out.println(sb.toString());

	}

}
