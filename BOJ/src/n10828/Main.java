package BOJ.src.n10828;

//	19224KB	188MS

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Stack<String> stack = new Stack<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            if (S.contains("pop")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            } else if (S.contains("size")) {
                sb.append(stack.size()).append("\n");
            } else if (S.contains("empty")) {
                if (stack.isEmpty()) {
                    sb.append("1").append("\n");
                } else {
                    sb.append("0").append("\n");
                }

            } else if (S.contains("top")) {
                if (!stack.isEmpty()) {
                    sb.append(stack.get(stack.size()-1)).append("\n");
                } else {
                    sb.append("-1").append("\n");
                }
            } else if (S.contains("push")) {
                st = new StringTokenizer(S);
                String a = st.nextToken();
                String X = st.nextToken();
                stack.push(X);
            }
        }

        System.out.println(sb);
    }
}
