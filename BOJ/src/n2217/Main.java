package BOJ.src.n2217;

//	24480KB	296MS

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = 0;

        Arrays.sort(arr);

        for (int i = 0; i < N; i++) {
            max = Math.max(max, arr[i] * (N - i));
        }

        System.out.println(max);
    }
}
