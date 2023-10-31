package BOJ.src.n15650;

//14380KB	136MS

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static boolean[] isVisited;
    static int[] arr;
    static int N, M;
    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        isVisited = new boolean[N + 1];
        arr = new int[N + 1];

        gg(0);
        System.out.println(sb);
    }

    private static void gg(int k) {
        if (k == M) {
            for (int i = 1; i < k; i++) {
                if (arr[i] >= arr[i + 1]) {
                    return;
                }
            }
            for (int i = 1; i <= k; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= N; i++) {
            if (!isVisited[i]) {
                isVisited[i] = true;
                arr[k + 1] = i;
                gg(k + 1);

                isVisited[i] = false;
            }
        }
    }
}
