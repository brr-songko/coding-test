package BOJ.src.n10845;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        LinkedList<String> queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (s.contains("push")) {
                queue.offer(st.nextToken());
            } else if (s.contains("front")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if (s.contains("back")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.get(queue.size() - 1)).append("\n");
                }
            } else if (s.contains("size")) {
                sb.append(queue.size()).append("\n");
            } else if (s.contains("pop")) {
                if (queue.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }
            } else if (s.contains("empty")) {
                if (queue.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}
