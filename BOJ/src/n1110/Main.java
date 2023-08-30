package BOJ.src.n1110;

//	14312KB	128MS

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        int tempN = N;

        while (true) {
            if (tempN >= 10) {
                int ten = tempN / 10;
                int one = tempN % 10;
                tempN = (ten + one) % 10 + one * 10;
                answer++;
            } else {
                int one = tempN;
                tempN = one + one * 10;
                answer++;
            }

            if (tempN == N) {
                System.out.println(answer);
                break;
            }
        }

    }
}
