package n1110_���ϱ����Ŭ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = A; // ���ϴ� B ���� A ���� ���ϱ� ���� ����
		int a; // 10�� �ڸ� ��
		int b; // 1�� �ڸ� ��
		int count = 0; // ����Ŭ ��
		for (;;) {
			a = B / 10;
			b = B % 10;
			int sum = a + b;
			B = sum % 10 + b * 10;
			count++;
			if (A == B) {
				break;
			}
		}
		System.out.println(count);
	}
}

//�� ��° Ǯ��
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//int N = Integer.parseInt(br.readLine());
//int temp = N;
//int answer = 0;
//
//while (true) {
//	if (temp / 10 == 0) {
//		temp = temp * 10 + temp;
//	} else {
//		int ten = temp % 10;
//		int one = temp / 10 + temp % 10;
//		if (one < 10) {
//			temp = ten * 10 + one;
//		} else {
//			temp = ten * 10 + one % 10;
//		}
//	}
//	answer++;
//	if (temp == N) {
//		break;
//	}
//}
//System.out.println(answer);
//}
