package BOJ.src.n10812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            int[] newBasket = new int[N];
            st = new StringTokenizer(br.readLine()," ");
            int begin = Integer.parseInt(st.nextToken()) -1;
            int end = Integer.parseInt(st.nextToken()) -1;
            int mid = Integer.parseInt(st.nextToken()) -1;
            int end_mid = end - mid;
            int mid_begin = mid - begin;

            for (int j = 0; j <= end_mid; j++) {
                newBasket[begin++] = basket[mid++];
            }

            for (int j = 0; j <= mid_begin; j++) {
                newBasket[mid++] = basket[begin++];
            }

            for (int j = 0; j < N; j++) {
                basket[j] = newBasket[j];
            }
        }

        for (int i = 0; i < N; i++) {
            sb.append(basket[i]).append(" ");
        }

        System.out.println(sb.toString());
    }
}

/**
 * 도현 바구니 총 N개 소유
 * 바구니는 1번부터 N번까지 번호 소유
 * 바구니는 1열로
 * 가장 왼쪽이 1번 오른쪽이 N번
 *
 * 1 2 3 4 ... N 바구니
 *
 * M번 바구니 순서를 회전시키려고 만들려고 함
 * 순서를 회전시킬 번호를 정하고 그 범위 안에서 기준이 될 바구니를 선택
 * 바구니 범위가 begin, end
 * 기준이 mid
 *
 * begin begin+1 begin+2 mid-1 mid mid+1 end-1 end
 * 위에 거를
 * mid mid+1 ... end-1 end begin begin+1 begin+2
 * 로 바꿈
 */