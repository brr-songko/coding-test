package n1193_분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//public class Main {
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int X = Integer.parseInt(br.readLine());
//		int sum = 1;
//		int A = 1;
//		int B = 1;
////		for (;;) {
////			if (sum > X) {
////				x = sum - X;
////				break;
////			} else if (sum == X) {
////				x = sum - X;
////				break;
////			}
////			sum += N;
////			N++;
////		}
////		if (N % 2 == 0) {
////			System.out.println((1 + x) + "/" + (N - x));
////		} else if (N % 2 == 1) {
////			System.out.println((N - x) + "/" + (1 + x));
////		}
////	}
////}

// 1/1 1/2 2/1 3/1 2/2 1/3 1/4 2/3 3/2 4/1 5/1  4/2 3/3 2/4
// 1   2   3   4   5   6   7   8   9   10  11   12  13  14

//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//int X = Integer.parseInt(br.readLine());
//int sum = 1;
//int N = 1;
//int x = 0;
//for (;;) {
//	if (sum > X) {
//		x = sum - X;
//		break;
//	} else if (sum == X) {
//		x = sum - X;
//		break;
//	}
//	sum += N;
//	N++;
//}
//if (N % 2 == 0) {
//	System.out.println((1 + x) + "/" + (N - x));
//} else if (N % 2 == 1) {
//	System.out.println((N - x) + "/" + (1 + x));
//}