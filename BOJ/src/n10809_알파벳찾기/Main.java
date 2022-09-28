package n10809_¾ËÆÄºªÃ£±â;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int[] arr = new int['Z'-'A'+1];
		String S = br.readLine();
		char[] cArr = S.toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i < cArr.length; i++) {
			int a = cArr[i] - 'a';
			if(arr[a] == -1) {
			arr[a] = i;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		System.out.println(sb.toString());
	}
}
