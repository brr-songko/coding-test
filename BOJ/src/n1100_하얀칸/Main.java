package n1100_하얀칸;

//14164KB	124ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		for (int i = 0; i < 8; i++) {
			String A = br.readLine();
			for (int j = 0; j < 8; j++) {
				char N = A.charAt(j);
				if (i % 2 == 0 && j % 2 == 0 && N == 'F') {
					sum++;
				} else if (i % 2 == 1 && j % 2 == 1 && N == 'F') {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
	
	
}

//2회차 풀이
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//int answer = 0;
//
//for (int i = 0; i < 8; i++) {
//	// 8번째 줄까지 한줄 씩 입력받음
//	String a = br.readLine();
//	// 홀수 줄일 경우
//	if (i % 2 == 0) {
//		for (int j = 0; j < 8; j++) {
//			if (j % 2 == 0 && a.charAt(j) == 'F') {
////				System.out.println("홀수 시점에 answer가 증가한 시점, i와 j =" + i);
////				System.out.println(j);
//				answer++;
//			}
//		}
//		// 짝수 줄일 경우
//	} else if (i % 2 == 1) {
//		for (int j = 0; j < 8; j++) {
//			if (j % 2 == 1 && a.charAt(j) == 'F') {
////				System.out.println("짝수 시점에 answer가 증가한 시점, i와 j =" + i);
////				System.out.println(j);
//				answer++;
//			}
//		}
//	}
//}
//System.out.println(answer);
//}