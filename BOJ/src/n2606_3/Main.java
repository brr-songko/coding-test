package BOJ.src.n2606_3;

import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] isConnected;
    static boolean[] isVisited;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        isConnected = new boolean[N+1][N+1];
        isVisited = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            isConnected[n][m] = true;
            isConnected[m][n] = true;
        }

        System.out.println(virus(1));
    }

    private static int virus(int num) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(num);
        isVisited[num] = true;

        while (!queue.isEmpty()) {
            int temp = queue.poll();
            for (int i = 1; i <= isVisited.length -1; i++) {
                if (!isConnected[temp][i]) {
                    continue;
                }
                if (isVisited[i]) {
                    continue;
                }
                queue.offer(i);
                isVisited[i] = true;
                count++;
            }
        }

        return count;
    }
}
