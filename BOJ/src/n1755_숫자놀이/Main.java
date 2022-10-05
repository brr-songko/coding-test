package n1755_���ڳ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
   // ����� ��ȯ or ���ڷ� ��ȯ �� ����� �迭
   static String[] en = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine(), " ");
      int M = Integer.parseInt(st.nextToken());
      int N = Integer.parseInt(st.nextToken());
      LinkedList<String> strList = new LinkedList<>(); // ����� ��ȯ�ؼ� ���� ����Ʈ
      LinkedList<Integer> intList = new LinkedList<>(); // ���� ����� ���ڸ� ���� ����Ʈ

      for (int i = M; i <= N; i++) {
         int ten = i / 10;
         int one = i % 10;
         if (ten == 0) { // 10�ڸ��� 0�̸� �Է¹��� ���ڴ� ���ڸ� ��
            strList.add(en[one]); // one�� ���ڸ� �� �ǹ�, en�� ���� �������, ���� ��������� strList�� �ִ´�
         } else {
            strList.add(en[ten]+" "+en[one]);
         }
      }
      
      Collections.sort(strList); // �ݷ��� �����ӟp������ �� �ִ� ���.
//      strList.sort(null); //���������� ����
      
      while(!strList.isEmpty()) { // str����Ʈ�� ������� �� ����
         String temp = strList.poll(); // ����Ʈ ù ��° ��� ����
         if(temp.contains(" ")) { //" "�� ������ �ִٸ�
            st = new StringTokenizer(temp, " "); // ���� �������� �� �ܾ ����
            String t1 = st.nextToken();
            String t2 = st.nextToken();
            int ten = findNum(t1); //findNum �Լ� �̿��ؼ� �ش��ϴ� ���ڷ� �ٽ� ��ȯ�ϱ�
            int one = findNum(t2);
            intList.add(ten*10 + one); //�����ڸ��� �����ڸ� �� ã������ ���ؼ� ���� ���ڸ� ����Ʈ�� �ֱ�
         }else {
            intList.add(findNum(temp)); //���ڸ� ����� �ٷ� ����Ʈ�� �ֱ�
         }
      }
      
      while(!intList.isEmpty()) { //����Ʈ�� �������� ����ϱ�
         for(int i = 0; i<10; i++) { //���ٿ� 10���� ����ϱ�
            if(intList.isEmpty()) { //���ٿ� 10���� �Ǳ����� ����Ʈ�� ��ٸ� ������ �����ʰ� return���� �ݺ��� ����ǰ� ��
               return;
            }
            System.out.print(intList.poll()+ " "); // ���ٿ� ��ĭ�� ����� ���
         }
         System.out.println(); //10���� ������ �����ٷ� 
      }
   }
   
   static int findNum(String input) { //�Է¹��� ���ڸ� ���ڷ� �ٽ� ������Ű�� �޼ҵ�
      for(int i = 0; i<=9; i++) {
         if(input.equals(en[i])) {
            return i;
         }
      }
      return 0;
   }
}