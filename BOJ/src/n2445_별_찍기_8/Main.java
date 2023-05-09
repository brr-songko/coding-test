package BOJ.src.n2445_º°_Âï±â_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		// ºóÄ­  8 6 4 2 0 2 4 6 8
		// º°°³¼ö 2 4 6 8 10 8 6 4 2
		for(int i = 1; i <= A; i ++) {
			System.out.println("*".repeat(i) + " ".repeat((A-i)*2) + "*".repeat(i));
		}
		for(int i = 1; i<A;i++) {
			System.out.println("*".repeat(A-i) + " ".repeat(i*2) + "*".repeat(A-i));
		}
	}

}
