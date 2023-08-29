package BOJ.src.n2563;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[][] arr = new boolean[100][100];
        int answer = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (!arr[j][k]) {
                        arr[j][k] = true;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}


/***
 * 아무것도 안 겹쳤을 때
 * 그냥 각각의 넓이 구해서 더해
 * 300
 */

/***
 * 겹치는 부분이 있을 경우
 * 겹치는 부분 넓이 + 안겹치는 부분 넓이 더해
 */

/***
 * 제일 중요한 겹치는 거 어떻게 구별하냐
 * 먼저 첫 줄의 숫자만큼의 int[][] 배열 두개 생성
 * 한 개는 주어진 숫자 담을 배열
 * 한 개는 넓이 구하기용 배열
 * (가로 + 10 & 세로 + 10) 한 값보다 작은 값이 있으면 겹치는게 있는 놈
 * 300 디폴드 값 박아놓고 겹치는 부분이 있으면 그 부분 값만 구해서 빼면 됨
 * 3 13  7 17
 * 15 25 7 17
 * 5 15  2 12
 * 위와 같이 했을 때 각 변 비교했을 때 앞은 더 큰 값 뒤는 더 작은 값을 골라냄
 * 이거다
 */