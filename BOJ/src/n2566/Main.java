package BOJ.src.n2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int maxI = 0;
        int maxJ = 0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                int temp = Integer.parseInt(st.nextToken());
                if (max <= temp) {
                    max = temp;
                    maxI = i+1;
                    maxJ = j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(maxI + " " + maxJ);
    }
}
