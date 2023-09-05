package BOJ.src.n11866_2;

//	14196KB	124MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        int count = K - 1;
        for (int i = 0; i < N; i++) {
            list.add(i + 1);
        }

        sb.append("<");

        while (list.size() > 1) {
            if (count >= list.size()) {
                count %= list.size();
            }
            sb.append(list.get(count)).append(", ");
            list.remove(count);
            count += K - 1;
        }

        sb.append(list.get(0)).append(">");
        System.out.println(sb);
    }
}
