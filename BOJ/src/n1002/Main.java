package BOJ.src.n1002;

//14336KB	140MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            int distance = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//            int distance = (int)(Math.pow(x2- x1, 2) + Math.pow(y2 - y1, 2));

            if (x1 == x2 && y1 == y2 && r1 == r2) {
                System.out.println(-1);
            } else if (distance > (r1 + r2) * (r1 + r2)) {
//            } else if (distance > Math.pow(r1 + r2, 2)) {
                System.out.println(0);
            } else if (distance < (r2 - r1) * (r2 - r1)) {
//            } else if (distance < Math.pow(r2 - r1, 2)) {
                System.out.println(0);
            } else if (distance == (r2 - r1) * (r2 - r1)) {
//            } else if (distance == Math.pow(r2 - r1, 2)) {
                System.out.println(1);
            } else if (distance == (r1 + r2) * (r1 + r2)) {
//            } else if (distance == Math.pow(r1 + r2, 2)) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

    }
}
