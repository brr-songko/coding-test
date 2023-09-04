package BOJ.src.n1436;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 666;
        int count = 1;

        while (N != count) {
            answer++;

            if (String.valueOf(answer).contains("666")) {
                count++;
            }
        }

        System.out.println(answer);
    }
}
