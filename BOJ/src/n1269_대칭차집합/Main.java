package n1269_대칭차집합;


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
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		Map<Integer, Integer> AMap = new HashMap<>();
		Map<Integer, Integer> tempAMap = new HashMap<>();
		Map<Integer, Integer> BMap = new HashMap<>();

		// A원소를 aMap에 담기, key와 value 값은 동일하게 integer로
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= A; i++) {
			int a = Integer.parseInt(st.nextToken());
			AMap.put(a, a);
//			tempAMap.put(a, a);
		}
		// B원소를 bMap에 담기, key와 value 값은 동일하게 integer로
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 1; i <= B; i++) {
			int b = Integer.parseInt(st.nextToken());
			BMap.put(b, b);
		}
		
		int[] arr = new int[100000000];
		arr[10000000] = 1;
		System.out.println(arr[10000000]);

		// entrySet은 map을 순회해서 모든 요소들을 set<Map.entry<key,value>형태로 리턴함
		// removeAll은 set인터페이스가 가지고 있는 메소드
		AMap.entrySet().removeAll(BMap.entrySet());
		BMap.entrySet().removeAll(tempAMap.entrySet());
		int answer = AMap.size() + BMap.size();
		System.out.println(answer);
	}
}
