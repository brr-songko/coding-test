package BOJ.src.n10810;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = 0;
        }

        for (int a = 0; a < M; a++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st2.nextToken());
            int j = Integer.parseInt(st2.nextToken());
            int k = Integer.parseInt(st2.nextToken());

            for (int b = i-1; b <= j-1; b++) {
                baskets[b] = k;
            }
        }
        for (int i = 0; i < N; i++) {
            if (i < N - 1) {
                sb.append(baskets[i]).append(" ");
            } else {
                sb.append(baskets[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
