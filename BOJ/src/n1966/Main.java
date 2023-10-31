package BOJ.src.n1966;

//15280KB	156MS

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            LinkedList<int[]> queue = new LinkedList<>();
            int answer = 0;
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int[] arr = {j, Integer.parseInt(st.nextToken())};
                queue.offer(arr);
            }

            while (!queue.isEmpty()) {
                int[] first = queue.poll();
                boolean isMax = true;

                for (int j = 0; j < queue.size(); j++) {
                    if (first[1] < queue.get(j)[1]) {
                        queue.offer(first);
                        for (int k = 0; k < j; k++) {
                            queue.offer(queue.poll());
                        }
                        isMax = false;
                        break;
                    }
                }

                if (!isMax) {
                    continue;
                }

                answer++;
                if (first[0] == M) {
                    break;
                }
            }

            sb.append(answer).append("\n");
        }

        System.out.println(sb);
    }
}
