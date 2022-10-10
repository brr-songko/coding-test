package n1110_더하기사이클;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = A; // 변하는 B 값과 A 값을 비교하기 위한 변수
		int a; // 10의 자리 수
		int b; // 1의 자리 수
		int count = 0; // 사이클 수
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

//두 번째 풀이
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
