package BOJ.src.n10845;

// 	18816KB	184MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String back = "";
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            if (S.contains("push")) {
                StringTokenizer st = new StringTokenizer(S);
                st.nextToken();
                back = st.nextToken();
                queue.add(back);
            } else if (S.contains("pop")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.poll()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (S.contains("size")) {
                sb.append(queue.size()).append("\n");
            } else if (S.contains("empty")) {
                if (!queue.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(1).append("\n");
                }
            } else if (S.contains("front")) {
                if (!queue.isEmpty()) {
                    sb.append(queue.peek()).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            } else if (S.contains("back")) {
                if (!queue.isEmpty()) {
                    sb.append(back).append("\n");
                } else {
                    sb.append(-1).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
