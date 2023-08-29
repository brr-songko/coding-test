package BOJ.src.n1546;

//14344KB	132MS

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] scores = new double[N];
        double max = 0;
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
            if (scores[i] >= max) {
                max = scores[i];
            }
        }

        for (int i = 0; i < N; i++) {
            scores[i] = scores[i]/max*100;
            sum += scores[i];
        }

        System.out.println(sum/N);
    }
}
