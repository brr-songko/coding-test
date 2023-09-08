package BOJ.src.n1920;

//	43872KB	728MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nArr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        int[] mArr = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            mArr[i] = Integer.parseInt(st2.nextToken());
        }

        System.out.println(binarySearch(nArr, mArr));
    }

    public static StringBuilder binarySearch(int[] nArr, int[] mArr) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = 0;
        int mid = 0;
        boolean check = false;

        Arrays.sort(nArr);

        for (int i = 0; i < mArr.length; i++) {
            left = 0;
            right = nArr.length - 1;
            while(left <= right) {
                mid = (left + right) / 2;
                if (mArr[i] == nArr[mid]) {
                    sb.append(1).append("\n");
                    check = true;
                    break;
                } else if (mArr[i] > nArr[mid]) {
                    left = mid + 1;
                } else if (mArr[i] < nArr[mid]) {
                    right = mid - 1;
                }
            }
            if (!check) {
                sb.append(0).append("\n");
            }
            check = false;
        }

        return sb;
    }
}
