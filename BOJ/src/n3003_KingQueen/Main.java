package BOJ.src.n3003_KingQueen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int[] arr = {1, 1, 2, 2, 2, 8};
		for(int i = 0; i < 6; i++) {
			sb.append(arr[i] - Integer.parseInt(st.nextToken())).append(' ');
//			System.out.print(arr[i] - Integer.parseInt(st.nextToken())+ " ");
		}
		System.out.println(sb.toString());

	}

}
