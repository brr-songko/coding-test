package n2775_부녀회장이될테야;

//14276KB 120ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] arr = new int[15][15];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		// k,n값 입력받기
		for (int i = 0; i < T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			makeApt();
			sb.append(arr[k][n]).append("\n");
		}
		System.out.println(sb.toString());
	}

	public static void makeApt() {
		for (int c = 0; c < 15; c++) {
			arr[c][1] = 1;
			arr[0][c] = c;
		}

		// 2차원 배열에 2열부터 숫자 하나하나 때려박기
		for (int r = 1; r < 15; r++) {
			for (int c = 2; c < 15; c++) {
				arr[r][c] = arr[r][c - 1] + arr[r - 1][c];
			}
		}
	}
}
