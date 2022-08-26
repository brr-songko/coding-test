package n10250_ACMÈ£ÅÚ;

//14300kb	140ms

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			
			if(N%H == 0) {
				System.out.println(H*100 + 1*N/H);
			}else{
				System.out.println((N%H)*100+(N/H)+1);
			}
		}
	}
}


//for (int i = 0; i < T; i++) {
//	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//	int H = Integer.parseInt(st.nextToken());
//	int W = Integer.parseInt(st.nextToken());
//	int N = Integer.parseInt(st.nextToken());
//	int value = 0;
//
//	for (int j = 1; j <= W; j++) {
//		for (int k = 1; k <= H; k++) {
//			value++;
//			if (value == N) {
////				System.out.println(k);
////				System.out.println(j);
//				System.out.printf("%d0%d", k, j);
//				break;
//			}
//		}
//	}
//}