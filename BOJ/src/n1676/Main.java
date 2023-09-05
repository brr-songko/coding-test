package BOJ.src.n1676;

// 	14660KB	132MS

import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        BigInteger longAnswer = factorial(N);
        String answer = String.valueOf(longAnswer);
        for (int i = answer.length() - 1; i >= 0; i--) {
            if (answer.charAt(i) != '0') {
                System.out.println(answer.length() - 1 - i);
                break;
            }
        }
    }

    public static BigInteger factorial(int N) {
        if (N == 0) {
            return BigInteger.valueOf(1);
        }
        if (N == 1) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(N).multiply(factorial(N - 1));
    }
}
