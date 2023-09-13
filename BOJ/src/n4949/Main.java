package BOJ.src.n4949;

//	19728KB	264MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            Stack<Character> stack = new Stack<>();
            String S = br.readLine();

            if (S.equals(".")) {
                break;
            }

            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '(' || S.charAt(i) == '[') {
                    stack.add(S.charAt(i));
                } else if (S.charAt(i) == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        stack.add(S.charAt(i));
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (S.charAt(i) == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        stack.add(S.charAt(i));
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (!stack.isEmpty()) {
                sb.append("no").append("\n");
            } else {
                sb.append("yes").append("\n");
            }
        }

        System.out.println(sb);
    }
}
