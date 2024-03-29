package BOJ.src.n11047;

//	14196KB	128MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] aI = new int[N];
        int answer = 0;
        for (int i = 0; i < N; i++) {
            aI[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N - 1; i >= 0; i--) {
            if (aI[i] <= K) {
                answer = answer + K / aI[i];
                K = K % aI[i];
            }
            if (K == 0) {
                break;
            }
        }

        System.out.println(answer);
    }
}
