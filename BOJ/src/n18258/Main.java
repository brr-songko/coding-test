package BOJ.src.n18258;

//349704KB	1480MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int last = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String S = st.nextToken();
            if (S.contains("push")) {
                int X = Integer.parseInt(st.nextToken());
                queue.add(X);
                last = X;
            } else if (S.contains("pop")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if (S.contains("size")) {
                sb.append(queue.size()).append("\n");
            } else if (S.contains("empty")) {
                if (queue.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }
            } else if (S.contains("front")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if (S.contains("back")) {
                if (queue.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(last).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
