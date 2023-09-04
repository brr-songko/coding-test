package BOJ.src.n1026;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] aArr = new int[N];
        int[] bArr = new int[N];
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            aArr[i] = Integer.parseInt(st.nextToken());
            bArr[i] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(aArr);
        Arrays.sort(bArr);

        for (int i = 0; i < N; i++) {
            answer += aArr[i] * bArr[N-i-1];
        }

        System.out.println(answer);
    }
}
