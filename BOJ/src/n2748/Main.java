package BOJ.src.n2748;

//14192KB	128MS

import java.io.*;
import java.util.*;

public class Main {
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new long[n + 1];

        for (int i = 0; i < n + 1; i++) {
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;
        System.out.println(fivonacci(n));
    }

    private static long fivonacci(int n) {
        if (arr[n] == -1) {
            arr[n] = fivonacci(n - 1) + fivonacci(n - 2);
        }
        return arr[n];
    }
}


