package BOJ.src.n10845;

// 	18816KB	184MS

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;

        while(true){
            String tempS = "";
            for(int i = 0; i < s.length() - 1; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    tempS = s.substring(0, i) + s.substring(i + 2);
                    break;
                }
            }
            if(tempS.equals(s)){
                break;
            } else if(tempS.equals("")){
                break;
            } else {
                s = tempS;
            }

        }
        if(s.length() == 0){
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        int a = s.solution("baabaa");
        System.out.println(a);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//        int N = Integer.parseInt(br.readLine());
//        String back = "";
//        Queue<String> queue = new LinkedList<>();
//        for (int i = 0; i < N; i++) {
//            String S = br.readLine();
//            if (S.contains("push")) {
//                StringTokenizer st = new StringTokenizer(S);
//                st.nextToken();
//                back = st.nextToken();
//                queue.add(back);
//            } else if (S.contains("pop")) {
//                if (!queue.isEmpty()) {
//                    sb.append(queue.poll()).append("\n");
//                } else {
//                    sb.append(-1).append("\n");
//                }
//            } else if (S.contains("size")) {
//                sb.append(queue.size()).append("\n");
//            } else if (S.contains("empty")) {
//                if (!queue.isEmpty()) {
//                    sb.append(0).append("\n");
//                } else {
//                    sb.append(1).append("\n");
//                }
//            } else if (S.contains("front")) {
//                if (!queue.isEmpty()) {
//                    sb.append(queue.peek()).append("\n");
//                } else {
//                    sb.append(-1).append("\n");
//                }
//            } else if (S.contains("back")) {
//                if (!queue.isEmpty()) {
//                    sb.append(back).append("\n");
//                } else {
//                    sb.append(-1).append("\n");
//                }
//            }
//        }
//
//        System.out.println(sb);
    }
}
