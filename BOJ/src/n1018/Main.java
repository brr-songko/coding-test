package BOJ.src.n1018;

//14220KB	128MS

import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] board;
    static int min = 64;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        board = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            for (int j = 0; j < M; j++) {
                if (S.charAt(j) == 'W') {
                    board[i][j] = true;
                } else {
                    board[i][j] = false;
                }
            }
        }

        int row = N - 7;
        int col = M - 7;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                find(i, j);
            }
        }

        System.out.println(min);
    }

    public static void find(int x, int y) {
        int end_row = x+8;
        int end_col = y+8;
        int count = 0;

        boolean check = board[x][y];

        for (int i = x; i < end_row; i++) {
            for (int j = y; j < end_col; j++) {
                if (board[i][j] != check) {
                    count++;
                }
                check = !check;
            }
            check = !check;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(min, count);
    }
}
