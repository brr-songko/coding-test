package BOJ.src.n4344_�����_�Ѱ���;

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
			// 00. �Է��ϸ鼭 ���� ���ϰ� ����� ����Ѵ�.
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
			// 01. ��պ��� ������ ���� ��� ���� ����Ѵ�.
			for (int j = 0; j < N; j++) {
				if (arr[j] > average) {
					count++;
				}
			}
			// 02. ������ ����ϰ� ����Ѵ�.
			double ratio = (double) count / N * 100;
			sb.append(String.format("%.3f", ratio)).append("%").append("\n");
		}
		System.out.println(sb.toString());

	}

}
