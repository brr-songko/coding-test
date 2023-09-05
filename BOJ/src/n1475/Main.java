package BOJ.src.n1475;

//	14260KB	128MS

import java.io.*;

public class Main {
    static int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 1;
        int count = 0;
        String stringN = String.valueOf(N);

        for (int i = 0; i < stringN.length(); i++) {
            int index = Integer.parseInt(String.valueOf(stringN.charAt(i)));

            if (arr[index] == 0) {
                if (index == 6 && arr[9] != 0) {
                    arr[9] -= 1;
                    continue;
                } else if (index == 9 && arr[6] != 0) {
                    arr[6] -= 1;
                    continue;
                } else {
                    for (int j = 0; j < 10; j++) {
                        arr[j]++;
                    }
                    answer++;
                    arr[index] -= 1;
                }
            } else {
                arr[index] -= 1;
            }
        }

        System.out.println(answer);
    }
}
