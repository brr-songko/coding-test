package n8958_OXÄûÁî;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int j = 0; j < N; j++) {
			int score = 0;
			int sum = 0;
			String S = br.readLine();
			char[] arr = S.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == 'O') {
					score++;
					sum += score;
				} else if (arr[i] == 'X') {
					score = 0;
				} else if (arr[i] == 'O' && arr[i + 1] == 'O') {
					score++;
					sum += score;
				}
//				} else if (arr[i] == 'O' && arr[i+1] =='X') {
//					score = 0;
//				}
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb.toString());
	}
}
//System.out.println(score);