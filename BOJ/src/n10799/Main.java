package BOJ.src.n10799;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack stack = new Stack<Character>();
        int size = s.length();
        int answer = 0;

        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    stack.pop();
                    answer += stack.size();
                } else if (s.charAt(i - 1) == ')') {
                    stack.pop();
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}
