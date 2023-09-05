package BOJ.src.n10815_2;

//	161740KB	3816MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        long[] nArr = new long[N];
        long[] mArr = new long[M];
        int[] answerArr = new int[M];

        for (int i = 0; i < N; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            mArr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(nArr);

        for (int i = 0; i < M; i++) {
            int left = 0;
            int right = N-1;
            long findNum = mArr[i];
            while (left <= right) {
                int mid = (left + right) / 2;
//                if (left > right){
//                    answerArr[mid] = 0;
//                    break;
//                }
                if (findNum == nArr[mid]) {
                    answerArr[i] = 1;
                    break;
                } else if (findNum > nArr[mid]) {
                    left = mid + 1;
                } else if (findNum < nArr[mid]) {
                    right = mid - 1;
                }
            }
        }

        for (int i = 0; i < M; i++) {
            System.out.print(answerArr[i] + " ");
        }
    }
}
