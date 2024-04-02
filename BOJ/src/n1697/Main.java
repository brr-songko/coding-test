package BOJ.src.n1697;

import java.io.*;
import java.util.*;

public class Main {
    static int[] visited = new int[100001];
    static int count;
    static int N, K;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (N == K) {
            System.out.println(0);
        } else {
            bfs(N);
        }
    }

    public static void bfs(int n) {
        Queue<Integer> queue= new LinkedList<>();
        visited[n] = 1;
        queue.add(n);

        while (!queue.isEmpty()) {
            int now = queue.poll();
            for (int i = 0; i < 3; i++) {
                int next = 0;
                if (i == 0) {
                    next = now - 1;
                } else if (i == 1) {
                    next = now + 1;
                } else if (i == 2) {
                    next = now * 2;
                }

                if (next == K) {
                    System.out.println(visited[now]);
                    return;
                }

                if (next >= 0 && next < visited.length && visited[next] == 0) {
                    visited[next] = visited[now] + 1;
                    queue.add(next);
                }
            }
        }
    }
}


/**
 *5 17
 *4
 *
 */