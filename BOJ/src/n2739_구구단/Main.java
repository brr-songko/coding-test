package BOJ.src.n2739_������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int A = Integer.parseInt(br.readLine());

		for (int i = 1; i < 10; i++) {
			sb.append(A).append(" * ").append(i).append(" = ").append(A * i).append("\n");
		}
		System.out.println(sb.toString());

	}

}
