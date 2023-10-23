package BOJ.src.n9095;

import java.io.*;

public class Main {
    static int[] dp;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            dynamicP(n);
            sb.append(dp[n]).append("\n");
        }

        System.out.println(sb);
    }

    private static int dynamicP(int n) {
        if (n == 1) {
            return dp[1];
        } else if (n == 2) {
            return dp[2];
        } else if (n == 3) {
            return dp[3];
        } else {
            return dp[n] = dynamicP(n - 1) + dynamicP(n - 2) + dynamicP(n - 3);
        }
    }
}
