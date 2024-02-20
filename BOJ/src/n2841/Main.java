package BOJ.src.n2841;

//124884kb	968ms

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int answer = 0;
        Stack[] stack = new Stack[7];

        for (int i = 0; i <= 6; i++) {
            stack[i] = new Stack<Integer>();
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            if (stack[n].isEmpty()) {
                stack[n].push(p);
                answer++;
            } else {
                if ((int) stack[n].peek() < p) {
                    stack[n].push(p);
                    answer++;
                } else if ((int) stack[n].peek() > p) {
                    while ((int) stack[n].peek() > p) {
                        stack[n].pop();
                        answer++;
                        if (stack[n].isEmpty() || (int)stack[n].peek() == p) {
                            break;
                        }
                    }
                    if (!stack[n].isEmpty() && (int) stack[n].peek() < p) {
                        stack[n].push(p);
                        answer++;
                    }
                    if (stack[n].isEmpty()) {
                        stack[n].push(p);
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
