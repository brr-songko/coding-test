package BOJ.src.n10988_palindrom;
//팰린드롬인지 확인하기

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        int answer = 0;
        int temp = 0;
        int range = a.length()/2;
        for (int i = 0; i < range; i++) {
            if(a.charAt(i) == a.charAt(a.length()-i-1)){
                temp++;
            }
        }
        if (temp == range) {
            answer = 1;
        }
        System.out.println(answer);
    }
}
