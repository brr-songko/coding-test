package BOJ.src.n2446_��_���_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		// ��ĭ 0 2 4 6 8 6 4 2 0
		// ������ 9 7 5 3 1 3 5 7 9
		for (int i = 0; i < A; i++) {
			System.out.println(" ".repeat(i) + "*".repeat(2 * (A - i - 1) + 1));
		}
		for (int i = 1; i < A; i++) {
			System.out.println(" ".repeat(A - i - 1) + "*".repeat(2 * (i + 1) - 1));
		}

	}

}
