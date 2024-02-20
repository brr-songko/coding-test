package BOJ.src.n3986;

//	53560kb	524ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack stack = new Stack<String>();
        int answer = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            String[] s1 = s.split("");
            stack.push(s1[0]);
            for (int j = 1; j < s1.length; j++) {
                if (!stack.isEmpty()) {
                    if (stack.peek().equals(s1[j])) {
                        stack.pop();
                    } else {
                        stack.push(s1[j]);
                    }
                } else {
                    stack.push(s1[j]);
                }

            }
            if (stack.isEmpty()) {
                answer++;
            }
            stack.clear();
        }
        System.out.println(answer);
    }
}
