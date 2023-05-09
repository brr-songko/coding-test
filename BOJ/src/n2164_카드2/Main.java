package BOJ.src.n2164_ī��2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}

		for (int i = 1; i <= N - 1; i++) {
			queue.poll();
			int a = queue.poll();
			queue.offer(a);
		}
		System.out.println(queue.poll());
	}

}
