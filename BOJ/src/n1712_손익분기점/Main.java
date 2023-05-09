package BOJ.src.n1712_���ͺб���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		// A + B * x = C * x �� x���� ���ͺб���. �ڿ����̴� + 1 �� �ϸ� �װ��� ������ ���� ����
		// x = A/(C-B)
		if (C - B <= 0) {
			System.out.println(-1);
		} else {
			System.out.println(A / (C - B) + 1);
		}
	}
}
