package BOJ.src.n4344_평균은_넘겠지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int C = Integer.parseInt(br.readLine());

		for (int i = 1; i <= C; i++) {
			// 00. 입력하면서 합을 구하고 평균을 계산한다.
			int sum = 0;
			double average = 0;
			int count = 0;
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int[] arr = new int[N];
			for (int j = 0; j < N; j++) {
				arr[j] = (Integer.parseInt(st.nextToken()));
				sum += arr[j];
			}
			average = (double) sum / N;
			// 01. 평균보다 점수가 높은 사람 수를 계산한다.
			for (int j = 0; j < N; j++) {
				if (arr[j] > average) {
					count++;
				}
			}
			// 02. 비율을 계산하고 출력한다.
			double ratio = (double) count / N * 100;
			sb.append(String.format("%.3f", ratio)).append("%").append("\n");
		}
		System.out.println(sb.toString());

	}

}
