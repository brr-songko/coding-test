package BOJ.src.n10818_최소_최대;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N1 = Integer.parseInt(br.readLine());
		int[] arr = new int[N1];
		int max = -1000000;
		int min = 1000000;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N1; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		sb.append(min).append(" ").append(max);
		System.out.println(sb.toString());

	}

}
