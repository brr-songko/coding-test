package BOJ.src.n1427;

// 14336KB 128MS

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        char[] arr = new char[S.length()];

        for (int i = 0; i < S.length(); i++) {
            arr[i] = S.charAt(i);
        }

        Arrays.sort(arr);

        for (int i = S.length()-1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
