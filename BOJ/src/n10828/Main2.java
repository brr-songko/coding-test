package BOJ.src.n10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.logging.XMLFormatter;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.contains("push")) {
                st = new StringTokenizer(s);
                String a = st.nextToken();
                String x = st.nextToken();
                stack.push(x);
            } else if (s.contains("pop")) {
                if (stack.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
                    sb.append(stack.pop()).append("\n");
                }
            } else if (s.contains("size")) {
                sb.append(stack.size()).append("\n");
            } else if (s.contains("empty")) {
                if (stack.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }
            } else if (s.contains("top")) {
                if (stack.isEmpty()) {
                    sb.append("-1").append("\n");
                } else {
//                    sb.append(stack.get(stack.size() - 1)).append("\n");
                    sb.append(stack.peek()).append("\n");
                }
            }
        }

        System.out.println(sb);
    }
}
