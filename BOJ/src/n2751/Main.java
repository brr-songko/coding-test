package BOJ.src.n2751;

// 113400KB	1644MS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int min = 999999;
        int minCount = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

//        for (int i = 0; i < N; i++) {
//            min = arr[i];
//            if (i < N) {
//                for (int j = i + 1; j < N; j++) {
//                    if (min > arr[j]) {
//                         min = arr[j];
//                         minCount = j;
//                        int temp = arr[minCount];
//                        arr[minCount] = arr[i];
//                        arr[i] = temp;
//                    }
//                }
//            }
//        }

        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
