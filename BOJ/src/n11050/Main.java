package BOJ.src.n11050;

// 	14184KB	124MS

import java.io.*;
import java.util.*;

public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dp = new int[n+1][m+1];

        System.out.println(combination(n, m));
    }

    public static int combination(int n, int m) {
        if (dp[n][m] > 0) {
            return dp[n][m];
        }

        if (n == m || m == 0) {
            return dp[n][m] = 1;
        }

        return dp[n][m] = combination(n - 1, m - 1) + combination(n - 1, m);
    }
}
