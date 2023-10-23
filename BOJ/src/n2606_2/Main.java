package BOJ.src.n2606_2;

//14208MS	128KB

import java.io.*;
import java.util.*;

public class Main {
    static boolean[] visited;
    static boolean[][] isConnected;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];
        isConnected = new boolean[n+1][n+1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            isConnected[a][b] = true;
            isConnected[b][a] = true;
        }

        System.out.println(search(1));
    }

    private static int search(int num) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        queue.offer(num);
        visited[num] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int i = 1; i <= visited.length - 1; i++) {
                if (!isConnected[x][i]) {
                    continue;
                }
                if (visited[i]) {
                    continue;
                }
                queue.offer(i);
                visited[i] = true;
                count++;
            }
        }

        return count;
    }
}
