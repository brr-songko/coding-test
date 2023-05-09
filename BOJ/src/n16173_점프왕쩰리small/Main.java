package BOJ.src.n16173_점프왕쩰리small;

//14252kb		120ms
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
	static boolean[][] isVisited;
	static int[][] map;

	static int N;
//					   우  하
	static int[] dr = { 0, 1 };
	static int[] dc = { 1, 0 };

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		isVisited = new boolean[N][N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		search();
	}

	public static void search() {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { 0, 0 });
		isVisited[0][0] = true;
		int count = 0;

		while (!queue.isEmpty()) {
			int[] coord = queue.poll();
			int r = coord[0];
			int c = coord[1];

			if (map[r][c] == -1) {
				count++;
				System.out.println("HaruHaru");
				break;
			}
			for (int i = 0; i < 2; i++) {
				int nr = r + map[r][c] * dr[i];
				int nc = c + map[r][c] * dc[i];
				if (nr >= N || nc >= N)
					continue;
				if (isVisited[nr][nc])
					continue;
				queue.offer(new int[] { nr, nc });
				isVisited[nr][nc] = true;
			}
		}
		if (count != 1) {
			System.out.println("Hing");
		}
	}
}
