package n1755_숫자놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] alphaArr = new int['a'-'z'+1];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ") ;
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N]; // 뒤에 N에 M-N+1 넣으면 왜 안됨?
		for(int i = M-1; i < N; i++) {
			arr[i] = i+1;
		}
		
		
	}
}
