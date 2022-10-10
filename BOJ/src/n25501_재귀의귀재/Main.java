package n25501_¿Á±Õ¿«±Õ¿Á;

//	298316KB	592ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int cnt = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			String S = br.readLine();
			sb.append(isPalindrome(S)).append(" ").append(cnt).append("\n");
			cnt = 0;
		}
		System.out.println(sb.toString());
	}

	public static int recursion(String s, int l, int r) {
		cnt++;
		char[] arr = s.toCharArray();
		if (l >= r)
			return 1;
		else if (arr[l] != arr[r])
			return 0;
		else
			return recursion(s, l + 1, r - 1);
	}

	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}
}