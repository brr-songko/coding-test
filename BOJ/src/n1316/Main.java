package BOJ.src.n1316;

// 	14276KB	124MS

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 0; i < N; i++) {
            boolean[] alphabets = new boolean['z' - 'a' + 1];
            String S = br.readLine();
            for (int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);
                if (alphabets['z'- c] && S.charAt(j - 1) != S.charAt(j)) {
                    break;
                }
                alphabets['z'- c] = true;
                if (j == S.length() - 1) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
