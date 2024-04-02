package BOJ.src.n16953;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        int answer = 0;

        while(B != A){
            if(B < A){
                answer = -1;
                break;
            }

            if (B % 2 != 0 && B % 10 != 1) {
                answer = -1;
                break;
            }

            if (B % 10 == 1) {
                answer++;
                B /= 10;
            } else if (B % 2 == 0) {
                answer++;
                B /= 2;
            }
        }

        if (answer != -1) {
            answer++;
        }

        System.out.println(answer);
    }
}


/**
 * 2 162
 * 5
 *
 * 4 42
 * -1
 *
 * 100 40021
 * 5
 */