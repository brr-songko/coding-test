package BOJ.src.n2941;

// 14264KB	132MS

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int answer = 0;
        int tempAnswer = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'c' || S.charAt(i) == 'd' || S.charAt(i) == 'l' || S.charAt(i) == 'n' || S.charAt(i) == 's' || S.charAt(i) == 'z') {
                if (i < S.length() - 1) {
                    for (int j = 0; j < arr.length; j++) {
                        String s = String.valueOf(S.charAt(i)) + String.valueOf(S.charAt(i + 1));
                        if (arr[j].equals(s)) {
                            answer++;
                            i++;
                            break;
                        }
                    }
                    if (S.charAt(i) == 'd' && S.charAt(i + 1) == 'z') {
                        if (i < S.length() - 2) {
                            if (S.charAt(i + 2) == '=') {
                                answer++;
                                i += 2;
                            }
                        }
                    }

                    if (tempAnswer == answer) {
                        answer++;
                        tempAnswer = answer;
                    }
                    tempAnswer = answer;
                } else {
                    answer++;
                    tempAnswer = answer;
                }
            } else {
                answer++;
                tempAnswer = answer;
            }
        }
        System.out.println(answer);
    }
}
