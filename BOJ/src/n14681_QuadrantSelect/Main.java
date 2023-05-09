package BOJ.src.n14681_QuadrantSelect;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		if (A > 0 && B > 0) {
			System.out.println("1");
		} else if (A < 0 && B > 0) {
			System.out.println("2");
		} else if (A < 0 && B < 0) {
			System.out.println("3");
		} else if (A > 0 && B < 0) {
			System.out.println("4");
		}
	}
}
