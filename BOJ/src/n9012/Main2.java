package BOJ.src.n9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        Stack stack = new Stack<Character>();

        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.push('(');
                } else if (s.charAt(j) == ')') {
                    if (!stack.isEmpty()) {
                        if (stack.pop().equals('(')) {
                            continue;
                        } else {
                            stack.push(s.charAt(j));
                        }
                    } else {
                        stack.push(s.charAt(j));
                    }
                }
            }
            if (!stack.isEmpty()) {
                sb.append("NO").append("\n");
            } else {
                sb.append("YES").append("\n");
            }
            stack.clear();
        }
        System.out.println(sb);
    }
}