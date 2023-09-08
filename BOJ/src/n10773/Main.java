package BOJ.src.n10773;

//23472KB	228MS ArrayList
//23956KB	252MS Stack

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = 0; i < K; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                stack.pop();
            } else {
                stack.push(a);
            }
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }

        System.out.println(answer);
    }
}
