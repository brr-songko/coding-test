package BOJ.src.n2442_��_���_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());

		for (int i = 1; i <= A; i++) {
			System.out.println(" ".repeat(A - i) + "*".repeat(2 * i - 1));
		}

	}

}
