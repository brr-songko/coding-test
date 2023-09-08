package BOJ.src.n1065;

//	14220KB	124MS

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int N = Integer.parseInt(S);
        int answer = 0;

        if (N == 1000) {
            N = 999;
        }
        for (int i = 1; i <= N; i++) {
            if (i < 100) {
                answer++;
            } else if (i >= 100 && i < 1000) {
                int tempI = i;
                int one = i % 10;
                i /= 10;
                int ten = i % 10;
                i /= 10;
                int hun = i % 10;
                if ((hun - ten) == (ten - one)) {
                    answer++;
                }
                i = tempI;
            }
        }

        System.out.println(answer);
    }
}
