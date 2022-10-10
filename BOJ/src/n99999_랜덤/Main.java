package n99999_����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int temp = N;
		int answer = 0;

		while (true) {
			if (temp / 10 == 0) {
				temp = temp * 10 + temp;
			} else {
				int ten = temp % 10;
				int one = temp / 10 + temp % 10;
				if (one < 10) {
					temp = ten * 10 + one;
				} else {
					temp = ten * 10 + one % 10;
				}
			}
			answer++;
			if (temp == N) {
				break;
			}
		}
		System.out.println(answer);
	}
}

//int temp = 0;
//int answer = 0;
//
//while (temp != N) {
//	System.out.println("���� temp = " + temp);
//	if (temp / 10 == 0) {
//		temp = N * 10 + N;
//		System.out.println("���ڸ��� temp " + temp);
//	} else {
//		int newTenInt = (temp % 10);
//		System.out.println("���ڸ��� �̻��� �� �� �����ڸ�" + newTenInt);
//		int newOneInt = (temp / 10) + (temp % 10);
//		System.out.println("���ڸ��� �̻��� �� �� �����ڸ�" + newOneInt);
//		if(newOneInt < 10) {
//		temp = newTenInt *10 + newOneInt;
//		System.out.println("���ڸ��� �̻��� �� ���� ���ڸ��϶� = " + temp);
//		}else if(newOneInt >= 10) {
//			newOneInt = newOneInt % 10;
//			System.out.println("new" + newOneInt);
//			temp = newTenInt *10 + newOneInt;
//		}
//		System.out.println("10���� Ŭ�� " + temp);
//	}
//	answer++;
//}
//System.out.println(answer);