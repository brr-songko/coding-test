package n2443_º°_Âï±â_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());

		for (int i = 0; i < A; i++) {
			System.out.println(" ".repeat(i) + "*".repeat(2 * (A - i) - 1));
		}

	}

}
