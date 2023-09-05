package BOJ.src.n1010;

//	15272KB	148MS

import java.io.*;
import java.util.*;

public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            dp = new int[N+1][M+1];
            sb.append(combination(N, M)).append("\n");
        }

        System.out.println(sb);
    }

    public static int combination(int N, int M) {
        if (dp[N][M] > 0) {
            return dp[N][M];
        }

        if (N == M || M == 0) {
            return dp[N][M] = 1;
        }

        return dp[N][M] = combination(N-1, M-1) + combination(N-1, M);
    }
}
