package BOJ.src.n2563_2;

//14180KB	128MS

import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] arr = new boolean[100][100];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (!arr[x + j][y + k]) {
                        arr[x+j][y+k] = true;
                        answer++;
                    }
                }
            }
        }

        System.out.println(answer);
    }
}
