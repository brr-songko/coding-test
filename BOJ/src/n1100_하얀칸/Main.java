package n1100_�Ͼ�ĭ;

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

//2ȸ�� Ǯ��
//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//int answer = 0;
//
//for (int i = 0; i < 8; i++) {
//	// 8��° �ٱ��� ���� �� �Է¹���
//	String a = br.readLine();
//	// Ȧ�� ���� ���
//	if (i % 2 == 0) {
//		for (int j = 0; j < 8; j++) {
//			if (j % 2 == 0 && a.charAt(j) == 'F') {
////				System.out.println("Ȧ�� ������ answer�� ������ ����, i�� j =" + i);
////				System.out.println(j);
//				answer++;
//			}
//		}
//		// ¦�� ���� ���
//	} else if (i % 2 == 1) {
//		for (int j = 0; j < 8; j++) {
//			if (j % 2 == 1 && a.charAt(j) == 'F') {
////				System.out.println("¦�� ������ answer�� ������ ����, i�� j =" + i);
////				System.out.println(j);
//				answer++;
//			}
//		}
//	}
//}
//System.out.println(answer);
//}