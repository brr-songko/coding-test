package BOJ.src.n1269_��Ī������;




//	103068kb	876ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*
		<<<<<<< HEAD
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		//A���ҵ�� B���Ҹ� ���� ���� Map, key value ���� ������ integer ������ ����
		Map<Integer, Integer> AMap = new HashMap<>();
		Map<Integer, Integer> BMap = new HashMap<>();
		//
		st= new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < A; i++) {
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st2.nextToken());
			AMap.put(a, a);
			BMap.put(b, b);
		}
		

=======*/
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		Map<Integer, Integer> AMap = new HashMap<>();
		Map<Integer, Integer> tempAMap = new HashMap<>();
		Map<Integer, Integer> BMap = new HashMap<>();

		// A���Ҹ� aMap�� ���, key�� value ���� �����ϰ� integer��
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= A; i++) {
			int a = Integer.parseInt(st.nextToken());
			AMap.put(a, a);
//			tempAMap.put(a, a);
		}
		// B���Ҹ� bMap�� ���, key�� value ���� �����ϰ� integer��
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= B; i++) {
			int b = Integer.parseInt(st.nextToken());
			BMap.put(b, b);
		}
		
		int[] arr = new int[100000000];
		arr[10000000] = 1;
		System.out.println(arr[10000000]);

		// entrySet�� map�� ��ȸ�ؼ� ��� ��ҵ��� set<Map.entry<key,value>���·� ������
		// removeAll�� set�������̽��� ������ �ִ� �޼ҵ�
		AMap.entrySet().removeAll(BMap.entrySet());
		BMap.entrySet().removeAll(tempAMap.entrySet());
		int answer = AMap.size() + BMap.size();
		System.out.println(answer);
	}
}
