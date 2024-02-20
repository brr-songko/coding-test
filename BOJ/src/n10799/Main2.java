package BOJ.src.n10799;

import java.io.*;
import java.util.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack stack = new Stack<Character>();
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
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
