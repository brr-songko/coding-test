package BOJ.src.n1193_분수찾기;

//16124KB 172ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int a, b;
	static boolean isOdd;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		a = 1;
		b = 1;

		while (--X > 0) {
			run();
		}
		System.out.println(a + "/" + b);
	}

	public static void run() {
		if (!isOdd) {
			if (a == 1) {
				b++;
				isOdd = !isOdd;
			} else {
				a--;
				b++;
			}
		} else {
			if (b == 1) {
				a++;
				isOdd = !isOdd;
			} else {
				a++;
				b--;
			}
		}
	}
}