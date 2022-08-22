package n10809_¾ËÆÄºªÃ£±â;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		//baekjoon
		char[] sArr = A.toCharArray();
		int [] arr = new int['Z'-'A'+1];
		for(int i = 0; i< arr.length; i++) {
			arr[i] = -1;
		}
		for(int i = 0; i < sArr.length; i++) {
	
		}
		for(int i = 0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
