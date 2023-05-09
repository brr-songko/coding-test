package BOJ.src.n10815_숫자카드;

//176236kb	820ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
		static int[] arr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < N ; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < M; i++) {
			int test = binarySearch(Integer.parseInt(st.nextToken()));
			if(test != -1) {
				sb.append(1).append(" ");
			}else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb.toString());
	}
	
	public static int binarySearch(int compareNum) {
		int left = 0;
		int right = arr.length-1;
		int mid;
		
		while(left <= right) {
			mid = (left+right)/2;
			if(arr[mid] > compareNum) { 
				right = mid - 1;
			}
			else if(arr[mid] < compareNum) { 
				left = mid + 1;
			}
			else { 
				return mid;
			}
		}
		return -1;
	}
}




/* 두 번째 생각한 최대 배열 만들고 포문 한번만 돌게하기
 int[] checkArr = new int[20000000];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 내 숫자를 배열로 받기
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			checkArr[Integer.parseInt(st.nextToken())+10000001] = 1;
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i < M; i++) {
			if(checkArr[Integer.parseInt(st.nextToken())+10000001] == 1) {
				sb.append(1).append(" ");
			}else {
				sb.append(0).append(" ");
			}
		}
		System.out.println(sb.toString());
	}
 */

/* 처음 생각한 틀린 답 그냥 무식 이중포문
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
StringBuilder sb = new StringBuilder();
// 내 숫자를 배열로 받기
int N = Integer.parseInt(br.readLine());
StringTokenizer st = new StringTokenizer(br.readLine(), " ");
int[] myArr = new int[N];
for (int i = 0; i < N; i++) {
	myArr[i] = Integer.parseInt(st.nextToken());
}
// 비교해야할 숫자를 배열로 받기
// 비교한 값 넣을 배열 생성
int M = Integer.parseInt(br.readLine());
st = new StringTokenizer(br.readLine(), " ");
int[] checkArr = new int[M];
int[] compareArr = new int[M];
for (int i = 0; i < M; i++) {
	checkArr[i] = Integer.parseInt(st.nextToken());
	compareArr[i] = 0;
	for (int j = 0; j < N; j++) {
		if (checkArr[i] == myArr[j]) {
			compareArr[i] = 1;
			break;
		}
	}
	sb.append(compareArr[i]).append(" ");
}
	
System.out.println(sb.toString());
*/