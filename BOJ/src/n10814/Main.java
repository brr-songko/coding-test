package BOJ.src.n10814;

//	57964KB	2012MS

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[][] nameAgeList = new String[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            nameAgeList[i][0] = age;
            nameAgeList[i][1] = name;
        }

        Arrays.sort(nameAgeList, new Comparator<String[]>(){
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(nameAgeList[i][0]);
            System.out.println(nameAgeList[i][1]);
        }
    }
}
