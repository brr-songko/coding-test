package BOJ.src.n10798;

//	14232KB	132MS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[5];
        int max = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = br.readLine();
            if (max < arr[i].length()) {
                max = arr[i].length();
            }
        }

        char[][] charArr = new char[5][max];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                charArr[i][j] = arr[i].charAt(j);
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if(charArr[j][i] == '\0'){
                    continue;
                }
                    sb.append(charArr[j][i]);
            }
        }

        System.out.println(sb.toString());
    }
}
