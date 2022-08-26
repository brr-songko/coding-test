package n3052_³ª¸ÓÁö;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[10];
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine()) % 42;
		}

		for (int i = 0; i < arr.length; i++) {
			int temp = 0;
			for (int j = i + 1; j < 10; j++) {
				if (arr[i] == arr[j]) {
					temp++;
				}
			}
			if (temp == 0) {
				count++;
			}
//			System.out.println(arr[i]);
		}
		System.out.println(count);
	}
}
