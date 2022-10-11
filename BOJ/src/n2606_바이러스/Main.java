package n2606_���̷���;


//14244kb		124ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static boolean[] isVisited;
	static boolean[][] isConnected;
	static int N, M, count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		// 1�� ��ǻ�Ϳ� ������ ���� üũ�ϱ� ���� ��ǻ�� �����ŭ ����� ���� 2���� �迭
		isConnected = new boolean[N+1][N+1];
		// �湮 üũ�ϱ� ���� �迭
		isVisited = new boolean[N+1];

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			isConnected[a][b] = true;
			isConnected[b][a] = true;
		}
		search(1);
	}

	public static void search(int num) throws IOException {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(num);
		isVisited[num] = true;
		count = 0;
		
		while (!queue.isEmpty()) {
			int x = queue.poll();
			for (int i = 1; i <= N; i++) {
				if(!isConnected[x][i]) {
					continue;
				}
				if(isVisited[i]) {
					continue;
				}
				queue.offer(i);
				isVisited[i] = true;
				count++;
			}
		}
		System.out.println(count);
	}
}

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class Main {
//   static boolean[][] isConnected;
//   static boolean[] isVisited;
//   static Queue<Integer> queue = new LinkedList<>();
//   static int N, M;
//   
//   public static void main(String[] args) throws Exception {
//      // 00. �Է� �ް� �ڷ����� �ʱ�ȭ�Ѵ�.
//      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//      N = Integer.parseInt(br.readLine());
//       M = Integer.parseInt(br.readLine());
//       
//       isVisited = new boolean[N+1];
//       isConnected = new boolean[N+1][N+1];
//       
//       for(int i = 0; i < M; i++) {
//          StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//          int c1 = Integer.parseInt(st.nextToken());
//          int c2 = Integer.parseInt(st.nextToken());
//          // ��ǻ���� ���� ����� ������� ����� �ش�. 
//          isConnected[c1][c2] = true;
//          isConnected[c2][c1] = true;
//       }
//       
//       // 02. BFS Ž���Ѵ�.
//       int count = 0;
//       queue.offer(1);
//       isVisited[1] = true;
//       
//       while(!queue.isEmpty()) {
//          // 02-00. Ž�� �� ��ǻ�͸� ť���� �����´�.
//          int pc = queue.poll();
//          
//          // 02-01. ���� Ž�� ���� ��ǻ�Ϳ� "����Ǿ� �����鼭" "Ž���� �� ����" ��ǻ�ʹ� Queue�� ��´�.
//          // 02-02. Queue�� ���� ���� �湮 ���θ� üũ�ϰ�, ������ ��ǻ�� count�� �߰����ش�.
//          for(int i = 1; i <= N; i++) {
//             if(isConnected[pc][i] && !isVisited[i]) {
//                isVisited[i] = true;
//                queue.offer(i);
//                count++;
//             }
//          }
//       }
//       
//       // 03. ������ ��ǻ�� count�� ����Ѵ�.
//       System.out.println(count);
//   }
//}