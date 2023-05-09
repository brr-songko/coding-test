package BOJ.src.n1546_ЦђБе;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double max = 0;
		double sum = 0;
		double ave = 0;
		double[] arr = new double[N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] > max) {
				max = arr[i];
			}
//			System.out.println(arr[i]);
		}
//		System.out.println(max);
		for (int i = 0; i < N; i++) {
			arr[i] = arr[i] / max * 100;
			sum += arr[i];
//			System.out.println(arr[i]);
		}
//		System.out.println(sum);
		ave = sum / N;
		System.out.println(ave);
	}
}
