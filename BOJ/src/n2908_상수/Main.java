package n2908_»ó¼ö;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String A = st.nextToken();
		String B = st.nextToken();
		char[] aArr = A.toCharArray();
		char[] bArr = B.toCharArray();

		char aTemp = aArr[0];
		aArr[0] = aArr[2];
		aArr[2] = aTemp;
		char bTemp = bArr[0];
		bArr[0] = bArr[2];
		bArr[2] = bTemp;

		int newA = Integer.parseInt(String.valueOf(aArr));
		int newB = Integer.parseInt(String.valueOf(bArr));

		if (newA > newB) {
			System.out.println(newA);
		} else {
			System.out.println(newB);
		}
	}
}
