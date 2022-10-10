package n25305_ĿƮ����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		StringTokenizer scoreSt = new StringTokenizer(br.readLine()," ");
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(scoreSt.nextToken());
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[N-k]);
	}
}
