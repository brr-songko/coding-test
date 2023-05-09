package BOJ.src.n5622_´ÙÀÌ¾ó;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		int[] arr = new int['Z'-'A'+1];
		int a = 3;
		for(int i = 1; i <= arr.length; i++) {
			arr[i] = a;
			if(i%3 == 0) {
				a++;
			}
			System.out.println(arr[i]);
		}
		System.out.println("---- ");
		char[] pArr = A.toCharArray();
		int sum = 0;
		for(int i = 0; i < pArr.length; i++) {
			sum += arr[pArr[i]-'A'];
			System.out.println(arr[pArr[i]-'A']);
		}
		System.out.println(sum);
		
	}
}
