package n9999000_Å×½ºÆ®;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int answer = 0;
		StringTokenizer st = new StringTokenizer(N, " ");
//		System.out.println(st.hasMoreTokens());
		while(st.hasMoreTokens()) {
			st.nextToken();
			answer++;
		}
		System.out.println(answer);
	}
}
