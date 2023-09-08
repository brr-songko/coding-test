package BOJ.src.n9012;

//	14312KB	128MS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            Stack stack = new Stack<Character>();

            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == '(') {
                    stack.push(S.charAt(j));
                } else {
                    if (stack.isEmpty()) {
                        stack.push(S.charAt(j));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (stack.isEmpty()) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb);
    }
}
