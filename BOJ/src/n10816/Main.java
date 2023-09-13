package BOJ.src.n10816;

//184980KB	1304MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int index = Integer.parseInt(st.nextToken());
            if (map.get(index) == null) {
                map.put(index, 1);
            } else {
                map.put(index, map.get(index) + 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int index = Integer.parseInt(st.nextToken());
            if (map.get(index) == null) {
                sb.append(0).append(" ");
            } else {
                sb.append(map.get(index)).append(" ");
            }
        }

        System.out.println(sb);
    }
}
