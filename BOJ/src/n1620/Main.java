package BOJ.src.n1620;

//58688KB	560MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map1 = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            String S = br.readLine();
            map1.put(S, i);
            map2.put(i, S);
        }

        for (int i = 0; i < M; i++) {
            String S = br.readLine();
            if (S.charAt(0) >= 49 && S.charAt(0) <= 57) {
                sb.append(map2.get(Integer.parseInt(S))).append("\n");
            } else {
                sb.append(map1.get(S)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
