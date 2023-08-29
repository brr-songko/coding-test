package BOJ.src.n11718;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            String S = br.readLine();
            if (S == null) {
                break;
            }
            sb.append(S).append("\n");
        }
        System.out.println(sb.toString());
    }
}
