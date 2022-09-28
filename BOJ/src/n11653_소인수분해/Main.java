package n11653_소인수분해;

//	14872KB	164ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int a = 2;

		while (a <= N) {
			if (N % a == 0) {
				N = N / a;
				sb.append(a).append("\n");
			} else {
				a++;
			}
		}
		System.out.println(sb.toString());
	}
}
