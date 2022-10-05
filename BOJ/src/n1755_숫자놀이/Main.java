package n1755_숫자놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
   // 영어로 변환 or 숫자로 변환 시 사용할 배열
   static String[] en = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int M = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());
      LinkedList<String> strList = new LinkedList<>(); // 영어로 변환해서 넣을 리스트
      LinkedList<Integer> intList = new LinkedList<>(); // 최종 출력할 숫자를 넣을 리스트

      for (int i = M; i <= N; i++) {
         int ten = i / 10;
         int one = i % 10;
         if (ten == 0) { // 10자리가 0이면 입력받은 숫자는 한자리 수
            strList.add(en[one]); // one은 한자리 수 의미, en은 숫자 영어버전, 숫자 영어버전을 strList에 넣는다
         } else {
            strList.add(en[ten]+" "+en[one]);
         }
      }
      
      Collections.sort(strList); // 콜렉션 프레임웤에서는 다 있는 기능.
//      strList.sort(null); //사전순으로 정렬
      
      while(!strList.isEmpty()) { // str리스트가 비어있을 때 까지
         String temp = strList.poll(); // 리스트 첫 번째 요소 추출
         if(temp.contains(" ")) { //" "를 가지고 있다면
            st = new StringTokenizer(temp, " "); // 띄어쓰기 기준으로 한 단어씩 떼옴
            String t1 = st.nextToken();
            String t2 = st.nextToken();
            int ten = findNum(t1); //findNum 함수 이용해서 해당하는 숫자로 다시 반환하기
            int one = findNum(t2);
            intList.add(ten*10 + one); //십의자리와 일의자리 다 찾았으면 더해서 원래 숫자를 리스트에 넣기
         }else {
            intList.add(findNum(temp)); //한자리 수라면 바로 리스트에 넣기
         }
      }
      
      while(!intList.isEmpty()) { //리스트가 빌때까지 출력하기
         for(int i = 0; i<10; i++) { //한줄에 10개씩 출력하기
            if(intList.isEmpty()) { //한줄에 10개가 되기전에 리스트가 빈다면 오류가 나지않게 return으로 반복문 종료되게 함
               return;
            }
            System.out.print(intList.poll()+ " "); // 한줄에 한칸씩 띄워서 출력
         }
         System.out.println(); //10개가 끝나면 다음줄로 
      }
   }
   
   static int findNum(String input) { //입력받은 문자를 숫자로 다시 원복시키는 메소드
      for(int i = 0; i<=9; i++) {
         if(input.equals(en[i])) {
            return i;
         }
      }
      return 0;
   }
}