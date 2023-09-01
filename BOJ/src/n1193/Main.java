package BOJ.src.n1193;

// 	16100KB	172MS

import java.io.*;

public class Main {
    static int a;
    static int b;
    static boolean isOdd;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        a = 1;
        b = 1;

        while (--X > 0) {
            run();
        }

        System.out.println(a + "/" + b);
    }

    private static void run() {
        if (!isOdd) {
            if (a == 1) {
                b++;
                isOdd = true;
            } else {
                a--;
                b++;
            }
        } else {
            if (b == 1) {
                a++;
                isOdd = false;
            } else {
                a++;
                b--;
            }
        }
    }
}
