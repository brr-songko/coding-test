package n1269_대칭차집합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		//A원소들와 B원소를 각각 담을 Map, key value 값은 동일한 integer 값으로 넣음
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
		

	}
}
